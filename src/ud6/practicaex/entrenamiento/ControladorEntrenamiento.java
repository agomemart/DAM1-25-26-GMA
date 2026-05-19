package ud6.practicaex.entrenamiento;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

public class ControladorEntrenamiento {

    @FXML
    private DatePicker dpFecha;

    @FXML
    private ListView<Entrenamiento> lstVista;

    @FXML
    private TextField txtKmRecorridos;

    @FXML
    private TextField txtNombre;

    @FXML
    void abrir(ActionEvent event) {
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Abrir archivo");

        File archivo = chooser.showOpenDialog(null);

        if (archivo == null) {
            return;
        }

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo));
            lstVista.getItems().clear();
            try {
                while (true) {
                   lstVista.getItems().add((Entrenamiento) in.readObject());
                }
            } catch (EOFException e) {
                System.out.println("Fin de archivo");
            }
            in.close();
            
            lstVista.getItems().sort((e1, e2) -> e1.fecha.compareTo(e2.fecha));

        } catch (FileNotFoundException e) {
            System.out.println("No existe el archivo");
        } catch (IOException e) {
            System.out.println("Error de I/O");
        } catch (ClassNotFoundException e) {
            System.out.println("No existe la clase");
        }
    }

    @FXML
    void guardar(ActionEvent event) {
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Guardar archivo");
        chooser.setInitialFileName("entrenos.dat");

        File archivo = chooser.showSaveDialog(null);

        if (archivo == null) {
            return;
        }

        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(archivo));
            for (Entrenamiento e : EntrenamientoFX.entrenamientos) {
                out.writeObject(e);
            }
            out.close();
        } catch (IOException e) {
            System.out.println("Error de I/O");
        }
    }

    @FXML
    void registrar(ActionEvent event) {
        Entrenamiento e = new Entrenamiento(txtNombre.getText(), dpFecha.getValue(),
                Integer.parseInt(txtKmRecorridos.getText()));

        lstVista.getItems().add(e);
        lstVista.getItems().sort((e1, e2) -> e1.fecha.compareTo(e2.fecha));
    }
}
