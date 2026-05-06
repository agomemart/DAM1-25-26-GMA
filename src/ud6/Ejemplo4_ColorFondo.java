package ud6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ejemplo4_ColorFondo extends Application{
    VBox vbox;

    @Override
    public void start(Stage primaryStage) throws Exception {
        ChoiceBox<String> cb = new ChoiceBox<>();
        cb.getItems().addAll("black", "green", "red", "white");
        cb.setOnAction(e -> vbox.setStyle("-fx-background-color: " + cb.getValue() + ";"));
        vbox = new VBox(cb);

        Scene scene = new Scene(vbox, 300,200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    
}
