/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package realisering15;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * @author Grupp15
 */
public class Validering {
    //Kontrollerar om det har fyllts i ett värde
    public static boolean textFaltHarVarde(JTextField ettTextFalt) {
        boolean resultat = true;

        if (ettTextFalt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Inmatningsrutor får ej lämnas tomma!");
            resultat = false;
        }
        return resultat;
    }
    //Kontrollerar om värdet som fyllts i är ett heltal
    public static boolean isHeltal(JTextField ettTextFalt) {
        boolean resultat = true;

        try {
            Integer.parseInt(ettTextFalt.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Var god ange heltal!");
            resultat = false;
        }
        return resultat;
    }
    //Kontrollerar om värdet som fyllts i är positivt
    public static boolean isPositivt(JTextField ettTextFalt) {
        boolean resultat = true;
        int ettTextFaltSiffra = Integer.parseInt(ettTextFalt.getText());
        if(ettTextFaltSiffra < 0)
            {
                JOptionPane.showMessageDialog(null, "Var god ange ett positivt tal!");
                resultat = false;
            }
        return resultat;
    }

}
