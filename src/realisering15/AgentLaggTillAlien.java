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
public class AgentLaggTillAlien extends javax.swing.JFrame {
    private static InfDB databas;
    //Sparar ID för inloggad agent
    private String id = null;
    /**
     * Creates new form LaggTillAlienFonster
     */
    public AgentLaggTillAlien(InfDB databas, String id) 
    {
        this.id=id;
        this.databas=databas;
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

        txtIDNyAlien = new javax.swing.JTextField();
        txtRegDatNyAlien = new javax.swing.JTextField();
        txtLosenNyAlien = new javax.swing.JTextField();
        txtNamnNyAlien = new javax.swing.JTextField();
        txtTelefonNyAlien = new javax.swing.JTextField();
        txtPlatsNyAlien = new javax.swing.JTextField();
        txtAnsvarigAgentNyAlien = new javax.swing.JTextField();
        btnActionRegistreraNyAlien = new javax.swing.JButton();
        btnTillbakaNyAlien = new javax.swing.JButton();
        lblIDNyAlien = new javax.swing.JLabel();
        lblRegDatNyAlien = new javax.swing.JLabel();
        lblLosenNyAlien = new javax.swing.JLabel();
        lblNamnNyAlien = new javax.swing.JLabel();
        lblTelefonNyAlien = new javax.swing.JLabel();
        lblPlatsNyAlien = new javax.swing.JLabel();
        lblAnsvarigAgentNyAlien = new javax.swing.JLabel();
        lblRubrikNyAlien = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtIDNyAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDNyAlienActionPerformed(evt);
            }
        });

        txtRegDatNyAlien.setText("YYYY-MM-DD");
        txtRegDatNyAlien.setToolTipText("");
        txtRegDatNyAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegDatNyAlienActionPerformed(evt);
            }
        });

        txtPlatsNyAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlatsNyAlienActionPerformed(evt);
            }
        });

        btnActionRegistreraNyAlien.setText("Registrera");
        btnActionRegistreraNyAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionRegistreraNyAlienActionPerformed(evt);
            }
        });

        btnTillbakaNyAlien.setText("Tillbaka");
        btnTillbakaNyAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaNyAlienActionPerformed(evt);
            }
        });

        lblIDNyAlien.setText("ID-nummer");

        lblRegDatNyAlien.setText("Registreringsdatum");

        lblLosenNyAlien.setText("Lösenord");

        lblNamnNyAlien.setText("Namn");

        lblTelefonNyAlien.setText("Telefon");

        lblPlatsNyAlien.setText("Plats");

        lblAnsvarigAgentNyAlien.setText("Ansvarig Agent");

        lblRubrikNyAlien.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRubrikNyAlien.setText("Registrera Alien");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLosenNyAlien)
                            .addComponent(txtLosenNyAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNamnNyAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNamnNyAlien)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtIDNyAlien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(lblIDNyAlien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPlatsNyAlien)
                            .addComponent(lblRegDatNyAlien)
                            .addComponent(txtAnsvarigAgentNyAlien)
                            .addComponent(lblAnsvarigAgentNyAlien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtRegDatNyAlien)
                            .addComponent(txtPlatsNyAlien))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefonNyAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTelefonNyAlien))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTillbakaNyAlien)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnActionRegistreraNyAlien)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(lblRubrikNyAlien)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRubrikNyAlien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblIDNyAlien)
                        .addGap(3, 3, 3)
                        .addComponent(txtIDNyAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblLosenNyAlien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLosenNyAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblNamnNyAlien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNamnNyAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblRegDatNyAlien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRegDatNyAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPlatsNyAlien)
                        .addGap(3, 3, 3)
                        .addComponent(txtPlatsNyAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblAnsvarigAgentNyAlien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAnsvarigAgentNyAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lblTelefonNyAlien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefonNyAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActionRegistreraNyAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTillbakaNyAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDNyAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDNyAlienActionPerformed
        // Lägger till ny alien
    }//GEN-LAST:event_txtIDNyAlienActionPerformed

    private void btnTillbakaNyAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaNyAlienActionPerformed
        // TODO add your handling code here:
        AgentLaggTillAlien.this.dispose();
    }//GEN-LAST:event_btnTillbakaNyAlienActionPerformed

    private void btnActionRegistreraNyAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionRegistreraNyAlienActionPerformed
        // TODO add your handling code here:
          try 
        {
            //Ska vara int
            String alienID = txtIDNyAlien.getText();
            //Ska vara string
            String regDat = txtRegDatNyAlien.getText();
            //Ska vara String
            String losen = txtLosenNyAlien.getText();
            //Ska vara String
            String namn = txtNamnNyAlien.getText();
            //Ska vara String
            String tele = txtTelefonNyAlien.getText();
            //Ska vara int
            String plats = txtPlatsNyAlien.getText();
            //Ska vara int
            String ansvarAgent = txtAnsvarigAgentNyAlien.getText();
            //Insert into alien
            String tillLagg = "insert into alien values(" + alienID +",'" + regDat + "','" + losen + "','" + namn + "','" + tele + "'," + plats + "," + ansvarAgent + ")";
            
            databas.insert(tillLagg);
           JOptionPane.showMessageDialog(null, "En ny Alien har registrerats");
        } 
        catch (InfException ex1) 
        {
            JOptionPane.showMessageDialog(null, "Registreringen misslyckades, försök igen");
            System.out.println("Internt felmeddelande" + ex1.getMessage());
        }
       
    }//GEN-LAST:event_btnActionRegistreraNyAlienActionPerformed

    private void txtPlatsNyAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlatsNyAlienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlatsNyAlienActionPerformed

    private void txtRegDatNyAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegDatNyAlienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegDatNyAlienActionPerformed

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
            java.util.logging.Logger.getLogger(AgentLaggTillAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgentLaggTillAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgentLaggTillAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgentLaggTillAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new LaggTillAlienFonster().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActionRegistreraNyAlien;
    private javax.swing.JButton btnTillbakaNyAlien;
    private javax.swing.JLabel lblAnsvarigAgentNyAlien;
    private javax.swing.JLabel lblIDNyAlien;
    private javax.swing.JLabel lblLosenNyAlien;
    private javax.swing.JLabel lblNamnNyAlien;
    private javax.swing.JLabel lblPlatsNyAlien;
    private javax.swing.JLabel lblRegDatNyAlien;
    private javax.swing.JLabel lblRubrikNyAlien;
    private javax.swing.JLabel lblTelefonNyAlien;
    private javax.swing.JTextField txtAnsvarigAgentNyAlien;
    private javax.swing.JTextField txtIDNyAlien;
    private javax.swing.JTextField txtLosenNyAlien;
    private javax.swing.JTextField txtNamnNyAlien;
    private javax.swing.JTextField txtPlatsNyAlien;
    private javax.swing.JTextField txtRegDatNyAlien;
    private javax.swing.JTextField txtTelefonNyAlien;
    // End of variables declaration//GEN-END:variables
}
