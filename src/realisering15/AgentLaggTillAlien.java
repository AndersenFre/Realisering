/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package realisering15;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 * @author Grupp15
 */
public class AgentLaggTillAlien extends javax.swing.JFrame {

    private static InfDB databas;
    private String id;

    /**
     * Creates new form LaggTillAlienFonster
     */
    public AgentLaggTillAlien(InfDB databas, String id) {
        this.id = id;
        this.databas = databas;
        initComponents();
        fyllCbValjRas();
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
        cbValjRas = new javax.swing.JComboBox<>();
        lblValjRas = new javax.swing.JLabel();
        lblAntalArmarBoogies = new javax.swing.JLabel();
        txtAntalArmarBoogies = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtRegDatNyAlien.setText("YYYY-MM-DD");
        txtRegDatNyAlien.setToolTipText("");

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

        lblValjRas.setText("Ras");

        lblAntalArmarBoogies.setText("Antal armar/Boogies");

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
                            .addComponent(txtRegDatNyAlien, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(txtPlatsNyAlien))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTillbakaNyAlien)
                                .addGap(73, 73, 73)
                                .addComponent(txtAntalArmarBoogies, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTelefonNyAlien)
                                    .addComponent(txtTelefonNyAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(127, 127, 127)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnActionRegistreraNyAlien)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblValjRas)
                                    .addComponent(cbValjRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAntalArmarBoogies)
                    .addComponent(lblRubrikNyAlien))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRubrikNyAlien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefonNyAlien)
                    .addComponent(lblValjRas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefonNyAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbValjRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(lblAntalArmarBoogies)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAntalArmarBoogies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnActionRegistreraNyAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTillbakaNyAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metod som tar användaren tillbaka till föregående fönster
     */
    private void btnTillbakaNyAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaNyAlienActionPerformed
        AgentLaggTillAlien.this.dispose();
    }//GEN-LAST:event_btnTillbakaNyAlienActionPerformed
    private void fyllCbValjRas() {
        ArrayList<String> raser = new ArrayList<String>();
        raser.add("Boglodite");
        raser.add("Worm");
        raser.add("Squid");

        Collections.sort(raser);
        
        for (String enRas : raser) {
            cbValjRas.addItem(enRas);
        }
    }
    /**
     * Metod som lägger till en ny alien med önskade attribut/önskad data
     */
    private void btnActionRegistreraNyAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionRegistreraNyAlienActionPerformed
        if (Validering.textFaltHarVarde(txtIDNyAlien) && Validering.textFaltHarVarde(txtRegDatNyAlien) && Validering.textFaltHarVarde(txtLosenNyAlien) && Validering.textFaltHarVarde(txtNamnNyAlien) && Validering.textFaltHarVarde(txtTelefonNyAlien) && Validering.textFaltHarVarde(txtPlatsNyAlien) && Validering.textFaltHarVarde(txtAnsvarigAgentNyAlien)) {
            try {
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
                String tillLagg = "insert into alien values(" + alienID + ",'" + regDat + "','" + losen + "','" + namn + "','" + tele + "'," + plats + "," + ansvarAgent + ")";
                
                databas.insert(tillLagg);
                String valdRas = cbValjRas.getSelectedItem().toString();
                String antalArmBog = txtAntalArmarBoogies.getText();
                if(valdRas.equals("Boglodite"))
                {
                    String bog = "insert into boglodite values(" + alienID + "," + antalArmBog +")";
                    databas.insert(bog);
                }
                else if(valdRas.equals("Squid"))
                {
                    String squid = "insert into squid values(" + alienID + "," + antalArmBog +")";
                    databas.insert(squid);
                }
                else if(valdRas.equals("Worm"))
                {
                    String worm = "insert into worm values(" + alienID + ")";
                    databas.insert(worm);
                }
                
                JOptionPane.showMessageDialog(null, "En ny Alien har registrerats");
            } catch (InfException ex) {
                JOptionPane.showMessageDialog(null, "Registreringen misslyckades, försök igen");
                System.out.println("Internt felmeddelande" + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnActionRegistreraNyAlienActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActionRegistreraNyAlien;
    private javax.swing.JButton btnTillbakaNyAlien;
    private javax.swing.JComboBox<String> cbValjRas;
    private javax.swing.JLabel lblAnsvarigAgentNyAlien;
    private javax.swing.JLabel lblAntalArmarBoogies;
    private javax.swing.JLabel lblIDNyAlien;
    private javax.swing.JLabel lblLosenNyAlien;
    private javax.swing.JLabel lblNamnNyAlien;
    private javax.swing.JLabel lblPlatsNyAlien;
    private javax.swing.JLabel lblRegDatNyAlien;
    private javax.swing.JLabel lblRubrikNyAlien;
    private javax.swing.JLabel lblTelefonNyAlien;
    private javax.swing.JLabel lblValjRas;
    private javax.swing.JTextField txtAnsvarigAgentNyAlien;
    private javax.swing.JTextField txtAntalArmarBoogies;
    private javax.swing.JTextField txtIDNyAlien;
    private javax.swing.JTextField txtLosenNyAlien;
    private javax.swing.JTextField txtNamnNyAlien;
    private javax.swing.JTextField txtPlatsNyAlien;
    private javax.swing.JTextField txtRegDatNyAlien;
    private javax.swing.JTextField txtTelefonNyAlien;
    // End of variables declaration//GEN-END:variables
}
