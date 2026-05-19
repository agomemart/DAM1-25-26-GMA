package ud6.practicaex.bibliotecatexto;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BibliotecaTextoFX extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(BibliotecaTextoFX.class.getResource("VistaBiblioteca.fxml"));

        Scene scene = new Scene(root);
        primaryStage.setTitle("Gestión de libros leidos");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    
}
