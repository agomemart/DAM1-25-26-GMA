package ud6.practicaex.tareas;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ControladorTareas {
    @FXML
    private CheckBox chPrioritaria;

    @FXML
    private Label lblMensaje;

    @FXML
    private ListView<Tarea> lstTareas;

    @FXML
    private TextArea txtDesc;

    @FXML
    private TextField txtTitulo;

    @FXML
    void addTarea(ActionEvent event) {
        if (txtTitulo.getText() != null && !txtTitulo.getText().isBlank() && txtDesc.getText() != null && !txtDesc.getText().isBlank()) {
            Tarea t = new Tarea(txtTitulo.getText(), txtDesc.getText(), chPrioritaria.isSelected());
            lstTareas.getItems().add(t);
            lstTareas.getItems().sort((t1, t2) -> {
                if (t2.prioritaria != t1.prioritaria) {
                    if (t2.prioritaria == false) {
                        return -1;
                    } else {
                        return 1;
                    }
                }
                return t1.titulo.compareTo(t2.titulo);
            });
            lblMensaje.setText("Tarea añadida correctamente");
        } else {
            lblMensaje.setText("Completa el título y la descripción");
        }
    }

    @FXML
    void cerrarApp(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void generarNuevo(ActionEvent event) {
        lstTareas.getItems().clear();
        txtTitulo.clear();
        txtDesc.clear();
        lblMensaje.setText(null);
        chPrioritaria.setSelected(false);
    }

}
