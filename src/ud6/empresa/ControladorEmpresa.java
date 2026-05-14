package ud6.empresa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

public class ControladorEmpresa implements Initializable {

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
        int id = Integer.parseInt(txtId.getText());
        
        Empresa buscada = new Empresa(id);
        int i = lstEmpresas.getItems().indexOf(buscada);

        if (i != -1) {
            Empresa nueva = new Empresa(id, txtNombre.getText(), txtWeb.getText());

            lstEmpresas.getItems().set(i, nueva);
        }

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
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Abrir archivo");

        File file = chooser.showOpenDialog(null);

        if (file == null) {
            return;
        }

        try (BufferedReader in = new BufferedReader(new FileReader(file))) {
            lstEmpresas.getItems().clear();

            List<String> lineas = in.readAllLines();
            for (String linea : lineas) {
                int posPrimerEspacio = linea.indexOf(' ');
                int id = Integer.parseInt(linea.substring(0, posPrimerEspacio));
                String nombre = linea.substring(posPrimerEspacio + 2);
                lstEmpresas.getItems().add(new Empresa(id, nombre, null));
            }

        } catch (IOException e) {
            System.out.println("Error de I/O");
        }

    }

    @FXML
    void guardar(ActionEvent event) {
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Guardar archivo");
        chooser.setInitialFileName("empresas.txt");

        File file = chooser.showSaveDialog(null);

        if (file == null) {
            return;
        }

        try (BufferedWriter out = new BufferedWriter(new FileWriter(file))) {
            for (Empresa e : lstEmpresas.getItems()) {
                out.write(e.toString());
                out.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error de I/O");
        }

    }

    @FXML
    void cerrar(ActionEvent event) {
        Platform.exit();
    }

}
