package Edificio;

public class ApartamentoB extends Apartamento {
    private int Balcon;

    public ApartamentoB(String nombre , int tamaño , String color ,float precio, int habitaciones , int comedor , int baño , int cocina , int balcon){
        super(nombre,tamaño,color,precio,habitaciones,comedor,baño,cocina);
        this.Balcon = balcon;
    }

    public void getDescription(){
        System.out.println("soy un apartamento tipo B: "+this.getNombre());
    }

    public int getBalcon() {
        return Balcon;
    }

    public void setBalcon(int balcon) {
        Balcon = balcon;
    }
}
