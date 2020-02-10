/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier.classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class ListeProspects {
    private static int nbPropects;

    public static int getNbPropects() {
        return nbPropects;
    }

    public static void setNbPropects(int nbPropects) {
        ListeProspects.nbPropects = nbPropects;
    }
    private static List<Prospect> listeProspects = new ArrayList<Prospect>();

    /**
     * @return the listeProspects
     */
    public static List<Prospect> getListeProspects() {
        return listeProspects;
    }
    /**
     * modification de la liste des prospects : méthode de classe
     * @param prospect : prospect à modifié
     * @param ancProspect : prospect avant modif : sert à récupérer l'index de l'objet à modifier
     */
    public static void modif(Prospect prospect, Prospect ancProspect)
    {
        int index = listeProspects.indexOf(ancProspect);
        listeProspects.set(index, prospect);
    }
    
    /**
     * ajout d'un objet dans la liste des prospects
     * @param prospect 
     */
    public static void ajout(Prospect prospect)
    {
        listeProspects.add(prospect);
    }
}
