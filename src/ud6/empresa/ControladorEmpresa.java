package ud6.empresa;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

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
    private MenuBar menu;

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

    @FXML
    void abrir(ActionEvent event) {

    }

    @FXML
    void guardar(ActionEvent event) {
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Guardar");
        chooser.setInitialDirectory(null);
        chooser.setInitialFileName("empresas.txt");

        File file = chooser.showSaveDialog(null);

        try (BufferedWriter out = new BufferedWriter(new FileWriter("empresas.txt"))) {
            for (Empresa e : lstEmpresas.getItems()) {
                out.write(e.toString());
                out.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error de I/O");
        }
        
    }

}
