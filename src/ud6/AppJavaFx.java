package ud6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AppJavaFx extends Application{
    static int contador = 0;
    Button btn;
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        btn = new Button("Púlsame");
        btn.setOnAction(e -> respuestaButton());
        Scene scene = new Scene(btn);
        stage.setScene(scene);
        stage.show();
    }

    private void respuestaButton() {
        contador++;
        System.out.println(contador);
        btn.setText("Pulsado" + contador + " vez/veces");
    }
}
