/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package realisering15;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Grupp15
 */
public class AlienInloggning extends javax.swing.JFrame {

    private static InfDB databas;
    private String id = null;

    /**
     * Creates new form AlienInloggning
     */
    public AlienInloggning(InfDB databas) {
        initComponents();
        this.databas = databas;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblValkommenAlien = new javax.swing.JLabel();
        lblIDNr = new javax.swing.JLabel();
        lblLösenord = new javax.swing.JLabel();
        txtIDNr = new javax.swing.JTextField();
        txtPLosen = new javax.swing.JPasswordField();
        btnLoggaIn = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblValkommenAlien.setText("Välkommen Alien!");

        lblIDNr.setText("ID-nummer");

        lblLösenord.setText("Lösenord");

        btnLoggaIn.setText("Logga in");
        btnLoggaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaInActionPerformed(evt);
            }
        });

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(lblValkommenAlien))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIDNr)
                            .addComponent(lblLösenord)
                            .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLoggaIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIDNr, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(txtPLosen))))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(lblValkommenAlien)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDNr)
                    .addComponent(txtIDNr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLösenord)
                    .addComponent(txtPLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoggaIn)
                    .addComponent(btnTillbaka))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metod som kontrollerar om inloggningsuppgifterna är korrekta och om de
     * stämmer sedan loggar in användaren och för användaren till ett nytt
     * fönster med val
     */
    private void btnLoggaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaInActionPerformed
        if (Validering.textFaltHarVarde(txtIDNr) && Validering.textFaltHarVarde(txtPLosen) && Validering.isHeltal(txtIDNr)) {
            try {
                id = txtIDNr.getText();
                String rattLosen = "SELECT losenord FROM alien where alien_id=" + id;
                String svarLosen = databas.fetchSingle(rattLosen);
                //Dekryptering av JPassword
                char[] losenKrypt = txtPLosen.getPassword();
                String losenOkrypt = new String(losenKrypt);

                if (losenOkrypt.equals(svarLosen)) {
                    new AlienFonster(databas, id).setVisible(true);
                    AlienInloggning.this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Felaktigt lösenord");
                }
            } catch (InfException ex) {
                JOptionPane.showMessageDialog(null, "Inget resultat hittades");
                System.out.println("Internt felmeddelande" + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnLoggaInActionPerformed

    /**
     * Metod som tar användaren tillbaka till startsidan
     */
    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        AlienInloggning.this.dispose();
        new Start(databas).setVisible(true);
    }//GEN-LAST:event_btnTillbakaActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoggaIn;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JLabel lblIDNr;
    private javax.swing.JLabel lblLösenord;
    private javax.swing.JLabel lblValkommenAlien;
    private javax.swing.JTextField txtIDNr;
    private javax.swing.JPasswordField txtPLosen;
    // End of variables declaration//GEN-END:variables
}
