package ud6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ejemplo7_ListaNotas extends Application{
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label lblAlumno = new Label("Alumn@:");
        TextField txtAlumno = new TextField();
        Label lblNota = new Label("Nota:");
        TextField txtNota = new TextField();
        Button btnAdd = new Button("Añadir");
        ListView<Alumno> lstAlumnos = new ListView<>();
        
        btnAdd.setOnAction(e -> {
            Alumno alumno = new Alumno(txtAlumno.getText(), Integer.parseInt(txtNota.getText()));
            lstAlumnos.getItems().add(alumno);
            lstAlumnos.getItems().sort((a1, a2) -> a1.nombre.compareTo(a2.nombre));

        });
        
        VBox vbox = new VBox(lblAlumno, txtAlumno, lblNota, txtNota, btnAdd, lstAlumnos);
        Scene scene = new Scene(vbox);
        scene.addEventHandler(MouseEvent.MOUSE_ENTERED, e -> System.out.println("Ratón entrando en la escena"));
        scene.addEventHandler(MouseEvent.MOUSE_EXITED, e -> System.out.println("Ratón saliendo en la escena"));
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    class Alumno {
        String nombre;
        int nota;
        
        public Alumno(String nombre, int nota) {
            this.nombre = nombre;
            this.nota = nota;
        }

        @Override
        public String toString() {
            return nombre + " (" + nota + ")";
        }

        
    }
}
