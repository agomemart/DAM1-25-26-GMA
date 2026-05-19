package ud6.practicaex.notas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

public class ControladorNotas {

    @FXML
    private Label lblMensaje;

    @FXML
    private ListView<Nota> lstNotas;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtNota;

    @FXML
    void abrir(ActionEvent event) {
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Abrir archivo");

        File archivo = chooser.showOpenDialog(null);

        if (archivo == null) {
            return;
        }

        lstNotas.getItems().clear();
        try (BufferedReader in = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = in.readLine()) != null) {
                int posPrimerSeparador = linea.indexOf(";");
                String nombre = linea.substring(0, posPrimerSeparador);
                try {
                    double nota = Double.parseDouble(linea.substring(posPrimerSeparador + 1));
                    if (!nombre.isBlank() && nota >= 0 && nota <= 10) {
                        Nota n = new Nota(nombre, nota);
                        lstNotas.getItems().add(n);
                    } else {
                        lblMensaje.setText("Alguno de los datos no es correcto");
                    }
                } catch (NumberFormatException e) {
                    lblMensaje.setText("Nota no válida en el archivo");
                }

            }
        } catch (IOException e) {
            lblMensaje.setText("Error al leer el archivo");
        }
        lstNotas.getItems().sort((n1, n2) -> Double.compare(n2.nota, n1.nota));
    }

    @FXML
    void add(ActionEvent event) {
        try {
            double nota = Double.parseDouble(txtNota.getText());
            if (!txtNombre.getText().isBlank() && nota >= 0 && nota <= 10) {
                Nota n = new Nota(txtNombre.getText(), nota);
                lstNotas.getItems().add(n);
                lblMensaje.setText("Añadido correctamente");
            } else {
                lblMensaje.setText("Alguno de los datos no es correcto");
            }
        } catch (NumberFormatException e) {
            lblMensaje.setText("La nota tiene que ser un número");
        }
        lstNotas.getItems().sort((n1, n2) -> Double.compare(n2.nota, n1.nota));
    }

    @FXML
    void guardar(ActionEvent event) {
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Guardar archivo");

        File archivo = chooser.showSaveDialog(null);
        
        if (archivo == null) {
            return;
        }

        try (BufferedWriter out = new BufferedWriter(new FileWriter(archivo))) {
            String contenido = "";
            for (Nota n : lstNotas.getItems()) {
                contenido += n.nombre + ";" + n.nota + "\n";
            }
            out.write(contenido);
            lblMensaje.setText("Archivo guardado correctamente");
        } catch (IOException e) {
            lblMensaje.setText("Error al guardar el archivo");
        }
    }

    @FXML
    void salir(ActionEvent event) {
        Platform.exit();
    }

}
