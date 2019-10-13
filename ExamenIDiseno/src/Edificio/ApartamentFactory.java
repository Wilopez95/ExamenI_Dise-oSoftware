package Edificio;

public class ApartamentFactory implements ApartamentFactoryMethod {

    @Override
    public Apartamento crearApartamento(int Tamaño){
        if(Tamaño == 10){
            return new ApartamentoA("A",10,"Blanco",50000,1, 1 , 1 ,1 );
        }else if (Tamaño == 20){
            return  new ApartamentoB("B",20,"Blanco",100000,2, 1 , 1 ,1 ,1);
        }else{
            return new ApartamentoC("C",30,"Blanco",1500000,3, 1 , 2 ,1 ,1);
        }
    }
}
