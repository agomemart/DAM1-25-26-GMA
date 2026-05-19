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

public class GeneraMarkdownFX extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label lblTitulo = new Label("Titulo");
        TextField txtTitulo = new TextField();
        Label lblAutor = new Label("Autor");
        TextField txtAutor = new TextField();
        Label lblTextoEnlace = new Label("Texto enlace");
        TextField txtTextoEnlace = new TextField();
        Label lblUrl = new Label("URL");
        TextField txtUrl = new TextField();
        Label lblNombreFichero = new Label("Nombre fichero");
        TextField txtNombreFichero = new TextField();
        Label lblTextoPrincipal = new Label("Texto principal");
        TextArea txtTextoPrincipal = new TextArea();
        Button btnGenerar = new Button("Generar");
        btnGenerar.setOnAction(e -> {
            String contenido = "# " + txtTitulo.getText() + "\n\nAutor: " + txtAutor.getText() + "\n\n"
                    + txtTextoPrincipal.getText() +
                    "\n\n[" + txtTextoEnlace.getText() + "](" + txtUrl.getText() + ")";

            try (BufferedWriter out = new BufferedWriter(new FileWriter(txtNombreFichero.getText()))) {
                out.write(contenido);
            } catch (IOException ex) {
                System.out.println("Error de I/O");
            }
        });

        VBox vBox = new VBox(lblTitulo, txtTitulo, lblAutor, txtAutor, lblTextoEnlace, txtTextoEnlace, lblUrl, txtUrl,
                lblNombreFichero, txtNombreFichero, lblTextoPrincipal, txtTextoPrincipal, btnGenerar);

        Scene scene = new Scene(vBox, 300, 300);
        primaryStage.setTitle("Generar Markdown");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
