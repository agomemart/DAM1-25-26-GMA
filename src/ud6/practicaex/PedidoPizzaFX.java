package ud6.practicaex;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PedidoPizzaFX extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label lblNombre = new Label("Nombre");
        TextField txtNombre = new TextField();

        Label lblTamano = new Label("Tamaño pizza");
        ComboBox<String> cbTamano = new ComboBox<>();
        cbTamano.getItems().add("Pequeña");
        cbTamano.getItems().add("Mediana");
        cbTamano.getItems().add("Grande");

        Label lblExtra = new Label("Ingredientes extra");
        CheckBox chQueso = new CheckBox("Queso extra");
        CheckBox chJamon = new CheckBox("Jamón");
        CheckBox chChampinones = new CheckBox("Champiñones");

        Button btnCalcPedido = new Button("Calcular pedido");

        Label lblResumen = new Label();

        btnCalcPedido.setOnAction(e -> {
            double precio = 0;
            if (txtNombre.getText() != null && !txtNombre.getText().isBlank() && cbTamano != null) {
                String salida = "Pedido de " + txtNombre.getText() + "\nPizza ";

                if (cbTamano.getValue().equals("Pequeña")) {
                    precio += 6;
                    salida += "Pequeña\n";
                } else if (cbTamano.getValue().equals("Mediana")) {
                    precio += 8;
                    salida += "Mediana\n";
                } else {
                    precio += 10;
                    salida += "Grande\n";
                }

                salida += "Extras: ";
                if (chQueso.isSelected()) {
                    precio += 1.5;
                    salida += "Queso extra, ";
                }
                if (chJamon.isSelected()) {
                    precio += 1.5;
                    salida += "Jamón, ";
                }
                if (chChampinones.isSelected()) {
                    precio += 1.5;
                    salida += "Champiñones";
                }

                if (salida.endsWith(", ")) {
                    salida = salida.substring(0, salida.length() - 2);
                }

                salida += "\nTotal: " + precio + " euros";

                lblResumen.setText(salida);
            } else {
                lblResumen.setText("Datos inválidos");
            }

        });

        VBox vBox = new VBox(lblNombre, txtNombre, lblTamano, cbTamano, lblExtra, chQueso, chJamon, chChampinones,
                btnCalcPedido, lblResumen);
        Scene scene = new Scene(vBox, 400, 500);

        primaryStage.setTitle("Pizzería");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
