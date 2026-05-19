package ud6.practicaex;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SemaforoFX extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        TextField txtCiudad = new TextField();
        Label lblMensaje = new Label();
        Button btnVerde = new Button("Verde");
        Button btnAmarillo = new Button("Amarillo");
        Button btnRojo = new Button("Rojo");

        VBox vBox = new VBox(txtCiudad, lblMensaje, btnVerde, btnAmarillo, btnRojo);
        Scene scene = new Scene(vBox, 300, 400);

        btnVerde.setOnAction(e -> {
            if (txtCiudad.getText().isBlank()) {
                txtCiudad.setStyle("-fx-background-color: red;");
                lblMensaje.setText("Debe introducir una ciudad");
            } else {
                txtCiudad.setStyle("-fx-background-color: white;");
                vBox.setStyle("-fx-background-color: lightgreen;");
                lblMensaje.setStyle("-fx-background-color: green;");
                lblMensaje.setText("Ciudad " + txtCiudad.getText() + " - tráfico fluido");
            }

        });

        btnAmarillo.setOnAction(e -> {
            if (txtCiudad.getText().isBlank()) {
                txtCiudad.setStyle("-fx-background-color: white;");
                txtCiudad.setStyle("-fx-background-color: red;");
                lblMensaje.setText("Debe introducir una ciudad");
            } else {
                vBox.setStyle("-fx-background-color: yellow;");
                lblMensaje.setStyle("-fx-background-color: orange;");
                lblMensaje.setText("Ciudad " + txtCiudad.getText() + " - tráfico moderado");
            }

        });

        btnRojo.setOnAction(e -> {
            if (txtCiudad.getText().isBlank()) {
                txtCiudad.setStyle("-fx-background-color: white;");
                txtCiudad.setStyle("-fx-background-color: red;");
                lblMensaje.setText("Debe introducir una ciudad");
            } else {
                vBox.setStyle("-fx-background-color: red;");
                lblMensaje.setStyle("-fx-background-color: darkred;");
                lblMensaje.setText("Ciudad " + txtCiudad.getText() + " - tráfico denso");
            }
        });

        primaryStage.setTitle("Semáforo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
