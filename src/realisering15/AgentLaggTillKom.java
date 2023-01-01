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
public class AgentLaggTillKom extends javax.swing.JFrame {
        private static InfDB databas;
        private String id = null;
    /**
     * Creates new form AgentLaggTillKom
     */
    public AgentLaggTillKom(InfDB databas, String id) {
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

        btnKomTillbaka = new javax.swing.JButton();
        btnRegTek = new javax.swing.JButton();
        lblKomRubrik = new javax.swing.JLabel();
        lblKomUtrID = new javax.swing.JLabel();
        lblKomNamn = new javax.swing.JLabel();
        lblKomOverFor = new javax.swing.JLabel();
        txtKomUtrID = new javax.swing.JTextField();
        txtKomNamn = new javax.swing.JTextField();
        txtKomOverFor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnKomTillbaka.setText("Tillbaka");
        btnKomTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKomTillbakaActionPerformed(evt);
            }
        });

        btnRegTek.setText("Registrera");
        btnRegTek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegTekActionPerformed(evt);
            }
        });

        lblKomRubrik.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblKomRubrik.setText("Lägg till kommunikationsutrustning");
        lblKomRubrik.setAlignmentY(0.0F);

        lblKomUtrID.setText("Utrustnings ID");
        lblKomUtrID.setAlignmentY(0.0F);

        lblKomNamn.setText("Benämning");
        lblKomNamn.setAlignmentY(0.0F);

        lblKomOverFor.setText("Överföringsteknik");
        lblKomOverFor.setAlignmentY(0.0F);

        txtKomUtrID.setAlignmentX(0.0F);
        txtKomUtrID.setAlignmentY(0.0F);

        txtKomNamn.setAlignmentX(0.0F);
        txtKomNamn.setAlignmentY(0.0F);

        txtKomOverFor.setAlignmentX(0.0F);
        txtKomOverFor.setAlignmentY(0.0F);
        txtKomOverFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKomOverForActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnKomTillbaka)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegTek)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblKomNamn)
                                .addContainerGap(181, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblKomUtrID, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtKomOverFor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                        .addComponent(txtKomNamn, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtKomUtrID, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(lblKomOverFor))
                                .addGap(0, 0, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblKomRubrik)
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblKomRubrik)
                .addGap(29, 29, 29)
                .addComponent(lblKomUtrID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtKomUtrID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblKomNamn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtKomNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblKomOverFor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtKomOverFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKomTillbaka)
                    .addComponent(btnRegTek))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtKomOverForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKomOverForActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKomOverForActionPerformed

    private void btnKomTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKomTillbakaActionPerformed
        // TODO add your handling code here:
        AgentLaggTillKom.this.dispose();
    }//GEN-LAST:event_btnKomTillbakaActionPerformed

    private void btnRegTekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegTekActionPerformed
        // TODO add your handling code here:
        try 
        {
            //Ska vara int
            String utrID = txtKomUtrID.getText();
            //Ska vara string
            String namn = txtKomNamn.getText();
            //Ska vara Int
            String overFor = txtKomOverFor.getText();
            //Insert into Utrustning och vapen
            String tillLaggUtr = "insert into utrustning values(" + utrID + ",'" + namn +"')";
            String tillLaggKom = "insert into kommunikation values(" + utrID + ",'" + overFor + "')";
            
            databas.insert(tillLaggUtr);
            databas.insert(tillLaggKom);
           JOptionPane.showMessageDialog(null, "Ny kommunikationsutrustning har registrerats");
        } 
        catch (InfException ex1) 
        {
            JOptionPane.showMessageDialog(null, "Registreringen misslyckades, försök igen");
            System.out.println("Internt felmeddelande" + ex1.getMessage());
        }
    }//GEN-LAST:event_btnRegTekActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKomTillbaka;
    private javax.swing.JButton btnRegTek;
    private javax.swing.JLabel lblKomNamn;
    private javax.swing.JLabel lblKomOverFor;
    private javax.swing.JLabel lblKomRubrik;
    private javax.swing.JLabel lblKomUtrID;
    private javax.swing.JTextField txtKomNamn;
    private javax.swing.JTextField txtKomOverFor;
    private javax.swing.JTextField txtKomUtrID;
    // End of variables declaration//GEN-END:variables
}
