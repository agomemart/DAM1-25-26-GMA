package ud6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Mapa extends Application{
    int[][] mapa = {
        {1, 0, 1, 1, 1, 1},
        {1, 0, 1, 1, 1, 1},
        {1, 0, 1, 1, 1, 1},
        {1, 0, 0, 0, 0, 1},
        {1, 1, 1, 1, 0, 0}
    };

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gridPane = new GridPane();
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa.length; j++) {
                Label lbl = new Label();
                if (mapa[i][j] == 1) {
                    lbl.setText(" 1 ");
                    lbl.setStyle("-fx-background-color: black");
                } else {
                    lbl.setText(" 0 ");
                    lbl.setStyle("-fx-background-color: white");
                }
                gridPane.add(lbl, i, j);
            }
        }

        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    
}
