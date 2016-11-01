/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


/**
 *
 * @author Martin
 */
public class TipoSala extends javax.swing.JFrame {

    /**
     * Creates new form Ciudad
     */
    public TipoSala() {
        initComponents();
    }
     Connection connection;
    PreparedStatement pst;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NmbreTipo = new javax.swing.JTextField();
        IdTipo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NmbreTipo.setBackground(new java.awt.Color(49, 97, 131));
        NmbreTipo.setForeground(new java.awt.Color(255, 255, 255));
        NmbreTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NmbreTipoActionPerformed(evt);
            }
        });
        getContentPane().add(NmbreTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 460, 215, 30));

        IdTipo.setBackground(new java.awt.Color(49, 97, 131));
        IdTipo.setForeground(new java.awt.Color(255, 255, 255));
        IdTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdTipoActionPerformed(evt);
            }
        });
        getContentPane().add(IdTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 215, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton Guardar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, 80, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Tipo de  Sala.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1150, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NmbreTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NmbreTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NmbreTipoActionPerformed

    private void IdTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdTipoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        try {
            connection = Conexion.getConnection();  //Establecer conexiÃ³n
            pst = connection.prepareStatement("INSERT INTO tipo_sala (IdTipo, Nombre) VALUES (?, ?)");
            pst.setString(1, this.IdTipo.getText());
            pst.setString(2, this.NmbreTipo.getText());
            String cadena = this.IdTipo.getText();
            if (cadena.equals("")) {
                JOptionPane.showMessageDialog(null, "El codigo de a ciudad es Obligatorio!");
            } else {
                int res = pst.executeUpdate();
                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Datos Almacenados correctamente!");
                } else {
                    JOptionPane.showMessageDialog(null, "Datos No Almacenados!");
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TipoSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TipoSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TipoSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TipoSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TipoSala().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IdTipo;
    private javax.swing.JTextField NmbreTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    private void EXIT_ON_CLOSE() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void finalize(TipoSala m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}