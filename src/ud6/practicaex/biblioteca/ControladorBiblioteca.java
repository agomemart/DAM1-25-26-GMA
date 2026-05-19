package ud6.practicaex.biblioteca;

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
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

public class ControladorBiblioteca {

    @FXML
    private DatePicker dpFecha;

    @FXML
    private ListView<Biblioteca> lstVista;

    @FXML
    private TextField txtDiasPrestamo;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtTitulo;

    @FXML
    void abrir(ActionEvent event) {
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Abrir archivo");
        File archivo = chooser.showOpenDialog(null);

        if (archivo == null) {
            return;
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo))) {
            lstVista.getItems().clear();
            try {
                while (true) {
                    lstVista.getItems().add((Biblioteca) in.readObject());
                }
            } catch (EOFException e) {
                System.out.println("Fin de archivo");
            } catch (ClassNotFoundException e) {
                System.out.println("No se encuentra la clase");
            }

        } catch (IOException e) {
            System.out.println("Error de I/O");
        }
    }

    @FXML
    void anadir(ActionEvent event) {
        Biblioteca b = new Biblioteca(txtNombre.getText(), txtTitulo.getText(), dpFecha.getValue(), Integer.parseInt(txtDiasPrestamo.getText()));
        lstVista.getItems().add(b);
        lstVista.getItems().sort((b1, b2) -> b1.fechaPrestamo.compareTo(b2.fechaPrestamo));
    }

    @FXML
    void generarNuevo(ActionEvent event) {
        lstVista.getItems().clear();
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
            for (Biblioteca b : lstVista.getItems()) {
                out.writeObject(b);
            }
        } catch (IOException e) {
            System.out.println("Error de I/O");
        }
    }

    @FXML
    void salir(ActionEvent event) {
        Platform.exit();
    }

}