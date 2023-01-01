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
public class AgentVisaOmrC extends javax.swing.JFrame {
            private static InfDB databas;
            private String id;
    /**
     * Creates new form AgentVisaOmrC
     */
    public AgentVisaOmrC(InfDB databas, String id) {
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
        btnVisaOmrCTillbaka = new javax.swing.JButton();
        lblVisaOmrCRubrik = new javax.swing.JLabel();
        lblVisaOmrCValjOmr = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaVisaInfo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbValjOmrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbValjOmradeActionPerformed(evt);
            }
        });

        btnVisaOmrCTillbaka.setText("Tillbaka");
        btnVisaOmrCTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaOmrCTillbakaActionPerformed(evt);
            }
        });

        lblVisaOmrCRubrik.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblVisaOmrCRubrik.setText("Visa chef i angivet område");

        lblVisaOmrCValjOmr.setText("Välj område");

        txtAreaVisaInfo.setEditable(false);
        txtAreaVisaInfo.setColumns(20);
        txtAreaVisaInfo.setRows(5);
        jScrollPane2.setViewportView(txtAreaVisaInfo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(lblVisaOmrCRubrik))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblVisaOmrCValjOmr)
                                .addGap(124, 124, 124)
                                .addComponent(cbValjOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 63, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVisaOmrCTillbaka)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblVisaOmrCRubrik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbValjOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVisaOmrCValjOmr))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnVisaOmrCTillbaka)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVisaOmrCTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaOmrCTillbakaActionPerformed
        // TODO add your handling code here:
        AgentVisaOmrC.this.dispose();
    }//GEN-LAST:event_btnVisaOmrCTillbakaActionPerformed

    private void cbValjOmradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbValjOmradeActionPerformed
        txtAreaVisaInfo.setText("");
        ArrayList<HashMap<String, String>> soktaChefer;
        
        try
            {
            String valtOmrade = cbValjOmrade.getSelectedItem().toString();
            String fragaChef = "SELECT * FROM agent where agent_id=(select agent_id from omradeschef where omrade =(select omrades_id from omrade where benamning = '"+valtOmrade+"'))";
            soktaChefer = databas.fetchRows(fragaChef);
            txtAreaVisaInfo.append("ID"+"\t");
            txtAreaVisaInfo.append("Namn"+"\t");
            txtAreaVisaInfo.append("Telefon"+"\n"); 
            for(HashMap<String, String> enChef : soktaChefer)
                {
                txtAreaVisaInfo.append(enChef.get("Agent_ID")+"\t");
                txtAreaVisaInfo.append(enChef.get("Namn")+"\t");
                txtAreaVisaInfo.append(enChef.get("Telefon")+"\n");
                }
            }
        catch(InfException ex1)
            {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + ex1.getMessage());     
            }
    }//GEN-LAST:event_cbValjOmradeActionPerformed
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVisaOmrCTillbaka;
    private javax.swing.JComboBox<String> cbValjOmrade;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblVisaOmrCRubrik;
    private javax.swing.JLabel lblVisaOmrCValjOmr;
    private javax.swing.JTextArea txtAreaVisaInfo;
    // End of variables declaration//GEN-END:variables
}
