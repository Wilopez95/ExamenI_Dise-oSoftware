package Edificio;

public abstract class Apartamento implements Cloneable{

    private String Nombre;
    private int Tamaño;
    private String Color;
    private float Precio;
    private int Habitaciones;
    private int Comedor;
    private int Baño;
    private int Cocina;
    private boolean ocupado;


    public Apartamento(String nombre , int tamaño , String color , float precio,int habitaciones , int comedor , int baño , int cocina){
        this.Nombre = nombre;
        this.Tamaño = tamaño;
        this.Color = color;
        this.Precio = precio;
        this.Habitaciones = habitaciones;
        this.Comedor = comedor;
        this.Cocina = cocina;
        this.ocupado = false;
    }

    public void getDescription(){

    }

    //Metodo para clonar
    public Object Clone(){
        Object clone=null;

        try {
            clone = super.clone();
        }catch (CloneNotSupportedException c){
            c.printStackTrace();
        }
        return clone;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getTamaño() {
        return Tamaño;
    }

    public void setTamaño(int tamaño) {
        Tamaño = tamaño;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float precio) {
        Precio = precio;
    }

    public int getHabitaciones() {
        return Habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        Habitaciones = habitaciones;
    }

    public int getComedor() {
        return Comedor;
    }

    public void setComedor(int comedor) {
        Comedor = comedor;
    }

    public int getBaño() {
        return Baño;
    }

    public void setBaño(int baño) {
        Baño = baño;
    }

    public int getCocina() {
        return Cocina;
    }

    public void setCocina(int cocina) {
        Cocina = cocina;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
}
