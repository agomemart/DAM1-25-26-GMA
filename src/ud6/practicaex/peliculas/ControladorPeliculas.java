package ud6.practicaex.peliculas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

import org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.EOFException;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

public class ControladorPeliculas {

    @FXML
    private DatePicker dpFecha;

    @FXML
    private Label lblMensaje;

    @FXML
    private ListView<Pelicula> lstPeliculas;

    @FXML
    private TextField txtGenero;

    @FXML
    private TextField txtPuntuacion;

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

        lstPeliculas.getItems().clear();

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo))) {
            try {
                while (true) {
                    Pelicula p = (Pelicula) in.readObject();
                    if (!lstPeliculas.getItems().contains(p)) {
                        if (peliculaValida(p)) {
                            lstPeliculas.getItems().add(p);
                        } else {
                            lblMensaje.setText("Alguna de las peliculas no es válida");
                        }
                    } else {
                        lblMensaje.setText("Alguna de las películas ya existe");
                    }
                }
            } catch (EOFException e) {
                System.out.println("Fin del archivo");
            } catch (ClassNotFoundException e) {
                System.out.println("No se encuentra la clase");
            }
        } catch (IOException e) {
            lblMensaje.setText("Error al leer el archivo");
        }
        lblMensaje.setText("Archivo cargado correctanemte");
        lstPeliculas.getItems().sort((p1, p2) -> p2.fechaVista.compareTo(p1.fechaVista));
    }

    @FXML
    void add(ActionEvent event) {
        int puntuacion = 0;
        try {
            puntuacion = Integer.parseInt(txtPuntuacion.getText());
            Pelicula p = new Pelicula(txtTitulo.getText(), txtGenero.getText(), dpFecha.getValue(), puntuacion);
            if (!lstPeliculas.getItems().contains(p)) {
                if (peliculaValida(p)) {
                    if (p.fechaVista == null) {
                        p.fechaVista = LocalDate.now();
                    }
                    lstPeliculas.getItems().add(p);
                    lblMensaje.setText("Película añadida correctamente");
                } else {
                    lblMensaje.setText("Alguno de los datos introducidos no es válido");
                }
            } else {
                lblMensaje.setText("Película existente");
            }

        } catch (NumberFormatException e) {
            lblMensaje.setText("La puntuación tiene que ser un número");
        }

        lstPeliculas.getItems().sort((p1, p2) -> p2.fechaVista.compareTo(p1.fechaVista));
    }

    @FXML
    void generarNuevo(ActionEvent event) {
        lstPeliculas.getItems().clear();
        txtTitulo.clear();
        txtGenero.clear();
        txtPuntuacion.clear();
        dpFecha.setValue(null);
        lblMensaje.setText("");
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
            for (Pelicula p : lstPeliculas.getItems()) {
                out.writeObject(p);
            }
            lblMensaje.setText("Archivo guardado correctamente");
        } catch (IOException e) {
            lblMensaje.setText("Error al guardar el archivo");
        }
    }

    @FXML
    void salir(ActionEvent event) {
        Platform.exit();
    }

    boolean peliculaValida(Pelicula p) {
        if (p == null) {
            return false;
        }
        if (p.titulo.isBlank() || p.genero.isBlank() || p.puntuacion < 1 || p.puntuacion > 10) {
            return false;
        }

        return true;
    }
}
