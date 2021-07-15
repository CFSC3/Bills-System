
package view;

import avisos.Avisos;
import model.dao.CadastroUsuarioDao;
import model.dao.CpfDao;


public class ASenha extends javax.swing.JPanel {

    private CpfDao cpf1 = new CpfDao();
    private CadastroUsuarioDao dao = new CadastroUsuarioDao();
    private Avisos av = new Avisos();
    private char s = '\u0000';
    private char s1 = '\u0000';
    private char s2 = '\u0000';
    Tela tela;
    
    public ASenha(Tela tela) {
        initComponents();
        this.tela=tela;
        alerta1.setVisible(false);
        alerta2.setVisible(false);
        olhoaberto.setVisible(false);
        olhofechado.setVisible(true);
         olhoaberto1.setVisible(false);
        olhofechado1.setVisible(true);
        olhoaberto2.setVisible(false);
        olhofechado2.setVisible(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        senha = new javax.swing.JPasswordField();
        senha1 = new javax.swing.JPasswordField();
        senha2 = new javax.swing.JPasswordField();
        confirmar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        mostrarSenha = new javax.swing.JButton();
        mostrarSenha1 = new javax.swing.JButton();
        mostrarSenha2 = new javax.swing.JButton();
        olhofechado = new javax.swing.JLabel();
        olhoaberto = new javax.swing.JLabel();
        olhofechado1 = new javax.swing.JLabel();
        olhoaberto1 = new javax.swing.JLabel();
        olhofechado2 = new javax.swing.JLabel();
        olhoaberto2 = new javax.swing.JLabel();
        alerta1 = new javax.swing.JLabel();
        alerta2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        senha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        senha.setBorder(null);
        senha.setOpaque(false);
        add(senha);
        senha.setBounds(530, 240, 200, 30);

        senha1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        senha1.setBorder(null);
        senha1.setOpaque(false);
        add(senha1);
        senha1.setBounds(530, 320, 200, 20);

        senha2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        senha2.setBorder(null);
        senha2.setOpaque(false);
        add(senha2);
        senha2.setBounds(530, 390, 200, 30);

        confirmar.setBorder(null);
        confirmar.setContentAreaFilled(false);
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });
        add(confirmar);
        confirmar.setBounds(310, 570, 170, 30);

        cancelar.setBorder(null);
        cancelar.setContentAreaFilled(false);
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        add(cancelar);
        cancelar.setBounds(540, 570, 170, 30);

        voltar.setBorder(null);
        voltar.setContentAreaFilled(false);
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        add(voltar);
        voltar.setBounds(770, 570, 170, 30);

        sair.setBorder(null);
        sair.setContentAreaFilled(false);
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        add(sair);
        sair.setBounds(40, 570, 170, 30);

        mostrarSenha.setBorder(null);
        mostrarSenha.setContentAreaFilled(false);
        mostrarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarSenhaActionPerformed(evt);
            }
        });
        add(mostrarSenha);
        mostrarSenha.setBounds(700, 240, 60, 30);

        mostrarSenha1.setBorder(null);
        mostrarSenha1.setContentAreaFilled(false);
        mostrarSenha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarSenha1ActionPerformed(evt);
            }
        });
        add(mostrarSenha1);
        mostrarSenha1.setBounds(700, 310, 60, 40);

        mostrarSenha2.setBorder(null);
        mostrarSenha2.setContentAreaFilled(false);
        mostrarSenha2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarSenha2ActionPerformed(evt);
            }
        });
        add(mostrarSenha2);
        mostrarSenha2.setBounds(700, 390, 60, 30);

        olhofechado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Icone-senha-oculta.png"))); // NOI18N
        add(olhofechado);
        olhofechado.setBounds(700, 210, 80, 90);

        olhoaberto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Olho-senha-ativado.png"))); // NOI18N
        add(olhoaberto);
        olhoaberto.setBounds(700, 230, 60, 50);

        olhofechado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Icone-senha-oculta.png"))); // NOI18N
        add(olhofechado1);
        olhofechado1.setBounds(700, 290, 80, 80);

        olhoaberto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Olho-senha-ativado.png"))); // NOI18N
        add(olhoaberto1);
        olhoaberto1.setBounds(700, 310, 60, 40);

        olhofechado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Icone-senha-oculta.png"))); // NOI18N
        add(olhofechado2);
        olhofechado2.setBounds(700, 360, 80, 90);

        olhoaberto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Olho-senha-ativado.png"))); // NOI18N
        add(olhoaberto2);
        olhoaberto2.setBounds(700, 380, 60, 50);

        alerta1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        alerta1.setForeground(new java.awt.Color(255, 0, 0));
        alerta1.setText("Senha incorreta");
        add(alerta1);
        alerta1.setBounds(620, 210, 110, 40);

        alerta2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        alerta2.setForeground(new java.awt.Color(255, 0, 0));
        alerta2.setText("Senha não é igual");
        add(alerta2);
        alerta2.setBounds(490, 420, 120, 17);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Tela alterar senha.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 615);
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarSenhaActionPerformed
        if(s=='\u0000'){
            senha.setEchoChar(s);
            s = '\u25cf';
             olhoaberto.setVisible(true);
        olhofechado.setVisible(false);
        }else{
            senha.setEchoChar(s);
            s = '\u0000';
             olhoaberto.setVisible(false);
        olhofechado.setVisible(true);
        }
    }//GEN-LAST:event_mostrarSenhaActionPerformed

    private void mostrarSenha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarSenha1ActionPerformed
        if(s1=='\u0000'){
            senha1.setEchoChar(s1);
            s1 = '\u25cf';
             olhoaberto1.setVisible(true);
        olhofechado1.setVisible(false);
        }else{
            senha1.setEchoChar(s1);
            s1 = '\u0000';
             olhoaberto1.setVisible(false);
        olhofechado1.setVisible(true);
        }
    }//GEN-LAST:event_mostrarSenha1ActionPerformed

    private void mostrarSenha2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarSenha2ActionPerformed
        if(s2=='\u0000'){
            senha2.setEchoChar(s2);
            s2 = '\u25cf';
             olhoaberto2.setVisible(true);
        olhofechado2.setVisible(false);
        }else{
            senha2.setEchoChar(s2);
            s2 = '\u0000';
             olhoaberto2.setVisible(false);
        olhofechado2.setVisible(true);
        }
    }//GEN-LAST:event_mostrarSenha2ActionPerformed

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        if(String.valueOf(senha.getPassword()).equals(dao.retornar(cpf1.retornar()))){
            if(String.valueOf(senha1.getPassword()).equals(String.valueOf(senha2.getPassword()))){
                dao.atualizaSenha(cpf1.retornar(), String.valueOf(senha1.getPassword()));
                av.sucesso("Senha atualizada");
                funcao1();
            }else{
                alerta2.setVisible(true);
                alerta1.setVisible(false);
            }
        }else{
            alerta1.setVisible(true);
        }
    }//GEN-LAST:event_confirmarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        funcao1();
    }//GEN-LAST:event_cancelarActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        Configuracoes ini = new Configuracoes(this.tela);
        setVisible(false);
        tela.add(ini);
        ini.requestFocus();
    }//GEN-LAST:event_voltarActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        if(av.sair()){
            if(cpf1.excluir()){
        Tela_Usuario cad = new Tela_Usuario(this.tela);
        setVisible(false);
        tela.add(cad);
        cad.requestFocus();
            }
        }
    }//GEN-LAST:event_sairActionPerformed

    public void funcao1(){
        senha.setText("");
        senha1.setText("");
        senha2.setText("");
        alerta1.setVisible(false);
        alerta2.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alerta1;
    private javax.swing.JLabel alerta2;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton confirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mostrarSenha;
    private javax.swing.JButton mostrarSenha1;
    private javax.swing.JButton mostrarSenha2;
    private javax.swing.JLabel olhoaberto;
    private javax.swing.JLabel olhoaberto1;
    private javax.swing.JLabel olhoaberto2;
    private javax.swing.JLabel olhofechado;
    private javax.swing.JLabel olhofechado1;
    private javax.swing.JLabel olhofechado2;
    private javax.swing.JButton sair;
    private javax.swing.JPasswordField senha;
    private javax.swing.JPasswordField senha1;
    private javax.swing.JPasswordField senha2;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
