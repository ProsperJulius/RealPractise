package Miscellenous;

import java.util.HashMap;
import java.util.Map;
import java.util.Spliterator;

public class Graphe {
    Map<String, Sommet> associationSommet;

    public Graphe(){
        associationSommet=new HashMap<>();
    }
    private Sommet getOrCreate(String nomSommet){
        Sommet sommet= associationSommet.get(nomSommet);
        if(sommet!=null){
            return sommet;
        }else{
            Sommet newSommet=new Sommet(nomSommet);
            associationSommet.put(nomSommet,newSommet);
            return newSommet;
        }
    }
    public void ajouterArete(String nomSommet1, String nomSommet2, int distance){
        Sommet sommetOne= new Sommet(nomSommet1);
        Sommet sommetTwo = new Sommet(nomSommet2);
        getOrCreate(nomSommet1);
        getOrCreate(nomSommet2);
        sommetOne.ajouterSommet(sommetTwo,distance);
        sommetTwo.ajouterSommet(sommetOne,distance);


    }
    public Chemin plusCoursChemin(String nomSommetDebut, String
            nomSommetFin){
        return null;
    }

    @Override
    public String toString() {
        return "Graphe{" +
                "associationSommet=" + associationSommet +
                '}';
    }
}
