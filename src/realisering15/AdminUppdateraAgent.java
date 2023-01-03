/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package realisering15;

import java.util.ArrayList;
import javax.swing.JComboBox;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;
/**
 *
 * @author Grupp15
 */
public class AdminUppdateraAgent extends javax.swing.JFrame {
private static InfDB databas;
private String id;
    /**
     * Creates new form AdminUppdateraAgent
     */
    public AdminUppdateraAgent(InfDB databas, String id) {
        initComponents();
        this.databas = databas;
        this.id=id;
        fyllCbValjAgentID();
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

        lblUppdateraAgentRubrik = new javax.swing.JLabel();
        btnUppdateraAgentTillbaka = new javax.swing.JButton();
        lblUppdatAgentValjID = new javax.swing.JLabel();
        cbUppdateraAgentID = new javax.swing.JComboBox<>();
        lblUppdateraAgentValjInfo = new javax.swing.JLabel();
        cbUppdateraAgentValjInfo = new javax.swing.JComboBox<>();
        lblUppdateraAgentNyInfo = new javax.swing.JLabel();
        txtUppdateraAgentNyttVarde = new javax.swing.JTextField();
        btnUppdateraAgentAndra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblUppdateraAgentRubrik.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUppdateraAgentRubrik.setText("Ändra information om en Agent");

        btnUppdateraAgentTillbaka.setText("Tillbaka");
        btnUppdateraAgentTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUppdateraAgentTillbakaActionPerformed(evt);
            }
        });

        lblUppdatAgentValjID.setText("Välj ett ID:");

        lblUppdateraAgentValjInfo.setText("Vad vill du ändra?");

        cbUppdateraAgentValjInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUppdateraAgentValjInfoActionPerformed(evt);
            }
        });

        lblUppdateraAgentNyInfo.setText("Skriv in det nya värdet:");

        btnUppdateraAgentAndra.setText("Ändra");
        btnUppdateraAgentAndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUppdateraAgentAndraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUppdateraAgentValjInfo)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(cbUppdateraAgentValjInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnUppdateraAgentTillbaka)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUppdateraAgentAndra))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(lblUppdateraAgentRubrik))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(lblUppdatAgentValjID))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(cbUppdateraAgentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(lblUppdateraAgentNyInfo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(txtUppdateraAgentNyttVarde, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 72, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUppdateraAgentRubrik)
                .addGap(18, 18, 18)
                .addComponent(lblUppdatAgentValjID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbUppdateraAgentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblUppdateraAgentValjInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbUppdateraAgentValjInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblUppdateraAgentNyInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUppdateraAgentNyttVarde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUppdateraAgentTillbaka)
                    .addComponent(btnUppdateraAgentAndra))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void fyllCbValjAgentID() {
        // Metod som fyller combobox med ID och kolumner från Agent-tabellen
        try {
            ArrayList<String> allaAlienID = databas.fetchColumn("SELECT Agent_ID FROM Agent");
            for (String ettAlienID : allaAlienID) {
                cbUppdateraAgentID.addItem(ettAlienID);
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }
    private void fyllCbValjInfo() {
        String[] InfoOmAgent = {"Namn", "Telefon", "Anställningsdatum", "Lösenord", "Område"};

        for (String enInfo : InfoOmAgent) {
            cbUppdateraAgentValjInfo.addItem(enInfo);
        }
    }
   
    
    private void btnUppdateraAgentTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUppdateraAgentTillbakaActionPerformed
        // Metod för att stänga detta fönster
        AdminUppdateraAgent.this.dispose();
    }//GEN-LAST:event_btnUppdateraAgentTillbakaActionPerformed

    private void cbUppdateraAgentValjInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUppdateraAgentValjInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbUppdateraAgentValjInfoActionPerformed

    private void btnUppdateraAgentAndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUppdateraAgentAndraActionPerformed
        // Metod som ändrar värden i Agent-tabellen beroende på vad som valts i comboboxen och skrivits in i txt-fältet.
                if (Validering.textFaltHarVarde(txtUppdateraAgentNyttVarde)) {
            try {
                String valtAgentID = cbUppdateraAgentID.getSelectedItem().toString();
                String valtInfo = cbUppdateraAgentValjInfo.getSelectedItem().toString();

                if (valtInfo.equals("Namn")) {
                    String nyttNamn = txtUppdateraAgentNyttVarde.getText();
                    databas.update("Update agent Set namn='" + nyttNamn + "' where agent_Id =" + valtAgentID);
                } else if (valtInfo.equals("Telefon")) {
                    String nyttTelenr = txtUppdateraAgentNyttVarde.getText();
                    databas.update("Update agent Set telefon='" + nyttTelenr + "' where agent_id =" + valtAgentID);
                } else if (valtInfo.equals("Anställningsdatum")) {
                    String nyttDatum = txtUppdateraAgentNyttVarde.getText();
                    databas.update("Update agent set Anstallningsdatum='" + nyttDatum + "' where agent_id=" + valtAgentID);
                } else if (valtInfo.equals("Lösenord")) {
                    String nyttLosen = txtUppdateraAgentNyttVarde.getText();
                    databas.update("Update agent set Losenord='" + nyttLosen + "' where agent_id=" + valtAgentID);
                } else if (valtInfo.equals("Område")) {
                    String nyttOmrade = txtUppdateraAgentNyttVarde.getText();
                    databas.update("Update agent set omrade=" + nyttOmrade + " where agent_id=" + valtAgentID);
                }
                JOptionPane.showMessageDialog(null, "Informationen för Agent med ID: " + valtAgentID + " har ändrats");

            } catch (InfException ex1) {
                JOptionPane.showMessageDialog(null, "Något gick fel");
                System.out.println("Internt felmeddelande" + ex1.getMessage());
            }
            
            
        }
    }//GEN-LAST:event_btnUppdateraAgentAndraActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUppdateraAgentAndra;
    private javax.swing.JButton btnUppdateraAgentTillbaka;
    private javax.swing.JComboBox<String> cbUppdateraAgentID;
    private javax.swing.JComboBox<String> cbUppdateraAgentValjInfo;
    private javax.swing.JLabel lblUppdatAgentValjID;
    private javax.swing.JLabel lblUppdateraAgentNyInfo;
    private javax.swing.JLabel lblUppdateraAgentRubrik;
    private javax.swing.JLabel lblUppdateraAgentValjInfo;
    private javax.swing.JTextField txtUppdateraAgentNyttVarde;
    // End of variables declaration//GEN-END:variables
}
