/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package realisering15;

import java.util.ArrayList;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;

/**
 * @author Grupp15
 */
public class AdminAndraOmrC extends javax.swing.JFrame {

    private static InfDB databas;
    private String id;

    /**
     * Creates new form AdminAndraOmrC
     */
    public AdminAndraOmrC(InfDB databas, String id) {
        initComponents();
        this.databas = databas;
        this.id = id;
        fyllCbValjOmrade();
        fyllCbNyOmradeschef();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        lvlVakommen = new javax.swing.JLabel();
        btnAndraOmrCTillbaka = new javax.swing.JButton();
        lblValjOmrade = new javax.swing.JLabel();
        cbValjOmrade = new javax.swing.JComboBox<>();
        txtFieldNuvarandeOmradeschef = new javax.swing.JTextField();
        lblNuvarandeOmradeschef = new javax.swing.JLabel();
        lblNyOmradeschef = new javax.swing.JLabel();
        cbNyOmradeschef = new javax.swing.JComboBox<>();
        btnAndraOmradeschef = new javax.swing.JButton();
        lblOmradesNamn = new javax.swing.JLabel();
        txtFieldValtOmradesNamn = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lvlVakommen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lvlVakommen.setText("Ändra områdeschef över ett område");

        btnAndraOmrCTillbaka.setText("Tillbaka");
        btnAndraOmrCTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraOmrCTillbakaActionPerformed(evt);
            }
        });

        lblValjOmrade.setText("Välj områdesID");

        cbValjOmrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbValjOmradeActionPerformed(evt);
            }
        });

        txtFieldNuvarandeOmradeschef.setEditable(false);

        lblNuvarandeOmradeschef.setText("Nuvarande områdeschef (ID)");

        lblNyOmradeschef.setText("Ny områdeschef (ID)");

        btnAndraOmradeschef.setText("Ändra områdeschef");
        btnAndraOmradeschef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraOmradeschefActionPerformed(evt);
            }
        });

        lblOmradesNamn.setText("Valt områdesnamn");

        txtFieldValtOmradesNamn.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAndraOmrCTillbaka)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAndraOmradeschef)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lvlVakommen))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblValjOmrade)
                                    .addComponent(lblOmradesNamn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFieldValtOmradesNamn)
                                    .addComponent(cbValjOmrade, 0, 120, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNyOmradeschef)
                                    .addComponent(lblNuvarandeOmradeschef))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFieldNuvarandeOmradeschef)
                                    .addComponent(cbNyOmradeschef, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lvlVakommen)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValjOmrade)
                    .addComponent(cbValjOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOmradesNamn)
                    .addComponent(txtFieldValtOmradesNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNuvarandeOmradeschef)
                    .addComponent(txtFieldNuvarandeOmradeschef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNyOmradeschef)
                    .addComponent(cbNyOmradeschef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAndraOmrCTillbaka)
                    .addComponent(btnAndraOmradeschef))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metod som körs när konstruktorn anropas för att fylla comboboxen
     * "ValjOmrade" med val
     */
    private void fyllCbValjOmrade() {
        try {
            ArrayList<String> allaOmraden = databas.fetchColumn("SELECT omrades_ID FROM omrade");
            for (String ettOmrade : allaOmraden) {
                cbValjOmrade.addItem(ettOmrade);
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }

    /**
     * Metod som körs när konstruktorn anropas för att fylla comboboxen
     * "NyOmradeschef" med val
     */
    private void fyllCbNyOmradeschef() {
        try {
            ArrayList<String> allaAgentID = databas.fetchColumn("SELECT agent_ID FROM agent");
            for (String ettAgentID : allaAgentID) {
                cbNyOmradeschef.addItem(ettAgentID);
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }

    /**
     * Metod som stänger detta fönster och tar användaren tillbaka till
     * adminfönstret
     */
    private void btnAndraOmrCTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraOmrCTillbakaActionPerformed
        AdminAndraOmrC.this.dispose();
    }//GEN-LAST:event_btnAndraOmrCTillbakaActionPerformed

    /**
     * Metod som visar den nuvarande områdeschefen för det valda området i
     * textrutan
     */
    private void cbValjOmradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbValjOmradeActionPerformed
        txtFieldNuvarandeOmradeschef.setText("");
        txtFieldValtOmradesNamn.setText("");

        try {
            String valtOmradesID = cbValjOmrade.getSelectedItem().toString();
            String valtOmradesNamn = databas.fetchSingle("SELECT benamning FROM omrade WHERE omrades_id=" + valtOmradesID);
            txtFieldValtOmradesNamn.setText(valtOmradesNamn);
            String nuvarandeOmradeschefID = databas.fetchSingle("SELECT agent_id FROM omradeschef WHERE omrade=" + valtOmradesID);
            txtFieldNuvarandeOmradeschef.setText(nuvarandeOmradeschefID);

        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }//GEN-LAST:event_cbValjOmradeActionPerformed

    /**
     * Metod som uppdaterar vilken agent som är områdeschef över valt område
     */
    private void btnAndraOmradeschefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraOmradeschefActionPerformed
        try {
            String valtOmradesID = cbValjOmrade.getSelectedItem().toString();
            String nyOmradeschefID = cbNyOmradeschef.getSelectedItem().toString();

            databas.update("UPDATE omradeschef SET agent_id=" + nyOmradeschefID + " WHERE omrade=" + valtOmradesID);

            JOptionPane.showMessageDialog(null, ("Områdeschefen för område " + valtOmradesID + " har ändrats till agentID " + nyOmradeschefID));
            txtFieldNuvarandeOmradeschef.setText("");
            txtFieldValtOmradesNamn.setText("");

        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }//GEN-LAST:event_btnAndraOmradeschefActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndraOmrCTillbaka;
    private javax.swing.JButton btnAndraOmradeschef;
    private javax.swing.JComboBox<String> cbNyOmradeschef;
    private javax.swing.JComboBox<String> cbValjOmrade;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel lblNuvarandeOmradeschef;
    private javax.swing.JLabel lblNyOmradeschef;
    private javax.swing.JLabel lblOmradesNamn;
    private javax.swing.JLabel lblValjOmrade;
    private javax.swing.JLabel lvlVakommen;
    private javax.swing.JTextField txtFieldNuvarandeOmradeschef;
    private javax.swing.JTextField txtFieldValtOmradesNamn;
    // End of variables declaration//GEN-END:variables
}
