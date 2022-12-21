/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package realisering15;

import javax.swing.JOptionPane;
import java.util.logging.Logger;
import java.util.logging.Level;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Grupp15
 */
public class AgentInloggning extends javax.swing.JFrame {

    private static InfDB databas;

    /**
     * Creates new form HuvudFonster
     */
    public AgentInloggning() {
        try {
            databas = new InfDB("mibdb", "3306", "mibdba", "mibkey");
        } catch (InfException ex) {
            Logger.getLogger(AgentInloggning.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Kontakt med databas misslyckades");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
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

        btnLoggaIn = new javax.swing.JButton();
        lblLösenord = new javax.swing.JLabel();
        txtIDNr = new javax.swing.JTextField();
        lblIDNr = new javax.swing.JLabel();
        txtPLosen = new javax.swing.JPasswordField();
        lblValkommenAgent = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLoggaIn.setText("Logga in");
        btnLoggaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaInActionPerformed(evt);
            }
        });

        lblLösenord.setText("Lösenord");

        txtIDNr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDNrActionPerformed(evt);
            }
        });

        lblIDNr.setText("ID-nummer");

        txtPLosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPLosenActionPerformed(evt);
            }
        });

        lblValkommenAgent.setText("Välkommen Agent!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(lblValkommenAgent))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(btnLoggaIn))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLösenord)
                                    .addComponent(lblIDNr))
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIDNr, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                    .addComponent(txtPLosen))))))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(lblValkommenAgent)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIDNr)
                    .addComponent(txtIDNr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnLoggaIn)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoggaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaInActionPerformed
        // TODO add your handling code here:

        try {
            String id = txtIDNr.getText();
            String rattLosen = "SELECT losenord FROM agent where agent_id=" + id;
            String svarLosen = databas.fetchSingle(rattLosen);
            //Dekryptering av JPassword
            char[] losenKrypt = txtPLosen.getPassword();
            String losenOkrypt = new String(losenKrypt);
            String fraga = "SELECT administrator FROM agent where agent_id=" + id;
            String svarFraga = databas.fetchSingle(fraga);

            if (losenOkrypt.equals(svarLosen)) {
                //Till nytt fönster
                if(svarFraga.equals("J"))
                        {
                            new AdminFonster(databas).setVisible(true);
                        }
                else//Admin=N
                {
                    new AgentFonster(databas).setVisible(true);
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "Felaktigt lösenord");
            }
        } catch (InfException ex1) {
            JOptionPane.showMessageDialog(null, "Inget resultat hittades");
            System.out.println("Internt felmeddelande" + ex1.getMessage());

        }
    }//GEN-LAST:event_btnLoggaInActionPerformed

    private void txtIDNrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDNrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDNrActionPerformed

    private void txtPLosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPLosenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPLosenActionPerformed

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
            java.util.logging.Logger.getLogger(AgentInloggning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgentInloggning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgentInloggning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgentInloggning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgentInloggning().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoggaIn;
    private javax.swing.JLabel lblIDNr;
    private javax.swing.JLabel lblLösenord;
    private javax.swing.JLabel lblValkommenAgent;
    private javax.swing.JTextField txtIDNr;
    private javax.swing.JPasswordField txtPLosen;
    // End of variables declaration//GEN-END:variables
}
