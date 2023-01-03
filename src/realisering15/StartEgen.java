/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package realisering15;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 * @author Grupp15
 */
public class StartEgen {
    private static InfDB databas;
    
    public static void main(String[] args) {
        try {
            databas = new InfDB("mibdb", "3306", "mibdba", "mibkey");
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Kontakt med databas misslyckades");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }

        new Start(databas).setVisible(true);
    }
}