package vista;

import vista.InicioSesion;
import vista.Registro;
import modelo.ConexionBBDD;


public class VentanaPrincipal extends javax.swing.JFrame {

   
    public VentanaPrincipal() {
        initComponents();
        ConexionBBDD c = new ConexionBBDD();
        c.connection();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoVentanaPrincipal = new javax.swing.JPanel();
        Fondo = new javax.swing.JLabel();
        Play = new javax.swing.JButton();
        Registro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FondoVentanaPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/fondoFigma.jpg"))); // NOI18N
        FondoVentanaPrincipal.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 800));

        Play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayActionPerformed(evt);
            }
        });
        FondoVentanaPrincipal.add(Play, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 530, 220, 80));

        Registro.setText("jButton1");
        Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroActionPerformed(evt);
            }
        });
        FondoVentanaPrincipal.add(Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 650, 240, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoVentanaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoVentanaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayActionPerformed
        InicioSesion s1 = new InicioSesion();
        s1.setVisible(true);
        
    }//GEN-LAST:event_PlayActionPerformed

    private void RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroActionPerformed
        Registro r1 = new Registro();
        r1.setVisible(true);
    }//GEN-LAST:event_RegistroActionPerformed

   
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel FondoVentanaPrincipal;
    private javax.swing.JButton Play;
    private javax.swing.JButton Registro;
    // End of variables declaration//GEN-END:variables
}
