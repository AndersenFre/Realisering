/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package realisering15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;

/**
 * @author Grupp15
 */
public class AdminAndraAdminStatus extends javax.swing.JFrame {
    private static InfDB databas;
    private String id;

    /**
     * Creates new form AdminAndraAdminStatus
     */
    public AdminAndraAdminStatus(InfDB databas, String id) {
        initComponents();
        this.databas = databas;
        this.id = id;
        fyllCbValjAgent();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAndraAdminStatus = new javax.swing.JLabel();
        btnAdminStatusTillbaka = new javax.swing.JButton();
        lblValjAgentID = new javax.swing.JLabel();
        cbValjAgent = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaAgentInfo = new javax.swing.JTextArea();
        btnAndraStatus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAndraAdminStatus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAndraAdminStatus.setText("Ändra Adminstatus");

        btnAdminStatusTillbaka.setText("Tillbaka");
        btnAdminStatusTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminStatusTillbakaActionPerformed(evt);
            }
        });

        lblValjAgentID.setText("Välj Agent ID");

        cbValjAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbValjAgentActionPerformed(evt);
            }
        });

        txtAreaAgentInfo.setEditable(false);
        txtAreaAgentInfo.setColumns(20);
        txtAreaAgentInfo.setRows(5);
        jScrollPane1.setViewportView(txtAreaAgentInfo);

        btnAndraStatus.setText("Ändra status");
        btnAndraStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdminStatusTillbaka)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAndraStatus)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblValjAgentID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbValjAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(83, 83, 83))
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(lblAndraAdminStatus)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblAndraAdminStatus)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValjAgentID)
                    .addComponent(cbValjAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdminStatusTillbaka)
                    .addComponent(btnAndraStatus))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metod som stänger detta fönster och tar användaren tillbaka till
     * adminfönstret
     */
    private void btnAdminStatusTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminStatusTillbakaActionPerformed
        AdminAndraAdminStatus.this.dispose();
    }//GEN-LAST:event_btnAdminStatusTillbakaActionPerformed

    /**
     * Metod som körs när konstruktorn anropas för att fylla comboboxen med val
     */
    private void fyllCbValjAgent() {
        try {
            ArrayList<String> allaAgentID = databas.fetchColumn("SELECT agent_ID FROM agent");
            
            Collections.sort(allaAgentID);
            
            for (String ettAgentID : allaAgentID) {
                cbValjAgent.addItem(ettAgentID);
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + ex.getMessage());
           
        }
    }

    /**
     * Metod som fyller scrollistan med de agenter som finns registrerade
     */
    private void cbValjAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbValjAgentActionPerformed
        txtAreaAgentInfo.setText("");

        try {
            String valtAgentID = cbValjAgent.getSelectedItem().toString();
            HashMap<String, String> soktAgent = databas.fetchRow("SELECT * FROM agent WHERE agent_id=" + valtAgentID);

            txtAreaAgentInfo.append("Agent ID" + "\t");
            txtAreaAgentInfo.append("Namn" + "\t");
            txtAreaAgentInfo.append("Är admin" + "\n");
            txtAreaAgentInfo.append(soktAgent.get("Agent_ID") + "\t");
            txtAreaAgentInfo.append(soktAgent.get("Namn") + "\t");
            txtAreaAgentInfo.append(soktAgent.get("Administrator"));

        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }//GEN-LAST:event_cbValjAgentActionPerformed

    /**
     * Metod som ändrar den valda agentens adminstatus
     */
    private void btnAndraStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraStatusActionPerformed
        String valtAgentID = cbValjAgent.getSelectedItem().toString();
        
        try {
            String adminStatus = databas.fetchSingle("SELECT Administrator FROM agent WHERE Agent_ID=" + valtAgentID);

            if (adminStatus.equals("J")) {
                databas.update("UPDATE agent SET Administrator = 'N' WHERE Agent_ID =" + valtAgentID);
            } else if (adminStatus.equals("N")) {
                databas.update("UPDATE agent SET Administrator = 'J' WHERE Agent_ID =" + valtAgentID);
            }
            JOptionPane.showMessageDialog(null, "Agentens adminstatus har ändrats");
            txtAreaAgentInfo.setText("");

        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }//GEN-LAST:event_btnAndraStatusActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminStatusTillbaka;
    private javax.swing.JButton btnAndraStatus;
    private javax.swing.JComboBox<String> cbValjAgent;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAndraAdminStatus;
    private javax.swing.JLabel lblValjAgentID;
    private javax.swing.JTextArea txtAreaAgentInfo;
    // End of variables declaration//GEN-END:variables
}
