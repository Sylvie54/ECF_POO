/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecf.client.prospect;

import frames.MenuPrincipal;
import javax.swing.JOptionPane;
import metier.classes.Client;
import metier.classes.Prospect;
/**
 * application gérant des clients et des prospects
 * @author Sylvie
 */
public class ECFClientProspect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            
            // méthode de classe de la classe Client : initListeClient()
            Client.initListeClient();
            // méthode de classe de la classe Prospect : initListeProspect()
            Prospect.initListeProspect();
        }
        catch (Exception e)
            { JOptionPane.showMessageDialog(null,e.getMessage() , "erreur init listes" , JOptionPane.INFORMATION_MESSAGE);}  
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.setVisible(true);
    } 
    
}
