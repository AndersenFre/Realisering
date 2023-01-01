/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package realisering15;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Grupp15
 */
public class AgentListaAlienRas extends javax.swing.JFrame {

    private static InfDB databas;
    private String id;

    /**
     * Creates new form AgentListaAle
     */
    public AgentListaAlienRas(InfDB databas, String id) {
        initComponents();
        this.id = id;
        this.databas = databas;
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

        lblVisaRasRubrik = new javax.swing.JLabel();
        btnVisaRasTillbaka = new javax.swing.JButton();
        cbVisaRasRaser = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaAliens = new javax.swing.JTextArea();
        lblVisaRasValjRas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblVisaRasRubrik.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblVisaRasRubrik.setText("Visa Aliens av ras");

        btnVisaRasTillbaka.setText("Tillbaka");
        btnVisaRasTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaRasTillbakaActionPerformed(evt);
            }
        });

        cbVisaRasRaser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVisaRasRaserActionPerformed(evt);
            }
        });

        txtAreaAliens.setEditable(false);
        txtAreaAliens.setColumns(20);
        txtAreaAliens.setRows(5);
        jScrollPane1.setViewportView(txtAreaAliens);

        lblVisaRasValjRas.setText("Välj ras:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblVisaRasValjRas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbVisaRasRaser, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVisaRasTillbaka))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblVisaRasRubrik)))
                .addGap(132, 132, 132))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVisaRasRubrik)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbVisaRasRaser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVisaRasValjRas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(btnVisaRasTillbaka)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVisaRasTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaRasTillbakaActionPerformed
        // TODO add your handling code here:
        AgentListaAlienRas.this.dispose();
    }//GEN-LAST:event_btnVisaRasTillbakaActionPerformed

    private void cbVisaRasRaserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVisaRasRaserActionPerformed
        // TODO add your handling code here:
        txtAreaAliens.setText("");
        ArrayList<String> soktAlienID;
        ArrayList<HashMap<String, String>> soktaAliens;
        // 
        try {
            String valdRas = cbVisaRasRaser.getSelectedItem().toString();
            String fragaRas = "SELECT Alien_ID FROM " + valdRas;
            soktAlienID = databas.fetchColumn(fragaRas);

            txtAreaAliens.append("ID" + "\t");
            txtAreaAliens.append("Namn" + "\t");
            txtAreaAliens.append("Telefon" + "\n");

            for (String ettAlienID : soktAlienID) {
                String enFragaNamn = "SELECT namn FROM alien WHERE alien_id =" + ettAlienID;
                String ettAlienNamn = databas.fetchSingle(enFragaNamn);
                String enFragaTelefon = "SELECT telefon FROM alien WHERE alien_id =" + ettAlienID;
                String enAlienTelefon = databas.fetchSingle(enFragaTelefon);
                txtAreaAliens.append(ettAlienID + "\t");
                txtAreaAliens.append(ettAlienNamn + "\t");
                txtAreaAliens.append(enAlienTelefon + "\n");
            }

        } catch (InfException ex1) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + ex1.getMessage());
        }

    }//GEN-LAST:event_cbVisaRasRaserActionPerformed
    
    private void fyllCbValjRas() {
        ArrayList<String> raser = new ArrayList<String>();
        raser.add("Boglodite");
        raser.add("Worm");
        raser.add("Squid");

        for (String enRas : raser) {
            cbVisaRasRaser.addItem(enRas);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVisaRasTillbaka;
    private javax.swing.JComboBox<String> cbVisaRasRaser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblVisaRasRubrik;
    private javax.swing.JLabel lblVisaRasValjRas;
    private javax.swing.JTextArea txtAreaAliens;
    // End of variables declaration//GEN-END:variables
}
