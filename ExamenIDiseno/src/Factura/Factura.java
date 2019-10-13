package Factura;

import Edificio.Apartamento;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class Factura {

    private int IDFactura;
    private double Total;
    private double Prima;
    private float Costo_Apartamento;
    private ArrayList<Extra> ListaExtras = new ArrayList<Extra>();
    private String Fecha;
    private String StrinUserId;
    private String NombreApt;
    private PlanDePagos plandepagos;

    public Factura(Apartamento apartamento , String User){

        this.IDFactura = 0;
        this.Total = CalculoTotal(apartamento);
        this.Prima = Total* 0.2;
        this.Costo_Apartamento = apartamento.getPrecio();


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        this.Fecha = dtf.format(now);


        this.StrinUserId = User;
        this.NombreApt = apartamento.getNombre();


    }


    private double CalculoTotal(Apartamento apartamento){
        return 0;
    }

    public void addExtra(Extra extra){
        ListaExtras.add(extra);
    }

    public int getIDFactura() {
        return IDFactura;
    }

    public void setIDFactura(int IDFactura) {
        this.IDFactura = IDFactura;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double total) {
        Total = total;
    }

    public double getPrima() {
        return Prima;
    }

    public void setPrima(double prima) {
        Prima = prima;
    }

    public float getCosto_Apartamento() {
        return Costo_Apartamento;
    }

    public void setCosto_Apartamento(float costo_Apartamento) {
        Costo_Apartamento = costo_Apartamento;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public String getStrinUserId() {
        return StrinUserId;
    }

    public void setStrinUserId(String strinUserId) {
        StrinUserId = strinUserId;
    }

    public String getNombreApt() {
        return NombreApt;
    }

    public void setNombreApt(String nombreApt) {
        NombreApt = nombreApt;
    }
}
