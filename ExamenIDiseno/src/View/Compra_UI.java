package View;



import Controller.MainController;
import Edificio.Apartamento;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Builder;

import java.util.Optional;

public class Compra_UI {
    MainController maincontroller = MainController.getInstance();
    Factura_UI factura_ui = new Factura_UI();
    private String tipoaprt;
    Apartamento apartamento;

    @FXML
    private ImageView img1;

    @FXML
    private ImageView img2;

    @FXML
    private ImageView img3;

    @FXML
    private Label room;

    @FXML
    private Label dinner;

    @FXML
    private Label bath;

    @FXML
    private Label kitchen;

    @FXML
    private Label balcon;

    @FXML
    private Label loundry;

    @FXML
    private Label price;


    @FXML
    void OnClick(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmación");
        alert.setHeaderText("");
        alert.setContentText("¿Seguro que desea comprar este apartamento?");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Factura.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setTitle("Factura");
                fxmlLoader.setController(factura_ui);
                stage.setScene(new Scene(root1));
                stage.setMaximized(true);
                stage.show();
                maincontroller.getStage().close();
                maincontroller.setStage(stage);
                maincontroller.Compra(apartamento);


            }catch (Exception e){
                System.out.println(e);
            }
        }
    }

    @FXML
    void OnClickA(ActionEvent event){
        tipoaprt = "A";
        apartamento = maincontroller.getApartament("A");
        img1.setImage(new Image("View/assets/A1.png"));
        img2.setImage(new Image("View/assets/A2.png"));
        img3.setImage(new Image("View/assets/A3.png"));
        room.setText("Habitaciones : 1");
        dinner.setText("Comedor : 1");
        bath.setText("Baños : 1");
        kitchen.setText("Cocinas : 1");
        loundry.setText("");
        balcon.setText("");
        price.setText("Precio : "+apartamento.getPrecio()+"$");
    }

    @FXML
    void OnClickB(ActionEvent event) {
        tipoaprt = "B";
        apartamento = maincontroller.getApartament("B");
        img1.setImage(new Image("View/assets/B1.png"));
        img2.setImage(new Image("View/assets/B2.png"));
        img3.setImage(new Image("View/assets/B3.png"));
        room.setText("Habitaciones : 2");
        dinner.setText("Comedor : 1");
        bath.setText("Baños : 1");
        kitchen.setText("Cocinas : 1");
        loundry.setText("");
        balcon.setText("Balcon : 1");
        price.setText("Precio : "+apartamento.getPrecio()+"$");

    }

    @FXML
    void OnClickC(ActionEvent event) {
        tipoaprt = "C";
        apartamento = maincontroller.getApartament("C");
        img1.setImage(new Image("View/assets/C1.png"));
        img2.setImage(new Image("View/assets/C2.png"));
        img3.setImage(new Image("View/assets/C3.png"));
        room.setText("Habitaciones : 3");
        dinner.setText("Comedor : 1");
        bath.setText("Baños : 2");
        kitchen.setText("Cocinas : 1");
        loundry.setText("Lavanderia 1");
        balcon.setText("Balcon : 1");
        price.setText("Precio : "+apartamento.getPrecio()+"$");

    }

}
