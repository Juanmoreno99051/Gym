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
public class Sala extends javax.swing.JFrame {

    /**
     * Creates new form Socio
     */
    public Sala() {
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

        jButton1 = new javax.swing.JButton();
        IdSala = new javax.swing.JTextField();
        Metros = new javax.swing.JTextField();
        IdTipo = new javax.swing.JTextField();
        Unic = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setForeground(new java.awt.Color(22, 97, 172));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton Guardar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 80, 50));

        IdSala.setBackground(new java.awt.Color(49, 97, 131));
        IdSala.setForeground(new java.awt.Color(255, 255, 255));
        IdSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdSalaActionPerformed(evt);
            }
        });
        getContentPane().add(IdSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 210, 30));

        Metros.setBackground(new java.awt.Color(49, 97, 131));
        Metros.setForeground(new java.awt.Color(255, 255, 255));
        Metros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MetrosActionPerformed(evt);
            }
        });
        getContentPane().add(Metros, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 210, 30));

        IdTipo.setBackground(new java.awt.Color(49, 97, 131));
        IdTipo.setForeground(new java.awt.Color(255, 255, 255));
        IdTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdTipoActionPerformed(evt);
            }
        });
        getContentPane().add(IdTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 210, 30));

        Unic.setBackground(new java.awt.Color(49, 97, 131));
        Unic.setForeground(new java.awt.Color(255, 255, 255));
        Unic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnicActionPerformed(evt);
            }
        });
        getContentPane().add(Unic, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 300, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Tipo Sala.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 260, 180, 170));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sala.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            connection = Conexion.getConnection();  //Establecer conexiÃ³n
            pst = connection.prepareStatement("INSERT INTO sala (idSala, Metros, Ubicacion, Idtipo, Tipo_Sala_IdTipo) VALUES (? , ? , ? , ? , ? )");
            pst.setString(1, this.IdSala.getText());
            pst.setString(2, this.Unic.getText());
            pst.setString(3, this.Metros.getText());
            pst.setString(4,this.IdTipo.getText());
            pst.setString(5,this.IdTipo.getText());
             
            String cadena = this.IdSala.getText();
            if (cadena.equals("")) {
                JOptionPane.showMessageDialog(null, "El Numero de la Sala es Obligatorio!");
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
        
       this.IdSala.setText("");
          this.Unic.setText("");
             this.IdTipo.setText("");
             this.Metros.setText("");
         
           
        
        

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void IdSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdSalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdSalaActionPerformed

    private void MetrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MetrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MetrosActionPerformed

    private void IdTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdTipoActionPerformed

    private void UnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UnicActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
TipoSala t=new TipoSala();
t.setVisible(rootPaneCheckingEnabled);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Sala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sala().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IdSala;
    private javax.swing.JTextField IdTipo;
    private javax.swing.JTextField Metros;
    private javax.swing.JTextField Unic;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
