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
public class AgentLaggTillTek extends javax.swing.JFrame {

    private static InfDB databas;
    private String id = null;

    /**
     * Creates new form AgentLaggTillTek
     */
    public AgentLaggTillTek(InfDB databas, String id) {
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

        btnLaggTillTekTillbaka = new javax.swing.JButton();
        btnTekReg = new javax.swing.JButton();
        txtTekNamn = new javax.swing.JTextField();
        txtTekKraft = new javax.swing.JTextField();
        lblTekRubrik = new javax.swing.JLabel();
        lblTekUtrID = new javax.swing.JLabel();
        lblTekNamn = new javax.swing.JLabel();
        lblTekKraft = new javax.swing.JLabel();
        txtTekUtrID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLaggTillTekTillbaka.setText("Tillbaka");
        btnLaggTillTekTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillTekTillbakaActionPerformed(evt);
            }
        });

        btnTekReg.setText("Registrera");
        btnTekReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTekRegActionPerformed(evt);
            }
        });

        txtTekNamn.setAlignmentX(0.0F);
        txtTekNamn.setAlignmentY(0.0F);

        txtTekKraft.setAlignmentX(0.0F);
        txtTekKraft.setAlignmentY(0.0F);

        lblTekRubrik.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTekRubrik.setText("Lägg till tekniskutrustning");
        lblTekRubrik.setAlignmentY(0.0F);

        lblTekUtrID.setText("Utrustnings ID");
        lblTekUtrID.setAlignmentY(0.0F);

        lblTekNamn.setText("Benämning");
        lblTekNamn.setAlignmentY(0.0F);

        lblTekKraft.setText("Kraftkälla");
        lblTekKraft.setAlignmentY(0.0F);

        txtTekUtrID.setAlignmentX(0.0F);
        txtTekUtrID.setAlignmentY(0.0F);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLaggTillTekTillbaka)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTekReg)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTekNamn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtTekKraft, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtTekUtrID, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtTekNamn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTekKraft)
                    .addComponent(lblTekUtrID))
                .addGap(161, 161, 161))
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(lblTekRubrik)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblTekRubrik)
                .addGap(18, 18, 18)
                .addComponent(lblTekUtrID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTekUtrID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTekNamn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTekNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTekKraft)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTekKraft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLaggTillTekTillbaka)
                    .addComponent(btnTekReg))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metod som lägger till ett vapen med önskat ID, benämning och kraftkälla
     */
    private void btnTekRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTekRegActionPerformed
        if (Validering.textFaltHarVarde(txtTekUtrID) && Validering.textFaltHarVarde(txtTekNamn) && Validering.textFaltHarVarde(txtTekKraft) && Validering.isHeltal(txtTekUtrID)) {
            try {
                //Ska vara int
                String utrID = txtTekUtrID.getText();
                //Ska vara string
                String namn = txtTekNamn.getText();
                //Ska vara Int
                String kraft = txtTekKraft.getText();
                //Insert into Utrustning och vapen
                String tillLaggUtr = "insert into utrustning values(" + utrID + ",'" + namn + "')";
                String tillLaggVapen = "insert into teknik values(" + utrID + ",'" + kraft + "')";

                databas.insert(tillLaggUtr);
                databas.insert(tillLaggVapen);
                JOptionPane.showMessageDialog(null, "Ny tekniskutrustning har registrerats");
            } catch (InfException ex1) {
                JOptionPane.showMessageDialog(null, "Registreringen misslyckades, försök igen");
                System.out.println("Internt felmeddelande" + ex1.getMessage());
            }
        }
    }//GEN-LAST:event_btnTekRegActionPerformed

    /**
     * Metod som tar användaren tillbaka till föregående fönster
     */
    private void btnLaggTillTekTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillTekTillbakaActionPerformed
        AgentLaggTillTek.this.dispose();
    }//GEN-LAST:event_btnLaggTillTekTillbakaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLaggTillTekTillbaka;
    private javax.swing.JButton btnTekReg;
    private javax.swing.JLabel lblTekKraft;
    private javax.swing.JLabel lblTekNamn;
    private javax.swing.JLabel lblTekRubrik;
    private javax.swing.JLabel lblTekUtrID;
    private javax.swing.JTextField txtTekKraft;
    private javax.swing.JTextField txtTekNamn;
    private javax.swing.JTextField txtTekUtrID;
    // End of variables declaration//GEN-END:variables
}
