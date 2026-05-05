package ud6;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ejemplo3 extends Application{
    TextField txtOperando1, txtOperando2;
    Label lblResultado;
   
    @Override
    public void start(Stage primaryStage) throws Exception {
        txtOperando1 = new TextField();
        txtOperando2 = new TextField();
        lblResultado = new Label("Aquí se mostrará el resultado.");
        txtOperando1.setPromptText("Escribe un número");
        txtOperando2.setPromptText("Escribe un número");
        
        Button btnSumar = new Button("Sumar");
        
        btnSumar.setOnAction(e -> mostrarSuma());
        txtOperando1.setOnKeyTyped(e -> mostrarSuma());
        txtOperando2.setOnKeyTyped(e -> mostrarSuma());

        VBox root = new VBox(txtOperando1, txtOperando2, btnSumar, lblResultado);
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void mostrarSuma() {
        try {
            Double resultado = Double.valueOf(txtOperando1.getText()) + Double.valueOf(txtOperando2.getText());
            lblResultado.setText(resultado.toString());
        } catch(Exception e) {
            lblResultado.setText("Algún número no es válido.");
        }
        
        
    }

    public static void main(String[] args) {
        launch();
    }

}
