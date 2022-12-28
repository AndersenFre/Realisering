/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package realisering15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;

/**
 *
 * @author Grupp15
 */
public class AdminVisaInfoAgent extends javax.swing.JFrame {

    private static InfDB databas;
    private String id;

    /**
     * Creates new form AdminVisaInfoAgent
     */
    public AdminVisaInfoAgent(InfDB databas, String id) {
        initComponents();
        this.databas = databas;
        this.id = id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAgentID = new javax.swing.JLabel();
        btnVisaInfoAgentTillbaka = new javax.swing.JButton();
        txtAgentID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaAgentInfo = new javax.swing.JTextArea();
        btnSok = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAgentID.setText("AgentID");

        btnVisaInfoAgentTillbaka.setText("Tillbaka");
        btnVisaInfoAgentTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaInfoAgentTillbakaActionPerformed(evt);
            }
        });

        txtAreaAgentInfo.setEditable(false);
        txtAreaAgentInfo.setColumns(20);
        txtAreaAgentInfo.setRows(5);
        jScrollPane1.setViewportView(txtAreaAgentInfo);

        btnSok.setText("Sök");
        btnSok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokActionPerformed(evt);
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
                        .addComponent(btnVisaInfoAgentTillbaka)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSok))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addComponent(lblAgentID))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(txtAgentID, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblAgentID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAgentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVisaInfoAgentTillbaka)
                    .addComponent(btnSok))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /**
    * Metod som för användaren tillbaka till föregående fönster och stänger nuvarande fönster
    */
    private void btnVisaInfoAgentTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaInfoAgentTillbakaActionPerformed
        AdminVisaInfoAgent.this.dispose();
    }//GEN-LAST:event_btnVisaInfoAgentTillbakaActionPerformed

    /**
    * Metod som tar fram information om vald agent efter att ha utfört en kontroll på att
    * invärdet (agentID) är giltigt
    */
    private void btnSokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokActionPerformed
        txtAreaAgentInfo.setText("");

        try {
            String ettAgentID = txtAgentID.getText();
            String sqlHelaRaden = "SELECT * FROM agent WHERE agent_id=" + ettAgentID;
            HashMap<String, String> enAgentRad = databas.fetchRow(sqlHelaRaden);
            ArrayList<String> antalAgenter = databas.fetchColumn("SELECT agent_id FROM agent");
            int ettAgentIDInt = Integer.parseInt(ettAgentID);

            String kontorschef = "Nej";
            String omradeschef = "Nej";
            ArrayList<String> kontorschefer = databas.fetchColumn("SELECT agent_id FROM kontorschef");
            ArrayList<String> omradeschefer = databas.fetchColumn("SELECT agent_id FROM omradeschef");
            for (String enKontorschef : kontorschefer) {
                if (ettAgentID.equals(enKontorschef)) {
                    kontorschef = "Ja";
                }
            }
            for (String enOmradeschef : omradeschefer) {
                if (ettAgentID.equals(enOmradeschef)) {
                    omradeschef = "Ja";
                }
            }

            if (ettAgentIDInt <= antalAgenter.size() && ettAgentIDInt > 0) {
                txtAreaAgentInfo.append("ID-nummer" + "\t" + "\t");
                txtAreaAgentInfo.append("Namn" + "\t");
                txtAreaAgentInfo.append("Telefon" + "\n");
                txtAreaAgentInfo.append(ettAgentID + "\t" + "\t");
                txtAreaAgentInfo.append(enAgentRad.get("Namn") + "\t");
                txtAreaAgentInfo.append(enAgentRad.get("Telefon") + "\n" + "\n" + "\n");
                txtAreaAgentInfo.append("Anställningsdatum" + "\t");
                txtAreaAgentInfo.append("Admin" + "\t");
                txtAreaAgentInfo.append("Lösenord" + "\n");
                txtAreaAgentInfo.append(enAgentRad.get("Anstallningsdatum") + "\t" + "\t");
                txtAreaAgentInfo.append(enAgentRad.get("Administrator") + "\t");
                txtAreaAgentInfo.append(enAgentRad.get("Losenord") + "\n" + "\n" + "\n");
                txtAreaAgentInfo.append("Område" + "\t");
                txtAreaAgentInfo.append("Är områdeschef" + "\t");
                txtAreaAgentInfo.append("Är kontorschef" + "\n");
                txtAreaAgentInfo.append(enAgentRad.get("Omrade") + "\t");
                txtAreaAgentInfo.append(omradeschef + "\t" + "\t");
                txtAreaAgentInfo.append(kontorschef + "\n");
            } else {
                JOptionPane.showMessageDialog(null, "Det finns ingen agent registrerad med ID: " + ettAgentID);
            }
        } catch (InfException ex) {
            Logger.getLogger(AdminVisaInfoAgent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSokActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminVisaInfoAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminVisaInfoAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminVisaInfoAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminVisaInfoAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AdminVisaInfoAgent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSok;
    private javax.swing.JButton btnVisaInfoAgentTillbaka;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAgentID;
    private javax.swing.JTextField txtAgentID;
    private javax.swing.JTextArea txtAreaAgentInfo;
    // End of variables declaration//GEN-END:variables
}
