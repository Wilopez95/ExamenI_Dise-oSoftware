import Controller.MainController;
import View.Login_UI;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;





public class Main extends Application{
    static MainController maincontroller;
    static Login_UI login = new Login_UI();
    private static Stage window;

    public static void main(String[] args) {
        maincontroller = MainController.getInstance();
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Main.window = stage;
        stage.setTitle("Eco Hogar");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("View/Login.fxml"));
        loader.setController(login);
        Scene scene = (new Scene(loader.load(),992,643));
        stage.setResizable(false);
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
        maincontroller.setStage(stage);
    }




}