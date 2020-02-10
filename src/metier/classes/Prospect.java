/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier.classes;

import java.util.Date;

/**
 * Classe Prospect héritée de la classe abstraite Societe
 * @author Acer
 */
public class Prospect extends Societe {
    public enum Interre {
        oui,
        non;
    }
    private Date dateProspection;
    private int interresse;

    public int getInterresse() {
        return interresse;
    }

    public void setInterresse(int interresse) {
        this.interresse = interresse;
    }
    
    /**
     * @return the dateProspection
     */
    public final Date getDateProspection() {
        return dateProspection;
    }

    /**
     * @param dateProspection the dateProspection to set
     */
    public final void setDateProspection(Date dateProspection) {
        this.dateProspection = dateProspection;
    }
    /**
     * constructeur par défaut
     */
    public Prospect()
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
    public Prospect(int IdSociete, String RsSociete, String AdrSociete,long CaSociete) throws Exception
    {
        super (IdSociete,RsSociete,AdrSociete, CaSociete);
    }
    
    /**
     * 
     * Constructeur avec l' Id du client, sa raison sociale, son adresse et son chiffre d'affaire hérité de la classe Societe
     * @param IdSociete : Identifiant de la société
     * @param RsSociete : Raison sociale de la société
     * @param AdrSociete : adresse de la société
     * @param CaSociete : chiffre d'affaire de la société
     * @param dateProspection : date de prospection
     * @throws Exception 
     */
    public Prospect(int IdSociete, String RsSociete, String AdrSociete,long CaSociete, Date dateProspection, int interre) throws Exception
    {
        super (IdSociete,RsSociete,AdrSociete, CaSociete);
        this.setDateProspection(dateProspection);
        this.setInterresse(interre);
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
     * @param dateProspection : date de prospection
     * @throws Exception 
     */    
    public Prospect(int IdSociete,
            String RsSociete,
            String TypeSociete,
            String DomaineSociete,
            String AdrSociete,
            String TelSociete,
            long CaSociete,
            String CommentaireSociete,
            long NbreEmplSociete,
            Date dateProspection) throws Exception
    {
        super(IdSociete,RsSociete,TypeSociete,DomaineSociete,AdrSociete,
        TelSociete,CaSociete,CommentaireSociete,NbreEmplSociete);
        this.setDateProspection(dateProspection);
    }
    public Prospect(int IdSociete,
            String RsSociete,
            String TypeSociete,
            String DomaineSociete,
            String AdrSociete,
            String TelSociete,
            long CaSociete,
            String CommentaireSociete,
            long NbreEmplSociete,
            Date dateProspection,
            int interresse) throws Exception
    {
        super(IdSociete,RsSociete,TypeSociete,DomaineSociete,AdrSociete,
        TelSociete,CaSociete,CommentaireSociete,NbreEmplSociete);
        this.setDateProspection(dateProspection);
        this.setInterresse(interresse);
    }
    
    /**
     * Initialisation de la liste des prospects : méthode de classe
     * @throws Exception : viennent de la classe métier Client
     */
    public static void initListeProspect() throws Exception
    {
        Date aujourdhui = new Date();
        Prospect prospect = new Prospect();
        prospect.setIdSociete(1);
        prospect.setRsSociete("Asus");
        prospect.setAdrSociete("ici");
        prospect.setCaSociete(1000000);
        prospect.setDateProspection(aujourdhui);
        ListeProspects.getListeProspects().add(prospect);
        prospect = new Prospect(3,"lenovo","null part", 3000000, aujourdhui,0);
        ListeProspects.getListeProspects().add(prospect);
        ListeProspects.setNbPropects(3);
        prospect = new Prospect(2,"Hyndai","ailleurs", 2000, aujourdhui,1);
        ListeProspects.getListeProspects().add(prospect);
    }
    
}
