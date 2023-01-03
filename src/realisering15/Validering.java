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

    public static boolean textFaltHarVarde(JTextField ettTextFalt) {
        boolean resultat = true;

        if (ettTextFalt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Inmatningsrutor får ej lämnas tomma!");
            resultat = false;
        }
        return resultat;
    }

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

}
