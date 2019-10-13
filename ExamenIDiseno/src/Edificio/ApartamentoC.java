package Edificio;

public class ApartamentoC extends Apartamento{
    private int Lavanderia;

    public ApartamentoC (String nombre , int tamaño , String color ,float precio, int habitaciones , int comedor , int baño , int cocina , int lavanderia){
        super(nombre,tamaño,color,precio,habitaciones,comedor,baño,cocina);
        this.Lavanderia = lavanderia;
    }

    public void getDescription(){
        System.out.println("soy un apartamento tipo C");
    }

    public int getLavanderia() {
        return Lavanderia;
    }

    public void setLavanderia(int lavanderia) {
        Lavanderia = lavanderia;
    }
}
