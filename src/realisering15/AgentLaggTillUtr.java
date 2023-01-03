/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package realisering15;

import oru.inf.InfDB;

/**
 * @author Grupp15
 */
public class AgentLaggTillUtr extends javax.swing.JFrame {

    private static InfDB databas;
    private String id = null;

    /**
     * Creates new form AgentLaggTillUtr
     *
     * @param databas
     */
    public AgentLaggTillUtr(InfDB databas, String id) {
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

        lblLaggTillUtrustning = new javax.swing.JLabel();
        btnUtrTillbaka = new javax.swing.JButton();
        btnLaggTillVapen = new javax.swing.JButton();
        btnLaggTillKom = new javax.swing.JButton();
        btnLaggTillTek = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblLaggTillUtrustning.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblLaggTillUtrustning.setText(" Välj kategori");
        lblLaggTillUtrustning.setPreferredSize(new java.awt.Dimension(110, 25));

        btnUtrTillbaka.setText("Tillbaka");
        btnUtrTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUtrTillbakaActionPerformed(evt);
            }
        });

        btnLaggTillVapen.setText("Vapen");
        btnLaggTillVapen.setAlignmentY(0.0F);
        btnLaggTillVapen.setBorderPainted(false);
        btnLaggTillVapen.setMaximumSize(new java.awt.Dimension(110, 23));
        btnLaggTillVapen.setMinimumSize(new java.awt.Dimension(110, 23));
        btnLaggTillVapen.setOpaque(true);
        btnLaggTillVapen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillVapenActionPerformed(evt);
            }
        });

        btnLaggTillKom.setText("Kommuniktion");
        btnLaggTillKom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillKomActionPerformed(evt);
            }
        });

        btnLaggTillTek.setText("Teknik");
        btnLaggTillTek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillTekActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLaggTillTek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLaggTillKom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLaggTillVapen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblLaggTillUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnUtrTillbaka)))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLaggTillUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(btnLaggTillVapen, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLaggTillKom, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLaggTillTek, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnUtrTillbaka)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metod som tar användaren tillbaka till föregående fönster
     */
    private void btnUtrTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUtrTillbakaActionPerformed
        AgentLaggTillUtr.this.dispose();
    }//GEN-LAST:event_btnUtrTillbakaActionPerformed

    /**
     * Metod som tar användaren till ett nytt fönster för att lägga till vapen
     */
    private void btnLaggTillVapenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillVapenActionPerformed
        new AgentLaggTillVapen(databas, id).setVisible(true);
    }//GEN-LAST:event_btnLaggTillVapenActionPerformed

    /**
     * Metod som tar användaren till ett nytt fönster för att lägga till
     * kommunikationsutrustning
     */
    private void btnLaggTillKomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillKomActionPerformed
        new AgentLaggTillKom(databas, id).setVisible(true);
    }//GEN-LAST:event_btnLaggTillKomActionPerformed

    /**
     * Metod som tar användaren till ett nytt fönster för att lägga till
     * teknologi
     */
    private void btnLaggTillTekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillTekActionPerformed
        new AgentLaggTillTek(databas, id).setVisible(true);
    }//GEN-LAST:event_btnLaggTillTekActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLaggTillKom;
    private javax.swing.JButton btnLaggTillTek;
    private javax.swing.JButton btnLaggTillVapen;
    private javax.swing.JButton btnUtrTillbaka;
    private javax.swing.JLabel lblLaggTillUtrustning;
    // End of variables declaration//GEN-END:variables
}
