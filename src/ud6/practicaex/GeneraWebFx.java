package ud6.practicaex;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GeneraWebFx extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label lblTitulo = new Label("Titulo");
        TextField txtTitulo = new TextField();
        Label lblDescripcion = new Label("Descripción");
        TextField txtDescripcion = new TextField();
        Label lblEnlace = new Label("Texto Enlace:");
        TextField txtEnlace = new TextField();
        Label lblUrl = new Label("URL Enlace");
        TextField txtUrl = new TextField();
        Label lblNombreFichero = new Label("Nombre fichero");
        TextField txtNombreFichero = new TextField();
        Button btnGenerar = new Button("Generar HTML");

        btnGenerar.setOnAction(e -> {
            String contenido = "<html>\n<head>\n<title>" + txtTitulo.getText() + "</title>\n" +
                    "<meta charset=\"utf-8\">\n</head>\n<body>\n<h1>" + txtTitulo.getText() + "</h1>\n" +
                    "<p>" + txtDescripcion.getText() + ". <br>\n<a href=\"" + txtUrl.getText() + "\">"
                    + txtEnlace.getText() + "</a>\n" +
                    "</p>\n</body>\n</html>";
            try (BufferedWriter out = new BufferedWriter(new FileWriter(txtNombreFichero.getText()))) {
                out.write(contenido);
            } catch (IOException ex) {
                System.out.println("Error de I/O");
            }
        });

        VBox vBox = new VBox(lblTitulo, txtTitulo, lblDescripcion, txtDescripcion, lblEnlace, txtEnlace, lblUrl, txtUrl,
                lblNombreFichero, txtNombreFichero, btnGenerar);
        Scene scene = new Scene(vBox);

        primaryStage.setTitle("Genera Web");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
