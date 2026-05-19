package ud6.practicaex.peliculas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PeliculasBinarioFX extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(PeliculasBinarioFX.class.getResource("VistaPelicula.fxml"));

        Scene scene = new Scene(root);
        primaryStage.setTitle("Películas vistas");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch();
    }
}
