package ud6.empresa;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppEmpresas extends Application{

    static List<Empresa> empresas  = new ArrayList<>();

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Empresas");
        Scene scene = new Scene(FXMLLoader.load(AppEmpresas.class.getResource("VistaEmpresa.fxml")));
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        empresas.add(new Empresa(1, "IES Chan do Monte", "www.ieschandomonte.es"));
        launch();
    }
}
