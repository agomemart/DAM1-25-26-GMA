package ud6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ejemplo2 extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        TextField textField = new TextField("Texto inicial...");
        Button button = new Button("Púlsame");
        Label label = new Label();
        button.setOnAction(e -> label.setText(textField.getText()));
        

        VBox vbox = new VBox(textField, button, label);
        Scene scene = new Scene(vbox, 400, 200);
        primaryStage.setScene(scene);

        primaryStage.setTitle("Cuadro de texto y etiqueta");
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    
}
