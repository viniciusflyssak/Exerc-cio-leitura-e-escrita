package views;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class FrmPesquisa extends javax.swing.JFrame {
    
    public FrmPesquisa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mbMenu = new javax.swing.JMenuBar();
        mnUtilitarios = new javax.swing.JMenu();
        miTabuada = new javax.swing.JMenuItem();
        spUtilitarios = new javax.swing.JPopupMenu.Separator();
        miSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Exercício sobre fluxo de dados");

        mnUtilitarios.setText("Utilitários");

        miTabuada.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miTabuada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/calculator-icon2 (Custom).png"))); // NOI18N
        miTabuada.setText("Tabuada");
        miTabuada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miTabuadaActionPerformed(evt);
            }
        });
        mnUtilitarios.add(miTabuada);
        mnUtilitarios.add(spUtilitarios);

        miSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        miSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Log-Out-icon (Custom).png"))); // NOI18N
        miSair.setText("Sair");
        miSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSairActionPerformed(evt);
            }
        });
        mnUtilitarios.add(miSair);

        mbMenu.add(mnUtilitarios);

        setJMenuBar(mbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSairActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja encerrar a aplicação?", "Sair", NORMAL) == JOptionPane.YES_OPTION){
            dispose();
        }
    }//GEN-LAST:event_miSairActionPerformed

    private void miTabuadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miTabuadaActionPerformed
        FrmCalcularTabuada frmCalcularTabuada = new FrmCalcularTabuada();
        
        JDesktopPane dp = new JDesktopPane();
        this.add(dp);
        frmCalcularTabuada.setClosable(true);//Se o frame vai poder ser fechado pelo botão fechar 
        frmCalcularTabuada.setIconifiable(true);//Se o frame vai poder ser minimizado.
        frmCalcularTabuada.setResizable(true);//Pemite editar o tamanho.
        dp.add(frmCalcularTabuada);
        
        setContentPane(dp);
        frmCalcularTabuada.setVisible(true);
        frmCalcularTabuada.toFront();
    }//GEN-LAST:event_miTabuadaActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(FrmPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPesquisa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar mbMenu;
    private javax.swing.JMenuItem miSair;
    private javax.swing.JMenuItem miTabuada;
    private javax.swing.JMenu mnUtilitarios;
    private javax.swing.JPopupMenu.Separator spUtilitarios;
    // End of variables declaration//GEN-END:variables
}
