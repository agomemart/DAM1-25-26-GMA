package ud6.practicaex.agenda;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

public class ControladorAgenda {
    @FXML
    private Label mensajeError;

    @FXML
    private ListView<Contacto> lstAgenda;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtTelefono;

    @FXML
    void abrir(ActionEvent event) {
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Abrir archivo");
        File archivo = chooser.showOpenDialog(null);

        if (archivo == null) {
            return;
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo))) {
            lstAgenda.getItems().clear();
            try {
                while (true) {
                    lstAgenda.getItems().add((Contacto) in.readObject());
                }
            } catch (EOFException e){
                System.out.println("Fin de archivo.");
            }
           
        } catch (IOException e) {
            System.out.println("Error de I/O");
        } catch (ClassNotFoundException e) {
            System.out.println("No existe la clase");
        }
    }

    @FXML
    void add(ActionEvent event) {
        Contacto c = new Contacto(txtNombre.getText(), txtTelefono.getText(), txtEmail.getText());
        if (esContactoValido(c) && !lstAgenda.getItems().contains(c)) {
            lstAgenda.getItems().add(c);
            lstAgenda.getItems().sort((c1, c2) -> c1.nombre.compareTo(c2.nombre));
            mensajeError.setText("Contacto guardado");
        } else {
            mensajeError.setText("Datos incorrectos o existentes");
        }
        
    }

    @FXML
    void cerrar(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void generarNuevo(ActionEvent event) {
        lstAgenda.getItems().clear();
    }

    @FXML
    void guardar(ActionEvent event) {
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Guardar archivo");
        File archivo = chooser.showSaveDialog(null);

        if (archivo == null) {
            return;
        }

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(archivo))) {
            for (Contacto c : lstAgenda.getItems()) {
                out.writeObject(c);
            }
        } catch (IOException e) {
            System.out.println("Error de I/O");
        }
    }

    boolean esContactoValido(Contacto c) {
        if (c.nombre == null || c.nombre.isEmpty()) {
            return false;
        }
        if (c.telefono == null || c.telefono.isEmpty()) {
            return false;
        }
        if (!c.telefono.matches("[0-9]{9}")) {
            return false;
        }
        if (c.email == null || c.email.isEmpty()) {
            return false;
        }
        if (!c.email.contains("@")) {
            return false;
        }
        return true;
    }
}
