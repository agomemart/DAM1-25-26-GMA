package ud6.agomemart;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author Adrián Gómez
 */
public class Codec extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label lblNomFicheroEntrada = new Label("Nombre fichero de entrada");
        TextField txtNomFicheroEntrada = new TextField();
        Label lblNomFicheroSalida = new Label("Nombre fichero de salida");
        TextField txtNomFicheroSalida = new TextField();
        Button btnCodificar = new Button("Codificar");
        Button btnDecodificar = new Button("Decodificar");
        Label lblMensaje = new Label();

        btnCodificar.setOnAction(e -> {
            try {
                if (!txtNomFicheroEntrada.getText().isBlank() && !txtNomFicheroSalida.getText().isBlank()) {
                    BufferedReader in = new BufferedReader(new FileReader("codec.txt"));
                    String contenido = in.readAllAsString();
                    in.close();
                    String[] codificacion = contenido.split("\n");
                    String salida = "";

                    BufferedReader inOrigen = new BufferedReader(new FileReader(txtNomFicheroEntrada.getText()));
                    String contenidoCodificar;
                    while ((contenidoCodificar = inOrigen.readLine()) != null) {
                        for (int i = 0; i < contenidoCodificar.length(); i++) {
                            char caracter = contenidoCodificar.charAt(i);
                            int posCaracter = codificacion[0].indexOf(caracter);
                            if (posCaracter != -1) {
                                caracter = codificacion[1].charAt(posCaracter);
                            }
                            salida += caracter;
                        }
                        salida += "\n";
                    }
                    inOrigen.close();

                    BufferedWriter out = new BufferedWriter(new FileWriter(txtNomFicheroSalida.getText()));
                    out.write(salida);
                    out.close();
                    lblMensaje.setText("Codificación completa");
                } else {
                    lblMensaje.setText("Completa los nombres de los archivos");
                }
            } catch (IOException ex) {
                System.out.println("Error al leer el fichero codec.txt");
            }
        });

        btnDecodificar.setOnAction(e -> {
            try {
                if (!txtNomFicheroEntrada.getText().isBlank() && !txtNomFicheroSalida.getText().isBlank()) {
                    BufferedReader in = new BufferedReader(new FileReader("codec.txt"));
                    String contenido = in.readAllAsString();
                    in.close();
                    String[] codificacion = contenido.split("\n");
                    String salida = "";

                    BufferedReader inOrigen = new BufferedReader(new FileReader(txtNomFicheroEntrada.getText()));
                    String contenidoDecodificar;
                    while ((contenidoDecodificar = inOrigen.readLine()) != null) {
                        for (int i = 0; i < contenidoDecodificar.length(); i++) {
                            char caracter = contenidoDecodificar.charAt(i);
                            int posCaracter = codificacion[1].indexOf(caracter);
                            if (posCaracter != -1) {
                                caracter = codificacion[0].charAt(posCaracter);
                            }
                            salida += caracter;
                        }
                        salida += "\n";
                    }
                    inOrigen.close();

                    BufferedWriter out = new BufferedWriter(new FileWriter(txtNomFicheroSalida.getText()));
                    out.write(salida);
                    out.close();
                    lblMensaje.setText("Decodificación completa");
                } else {
                    lblMensaje.setText("Completa los nombres de los archivos");
                }

            } catch (IOException ex) {
                System.out.println("Error al leer el fichero codec.txt");
            }
        });

        VBox vBox = new VBox(lblNomFicheroEntrada, txtNomFicheroEntrada, lblNomFicheroSalida, txtNomFicheroSalida,
                btnCodificar, btnDecodificar, lblMensaje);
        Scene scene = new Scene(vBox, 300, 400);

        primaryStage.setTitle("Codificar texto de archivos");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
