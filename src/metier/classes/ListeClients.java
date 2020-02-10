/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier.classes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Acer
 */
public class ListeClients {
      private static int nbClient = 0;    
    /**
     * @return the nbClient
     */
    public static int getNbClient() {
        return nbClient;
    }

    /**
     * @param aNbClient the nbClient to set
     */
    public static void setNbClient(int aNbClient) {
        nbClient = aNbClient;
    }
    // Liste des clients 
    private static List<Client> listeClient = new ArrayList<Client>();

    /**
     * @return the listeClient
     */
    public static List<Client> getListeClient() {
        return listeClient;
    }
    /**
     * Modification de la liste des clients : méthode de classe
     * @param client : client de la classe Client
     * @param ancClient : client avant modif : sert à récupérer l'index de l'objet à modifier
     */
    public static void modif(Client client, Client ancClient)
    {

        int index = listeClient.indexOf(ancClient);
        listeClient.set(index, client);
    }
    
    /**
     * Ajout dans la liste des clients : méthode de classe
     * @param client : de la classe Client
     */
    public static void ajout(Client client)
    {
        listeClient.add(client);
    }
    public static Comparator<Client> comparatorNom = (Client  c1, Client  c2)
            -> c1.getRsSociete().toUpperCase().compareTo(c2.getRsSociete().toUpperCase());
    
    // classe static: classe incluse dans une autre classe
    public static class TriListeClient implements Comparator<Client> {

        @Override
        public int compare(Client  c1, Client  c2)
        {

            return c1.getRsSociete().toUpperCase().compareTo(c2.getRsSociete().toUpperCase());
        }
    }
}




