package ud6.agomemart.maximaspuntuaciones;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 * @author Adrián Gómez
 */
public class ControladorPuntuaciones implements Initializable {
    @FXML
    private Label lblMensaje;

    @FXML
    private ListView<Puntuacion> lstPuntuaciones;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtPuntuacion;

    @FXML
    void addPuntuacion(ActionEvent event) {
        try {
            if (!txtNombre.getText().isBlank() && !txtPuntuacion.getText().isBlank()) {
                Puntuacion p = new Puntuacion(txtNombre.getText(), Integer.parseInt(txtPuntuacion.getText()),
                        LocalDateTime.now());
                lstPuntuaciones.getItems().add(p);
                lblMensaje.setText("Añadido correctamente");
            } else {
                lblMensaje.setText("Datos incorrectos");
            }
        } catch (NumberFormatException e) {
            lblMensaje.setText("La puntuación debe ser un número");
        }
        lstPuntuaciones.getItems().sort((p1, p2) -> p2.puntuacion - p1.puntuacion);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Puntuaciones.dat"))) {
            for (Puntuacion p : lstPuntuaciones.getItems()) {
                out.writeObject(p);
            }
        } catch (IOException e) {
            System.out.println("Error al guardar el fichero");
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("Puntuaciones.dat"))) {
            try {
                while (true) {
                    Puntuacion p = (Puntuacion) in.readObject();
                    lstPuntuaciones.getItems().add(p);
                }
            } catch (EOFException e) {
                System.out.println("Fin del fichero");
            } catch (ClassNotFoundException e) {
                System.out.println("No existe la clase");
            }
        } catch (IOException e) {
            System.out.println("Error al abrir el fichero");
        }

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Puntuaciones.dat"))) {
            out.close();
        } catch (IOException e) {
            System.out.println("Error al crear el fichero");
        }

        lstPuntuaciones.getItems().sort((p1, p2) -> p2.puntuacion - p1.puntuacion);
    }

}
