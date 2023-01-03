/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package realisering15;

import java.util.ArrayList;
import java.util.HashMap;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;

/**
 * @author Grupp15
 */
public class AdminTaBortAgent extends javax.swing.JFrame {
    private static InfDB databas;
    private String id;

    /**
     * Creates new form AdminTaBortAgent
     */
    public AdminTaBortAgent(InfDB databas, String id) {
        initComponents();
        this.databas = databas;
        this.id = id;
        fyllCbAgentLista();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblValkommen = new javax.swing.JLabel();
        btnTaBortAgentTillbaka = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbAgentLista = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaEnAgent = new javax.swing.JTextArea();
        btnRadera = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblValkommen.setText("Radera Agent");

        btnTaBortAgentTillbaka.setText("Tillbaka");
        btnTaBortAgentTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortAgentTillbakaActionPerformed(evt);
            }
        });

        jLabel1.setText("Välj Agent ID");

        cbAgentLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAgentListaActionPerformed(evt);
            }
        });

        txtAreaEnAgent.setEditable(false);
        txtAreaEnAgent.setColumns(20);
        txtAreaEnAgent.setRows(5);
        jScrollPane1.setViewportView(txtAreaEnAgent);

        btnRadera.setText("Radera");
        btnRadera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaderaActionPerformed(evt);
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
                        .addComponent(btnTaBortAgentTillbaka)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRadera))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(lblValkommen))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel1)
                                .addGap(94, 94, 94)
                                .addComponent(cbAgentLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblValkommen)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbAgentLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTaBortAgentTillbaka)
                    .addComponent(btnRadera))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metod som stänger detta fönster och tar användaren tillbaka till
     * adminfönstret
     */
    private void btnTaBortAgentTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortAgentTillbakaActionPerformed
        AdminTaBortAgent.this.dispose();
    }//GEN-LAST:event_btnTaBortAgentTillbakaActionPerformed

    /**
     * Metod som körs när konstruktorn anropas för att fylla comboboxen med val
     */
    private void fyllCbAgentLista() {
        try {
            ArrayList<String> allaAgentID = databas.fetchColumn("SELECT agent_ID FROM agent");
            for (String ettAgentID : allaAgentID) {
                cbAgentLista.addItem(ettAgentID);
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }

    /**
     * Metod som tar bort information om en agent från tabellerna där information om agenten lagras (agent, faltagent, områdeschef och kontorschef)
     */
    private void btnRaderaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaderaActionPerformed
        try {
            String valtAgentID = cbAgentLista.getSelectedItem().toString();
            String raderaAgent = "DELETE FROM agent WHERE agent_id=" + valtAgentID;
            String raderaOmradeschef = "DELETE FROM omradeschef WHERE agent_id="+valtAgentID;
            String raderaKontorschef = "DELETE FROM kontorschef WHERE agent_id="+valtAgentID;
            String raderaFaltagent = "DELETE FROM faltagent WHERE agent_id="+valtAgentID;
            
            ArrayList<String> omradeschefer = databas.fetchColumn("SELECT agent_id FROM omradeschef");
            ArrayList<String> kontorschefer = databas.fetchColumn("SELECT agent_id FROM kontorschef");
            ArrayList<String> faltagenter = databas.fetchColumn("SELECT agent_id FROM faltagent");
            
            boolean arOmradeschef = false;
            boolean arKontorschef = false;
            boolean arFaltagent = false;
            
            for(String enOmradeschef : omradeschefer){
                if(valtAgentID.equals(enOmradeschef)){
                    arOmradeschef = true;
                }    
            }
            for(String enKontorschef : kontorschefer){
                if(valtAgentID.equals(enKontorschef)){
                    arKontorschef = true;
                }    
            }
             for(String enFaltagent : faltagenter){
                if(valtAgentID.equals(enFaltagent)){
                    arFaltagent = true;
                }    
            }
             
            if(arOmradeschef == true){
                databas.delete(raderaOmradeschef);
            }
            if(arKontorschef == true){
                databas.delete(raderaKontorschef);
            }
            if(arFaltagent == true){
                databas.delete(raderaFaltagent);
            }
            databas.delete(raderaAgent);
            JOptionPane.showMessageDialog(null, "Agenten har raderats");
            AdminTaBortAgent.this.dispose();
            
        } 
        catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + ex.getMessage());  
        }
    }//GEN-LAST:event_btnRaderaActionPerformed

    /**
     * Metod som fyller textrutan med information om den valda agenten
     */
    private void cbAgentListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAgentListaActionPerformed
        txtAreaEnAgent.setText("");

        try {
            String valtAgentID = cbAgentLista.getSelectedItem().toString();
            HashMap<String, String> soktAgent = databas.fetchRow("SELECT * FROM agent WHERE agent_id=" + valtAgentID);

            String omradeschef = "Nej";
            String kontorschef = "Nej";
            ArrayList<String> omradeschefer = databas.fetchColumn("SELECT agent_id FROM omradeschef");
            ArrayList<String> kontorschefer = databas.fetchColumn("SELECT agent_id FROM kontorschef");
            for (String enOmradeschef : omradeschefer) {
                if (valtAgentID.equals(enOmradeschef)) {
                    omradeschef = "Ja";
                }
            }

            for (String enKontorschef : kontorschefer) {
                if (valtAgentID.equals(enKontorschef)) {
                    kontorschef = "Ja";
                }
            }

            txtAreaEnAgent.append("Agent ID" + "\t" + "\t");
            txtAreaEnAgent.append("Namn" + "\n");
            txtAreaEnAgent.append(soktAgent.get("Agent_ID") + "\t" + "\t");
            txtAreaEnAgent.append(soktAgent.get("Namn") + "\n" + "\n");
            txtAreaEnAgent.append("Är områdeschef" + "\t" + "\t");
            txtAreaEnAgent.append("Är kontorschef" + "\n");
            txtAreaEnAgent.append(omradeschef + "\t" + "\t");
            txtAreaEnAgent.append(kontorschef);
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + ex.getMessage());     
          }
    }//GEN-LAST:event_cbAgentListaActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRadera;
    private javax.swing.JButton btnTaBortAgentTillbaka;
    private javax.swing.JComboBox<String> cbAgentLista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblValkommen;
    private javax.swing.JTextArea txtAreaEnAgent;
    // End of variables declaration//GEN-END:variables
}
