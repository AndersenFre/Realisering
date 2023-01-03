/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package realisering15;


import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;

/**
 *
 * @author Grupp15
 */
public class AdminLaggTillAgent extends javax.swing.JFrame {

    private static InfDB databas;
    private String id;
    /**
     * Creates new form AdminLaggTillAgent
     */
    public AdminLaggTillAgent(InfDB databas, String id) {
        initComponents();
        this.databas = databas;
        this.id=id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLaggTillA = new javax.swing.JLabel();
        btnLaggTillAgentTillbaka = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();
        lblNamn = new javax.swing.JLabel();
        lblTelNr = new javax.swing.JLabel();
        lblAnstallningsdatum = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblAdminStatus = new javax.swing.JLabel();
        lblLosenord = new javax.swing.JLabel();
        lblOmrade = new javax.swing.JLabel();
        btnLaggTill = new javax.swing.JButton();
        txtNyttID = new javax.swing.JTextField();
        txtNyttNamn = new javax.swing.JTextField();
        txtNyTelNr = new javax.swing.JTextField();
        txtNyttAnstallningsdatum = new javax.swing.JTextField();
        txtNyAdminStatus = new javax.swing.JTextField();
        txtNyttLosen = new javax.swing.JTextField();
        txtNyttOmrade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblLaggTillA.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblLaggTillA.setText("Lägg till Agent");

        btnLaggTillAgentTillbaka.setText("Tillbaka");
        btnLaggTillAgentTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillAgentTillbakaActionPerformed(evt);
            }
        });

        lblID.setText("ID:");

        lblNamn.setText("Namn:");

        lblTelNr.setText("Telefon:");

        lblAnstallningsdatum.setText("Anställningsdatum:");

        lblAdminStatus.setText("Administratör:");

        lblLosenord.setText("Lösenord:");

        lblOmrade.setText("Område:");

        btnLaggTill.setText("Lägg Till");
        btnLaggTill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillActionPerformed(evt);
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
                        .addComponent(btnLaggTillAgentTillbaka)
                        .addGap(218, 218, 218))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(146, 146, 146)
                            .addComponent(lblLaggTillA))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblID)
                                .addComponent(lblTelNr)
                                .addComponent(lblAnstallningsdatum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblNamn)
                                .addComponent(txtNyttAnstallningsdatum)
                                .addComponent(txtNyTelNr)
                                .addComponent(txtNyttNamn)
                                .addComponent(txtNyttID))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addGap(87, 87, 87))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLaggTill)
                    .addComponent(lblAdminStatus)
                    .addComponent(lblLosenord)
                    .addComponent(lblOmrade)
                    .addComponent(txtNyttOmrade, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(txtNyttLosen)
                    .addComponent(txtNyAdminStatus))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblLaggTillA)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblAdminStatus)
                    .addComponent(lblID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNyttID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNyAdminStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNamn)
                    .addComponent(lblLosenord))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNyttNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNyttLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelNr)
                    .addComponent(lblOmrade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNyTelNr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNyttOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAnstallningsdatum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNyttAnstallningsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLaggTillAgentTillbaka)
                    .addComponent(btnLaggTill))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLaggTillAgentTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillAgentTillbakaActionPerformed
        // TODO add your handling code here:
        AdminLaggTillAgent.this.dispose();
    }//GEN-LAST:event_btnLaggTillAgentTillbakaActionPerformed

    private void btnLaggTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillActionPerformed
        // TODO add your handling code here:
        
        if(Validering.isHeltal(txtNyttID) && Validering.textFaltHarVarde(txtNyttNamn) && Validering.textFaltHarVarde(txtNyTelNr) && Validering.textFaltHarVarde(txtNyttLosen) && Validering.textFaltHarVarde(txtNyAdminStatus) && Validering.textFaltHarVarde(txtNyttAnstallningsdatum) && Validering.isHeltal(txtNyttOmrade)){
        try{
           
        String nyttID = txtNyttID.getText();
        String nyttNamn = txtNyttNamn.getText();
        String TelNr = txtNyTelNr.getText();
        String nyttLosen = txtNyttLosen.getText();
        String nyAdminStatus = txtNyAdminStatus.getText();
        String nyttAnstallningsdatum = txtNyttAnstallningsdatum.getText();
        String nyttOmrade = txtNyttOmrade.getText();
        String allaVarden = "insert into agent values(" +nyttID+ ",'" +nyttNamn+ "', '" +TelNr+ "', '" +nyttAnstallningsdatum+ "', '" +nyAdminStatus+ "', '" +nyttLosen+ "', " +nyttOmrade+ ")";
        
        databas.insert(allaVarden);
        JOptionPane.showMessageDialog(null, ""+nyttNamn+" har registrerats.");
        }
        catch(InfException ex){
        JOptionPane.showMessageDialog(null, "Registreringen misslyckades, försök igen");
        System.out.println("Internt felmeddelande" + ex.getMessage());
        }
        }
    }//GEN-LAST:event_btnLaggTillActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLaggTill;
    private javax.swing.JButton btnLaggTillAgentTillbaka;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblAdminStatus;
    private javax.swing.JLabel lblAnstallningsdatum;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblLaggTillA;
    private javax.swing.JLabel lblLosenord;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblOmrade;
    private javax.swing.JLabel lblTelNr;
    private javax.swing.JTextField txtNyAdminStatus;
    private javax.swing.JTextField txtNyTelNr;
    private javax.swing.JTextField txtNyttAnstallningsdatum;
    private javax.swing.JTextField txtNyttID;
    private javax.swing.JTextField txtNyttLosen;
    private javax.swing.JTextField txtNyttNamn;
    private javax.swing.JTextField txtNyttOmrade;
    // End of variables declaration//GEN-END:variables
}
