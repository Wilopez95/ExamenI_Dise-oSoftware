package View;

import Controller.MainController;
import Factura.Factura;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class Factura_UI {
    MainController maincontroller = MainController.getInstance();



    @FXML
    private TextField tipo_mueble;

    @FXML
    private TextField tipo_azulejo;

    @FXML
    private Label habitacion;

    @FXML
    private Label comedor;

    @FXML
    private VBox baños;

    @FXML
    private Label cocina;

    @FXML
    private Label balcon;

    @FXML
    private Label lavanderia;

    @FXML
    private Label prima;

    @FXML
    private Label mensualidad;

    @FXML
    private Label precio;


}

