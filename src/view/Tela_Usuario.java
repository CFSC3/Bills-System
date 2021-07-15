
package view;

import model.bean.Login;
import model.dao.CadastroUsuarioDao;
import model.dao.CpfDao;

public class Tela_Usuario extends javax.swing.JPanel {
    
    private CadastroUsuarioDao dao = new CadastroUsuarioDao();
    private Login login;
    private CpfDao cpfdao = new CpfDao();
    private char s = '\u0000';
    Tela tela;
    
    public Tela_Usuario(Tela tela) {
        initComponents();
        this.tela = tela;
        setVisible(true);
        senhaIncorreta.setVisible(false);
        cpfvalida.setVisible(false);
        olhoaberto.setVisible(false);
        olhofechado.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuario = new javax.swing.JTextField();
        try{  
            javax.swing.text.MaskFormatter cpf2= new javax.swing.text.MaskFormatter("###.###.###-##");  
            usuario = new javax.swing.JFormattedTextField(cpf2);  
        }  
        catch (Exception e){  
        }
        senha = new javax.swing.JPasswordField();
        cadastro = new javax.swing.JButton();
        entrar = new javax.swing.JButton();
        senhaIncorreta = new javax.swing.JLabel();
        cpfvalida = new javax.swing.JLabel();
        mostrarSenha = new javax.swing.JButton();
        olhofechado = new javax.swing.JLabel();
        olhoaberto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        usuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        usuario.setBorder(null);
        usuario.setOpaque(false);
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        add(usuario);
        usuario.setBounds(80, 350, 260, 50);

        senha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        senha.setBorder(null);
        senha.setOpaque(false);
        add(senha);
        senha.setBounds(80, 440, 220, 60);
        senha.getAccessibleContext().setAccessibleName("senha");

        cadastro.setBackground(new java.awt.Color(0, 0, 0));
        cadastro.setBorder(null);
        cadastro.setBorderPainted(false);
        cadastro.setContentAreaFilled(false);
        cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroActionPerformed(evt);
            }
        });
        add(cadastro);
        cadastro.setBounds(120, 580, 130, 20);
        cadastro.getAccessibleContext().setAccessibleName("cadastro");
        cadastro.getAccessibleContext().setAccessibleDescription("");

        entrar.setBorder(null);
        entrar.setContentAreaFilled(false);
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });
        add(entrar);
        entrar.setBounds(73, 523, 230, 40);

        senhaIncorreta.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        senhaIncorreta.setForeground(new java.awt.Color(255, 51, 51));
        senhaIncorreta.setText("Senha incorreta");
        add(senhaIncorreta);
        senhaIncorreta.setBounds(100, 410, 80, 40);

        cpfvalida.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        cpfvalida.setForeground(new java.awt.Color(255, 0, 0));
        cpfvalida.setText("CPF inválido");
        cpfvalida.setToolTipText("");
        add(cpfvalida);
        cpfvalida.setBounds(80, 324, 60, 20);

        mostrarSenha.setBorder(null);
        mostrarSenha.setContentAreaFilled(false);
        mostrarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarSenhaActionPerformed(evt);
            }
        });
        add(mostrarSenha);
        mostrarSenha.setBounds(290, 440, 60, 60);

        olhofechado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Icone-senha-oculta.png"))); // NOI18N
        add(olhofechado);
        olhofechado.setBounds(290, 430, 80, 80);

        olhoaberto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Olho-senha-ativado.png"))); // NOI18N
        add(olhoaberto);
        olhoaberto.setBounds(290, 450, 60, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ffff2.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, -10, 1000, 630);
        jLabel1.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
      
        String senhaDigitada = String.valueOf(senha.getPassword());
        String cpf = usuario.getText();
        
        dao.login(usuario.getText(),String.valueOf(senha.getPassword()));
        String cpf2 = dao.getCpf();
        String senha2 = dao.getSenha();
        
             if(cpf.equals(cpf2)){
                if(senhaDigitada.equals(senha2)){
                    cpfdao.inserir(usuario.getText());
        Tela_inicial ini = new Tela_inicial(this.tela);
        setVisible(false);
        tela.add(ini);
        ini.requestFocus();
                    
                }else{
                    cpfvalida.setVisible(false);
                    senhaIncorreta.setVisible(true);
                }
            }else{
                cpfvalida.setVisible(true);
            }
        
    }//GEN-LAST:event_entrarActionPerformed

    private void cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroActionPerformed
        Tela_Cadastro cad = new Tela_Cadastro(this.tela);
        setVisible(false);
        tela.add(cad);
        cad.requestFocus();
    }//GEN-LAST:event_cadastroActionPerformed

    private void mostrarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarSenhaActionPerformed
       if(s=='\u0000'){
        senha.setEchoChar(s);
        s = '\u25cf';
        olhofechado.setVisible(false);
        olhoaberto.setVisible(true);
        }else{
            senha.setEchoChar(s);
            s = '\u0000';
             olhofechado.setVisible(true);
             olhoaberto.setVisible(false);
        }
    }//GEN-LAST:event_mostrarSenhaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastro;
    private javax.swing.JLabel cpfvalida;
    private javax.swing.JButton entrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mostrarSenha;
    private javax.swing.JLabel olhoaberto;
    private javax.swing.JLabel olhofechado;
    private javax.swing.JPasswordField senha;
    private javax.swing.JLabel senhaIncorreta;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables

}
