/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package realisering15;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JComboBox;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;
/**
 *
 * @author Grupp15
 */
public class AdminTaBortUtr extends javax.swing.JFrame {
    
    private static InfDB databas;
    private String id;
    /**
     * Creates new form AdminTaBortUtr
     */
    public AdminTaBortUtr(InfDB databas, String id) {
        initComponents();
        this.databas = databas;
        this.id=id;
        fyllCbValjUtrID();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTaBortUtrRubrik = new javax.swing.JLabel();
        btnTaBortUtrTillbaka = new javax.swing.JButton();
        cbUtrID = new javax.swing.JComboBox<>();
        lblRaderaValjUtrID = new javax.swing.JLabel();
        btnRaderaUtrID = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaVisaInfoUtr = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTaBortUtrRubrik.setText("Radera Utr");

        btnTaBortUtrTillbaka.setText("Tillbaka");
        btnTaBortUtrTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortUtrTillbakaActionPerformed(evt);
            }
        });

        cbUtrID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUtrIDActionPerformed(evt);
            }
        });

        lblRaderaValjUtrID.setText("Välj utrustningsID:");

        btnRaderaUtrID.setText("Radera");
        btnRaderaUtrID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaderaUtrIDActionPerformed(evt);
            }
        });

        txtAreaVisaInfoUtr.setEditable(false);
        txtAreaVisaInfoUtr.setColumns(20);
        txtAreaVisaInfoUtr.setRows(5);
        jScrollPane1.setViewportView(txtAreaVisaInfoUtr);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTaBortUtrTillbaka)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRaderaUtrID))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(lblTaBortUtrRubrik)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 66, Short.MAX_VALUE)
                .addComponent(lblRaderaValjUtrID)
                .addGap(52, 52, 52)
                .addComponent(cbUtrID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lblTaBortUtrRubrik)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbUtrID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRaderaValjUtrID))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTaBortUtrTillbaka)
                    .addComponent(btnRaderaUtrID))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void fyllCbValjUtrID()
    {
        String fraga = "SELECT utrustnings_id FROM utrustning";
        
        ArrayList<String> allaUtrID;
        try
            {
            allaUtrID = databas.fetchColumn(fraga);
            for(String benamning : allaUtrID)
                {
                cbUtrID.addItem(benamning);
                }
            }
       catch(InfException ex1)
            {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + ex1.getMessage());                    
            }
    }
    private void btnTaBortUtrTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortUtrTillbakaActionPerformed
        // TODO add your handling code here:
        AdminTaBortUtr.this.dispose();
    }//GEN-LAST:event_btnTaBortUtrTillbakaActionPerformed

    private void btnRaderaUtrIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaderaUtrIDActionPerformed
        // TODO add your handling code here:
        try{
            
        
        String valtUtrID = cbUtrID.getSelectedItem().toString();
        String kategori = "";
        String raderaUtr = "delete from utrustning where utrustnings_id=" + valtUtrID;
        
        String raderaSub = "";
        
        ArrayList<String> arTek = new ArrayList<String>();
        ArrayList<String> arVapen = new ArrayList<String>();
        ArrayList<String> arKom = new ArrayList<String>();
        String fragaTek = "SELECT utrustnings_id FROM teknik";
        String fragaVapen = "SELECT utrustnings_id FROM vapen";
        String fragaKom = "SELECT utrustnings_id FROM kommunikation";
        arTek = databas.fetchColumn(fragaTek);
        arVapen = databas.fetchColumn(fragaVapen);
        arKom = databas.fetchColumn(fragaKom);
        
        String tek = "Teknik";
        String vapen = "Vapen";
        String kom = "Kommunikation";
        
        
            for(String idTek : arTek)
            {
              if(valtUtrID.equals(idTek))
              {
                  raderaSub = "delete from teknik where Utrustnings_ID=" +valtUtrID;
              }
            }
            for(String idVapen : arVapen)
            {
              if(valtUtrID.equals(idVapen))
              {
                  raderaSub = "delete from vapen where Utrustnings_ID=" +valtUtrID;
              }
            }
            for(String idKom : arKom)
            {
              if(valtUtrID.equals(idKom))
              {
                  raderaSub = "delete from kommunikation where Utrustnings_ID=" +valtUtrID;
              }
            }
            databas.delete(raderaUtr);
            databas.delete(raderaSub);
            JOptionPane.showMessageDialog(null, "Utrustningen har raderats");
            AdminTaBortUtr.this.dispose();
            
        }
        catch(InfException ex1)
            {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + ex1.getMessage());     
            }
            
        
        
    }//GEN-LAST:event_btnRaderaUtrIDActionPerformed

    private void cbUtrIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUtrIDActionPerformed
        // TODO add your handling code here:
        txtAreaVisaInfoUtr.setText("");
       
        try
            {
            HashMap<String, String> soktUtr;
            String tillhorKategori = "";
            String tek = "Teknik";
            String vapen = "Vapen";
            String kom = "Kommunikation";
            ArrayList<String> arTek = new ArrayList<String>();
            ArrayList<String> arVapen = new ArrayList<String>();
            ArrayList<String> arKom = new ArrayList<String>();
            String fragaTek = "SELECT utrustnings_id FROM teknik";
            String fragaVapen = "SELECT utrustnings_id FROM vapen";
            String fragaKom = "SELECT utrustnings_id FROM kommunikation";
            arTek = databas.fetchColumn(fragaTek);
            arVapen = databas.fetchColumn(fragaVapen);
            arKom = databas.fetchColumn(fragaKom);
            String valtUtrID = cbUtrID.getSelectedItem().toString();
            String fragaUtr = "SELECT * FROM utrustning where utrustnings_id="+valtUtrID;
            soktUtr = databas.fetchRow(fragaUtr);
            
            for(String idTek : arTek)
            {
              if(valtUtrID.equals(idTek))
              {
                  tillhorKategori = tek;
              }
            }
            for(String idVapen : arVapen)
            {
              if(valtUtrID.equals(idVapen))
              {
                  tillhorKategori = vapen;
              }
            }
            for(String idKom : arKom)
            {
              if(valtUtrID.equals(idKom))
              {
                  tillhorKategori = kom;
              }
            }
            
            txtAreaVisaInfoUtr.append("ID"+"\t"+"\t");
            txtAreaVisaInfoUtr.append("Benämning"+"\n");
            txtAreaVisaInfoUtr.append(soktUtr.get("Utrustnings_ID")+"\t"+"\t");
            txtAreaVisaInfoUtr.append(soktUtr.get("Benamning")+"\n");
            txtAreaVisaInfoUtr.append("Kategori"+"\n");
            txtAreaVisaInfoUtr.append(tillhorKategori);

            
            }
        catch(InfException ex1)
            {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + ex1.getMessage());     
            }
    }//GEN-LAST:event_cbUtrIDActionPerformed

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
            java.util.logging.Logger.getLogger(AdminTaBortUtr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminTaBortUtr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminTaBortUtr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminTaBortUtr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AdminTaBortUtr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRaderaUtrID;
    private javax.swing.JButton btnTaBortUtrTillbaka;
    private javax.swing.JComboBox<String> cbUtrID;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRaderaValjUtrID;
    private javax.swing.JLabel lblTaBortUtrRubrik;
    private javax.swing.JTextArea txtAreaVisaInfoUtr;
    // End of variables declaration//GEN-END:variables
}
