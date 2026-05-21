package ud6.practicaex.viajes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ViajesBinarioFX extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(ViajesBinarioFX.class.getResource("VistaViaje.fxml"));

        Scene scene= new Scene(root);

        primaryStage.setTitle("Viajes realizados");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch();
    }
}
