/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package realisering15;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Grupp15
 */
public class AgentLaggTillVapen extends javax.swing.JFrame {

    private static InfDB databas;
    private String id = null;

    /**
     * Creates new form AgentLaggTillVapen
     */
    public AgentLaggTillVapen(InfDB databas, String id) {
        this.id = id;
        this.databas = databas;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLaggTillVapenTillbaka = new javax.swing.JButton();
        lblVapenRubrik = new javax.swing.JLabel();
        txtVapenUtrID = new javax.swing.JTextField();
        txtVapenNamn = new javax.swing.JTextField();
        txtVapenKal = new javax.swing.JTextField();
        btnVapenReg = new javax.swing.JButton();
        lblVapenUtrID = new javax.swing.JLabel();
        lblVapenNamn = new javax.swing.JLabel();
        lblVapenKal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLaggTillVapenTillbaka.setText("Tillbaka");
        btnLaggTillVapenTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillVapenTillbakaActionPerformed(evt);
            }
        });

        lblVapenRubrik.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblVapenRubrik.setText("Lägg till vapen");
        lblVapenRubrik.setAlignmentY(0.0F);

        txtVapenUtrID.setAlignmentY(0.0F);

        txtVapenNamn.setAlignmentY(0.0F);

        txtVapenKal.setAlignmentY(0.0F);

        btnVapenReg.setText("Registrera");
        btnVapenReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVapenRegActionPerformed(evt);
            }
        });

        lblVapenUtrID.setText("Utrustnings ID");
        lblVapenUtrID.setAlignmentY(0.0F);

        lblVapenNamn.setText("Benämning");
        lblVapenNamn.setAlignmentY(0.0F);

        lblVapenKal.setText("Kaliber");
        lblVapenKal.setAlignmentY(0.0F);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLaggTillVapenTillbaka)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVapenReg)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblVapenRubrik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblVapenNamn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtVapenUtrID)
                    .addComponent(lblVapenUtrID)
                    .addComponent(txtVapenNamn)
                    .addComponent(txtVapenKal, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVapenKal))
                .addGap(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVapenRubrik)
                .addGap(31, 31, 31)
                .addComponent(lblVapenUtrID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVapenUtrID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblVapenNamn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVapenNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblVapenKal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVapenKal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLaggTillVapenTillbaka)
                    .addComponent(btnVapenReg))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metod som tar användaren tillbaka till föregående fönster
     */
    private void btnLaggTillVapenTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillVapenTillbakaActionPerformed
        AgentLaggTillVapen.this.dispose();
    }//GEN-LAST:event_btnLaggTillVapenTillbakaActionPerformed

    /**
     * Metod som lägger till ett vapen med önskat ID, namn och vapen
     */
    private void btnVapenRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVapenRegActionPerformed
        if (Validering.textFaltHarVarde(txtVapenUtrID) && Validering.textFaltHarVarde(txtVapenNamn) && Validering.textFaltHarVarde(txtVapenKal) && Validering.isHeltal(txtVapenUtrID)) {
            try {
                //Ska vara int
                String utrID = txtVapenUtrID.getText();
                //Ska vara string
                String namn = txtVapenNamn.getText();
                //Ska vara Int
                String kal = txtVapenKal.getText();
                //Insert into Utrustning och vapen
                String tillLaggUtr = "insert into utrustning values(" + utrID + ",'" + namn + "')";
                String tillLaggVapen = "insert into vapen values(" + utrID + "," + kal + ")";

                databas.insert(tillLaggUtr);
                databas.insert(tillLaggVapen);
                JOptionPane.showMessageDialog(null, "Ett nytt vapen har registrerats");
            } catch (InfException ex1) {
                JOptionPane.showMessageDialog(null, "Registreringen misslyckades, försök igen");
                System.out.println("Internt felmeddelande" + ex1.getMessage());
            }
        }
    }//GEN-LAST:event_btnVapenRegActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLaggTillVapenTillbaka;
    private javax.swing.JButton btnVapenReg;
    private javax.swing.JLabel lblVapenKal;
    private javax.swing.JLabel lblVapenNamn;
    private javax.swing.JLabel lblVapenRubrik;
    private javax.swing.JLabel lblVapenUtrID;
    private javax.swing.JTextField txtVapenKal;
    private javax.swing.JTextField txtVapenNamn;
    private javax.swing.JTextField txtVapenUtrID;
    // End of variables declaration//GEN-END:variables
}
