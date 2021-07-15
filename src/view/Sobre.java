
package view;

import model.dao.CpfDao;


public class Sobre extends javax.swing.JPanel {

    private CpfDao cpf = new CpfDao(); 
    Tela tela;
    
    public Sobre(Tela tela) {
        initComponents();
        this.tela=tela;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sair = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        sair.setBorder(null);
        sair.setContentAreaFilled(false);
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        add(sair);
        sair.setBounds(30, 563, 180, 30);

        voltar.setActionCommand("");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        add(voltar);
        voltar.setBounds(490, 580, 33, 9);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Tela sobre o sistema.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 610);
    }// </editor-fold>//GEN-END:initComponents

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        if(this.cpf.excluir()){
        Tela_Usuario cad = new Tela_Usuario(this.tela);
        setVisible(false);
        tela.add(cad);
        cad.requestFocus();
        }else{ 
        }
    }//GEN-LAST:event_sairActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        Configuracoes ini = new Configuracoes(this.tela);
        setVisible(false);
        tela.add(ini);
        ini.requestFocus();
    }//GEN-LAST:event_voltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton sair;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
