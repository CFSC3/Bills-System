
package view;

import model.dao.CadastroUsuarioDao;
import model.dao.CpfDao;

public class Excluir extends javax.swing.JDialog {

   private CadastroUsuarioDao dao = new CadastroUsuarioDao();
   private CpfDao cpf = new CpfDao();
   private Configuracoes f;
   private boolean b = true;
   static Tela tela;
   
    public Excluir(java.awt.Frame parent, boolean modal,Tela tela) {
        super(parent, modal);
        initComponents();
        this.tela=tela;
        setLocationRelativeTo(null);
        setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sim = new javax.swing.JButton();
        nao = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        sim.setBorder(null);
        sim.setContentAreaFilled(false);
        sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simActionPerformed(evt);
            }
        });
        jPanel1.add(sim);
        sim.setBounds(30, 233, 140, 30);

        nao.setBorder(null);
        nao.setContentAreaFilled(false);
        nao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naoActionPerformed(evt);
            }
        });
        jPanel1.add(nao);
        nao.setBounds(230, 233, 140, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Tela excluir conta.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 400, 270);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simActionPerformed
        String s=null;
        if(b){
            if(dao.aux1()){
                System.out.println("SUCESSO!");
                if(dao.aux2()){
                    System.out.println("SUCESSO2");
                    if(dao.aux3()){
                        System.out.println("SUCESSO3");
                        if(dao.aux4()){
                            System.out.println("SUCESSO4");
                            if(dao.aux5()){
                                System.out.println("SUCESSO5");
            if(dao.excluir()){
                System.out.println("SUCESSO6");
          f = new Configuracoes(tela);
           this.f.trocar();
           dispose();
            }else{
                System.out.println("ERRO6");
            }
            }else{
                                System.out.println("ERRO5");
                            }
                        }else{
                            System.out.println("ERRO4");
                        }
            }else{
                        System.out.println("ERRO3");
                    }
                }else{
                    System.out.println("ERRO2");
                }
            }else{
                System.out.println("ERRO1");
            }
        }
    }//GEN-LAST:event_simActionPerformed

    private void naoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naoActionPerformed
       dispose();
    }//GEN-LAST:event_naoActionPerformed

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
            java.util.logging.Logger.getLogger(Excluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Excluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Excluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Excluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Excluir dialog = new Excluir(new javax.swing.JFrame(), true,tela);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nao;
    private javax.swing.JButton sim;
    // End of variables declaration//GEN-END:variables
}
