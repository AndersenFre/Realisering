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
 * @author ander
 */
public class AdminFonster extends javax.swing.JFrame {
    private static InfDB databas;
    private String id;

    /**
     * Creates new form AdminFonster
     */
    public AdminFonster(InfDB databas, String id) {
        this.databas = databas;
        this.id=id;
        initComponents();
        fyllCbValjMetod();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblValkommenAdmin = new javax.swing.JLabel();
        lblValjAtgardAdmin = new javax.swing.JLabel();
        cblistaMetoderAdmin = new javax.swing.JComboBox<>();
        btnLoggaUtAdmin = new javax.swing.JButton();
        btnOkAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblValkommenAdmin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblValkommenAdmin.setText("Hej Admin!");

        lblValjAtgardAdmin.setText("Välj en åtgärd");

        cblistaMetoderAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cblistaMetoderAdminActionPerformed(evt);
            }
        });

        btnLoggaUtAdmin.setText("Logga ut");
        btnLoggaUtAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaUtAdminActionPerformed(evt);
            }
        });

        btnOkAdmin.setText("OK");
        btnOkAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkAdminActionPerformed(evt);
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
                        .addComponent(btnLoggaUtAdmin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOkAdmin))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(lblValkommenAdmin))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(lblValjAtgardAdmin)
                                .addGap(18, 18, 18)
                                .addComponent(cblistaMetoderAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 186, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblValkommenAdmin)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValjAtgardAdmin)
                    .addComponent(cblistaMetoderAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoggaUtAdmin)
                    .addComponent(btnOkAdmin))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Fyller comboBoxen med olika val en admin kan göra
    private void fyllCbValjMetod()
    {
        ArrayList<String> metoder = new ArrayList<String>();
        metoder.add("Ändra lösenord");
        metoder.add("Registrera Alien");
        metoder.add("Ändra information om en Alien");
        metoder.add("Ta bort Alien");
        metoder.add("Ta bort utrustning");
        metoder.add("Registrera Agent");
        metoder.add("Visa information om en Agent");
        metoder.add("Ändra administratörsstatus på Agent");
        metoder.add("Ändra information om Agent");
        metoder.add("Ta bort Agent");
        metoder.add("Ändra Kontorschef");
        metoder.add("Ändra Områdeschef");
        for(String enMetod : metoder)
        {
            cblistaMetoderAdmin.addItem(enMetod);
        }
    }
    private void btnOkAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkAdminActionPerformed
    //Kontrollerar vilken åtgärd som valts
    String valdMetod = cblistaMetoderAdmin.getSelectedItem().toString();
    if(valdMetod.equals("Ändra lösenord"))
    {
        new AgentNyttLosenord(databas,id).setVisible(true);
    }
    if(valdMetod.equals("Registrera Alien"))
    {
        new AgentLaggTillAlien(databas,id).setVisible(true);
    }
    if(valdMetod.equals("Ändra information om en Alien"))
    {
        new AgentUppdateraAlien(databas,id).setVisible(true);
    }
    if(valdMetod.equals("Ta bort Alien"))
    {
        new AdminTaBortAlien(databas,id).setVisible(true);
    }  
    if(valdMetod.equals("Ta bort utrustning"))
    {
        new AdminTaBortUtr(databas,id).setVisible(true);
    }            
    if(valdMetod.equals("Registrera Agent"))
    {
        new AdminLaggTillAgent(databas,id).setVisible(true);
    }         
    if(valdMetod.equals("Visa information om en Agent"))
    {
        new AdminVisaInfoAgent(databas,id).setVisible(true);
    }
    if(valdMetod.equals("Ändra administratörsstatus på Agent"))
    {
        new AdminAndraAdminStatus(databas,id).setVisible(true);
    }
    if(valdMetod.equals("Ändra information om Agent"))
    {
        new AdminUppdateraAgent(databas,id).setVisible(true);
    }
    if(valdMetod.equals("Ta bort Agent"))
    {
        new AdminTaBortAgent(databas,id).setVisible(true);
    }
    if(valdMetod.equals("Ändra Områdeschef"))
    {
        new AdminAndraOmrC(databas,id).setVisible(true);
    }
    if(valdMetod.equals("Ändra Kontorschef"))
    {
        new AdminAndraKontorC(databas,id).setVisible(true);
    }
    }//GEN-LAST:event_btnOkAdminActionPerformed

    private void cblistaMetoderAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cblistaMetoderAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cblistaMetoderAdminActionPerformed

    private void btnLoggaUtAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaUtAdminActionPerformed
        // Knapp för att admin ska kunna logga ut.
        new Start().setVisible(true);
        AdminFonster.this.dispose();
    }//GEN-LAST:event_btnLoggaUtAdminActionPerformed

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
            java.util.logging.Logger.getLogger(AdminFonster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminFonster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminFonster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminFonster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AdminFonster(databas).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoggaUtAdmin;
    private javax.swing.JButton btnOkAdmin;
    private javax.swing.JComboBox<String> cblistaMetoderAdmin;
    private javax.swing.JLabel lblValjAtgardAdmin;
    private javax.swing.JLabel lblValkommenAdmin;
    // End of variables declaration//GEN-END:variables
}
