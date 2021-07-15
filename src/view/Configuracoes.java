
package view;

import model.dao.CpfDao;


public class Configuracoes extends javax.swing.JPanel {

   
    private CpfDao cpf = new CpfDao(); 
    Tela tela;
    
    public Configuracoes(Tela tela) {
        initComponents();
        this.tela=tela;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aSenha = new javax.swing.JButton();
        aEmail = new javax.swing.JButton();
        excluirConta = new javax.swing.JButton();
        sobreSys = new javax.swing.JButton();
        tela_inicial = new javax.swing.JButton();
        cadastro_Cliente = new javax.swing.JButton();
        cadastro_Dividas = new javax.swing.JButton();
        formucobranca = new javax.swing.JButton();
        formuCliente = new javax.swing.JButton();
        histoNotaFiscal = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        aSenha.setBorder(null);
        aSenha.setContentAreaFilled(false);
        aSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aSenhaActionPerformed(evt);
            }
        });
        add(aSenha);
        aSenha.setBounds(300, 180, 130, 20);

        aEmail.setBorder(null);
        aEmail.setContentAreaFilled(false);
        aEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aEmailActionPerformed(evt);
            }
        });
        add(aEmail);
        aEmail.setBounds(300, 250, 130, 20);

        excluirConta.setBorder(null);
        excluirConta.setContentAreaFilled(false);
        excluirConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirContaActionPerformed(evt);
            }
        });
        add(excluirConta);
        excluirConta.setBounds(300, 320, 130, 20);

        sobreSys.setBorder(null);
        sobreSys.setContentAreaFilled(false);
        sobreSys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreSysActionPerformed(evt);
            }
        });
        add(sobreSys);
        sobreSys.setBounds(300, 390, 140, 20);

        tela_inicial.setBorder(null);
        tela_inicial.setContentAreaFilled(false);
        tela_inicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tela_inicialActionPerformed(evt);
            }
        });
        add(tela_inicial);
        tela_inicial.setBounds(73, 180, 100, 20);

        cadastro_Cliente.setBorder(null);
        cadastro_Cliente.setContentAreaFilled(false);
        cadastro_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastro_ClienteActionPerformed(evt);
            }
        });
        add(cadastro_Cliente);
        cadastro_Cliente.setBounds(20, 220, 200, 30);

        cadastro_Dividas.setBorder(null);
        cadastro_Dividas.setContentAreaFilled(false);
        cadastro_Dividas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastro_DividasActionPerformed(evt);
            }
        });
        add(cadastro_Dividas);
        cadastro_Dividas.setBounds(30, 280, 180, 20);

        formucobranca.setBorder(null);
        formucobranca.setContentAreaFilled(false);
        formucobranca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formucobrancaActionPerformed(evt);
            }
        });
        add(formucobranca);
        formucobranca.setBounds(10, 330, 230, 30);

        formuCliente.setBorder(null);
        formuCliente.setContentAreaFilled(false);
        formuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formuClienteActionPerformed(evt);
            }
        });
        add(formuCliente);
        formuCliente.setBounds(20, 390, 210, 20);

        histoNotaFiscal.setBorder(null);
        histoNotaFiscal.setContentAreaFilled(false);
        histoNotaFiscal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                histoNotaFiscalActionPerformed(evt);
            }
        });
        add(histoNotaFiscal);
        histoNotaFiscal.setBounds(20, 450, 210, 20);

        sair.setBorder(null);
        sair.setContentAreaFilled(false);
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        add(sair);
        sair.setBounds(30, 560, 180, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Tela confiurações.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 615);
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

    private void tela_inicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tela_inicialActionPerformed
        Tela_inicial ini = new Tela_inicial(this.tela);
        setVisible(false);
        tela.add(ini);
        ini.requestFocus();
    }//GEN-LAST:event_tela_inicialActionPerformed

    private void cadastro_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastro_ClienteActionPerformed
        Tela_Cadastro_Cliente ini = new Tela_Cadastro_Cliente(this.tela);
        setVisible(false);
        tela.add(ini);
        ini.requestFocus();
    }//GEN-LAST:event_cadastro_ClienteActionPerformed

    private void cadastro_DividasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastro_DividasActionPerformed
        Cadastro_Dividas ini = new Cadastro_Dividas(this.tela);
        setVisible(false);
        tela.add(ini);
        ini.requestFocus();
    }//GEN-LAST:event_cadastro_DividasActionPerformed

    private void formucobrancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formucobrancaActionPerformed
        Formulario_Cobranca ini = new Formulario_Cobranca(this.tela);
        setVisible(false);
        tela.add(ini);
        ini.requestFocus();    }//GEN-LAST:event_formucobrancaActionPerformed

    private void formuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formuClienteActionPerformed
        FormularioCliente ini = new FormularioCliente(this.tela);
        setVisible(false);
        tela.add(ini);
        ini.requestFocus();
    }//GEN-LAST:event_formuClienteActionPerformed

    private void histoNotaFiscalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_histoNotaFiscalActionPerformed
        HistoricoNotaFiscal ini = new HistoricoNotaFiscal(this.tela);
        setVisible(false);
        tela.add(ini);
        ini.requestFocus();
    }//GEN-LAST:event_histoNotaFiscalActionPerformed

    private void aSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aSenhaActionPerformed
        ASenha ini = new ASenha(this.tela);
        setVisible(false);
        tela.add(ini);
        ini.requestFocus();
    }//GEN-LAST:event_aSenhaActionPerformed

    private void aEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aEmailActionPerformed
        AEmail ini = new AEmail(this.tela);
        setVisible(false);
        tela.add(ini);
        ini.requestFocus();
    }//GEN-LAST:event_aEmailActionPerformed

    private void excluirContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirContaActionPerformed
        new CpfSenha(null,true,this.tela);
    }//GEN-LAST:event_excluirContaActionPerformed

    private void sobreSysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobreSysActionPerformed
        Sobre ini = new Sobre(this.tela);
        setVisible(false);
        tela.add(ini);
        ini.requestFocus();
    }//GEN-LAST:event_sobreSysActionPerformed

    public void trocar(){
        Tela_Usuario cad = new Tela_Usuario(this.tela);
        setVisible(false);
        tela.add(cad);
        cad.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aEmail;
    private javax.swing.JButton aSenha;
    private javax.swing.JButton cadastro_Cliente;
    private javax.swing.JButton cadastro_Dividas;
    private javax.swing.JButton excluirConta;
    private javax.swing.JButton formuCliente;
    private javax.swing.JButton formucobranca;
    private javax.swing.JButton histoNotaFiscal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton sair;
    private javax.swing.JButton sobreSys;
    private javax.swing.JButton tela_inicial;
    // End of variables declaration//GEN-END:variables
}
