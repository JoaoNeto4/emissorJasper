
package telas;

import classe.Ativus;
import classe.FormatarMoeda;
import classe.ImpressoraJasperAtivus;
import classe.ValorExtenso;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;


public class TelaAtivus extends javax.swing.JDialog {

    public TelaAtivus(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tfValor.setDocument(new FormatarMoeda());
        dataAtual();
        tfRecebe.setText("Ativus Gestão Empresarial");
        taReferente.setText("Adiantamento em espécie.");
        tfEmitente.setText("Ativus Gestão Empresarial");
        tfCpfCnpj.setText("10.537.846/0001-19");
    }
    
    private void dataAtual() {
        Calendar c = Calendar.getInstance();

        String diaDoMes;
        String ano;
        String dataCompleta = "";

        int mes;

        String[] listaMeses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio",
            "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        diaDoMes = Integer.toString(c.get(Calendar.DAY_OF_MONTH));
        mes = c.get(Calendar.MONTH);
        ano = Integer.toString(c.get(Calendar.YEAR));

       
        dataCompleta += ("Palmas-PR, " + diaDoMes + " de " + listaMeses[mes] + " de " + ano);
        

        tfLocal.setText(dataCompleta);
        
    }
    public static String procuraReal(String s){
        String temp="", temp2="", temp3="", temp4="";
       
        temp=s.replaceAll("R", "");
        temp2=temp.replace("$", "");
        temp3=temp2.replace(" ", "");
        temp4=temp3.replace(".", "");
        temp=temp4.replace(",", ".");
        
        return temp;
    }
    
    public static String procuraEspaco(String s){
        String temp="";
       for(int i=0; i<s.length(); i++){
          temp=s.replace(" ", "%");
       }
        return temp;
    }
   

    public void converte() throws java.text.ParseException{
      
            String extenso, aux;
            ValorExtenso e = new ValorExtenso();
            aux=procuraReal(tfValor.getText());
            double valDouble = Double.parseDouble(aux);
            BigDecimal bd = new BigDecimal(valDouble);
            String valorExtenso = e.write(bd);
            txImportancia.setText(valorExtenso.toLowerCase());


    }
    
  
    public List<String> GetDados(){
        
        ArrayList lista = new ArrayList<>();
       
        Ativus print = new Ativus();
        
        print.setCpfcnpj(tfCpfCnpj.getText());
        print.setEmitente(tfEmitente.getText());
        print.setImportancia(txImportancia.getText());
        print.setLocalData(tfLocal.getText());
        print.setRecebi(tfRecebe.getText());
        print.setReferente(taReferente.getText());
        print.setValor(tfValor.getText());
        //print.setValor(Double.toString(tfValor.getText()));
        //print.setValor(String.valueOf(tfValor.getText()));
        lista.add(print);
       
        return lista;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        tfRecebe = new javax.swing.JTextField();
        txImportancia = new javax.swing.JTextField();
        taReferente = new javax.swing.JTextField();
        tfLocal = new javax.swing.JTextField();
        tfEmitente = new javax.swing.JTextField();
        tfCpfCnpj = new javax.swing.JTextField();
        jbLimpar = new javax.swing.JButton();
        jbImprime = new javax.swing.JButton();
        tfValor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(245, 245, 245));

        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel11.setFocusCycleRoot(true);

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ativus2.png"))); // NOI18N

        jLabel65.setFont(new java.awt.Font("DejaVu Sans", 1, 28)); // NOI18N
        jLabel65.setText("Ativus Gestão Empresarial");

        jLabel66.setText("Avenida Marechal Deodoro, 2081 -  São José");

        jLabel67.setText("Palmas - Paraná");

        jLabel68.setText("CNPJ: 10.537.846/0001-19");

        jLabel69.setText("Fone:(46) 3262-3294");

        jLabel70.setText("Cep: 85.555-000");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel66)
                            .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel69)
                            .addComponent(jLabel67))
                        .addContainerGap())
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel70)
                            .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel66)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel69)
                            .addComponent(jLabel68))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel67)
                            .addComponent(jLabel70))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel71.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        jLabel71.setText("RECIBO");

        jLabel72.setText("Recebi(emos) de");

        jLabel73.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel73.setText("Valor");

        jLabel74.setText("A importância de");

        jLabel75.setText("Referente a");

        jLabel76.setText("Para maior clareza firmamos o presente,");

        jLabel77.setText("Emitente:");

        jLabel78.setText("CPF/CNPJ");

        jbLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/limpar.png"))); // NOI18N
        jbLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbLimparMouseReleased(evt);
            }
        });

        jbImprime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/print.png"))); // NOI18N
        jbImprime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbImprimeMouseReleased(evt);
            }
        });

        tfValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfValorKeyReleased(evt);
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
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbImprime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txImportancia, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfRecebe, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(83, 83, 83)
                                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(133, 133, 133)
                                        .addComponent(jLabel73)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfValor)))
                                .addGap(3, 3, 3))
                            .addComponent(taReferente)
                            .addComponent(tfLocal, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfEmitente)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel77)
                                            .addComponent(jLabel74)
                                            .addComponent(jLabel75)
                                            .addComponent(jLabel76)
                                            .addComponent(jLabel72))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel78)
                                    .addComponent(tfCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(jLabel73)
                    .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel72)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfRecebe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel74)
                .addGap(5, 5, 5)
                .addComponent(txImportancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel75)
                .addGap(1, 1, 1)
                .addComponent(taReferente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel76)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEmitente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbImprime, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLimparMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbLimparMouseReleased

        tfValor.setText("");
        tfRecebe.setText("");
        txImportancia.setText("");
        tfEmitente.setText("");
        tfCpfCnpj.setText("");
        tfRecebe.setText("Ativus Gestão Empresarial");
    }//GEN-LAST:event_jbLimparMouseReleased

    private void jbImprimeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbImprimeMouseReleased

        if(tfValor.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Valor está vazio!");
        }else if(tfRecebe.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Recebe está vazio!");
        }else if(tfEmitente.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Emitente está vazio!");
        }else if(tfCpfCnpj.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo CPF/CNPJ está vazio!");
        }else{

            JDialog dialog = new JDialog(this);
            ImpressoraJasperAtivus imp = new ImpressoraJasperAtivus();
            List listaDados = GetDados();
            imp.ImprimeRelatorio((ArrayList) listaDados, dialog);

        }
    }//GEN-LAST:event_jbImprimeMouseReleased

    private void tfValorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfValorKeyReleased
        if (!tfValor.getText().equals("") && evt.getKeyCode() == KeyEvent.VK_ENTER){
            try {
                converte();
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, ex);
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_tfValorKeyReleased


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
            java.util.logging.Logger.getLogger(TelaAtivus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAtivus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAtivus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAtivus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaAtivus dialog = new TelaAtivus(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JButton jbImprime;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JTextField taReferente;
    private javax.swing.JTextField tfCpfCnpj;
    private javax.swing.JTextField tfEmitente;
    private javax.swing.JTextField tfLocal;
    private javax.swing.JTextField tfRecebe;
    private javax.swing.JTextField tfValor;
    private javax.swing.JTextField txImportancia;
    // End of variables declaration//GEN-END:variables
}
