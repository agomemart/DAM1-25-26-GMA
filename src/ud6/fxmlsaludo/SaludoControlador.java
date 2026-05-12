package ud6.fxmlsaludo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SaludoControlador {

    @FXML
    private Label lblSaludo;

    @FXML
    private TextField txtNombre;

    @FXML
    void saludar(ActionEvent event) {
        lblSaludo.setText("Hola " + txtNombre.getText());
    }

}

