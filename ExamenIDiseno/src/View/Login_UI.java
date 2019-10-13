package View;

import Controller.MainController;
import Login.LoginSingleton;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import sun.tools.jar.Main;


public class Login_UI {
    MainController maincontroller = MainController.getInstance();;

        @FXML
        private TextField user;

        @FXML
        private PasswordField pass;

        @FXML
        private Label errormsj;

        @FXML
        void OnClick(ActionEvent event) {
            if (user.getText().isEmpty() || pass.getText().isEmpty()) {
                errormsj.setText("Datos inválidos");
            } else {

                if (maincontroller.IniciarSesion(user.getText(), pass.getText()) > 0) {
                    try {
                        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Compra.fxml"));
                        Parent root1 = (Parent) fxmlLoader.load();
                        Stage stage = new Stage();
                        stage.setTitle("Comprar");
                        stage.setScene(new Scene(root1));
                        stage.setMaximized(true);
                        stage.show();
                        maincontroller.getStage().close();
                        maincontroller.setStage(stage);




                    }catch (Exception e){

                    }
                } else {
                    errormsj.setText("Datos incorrectos");
                }
            }
        }

    }



