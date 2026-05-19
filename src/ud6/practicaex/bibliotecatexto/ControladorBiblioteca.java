package ud6.practicaex.bibliotecatexto;

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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

public class ControladorBiblioteca {

    @FXML
    private ListView<Libro> lstLibros;

    @FXML
    private Label lblMensaje;

    @FXML
    private TextField txtAutor;

    @FXML
    private TextArea txtComentario;

    @FXML
    private TextField txtTitulo;

    @FXML
    private TextField txtValoracion;

    @FXML
    void abrir(ActionEvent event) {
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Abrir archivo");

        File archivo = chooser.showOpenDialog(null);

        if (archivo == null) {
            return;
        }

        lstLibros.getItems().clear();
        try (BufferedReader in = new BufferedReader(new FileReader(archivo))) {
            String linea;

            while ((linea = in.readLine()) != null) {
                String[] datos = linea.split(";");
                int valoracion = 0;
                try{
                    valoracion = Integer.parseInt(datos[2]);
                }catch(NumberFormatException e) {
                    System.out.println("Formato de valoracion inválido");
                    lblMensaje.setText("Algunos de los libros no tiene un formato válido");
                    continue;
                };

                if (valoracion >= 1 && valoracion <= 10) {
                    Libro l = new Libro(datos[0], datos[1], valoracion, datos[3]);
                    lstLibros.getItems().add(l);
                } else {
                    lblMensaje.setText("Algunos de los libros no se han podido mostrar");
                }
            }
        } catch (IOException e) {
            System.out.println("Error de I/O");
        }
        lstLibros.getItems().sort((l1, l2) -> l2.valoracion - l1.valoracion);
    }

    @FXML
    void add(ActionEvent event) {
        try {
            if (Integer.parseInt(txtValoracion.getText()) >= 1 && Integer.parseInt(txtValoracion.getText()) <= 10) {
                if (txtTitulo.getText() != null && !txtTitulo.getText().isBlank() && txtAutor.getText() != null
                        && !txtAutor.getText().isBlank()) {
                    Libro l = new Libro(txtTitulo.getText(), txtAutor.getText(),
                            Integer.parseInt(txtValoracion.getText()),
                            txtComentario.getText());
                    lstLibros.getItems().add(l);
                    lblMensaje.setText("Libro añadido correctamente");
                } else {
                    lblMensaje.setText("Titulo y autor tienen que tener algún valor.");
                }
            } else {
                lblMensaje.setText("La valoración tiene que estar entre 1 y 10");
            }
        } catch (NumberFormatException e) {
            lblMensaje.setText("La valoración está vacia o no es un número");
        }
        lstLibros.getItems().sort((l1, l2) -> l2.valoracion - l1.valoracion);
    }

    @FXML
    void cerrar(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void guardar(ActionEvent event) {
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Guardar archivo");

        File archivo = chooser.showSaveDialog(null);

        if (archivo == null) {
            return;
        }

        String contenidoArchivo = "";
        for (Libro l : lstLibros.getItems()) {
            contenidoArchivo += l.titulo + ";" + l.autor + ";" + l.valoracion + ";" + l.comentario + "\n";
        }

        try (BufferedWriter out = new BufferedWriter(new FileWriter(archivo))) {
            out.write(contenidoArchivo);
            lblMensaje.setText("Archivo de libros guardado correctamente");
        } catch (IOException e) {
            System.out.println("Error de I/O");
        }
    }

}
