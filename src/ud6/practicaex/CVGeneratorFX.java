package ud6.practicaex;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CVGeneratorFX extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label lblNombre = new Label("Nombre");
        TextField txtNombre = new TextField();
        Label lblProfesion = new Label("Profesión");
        TextField txtProfesion = new TextField();
        Label lblDescPers = new Label("Descripción personal");
        TextArea txtDescPers = new TextArea();
        Label lblEmail = new Label("Email");
        TextField txtEmail = new TextField();
        Label lblPagWeb = new Label("Página Web");
        TextField txtPagWeb = new TextField();
        Label lblUrl = new Label("URL página");
        TextField txtUrl = new TextField();
        Label lblNombreFichero = new Label("Nombre fichero");
        TextField txtNombreFichero = new TextField();
        Button btnGenerar = new Button("Generar CV");

        btnGenerar.setOnAction(e -> {
            String contenido = "<html>\n" +
                    "<head>\n" +
                    "<meta charset=\"utf-8\">\n" +
                    "<title>" + txtNombre.getText() + "</title>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "<h1>" + txtNombre.getText() + "</h1>\n" +
                    "<h2>" + txtProfesion.getText() + "</h2>\n" +
                    "<p>" + txtDescPers.getText() + "</p>\n" +
                    "<p>Email: " + txtEmail.getText() + "</p>\n" +
                    "<a href=\"" + txtUrl.getText() + "\">" + txtPagWeb.getText() + "</a>\n" +
                    "</body>\n" +
                    "</html>";

            try {
                BufferedWriter out = new BufferedWriter(new FileWriter(txtNombreFichero.getText()));
                out.write(contenido);
                out.close();
            } catch (IOException ex) {
                System.out.println("Error de I/O");
            }
        });

        VBox vBox = new VBox(lblNombre, txtNombre, lblProfesion, txtProfesion, lblDescPers, txtDescPers, lblEmail,
                txtEmail, lblPagWeb, txtPagWeb, lblUrl, txtUrl, lblNombreFichero, txtNombreFichero, btnGenerar);
        Scene scene = new Scene(vBox, 300, 400);

        primaryStage.setTitle("Generar CV");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
