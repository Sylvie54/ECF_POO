/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier.classes;

// import java.util.Date;

import metier.exceptions.MetiersException;


/**
 * Classe Client : gère les clients
 * Hérite de la classe abstraite Societe
 * @author Sylvie
 */
public class Client extends Societe {
    
    // attributs suplémentaires de la classe Client
    
    private int nbContrats;
    private float montantContrats;
 
    /**
     * Nombre des contrats
     * @return the nbContrats
     */
    public final int getNbContrats() {
        return this.nbContrats;
    }

    /**
     * Nombre des contrats
     * @param nbContrats the nbContrats to set
     */
    public final void setNbContrats(int nbContrats) {
        this.nbContrats = nbContrats;
    }

    /**
     * Montant des contrats du client
     * @return the montantContrats
     */
    public final float getMontantContrats() {
        return this.montantContrats;
    }

    /**
     * Montant des contrats du client
     * @param montantContrats the montantContrats to set
     */
    public final void setMontantContrats(float montantContrats) {
        this.montantContrats = montantContrats;
    }
    
     /**
     * Constructeur par défaut
     */
    public Client()
    {
        
    } 
    
   
    /**
     * 
     * Constructeur avec l' Id du client, sa raison sociale, son adresse et son chiffre d'affaire hérité de la classe Societe
     * @param IdSociete : Identifiant de la société
     * @param RsSociete : Raison sociale de la société
     * @param AdrSociete : adresse de la société
     * @param CaSociete : chiffre d'affaire de la société
     * @throws Exception 
     */
    public Client(int IdSociete,
            String RsSociete,
            String AdrSociete,
            long CaSociete)
        throws MetiersException
    {
       super (IdSociete,RsSociete,AdrSociete, CaSociete);
    }
    /**
     * 
     * @param IdSociete : Identifiant de la société
     * @param RsSociete : Raison sociale de la société
     * @param AdrSociete : adresse de la société
     * @param CaSociete : chiffre d'affaire de la société
     * @param nbContrats : nombre de contrats
     * @throws Exception 
     */
    public Client(int IdSociete,
            String RsSociete,
            String AdrSociete,
            long CaSociete,
            int nbContrats)
       throws MetiersException
    {
       super (IdSociete,RsSociete,AdrSociete, CaSociete);
       this.setNbContrats(nbContrats);
    }
    
     /**
     * 
     * Constructeur de la totalité des attributs de la classe Client
     * @param IdSociete : Identifiant de la société
     * @param RsSociete : Raison sociale de la société
     * @param TypeSociete : type de la société
     * @param DomaineSociete : domaine de la société
     * @param AdrSociete : adresse de la société
     * @param TelSociete : téléphone de la société
     * @param CaSociete : chiffre d'affaire de la société
     * @param CommentaireSociete : commentaire si besoin
     * @param NbreEmplSociete : nombre d'employés de la société
     * @param nbContrats : nombre de contrats
     * @param montantContrats : montant des contrats
     * @throws Exception 
     */
    public Client(int IdSociete,
            String RsSociete,
            String TypeSociete,
            String DomaineSociete,
            String AdrSociete,
            String TelSociete,
            long CaSociete,
            String CommentaireSociete,
            long NbreEmplSociete,
            int nbContrats, float montantContrats)
        throws MetiersException
    {
        super(IdSociete,RsSociete,TypeSociete,DomaineSociete,AdrSociete,
         TelSociete,CaSociete,CommentaireSociete,NbreEmplSociete);
        this.setNbContrats(nbContrats);
        this.setMontantContrats(montantContrats);
    } 
    
    
    /**
     * Initialisation de la liste des clients : méthode de classe
     * @throws Exception : viennent de la classe métier Client
     */
    public static void initListeClient() throws Exception
    {
        Client client = new Client();
        client.setIdSociete(1);
        client.setRsSociete("Renault");
        client.setAdrSociete("ici");
        client.setCaSociete(1000000);
        client.nbContrats = 210;
        ListeClients.getListeClient().add(client);
        client = new Client(2,"Citroën","ailleurs", 2000,5);
        ListeClients.getListeClient().add(client);
        client = new Client(3,"Peugeot","null part", 3000000,30);
        ListeClients.getListeClient().add(client);
        ListeClients.setNbClient(3);
    }
    
    
   
}

