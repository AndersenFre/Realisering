/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package realisering15;

import java.util.ArrayList;
import java.util.Collections;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;

/**
 * @author Grupp15
 */
public class AgentUppdateraAlien extends javax.swing.JFrame {

    private static InfDB databas;
    private String id;

    /**
     * Creates new form AgentUppdateraAlien
     */
    public AgentUppdateraAlien(InfDB databas, String id) {
        initComponents();
        this.id = id;
        this.databas = databas;
        fyllCbValjAlienID();
        fyllCbValjInfo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAndraInfo = new javax.swing.JLabel();
        cbValjAlienID = new javax.swing.JComboBox<>();
        lblGammaltAID = new javax.swing.JLabel();
        lblValjInfo = new javax.swing.JLabel();
        cbValjInfoDuVillAndra = new javax.swing.JComboBox<>();
        lblNyttVarde = new javax.swing.JLabel();
        txtNyttVarde = new javax.swing.JTextField();
        btnAndra = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAndraInfo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAndraInfo.setText("Ändra information om en Alien");

        lblGammaltAID.setText("Välj ett ID:");

        lblValjInfo.setText("Vad vill du ändra?");

        lblNyttVarde.setText("Skriv in ditt nya värde:");

        btnAndra.setText("Ändra");
        btnAndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraActionPerformed(evt);
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
                        .addContainerGap()
                        .addComponent(btnTillbaka)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAndra))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(207, 207, 207)
                                .addComponent(lblGammaltAID))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(199, 199, 199)
                                .addComponent(cbValjAlienID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(175, 175, 175)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbValjInfoDuVillAndra, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(lblValjInfo))
                                    .addComponent(lblNyttVarde, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNyttVarde, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(lblAndraInfo)))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblAndraInfo)
                .addGap(31, 31, 31)
                .addComponent(lblGammaltAID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbValjAlienID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblValjInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbValjInfoDuVillAndra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNyttVarde, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNyttVarde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 61, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAndra)
                            .addComponent(btnTillbaka))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metod som fyller scrollistan cbValjAlien med val
     */
    private void fyllCbValjAlienID() {
        try {
            ArrayList<String> allaAlienID = databas.fetchColumn("SELECT alien_ID FROM Alien");
            
            Collections.sort(allaAlienID);
            
            for (String ettAlienID : allaAlienID) {
                cbValjAlienID.addItem(ettAlienID);
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }

    /**
     * Metod som fyller scrollistan cbValjInfo med val
     */
    private void fyllCbValjInfo() {
        ArrayList<String> infoOmAlien = new ArrayList<>();
        
        infoOmAlien.add("Registreringsdatum");
        infoOmAlien.add("Lösenord");
        infoOmAlien.add("Namn");
        infoOmAlien.add("Telefon");
        infoOmAlien.add("Plats");
        infoOmAlien.add("Ansvarig Agent");
        //Lägg in möjlighet att ändra ras och ras-attribut - Fre

        Collections.sort(infoOmAlien);
        
        for (String enInfo : infoOmAlien) {
            cbValjInfoDuVillAndra.addItem(enInfo);
        }
    }

    /**
     * Metod som ändrar den önskade datan
     */
    private void btnAndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraActionPerformed
        if (Validering.textFaltHarVarde(txtNyttVarde)) {
            try {
                String valtAlienID = cbValjAlienID.getSelectedItem().toString();
                String valtInfo = cbValjInfoDuVillAndra.getSelectedItem().toString();

                if (valtInfo.equals("Registreringsdatum")) {
                    String nyttRegDatum = txtNyttVarde.getText();
                    databas.update("Update alien Set Registreringsdatum='" + nyttRegDatum + "' where alien_Id =" + valtAlienID);
                } else if (valtInfo.equals("Lösenord")) {
                    String nyttLosenord = txtNyttVarde.getText();
                    databas.update("Update alien Set Losenord='" + nyttLosenord + "' where alien_id =" + valtAlienID);
                } else if (valtInfo.equals("Namn")) {
                    String nyttNamn = txtNyttVarde.getText();
                    databas.update("Update alien set Namn='" + nyttNamn + "' where alien_id=" + valtAlienID);
                } else if (valtInfo.equals("Telefon")) {
                    String nyTelefon = txtNyttVarde.getText();
                    databas.update("Update alien set Telefon='" + nyTelefon + "' where alien_id=" + valtAlienID);
                } else if (valtInfo.equals("Plats")) {
                    String nyPlats = txtNyttVarde.getText();
                    databas.update("Update alien set Plats=" + nyPlats + " where alien_id=" + valtAlienID);
                } else if (valtInfo.equals("Ansvarig Agent")) {
                    String nyAgent = txtNyttVarde.getText();
                    databas.update("Update alien set ansvarig_agent=" + nyAgent + " where alien_id=" + valtAlienID);
                }
                JOptionPane.showMessageDialog(null, "Informationen för Alien med ID: " + valtAlienID + " har ändrats");

            } catch (InfException ex1) {
                JOptionPane.showMessageDialog(null, "Något gick fel");
                System.out.println("Internt felmeddelande" + ex1.getMessage());
            }
        }
    }//GEN-LAST:event_btnAndraActionPerformed

    /**
     * Metod som stänger detta fönster och tar användaren tillbaka till
     * agentfönstret
     */
    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        AgentUppdateraAlien.this.dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndra;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> cbValjAlienID;
    private javax.swing.JComboBox<String> cbValjInfoDuVillAndra;
    private javax.swing.JLabel lblAndraInfo;
    private javax.swing.JLabel lblGammaltAID;
    private javax.swing.JLabel lblNyttVarde;
    private javax.swing.JLabel lblValjInfo;
    private javax.swing.JTextField txtNyttVarde;
    // End of variables declaration//GEN-END:variables
}
