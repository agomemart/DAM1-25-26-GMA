package ud6.empresa;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ControladorEmpresa implements Initializable{

    @FXML
    private ListView<Empresa> lstEmpresas;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtWeb;

    @FXML
    void actualizar(ActionEvent event) {
        Empresa e = new Empresa(Integer.parseInt(txtId.getText()));
        int i = lstEmpresas.getItems().indexOf(e);
        Empresa eL = lstEmpresas.getItems().get(i);
    }

    @FXML
    void agregar(ActionEvent event) {
        Empresa e = new Empresa(Integer.parseInt(txtId.getText()), txtNombre.getText(), txtWeb.getText());
        lstEmpresas.getItems().add(e);
    }

    @FXML
    void borrar(ActionEvent event) {
        Empresa e = new Empresa(Integer.parseInt(txtId.getText()));
        lstEmpresas.getItems().remove(e);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lstEmpresas.getItems().addAll(AppEmpresas.empresas);
    }

}
