package Edificio;

import java.util.Hashtable;

public class ApartamentCache {

    private static Hashtable<String,Apartamento> ApartamentCache ;
    ApartamentFactoryMethod factory;

    public ApartamentCache(){
        //Creacion de el hash de apartamentos.
        ApartamentCache = new Hashtable<String,Apartamento>();

        //Crecion de la fabrica
        factory = new ApartamentFactory();

        //Cargar la cache de apartamentos
        LoadCache();
    }


    //Optiene un clon de un departamento.
    public static Apartamento getApartament(String id){
        Apartamento apartamentoCache = ApartamentCache.get(id);
        return (Apartamento)apartamentoCache.Clone();
    }

    private void LoadCache(){
        Apartamento A= factory.crearApartamento(10);
        ApartamentCache.put("A",A);
        Apartamento B= factory.crearApartamento(20);
        ApartamentCache.put("B",B);
        Apartamento C= factory.crearApartamento(30);
        ApartamentCache.put("C",C);
    }

}
