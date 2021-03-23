package Miscellenous;

import java.util.*;

public class Chemin implements Iterator {
    public Sommet debut;
    public Sommet suite;
    public double longueur;
    public Chemin(Sommet debut){
        this.debut =debut;
        this.suite=null;
        this.longueur=0;
    }
    protected Chemin(Chemin debut, Sommet suite) throws Exception {
       this.debut=debut.debut;
       if(debut.suite.isVoisin(suite)){
           this.suite= suite;
       }else{
           throw new Exception("Changer la longueur du chemin");
       }

    }
    public Sommet arrivee(){
        return this.suite;
    }
    public Collection<Chemin> etendre() throws Exception {
        List<Chemin> concatanationSommet= new ArrayList<>();
        Sommet finSommet = this.arrivee();
        Iterator<Sommet> voisinsIterator = finSommet.voisins();
        while(voisinsIterator.hasNext()){
            Chemin newChemin = new Chemin(this, voisinsIterator.next());
            if(!hasCycle(newChemin)){
                concatanationSommet.add(newChemin);
            }
        }
        return concatanationSommet;

    }
    public boolean hasCycle(Chemin chemin){
        HashSet<Sommet> setOfSommets = new HashSet<>();
        while (chemin.hasNext()){
            if(setOfSommets.contains(chemin.next())){
                return true;
            }

        }
        return false;

    }


    @Override
    public boolean hasNext() {
        if(this.debut !=null){
            return true;
        }
        return false;
    }

    @Override
    public Sommet next() {
        Sommet clonedDebut=this.debut;
        this.debut=suite;
        return clonedDebut;
    }

    @Override
    public String toString() {
        return "Chemin{" +
                "debut=" + debut +
                ", suite=" + suite +
                ", longueur=" + longueur +
                '}';
    }
}
