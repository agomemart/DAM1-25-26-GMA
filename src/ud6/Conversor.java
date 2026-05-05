package ud6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Conversor extends Application{
    TextField txtNum1;
    Label lblResultado;

    @Override
    public void start(Stage primaryStage) throws Exception {
        txtNum1 = new TextField();
        txtNum1.setPromptText("Inserta €");
        lblResultado = new Label();
        Button btnConvertir = new Button("Convertir");
        btnConvertir.setOnAction(e -> conversion());

        VBox root = new VBox(txtNum1, btnConvertir, lblResultado);
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("Conversion de euros a dolares");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void conversion() {
        try {
            Double resultado = Double.valueOf(txtNum1.getText()) * 1.13;
            lblResultado.setText(resultado.toString() + "$");
        } catch (Exception e) {
            lblResultado.setText("Alguno de los numeros no es válido.");
        }
    }

    public static void main(String[] args) {
        launch();
    }
    
}
