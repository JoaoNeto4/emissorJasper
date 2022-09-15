

package telas;


public class TelaPrincipal extends javax.swing.JFrame {

    
    public TelaPrincipal() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jmReflorasul = new javax.swing.JMenu();
        jmAtivus = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmScp = new javax.swing.JMenuItem();
        jmTableros = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jmReflorasul.setText("Recibos");

        jmAtivus.setText("Ativus");
        jmAtivus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jmAtivusMouseReleased(evt);
            }
        });
        jmReflorasul.add(jmAtivus);

        jMenuItem1.setText("Reflorasul");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseReleased(evt);
            }
        });
        jmReflorasul.add(jMenuItem1);

        jmScp.setText("Serrarias Campos");
        jmScp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jmScpMouseReleased(evt);
            }
        });
        jmReflorasul.add(jmScp);

        jmTableros.setText("Tableros");
        jmTableros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jmTablerosMouseReleased(evt);
            }
        });
        jmReflorasul.add(jmTableros);

        jMenuBar1.add(jmReflorasul);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmAtivusMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmAtivusMouseReleased
        TelaAtivus at = new TelaAtivus(this, true);
        at.setVisible(true);
    }//GEN-LAST:event_jmAtivusMouseReleased

    private void jMenuItem1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseReleased
        TelaReflorasul ref = new TelaReflorasul(this, true);
        ref.setVisible(true);
    }//GEN-LAST:event_jMenuItem1MouseReleased

    private void jmScpMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmScpMouseReleased
        TelaScp scp = new TelaScp(this, true);
        scp.setVisible(true);
    }//GEN-LAST:event_jmScpMouseReleased

    private void jmTablerosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmTablerosMouseReleased
        TelaTableros tab = new TelaTableros(this, true);
        tab.setVisible(true);
    }//GEN-LAST:event_jmTablerosMouseReleased

    
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jmAtivus;
    private javax.swing.JMenu jmReflorasul;
    private javax.swing.JMenuItem jmScp;
    private javax.swing.JMenuItem jmTableros;
    // End of variables declaration//GEN-END:variables

}
