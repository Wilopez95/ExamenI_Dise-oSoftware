package Edificio;


import java.util.ArrayList;

public class Edificio {

    ApartamentCache apartamentCache = new ApartamentCache();
    ArrayList<Apartamento> ListaAptsA = new ArrayList<Apartamento>();
    ArrayList<Apartamento> ListaAptsB = new ArrayList<Apartamento>();
    ArrayList<Apartamento> ListaAptsC = new ArrayList<Apartamento>();


    public Edificio(){
        for(int i=0; i<10; i++){
            Apartamento clonA = (Apartamento) apartamentCache.getApartament("A");
            clonA.setNombre("A"+(i+1));
            ListaAptsA.add(clonA);
            Apartamento clonB = (Apartamento) apartamentCache.getApartament("B");
            clonB.setNombre("B"+(i+1));
            ListaAptsB.add(clonB);
            Apartamento clonC = (Apartamento) apartamentCache.getApartament("C");
            clonC.setNombre("C"+(i+1));
            ListaAptsC.add(clonC);
        }

        /*for(int i=0; i<ListaAptsA.size(); i++){
            System.out.println(ListaAptsB.get(i).getNombre());
        }*/



    }

    public ArrayList<Apartamento> getApartamentList(String id){
        if (id=="A"){
            return ListaAptsA;
        }else if(id=="B"){
            return ListaAptsB;
        }else{
            return ListaAptsC;
        }
    }

    public Apartamento getApartamentoA(String Nombre){
        Apartamento aparta = null;
        for (int i = 0; i<ListaAptsA.size();i++){
            if (ListaAptsA.get(i).getNombre().equals(Nombre)){
                aparta =  ListaAptsA.get(i);
            }
        }
        return aparta;
    }

    public Apartamento getApartamentoB(String Nombre){
        Apartamento aparta= null;
        for (int i = 0; i<ListaAptsB.size();i++){
            if (ListaAptsB.get(i).getNombre().equals(Nombre)){
                    aparta =  ListaAptsB.get(i);
            }
        }
        return aparta;
    }

    public Apartamento getApartamentoC(String Nombre){
        Apartamento aparta= null;
        for (int i = 0; i<ListaAptsC.size();i++){
            if (ListaAptsC.get(i).getNombre().equals(Nombre)){
                aparta =  ListaAptsC.get(i);
            }
        }
        return aparta;
    }





}
