/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package realisering15;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 * @author Grupp15
 */
public class AlienNyttLosenord extends javax.swing.JFrame {

    private static InfDB databas;
    private String id;

    /**
     * Creates new form AlienNyttLosenord
     */
    public AlienNyttLosenord(InfDB databas, String id) {
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

        lblNuvarandeLosen = new javax.swing.JLabel();
        lblNyttLosen = new javax.swing.JLabel();
        lblValkommen = new javax.swing.JLabel();
        lblBekraftaLosen = new javax.swing.JLabel();
        txtNuvarandeLosen = new javax.swing.JPasswordField();
        txtNyttLosen = new javax.swing.JPasswordField();
        txtBekraftaLosen = new javax.swing.JPasswordField();
        btnBekrafta = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNuvarandeLosen.setText("Nuvarande lösenord");

        lblNyttLosen.setText("Nytt lösenord");

        lblValkommen.setText("Fyll i uppgifterna nedan för att ändra ditt lösenord");

        lblBekraftaLosen.setText("Bekräfta lösenord");

        btnBekrafta.setText("Bekräfta");
        btnBekrafta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBekraftaActionPerformed(evt);
            }
        });

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNyttLosen)
                            .addComponent(lblNuvarandeLosen))
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNyttLosen, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtNuvarandeLosen)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBekraftaLosen)
                            .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBekrafta, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtBekraftaLosen))))
                .addGap(69, 69, 69))
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(lblValkommen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblValkommen)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNuvarandeLosen)
                    .addComponent(txtNuvarandeLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNyttLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNyttLosen))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBekraftaLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBekraftaLosen))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBekrafta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metod som kontrollerar att "rätt" användare är den som försöker ändra
     * lösenord genom att först kräva ett korrekt nuvarande lösen och som sedan
     * kontrollerar att det nya lösenordet är korrekt inskrivet genom att
     * nyttLosen kontrolleras mot bekraftaLosen, om informationen är korrekt så
     * förändras lösenordet till det önskade
     */
    private void btnBekraftaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBekraftaActionPerformed

        if (Validering.textFaltHarVarde(txtNuvarandeLosen) && Validering.textFaltHarVarde(txtNyttLosen) && Validering.textFaltHarVarde(txtBekraftaLosen)) {

            try {
                char[] nuvarandeLosenKrypt = txtNuvarandeLosen.getPassword();
                String nuvarandeLosenOkrypt = new String(nuvarandeLosenKrypt);

                char[] nyttLosenKrypt = txtNyttLosen.getPassword();
                String nyttLosenOkrypt = new String(nyttLosenKrypt);

                char[] bekraftaLosenKrypt = txtBekraftaLosen.getPassword();
                String bekraftaLosenOkrypt = new String(bekraftaLosenKrypt);

                String aliensLosenSql = "SELECT losenord FROM alien where alien_id=" + id;
                String aliensLosen = databas.fetchSingle(aliensLosenSql);

                String sqlUppdateraLosen = "UPDATE alien set losenord ='" + nyttLosenOkrypt + "' where alien_id =" + id;

                if (nuvarandeLosenOkrypt.equals(aliensLosen) && nyttLosenOkrypt.equals(bekraftaLosenOkrypt)) {
                    databas.update(sqlUppdateraLosen);
                    JOptionPane.showMessageDialog(null, "Ditt lösenord har ändrats!");
                } else {
                    JOptionPane.showMessageDialog(null, "Felaktiga lösenordsuppgifter, försök igen!");
                }
            } catch (InfException ex) {
                JOptionPane.showMessageDialog(null, "Ett fel har inträffat, försök igen");
                System.out.println("Internt felmeddelande" + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnBekraftaActionPerformed

    /**
     * Metod som tar användaren tillbaka till föregående fönster
     */
    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        AlienNyttLosenord.this.dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBekrafta;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JLabel lblBekraftaLosen;
    private javax.swing.JLabel lblNuvarandeLosen;
    private javax.swing.JLabel lblNyttLosen;
    private javax.swing.JLabel lblValkommen;
    private javax.swing.JPasswordField txtBekraftaLosen;
    private javax.swing.JPasswordField txtNuvarandeLosen;
    private javax.swing.JPasswordField txtNyttLosen;
    // End of variables declaration//GEN-END:variables
}
