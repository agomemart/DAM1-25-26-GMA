package ud6.practicaex.viajes;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

public class ControladorViaje implements Initializable{

    @FXML
    private ComboBox<String> cbTransporte;

    @FXML
    private CheckBox chSeguro;

    @FXML
    private DatePicker dpFecha;

    @FXML
    private ListView<Viaje> lstViajes;

    @FXML
    private TextField txtDestino;

    @FXML
    private TextField txtPrecio;

    @FXML
    void abrir(ActionEvent event) {
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Abrir archivo viajes");

        File archivo = chooser.showOpenDialog(null);

        if (archivo == null) {
            return;
        }

        lstViajes.getItems().clear();

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo))) {
            try {
                while (true) {
                    lstViajes.getItems().add((Viaje) in.readObject());
                }
            } catch (EOFException e) {
                System.out.println("Fin del archivo");
            } catch (ClassNotFoundException e) {
                System.out.println("No existe la clase");
            }
        } catch (IOException e) {
            System.out.println("Error al abrir el archivo");
        }

        lstViajes.getItems().sort((v1, v2) -> Double.compare(v2.precio, v1.precio));
    }

    @FXML
    void addViaje(ActionEvent event) {
        try {
            if (txtDestino.getText() != null && !txtDestino.getText().isBlank() && cbTransporte.getValue() != null) {
                if (Double.parseDouble(txtPrecio.getText()) > 0) {
                    if (dpFecha.getValue() == null) {
                        Viaje v = new Viaje(txtDestino.getText(), LocalDate.now(), cbTransporte.getValue(), Double.parseDouble(txtPrecio.getText()), chSeguro.isSelected());
                        lstViajes.getItems().add(v);
                    }
                    Viaje v = new Viaje(txtDestino.getText(), dpFecha.getValue(), cbTransporte.getValue(), Double.parseDouble(txtPrecio.getText()), chSeguro.isSelected());
                    lstViajes.getItems().add(v);
                } else {
                    System.out.println("El precio tiene que ser mayor que 0");
                }
            } else {
                System.out.println("Introduce valores válidos");
            }
        } catch (NumberFormatException e) {
            System.out.println("El precio tiene que ser un número válido");
        }

        lstViajes.getItems().sort((v1, v2) -> Double.compare(v2.precio, v1.precio));
    }

    @FXML
    void cerrar(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void generarNuevo(ActionEvent event) {
        lstViajes.getItems().clear();
        txtDestino.clear();
        dpFecha.setValue(null);
        chSeguro.setSelected(false);
        txtPrecio.clear();
    }

    @FXML
    void guardar(ActionEvent event) {
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Guardar archivo viajes");

        File archivo = chooser.showSaveDialog(null);

        if (archivo == null) {
            return;
        }

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(archivo))) {
            for (Viaje v : lstViajes.getItems()) {
                out.writeObject(v);
            }
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo");
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cbTransporte.getItems().addAll("Avión", "Tren", "Coche", "Barco");
    }

}
