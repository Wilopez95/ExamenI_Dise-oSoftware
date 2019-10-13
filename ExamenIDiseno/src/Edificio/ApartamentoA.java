package Edificio;

public class ApartamentoA extends Apartamento {

    public ApartamentoA(String nombre , int tamaño , String color ,float precio, int habitaciones , int comedor , int baño , int cocina){
        super(nombre,tamaño,color,precio,habitaciones,comedor,baño,cocina);


    }

    public void getDescription(){
        System.out.println("soy un apartamento tipo A: "+this.getNombre());
    }
}
