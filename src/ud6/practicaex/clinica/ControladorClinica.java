package ud6.practicaex.clinica;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

public class ControladorClinica {

    @FXML
    private DatePicker dpFecha;

    @FXML
    private ListView<Consulta> lstConsultas;

    @FXML
    private Label mensaje;

    @FXML
    private TextField txtDuracion;

    @FXML
    private TextField txtEspecialidad;

    @FXML
    private TextField txtPaciente;

    @FXML
    void abrir(ActionEvent event) {
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Abrir archivo");

        File archivo = chooser.showOpenDialog(null);

        if (archivo == null) {
            return;
        }

        lstConsultas.getItems().clear();
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo))) {
            try {
                while (true) {
                    lstConsultas.getItems().add((Consulta) in.readObject());
                }
            } catch (EOFException e) {
                System.out.println("Fin de archivo");
            } catch (ClassNotFoundException e) {
                System.out.println("No existe la clase");
            }
        } catch (IOException e) {
            System.out.println("Error de I/O");
        }

        lstConsultas.getItems().sort((c1, c2) -> c1.fecha.compareTo(c2.fecha));
    }

    @FXML
    void add(ActionEvent event) {
        try {
            if (!txtPaciente.getText().isBlank() && Integer.parseInt(txtDuracion.getText()) > 0) {
                if (dpFecha.getValue() == null) {
                    dpFecha.setValue(LocalDate.now());
                }
                Consulta c = new Consulta(txtPaciente.getText(), dpFecha.getValue(), txtEspecialidad.getText(),
                        Integer.parseInt(txtDuracion.getText()));
                lstConsultas.getItems().add(c);
                lstConsultas.getItems().sort((c1, c2) -> c1.fecha.compareTo(c2.fecha));
                mensaje.setText("Añadido correctamente");
            } else {
                mensaje.setText("ERROR: El paciente esta vacío o la duración es negativa");
            }
        } catch (NumberFormatException e) {
            mensaje.setText("La duración no cumple con el formato o está vacía");
        }
        
    }

    @FXML
    void cerrar(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void generarNuevo(ActionEvent event) {
        lstConsultas.getItems().clear();
        txtPaciente.clear();
        dpFecha.setValue(null);
        txtEspecialidad.clear();
        txtDuracion.clear();
        mensaje.setText(null);
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
            for (Consulta c : lstConsultas.getItems()) {
                out.writeObject(c);
            }
        } catch (IOException e) {
            System.out.println("Error de I/O");
        }
    }

}
