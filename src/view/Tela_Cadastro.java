
package view;

import model.bean.CadastroUsuario;
import model.dao.CadastroUsuarioDao;
import model.dao.CpfDao;

public class Tela_Cadastro extends javax.swing.JPanel {

    private  CadastroUsuario usuario;
    private CadastroUsuarioDao dao = new CadastroUsuarioDao();
    private CpfDao cpf = new CpfDao();
     private char s = '\u0000';
     private char s1 = '\u0000';
    Tela tela;
    
    public Tela_Cadastro(Tela tela) {
        initComponents();
       this.tela = tela;
       valida.setVisible(false);
       alerta.setVisible(false);
        olhoaberto.setVisible(false);
        olhofechado.setVisible(true);
         olhoaberto1.setVisible(false);
        olhofechado1.setVisible(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textoNome = new javax.swing.JTextField();
        textoEmail = new javax.swing.JTextField();
        textoCpf = new javax.swing.JTextField();
        try{  
            javax.swing.text.MaskFormatter cpf2= new javax.swing.text.MaskFormatter("###.###.###-##");  
            textoCpf = new javax.swing.JFormattedTextField(cpf2);  
        }  
        catch (Exception e){  
        }
        textoSenha = new javax.swing.JPasswordField();
        textoConfirmarSenha = new javax.swing.JPasswordField();
        cadastrar = new javax.swing.JButton();
        valida = new javax.swing.JLabel();
        mostrarSenha = new javax.swing.JButton();
        mostrarSenha1 = new javax.swing.JButton();
        olhofechado = new javax.swing.JLabel();
        olhoaberto = new javax.swing.JLabel();
        olhofechado1 = new javax.swing.JLabel();
        olhoaberto1 = new javax.swing.JLabel();
        alerta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        textoNome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        textoNome.setBorder(null);
        textoNome.setOpaque(false);
        textoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNomeActionPerformed(evt);
            }
        });
        add(textoNome);
        textoNome.setBounds(50, 198, 260, 20);

        textoEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        textoEmail.setBorder(null);
        textoEmail.setOpaque(false);
        add(textoEmail);
        textoEmail.setBounds(50, 270, 260, 30);

        textoCpf.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        textoCpf.setBorder(null);
        textoCpf.setOpaque(false);
        add(textoCpf);
        textoCpf.setBounds(50, 350, 260, 30);

        textoSenha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        textoSenha.setBorder(null);
        textoSenha.setOpaque(false);
        add(textoSenha);
        textoSenha.setBounds(50, 428, 200, 22);

        textoConfirmarSenha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        textoConfirmarSenha.setBorder(null);
        textoConfirmarSenha.setOpaque(false);
        add(textoConfirmarSenha);
        textoConfirmarSenha.setBounds(50, 500, 210, 30);

        cadastrar.setBorder(null);
        cadastrar.setContentAreaFilled(false);
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });
        add(cadastrar);
        cadastrar.setBounds(70, 560, 230, 40);

        valida.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        valida.setForeground(new java.awt.Color(255, 0, 0));
        valida.setText("CPF já cadastrado");
        add(valida);
        valida.setBounds(90, 320, 90, 20);

        mostrarSenha.setBorder(null);
        mostrarSenha.setContentAreaFilled(false);
        mostrarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarSenhaActionPerformed(evt);
            }
        });
        add(mostrarSenha);
        mostrarSenha.setBounds(260, 420, 60, 40);

        mostrarSenha1.setBorder(null);
        mostrarSenha1.setContentAreaFilled(false);
        mostrarSenha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarSenha1ActionPerformed(evt);
            }
        });
        add(mostrarSenha1);
        mostrarSenha1.setBounds(260, 490, 60, 50);

        olhofechado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Icone-senha-oculta.png"))); // NOI18N
        add(olhofechado);
        olhofechado.setBounds(250, 470, 80, 90);

        olhoaberto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Olho-senha-ativado.png"))); // NOI18N
        add(olhoaberto);
        olhoaberto.setBounds(250, 490, 60, 50);

        olhofechado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Icone-senha-oculta.png"))); // NOI18N
        add(olhofechado1);
        olhofechado1.setBounds(250, 380, 80, 120);

        olhoaberto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Olho-senha-ativado.png"))); // NOI18N
        add(olhoaberto1);
        olhoaberto1.setBounds(250, 400, 60, 80);

        alerta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        alerta.setForeground(new java.awt.Color(255, 0, 0));
        alerta.setText("Senha não é igual");
        add(alerta);
        alerta.setBounds(210, 470, 110, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tela cadastro.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 610);
    }// </editor-fold>//GEN-END:initComponents

    private void textoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNomeActionPerformed
       
    }//GEN-LAST:event_textoNomeActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        
       if(String.valueOf(textoSenha.getPassword()).equals(String.valueOf(textoConfirmarSenha.getPassword()))){
       usuario = new CadastroUsuario(textoNome.getText(),textoEmail.getText(),textoCpf.getText(),String.valueOf(textoSenha.getPassword()),String.valueOf(textoConfirmarSenha.getPassword()));
       
       if(dao.inserir(usuario)){
           Tela_Usuario cad = new Tela_Usuario(this.tela);
           setVisible(false);
           tela.add(cad);
           cad.requestFocus();
       }else{
           valida.setVisible(true);
           alerta.setVisible(false);
       }
        }else{
            alerta.setVisible(true);
        }
       
    }//GEN-LAST:event_cadastrarActionPerformed

    private void mostrarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarSenhaActionPerformed
        if(s=='\u0000'){
            textoSenha.setEchoChar(s);
            s = '\u25cf';
             olhoaberto1.setVisible(true);
        olhofechado1.setVisible(false);
        }else{
            textoSenha.setEchoChar(s);
            s = '\u0000';
             olhoaberto1.setVisible(false);
        olhofechado1.setVisible(true);
        }
    }//GEN-LAST:event_mostrarSenhaActionPerformed

    private void mostrarSenha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarSenha1ActionPerformed
        if(s1=='\u0000'){
            textoConfirmarSenha.setEchoChar(s1);
            s1 = '\u25cf';
             olhoaberto.setVisible(true);
        olhofechado.setVisible(false);
        }else{
            textoConfirmarSenha.setEchoChar(s1);
            s1 = '\u0000';
             olhoaberto.setVisible(false);
        olhofechado.setVisible(true);
        }
    }//GEN-LAST:event_mostrarSenha1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alerta;
    private javax.swing.JButton cadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mostrarSenha;
    private javax.swing.JButton mostrarSenha1;
    private javax.swing.JLabel olhoaberto;
    private javax.swing.JLabel olhoaberto1;
    private javax.swing.JLabel olhofechado;
    private javax.swing.JLabel olhofechado1;
    private javax.swing.JPasswordField textoConfirmarSenha;
    private javax.swing.JTextField textoCpf;
    private javax.swing.JTextField textoEmail;
    private javax.swing.JTextField textoNome;
    private javax.swing.JPasswordField textoSenha;
    private javax.swing.JLabel valida;
    // End of variables declaration//GEN-END:variables
}
