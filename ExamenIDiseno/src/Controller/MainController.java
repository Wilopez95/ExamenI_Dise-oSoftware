package Controller;

import Edificio.Edificio;
import Edificio.Apartamento;
import Factura.Factura;
import Login.LoginSingleton;
import  Factura.Extra;
import View.Compra_UI;
import View.Login_UI;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController   {

    private static MainController singleton;
    LoginSingleton loginSingleton;

    Factura factura;
    Extra extra;
    Edificio edificio;
    Stage stage;


    private MainController(){
        loginSingleton = LoginSingleton.getInstance();
        edificio = new Edificio();

        //viewLogin();
        ///viewCompra();
        //Test
        //IniciarSesion();
        //Test
        //viewcontroller.viewLogin();

        //Obtener un edificio
        //edificio.getApartamentoB("B8").getDescription();

        //Compra(edificio.getApartamentoB("B8"));

    }

    private static synchronized void createinstance(){
        if(singleton == null){
            singleton =  new MainController();
        }
    }

    public static MainController getInstance(){
        if(singleton == null){
            createinstance();
        }
        return singleton;
    }

    public int IniciarSesion(String user , String pass){
       return loginSingleton.Login(user,pass);
    }


    public void Compra(Apartamento aparta){
        factura =  new Factura(aparta , "Wilopez");
    }

    public Factura getFactura(){
        return factura;
    }

    public void AddExtraFactura(){
        factura.addExtra(extra);
    }

    public Apartamento getApartament(String AptName){
        Apartamento apartamento = null;
        if(AptName =="A"){
            apartamento = edificio.getApartamentoA("A1");
        }else if(AptName =="B"){
            apartamento = edificio.getApartamentoB("B1");
        }else{
            apartamento = edificio.getApartamentoC("C1");
        }
        return apartamento;
    }

    public Stage getStage(){
        return stage;
    }

    public void setStage(Stage sta){
        this.stage = sta;
    }

    public void viewCompra(){
        Compra_UI compra = new Compra_UI();
    }

}
