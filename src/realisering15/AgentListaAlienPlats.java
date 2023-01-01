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
public class AgentListaAlienPlats extends javax.swing.JFrame {
            private static InfDB databas;
            private String id;

    /**
     * Creates new form AgentListaAlienPlats
     */
    public AgentListaAlienPlats(InfDB databas, String id) {
        initComponents();
        this.id=id;
        this.databas=databas;
        fyllCbValjOmrade();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbValjOmrade = new javax.swing.JComboBox<>();
        btnListaAlienTillbaka = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaVisaInfo = new javax.swing.JTextArea();
        lblValjOmrade = new javax.swing.JLabel();
        lblListaAlienOmrRubrik = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbValjOmrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbValjOmradeActionPerformed(evt);
            }
        });

        btnListaAlienTillbaka.setText("Tillbaka");
        btnListaAlienTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaAlienTillbakaActionPerformed(evt);
            }
        });

        txtAreaVisaInfo.setEditable(false);
        txtAreaVisaInfo.setColumns(20);
        txtAreaVisaInfo.setRows(5);
        jScrollPane1.setViewportView(txtAreaVisaInfo);

        lblValjOmrade.setText("Välj område:");

        lblListaAlienOmrRubrik.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblListaAlienOmrRubrik.setText("Lista Aliens i angivet område");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnListaAlienTillbaka)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 70, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblValjOmrade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbValjOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(67, 67, 67))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblListaAlienOmrRubrik)
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblListaAlienOmrRubrik)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbValjOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValjOmrade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(btnListaAlienTillbaka)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListaAlienTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaAlienTillbakaActionPerformed
        // TODO add your handling code here:
        AgentListaAlienPlats.this.dispose();
    }//GEN-LAST:event_btnListaAlienTillbakaActionPerformed
    private void fyllCbValjOmrade()
    {
        String fraga = "SELECT benamning FROM OMRADE";
        
        ArrayList<String> allaOmraden;
        try
            {
            allaOmraden = databas.fetchColumn(fraga);
            for(String benamning : allaOmraden)
                {
                cbValjOmrade.addItem(benamning);
                }
            }
       catch(InfException ex1)
            {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + ex1.getMessage());                    
            }
    }
    
    private void cbValjOmradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbValjOmradeActionPerformed
        // TODO add your handling code here:
        txtAreaVisaInfo.setText("");
        ArrayList<HashMap<String, String>> soktaAliens;
       // 
        try
            {
            String valtOmrade = cbValjOmrade.getSelectedItem().toString();
            String fragaAlien = "SELECT * FROM alien where plats in (select omrades_id from omrade where benamning ='" +valtOmrade + "') order by alien_id";
            soktaAliens = databas.fetchRows(fragaAlien);
            txtAreaVisaInfo.append("ID"+"\t");
            txtAreaVisaInfo.append("Namn"+"\t");
            txtAreaVisaInfo.append("Telefon"+"\n"); 
            for(HashMap<String, String> alien : soktaAliens)
                {
                txtAreaVisaInfo.append(alien.get("Alien_ID")+"\t");
                txtAreaVisaInfo.append(alien.get("Namn")+"\t");
                txtAreaVisaInfo.append(alien.get("Telefon")+"\n");
                }
            }
        catch(InfException ex1)
            {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + ex1.getMessage());     
            }
    }//GEN-LAST:event_cbValjOmradeActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListaAlienTillbaka;
    private javax.swing.JComboBox<String> cbValjOmrade;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblListaAlienOmrRubrik;
    private javax.swing.JLabel lblValjOmrade;
    private javax.swing.JTextArea txtAreaVisaInfo;
    // End of variables declaration//GEN-END:variables
}
