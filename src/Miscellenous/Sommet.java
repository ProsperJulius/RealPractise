package Miscellenous;

import java.util.*;

import static java.lang.Math.abs;

public class Sommet {

    private String nom;
    public Map<Sommet,Integer> voisins;
    public Sommet(String nom){
        this.nom=nom;
        this.voisins= new HashMap<>();
    }
    public void ajouterSommet(Sommet voisin, int distance){
        if(voisin!=null){
        voisins.put(voisin,distance);}
    }
    public int distance(Sommet sommet){
        if(sommet!=null){
            int result= voisins.get(sommet);
            if(result>=1){
                return result;
            }
        }
        return -1;
    }
    public Iterator<Sommet>  voisins(){
        return voisins.keySet().iterator();
    }
    public String getNom(){
        return nom;
    }
   public boolean isVoisin(Sommet sommet){
       while(voisins().hasNext()){
           if(voisins().next().nom.equals(sommet.getNom())){
               return true;
           }
       }
       return false;
   }
    @Override
    public String toString() {
        return "Sommet{" +
                "nom='" + nom + '\'' +
                ", voisins=" + voisins +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sommet)) return false;
        Sommet sommet = (Sommet) o;
        return Objects.equals(nom, sommet.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom);
    }
}
