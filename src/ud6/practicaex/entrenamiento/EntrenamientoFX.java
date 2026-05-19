package ud6.practicaex.entrenamiento;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EntrenamientoFX extends Application{
    static List<Entrenamiento> entrenamientos = new ArrayList<>();

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Entrenamientos");
        Scene scene = new Scene(FXMLLoader.load(EntrenamientoFX.class.getResource("VistaEntrenamiento.fxml")));
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    
}
