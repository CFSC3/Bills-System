
package view;

import avisos.Avisos;
import model.bean.CadastroCliente;
import model.dao.CadastroClienteDao;
import model.dao.CpfDao;

public class Tela_Cadastro_Cliente extends javax.swing.JPanel {

       private CadastroCliente cliente;
       private CadastroClienteDao dao = new CadastroClienteDao();
       private CpfDao cpf = new CpfDao();
       private Avisos avisos = new Avisos(); 
       Tela tela;
       
    public Tela_Cadastro_Cliente(Tela tela) {
        initComponents();
        this.tela=tela;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textoNome = new javax.swing.JTextField();
        textoCpf = new javax.swing.JTextField();
        try{  
            javax.swing.text.MaskFormatter cpf= new javax.swing.text.MaskFormatter("###.###.###-##");  
            textoCpf = new javax.swing.JFormattedTextField(cpf);  
        }  
        catch (Exception e){  
        }
        textoDataNascimento = new javax.swing.JTextField();
        try{  
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("##/##/####");  
            textoDataNascimento = new javax.swing.JFormattedTextField(data);  
        }  
        catch (Exception e){  
        }
        textoEmail = new javax.swing.JTextField();
        textoEndereco = new javax.swing.JTextField();
        textoDDD = new javax.swing.JTextField();
        textoTelefone = new javax.swing.JTextField();
        textoCelular = new javax.swing.JTextField();
        sair = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        confirmar = new javax.swing.JButton();
        cadastroDividas = new javax.swing.JButton();
        formularioCobranca = new javax.swing.JButton();
        formularioCliente = new javax.swing.JButton();
        historicoNota = new javax.swing.JButton();
        telaini = new javax.swing.JButton();
        conf = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        textoNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textoNome.setBorder(null);
        textoNome.setOpaque(false);
        add(textoNome);
        textoNome.setBounds(310, 227, 410, 30);

        textoCpf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textoCpf.setBorder(null);
        textoCpf.setOpaque(false);
        add(textoCpf);
        textoCpf.setBounds(310, 280, 210, 30);

        textoDataNascimento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textoDataNascimento.setBorder(null);
        textoDataNascimento.setOpaque(false);
        textoDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoDataNascimentoActionPerformed(evt);
            }
        });
        add(textoDataNascimento);
        textoDataNascimento.setBounds(570, 280, 170, 30);

        textoEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textoEmail.setBorder(null);
        textoEmail.setOpaque(false);
        add(textoEmail);
        textoEmail.setBounds(310, 330, 410, 30);

        textoEndereco.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textoEndereco.setBorder(null);
        textoEndereco.setOpaque(false);
        add(textoEndereco);
        textoEndereco.setBounds(310, 380, 480, 30);

        textoDDD.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textoDDD.setBorder(null);
        textoDDD.setOpaque(false);
        add(textoDDD);
        textoDDD.setBounds(310, 440, 60, 20);

        textoTelefone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textoTelefone.setBorder(null);
        textoTelefone.setOpaque(false);
        add(textoTelefone);
        textoTelefone.setBounds(380, 440, 220, 20);

        textoCelular.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textoCelular.setBorder(null);
        textoCelular.setOpaque(false);
        add(textoCelular);
        textoCelular.setBounds(620, 440, 220, 20);

        sair.setBorder(null);
        sair.setContentAreaFilled(false);
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        add(sair);
        sair.setBounds(30, 563, 180, 40);

        cancelar.setContentAreaFilled(false);
        add(cancelar);
        cancelar.setBounds(310, 560, 180, 40);

        confirmar.setContentAreaFilled(false);
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });
        add(confirmar);
        confirmar.setBounds(660, 563, 180, 40);

        cadastroDividas.setBorder(null);
        cadastroDividas.setContentAreaFilled(false);
        cadastroDividas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroDividasActionPerformed(evt);
            }
        });
        add(cadastroDividas);
        cadastroDividas.setBounds(20, 280, 200, 30);

        formularioCobranca.setBorder(null);
        formularioCobranca.setContentAreaFilled(false);
        formularioCobranca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formularioCobrancaActionPerformed(evt);
            }
        });
        add(formularioCobranca);
        formularioCobranca.setBounds(10, 330, 230, 30);

        formularioCliente.setBorder(null);
        formularioCliente.setContentAreaFilled(false);
        formularioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formularioClienteActionPerformed(evt);
            }
        });
        add(formularioCliente);
        formularioCliente.setBounds(20, 390, 210, 30);

        historicoNota.setBorder(null);
        historicoNota.setContentAreaFilled(false);
        historicoNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historicoNotaActionPerformed(evt);
            }
        });
        add(historicoNota);
        historicoNota.setBounds(10, 440, 220, 40);

        telaini.setBorder(null);
        telaini.setContentAreaFilled(false);
        telaini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telainiActionPerformed(evt);
            }
        });
        add(telaini);
        telaini.setBounds(80, 180, 100, 20);

        conf.setBorder(null);
        conf.setContentAreaFilled(false);
        conf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confActionPerformed(evt);
            }
        });
        add(conf);
        conf.setBounds(60, 510, 120, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Tela cadastro de clientes.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 610);
    }// </editor-fold>//GEN-END:initComponents

    private void textoDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoDataNascimentoActionPerformed

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        
        if(textoTelefone.getText().equals("")){
        textoTelefone.setText("0");
        cliente = new CadastroCliente(textoNome.getText(),textoCpf.getText(),textoDataNascimento.getText(),textoEmail.getText(),textoEndereco.getText(),Integer.parseInt(textoDDD.getText()),Long.parseLong(textoTelefone.getText()),Long.parseLong(textoCelular.getText()));
        
        if(dao.inserir(cliente)){
            this.avisos.sucesso("Inserido com sucesso");
            funcao1();
        }else{
            System.out.println("Falha!");
        }
        }else{
            cliente = new CadastroCliente(textoNome.getText(),textoCpf.getText(),textoDataNascimento.getText(),textoEmail.getText(),textoEndereco.getText(),Integer.parseInt(textoDDD.getText()),Long.parseLong(textoTelefone.getText()),Long.parseLong(textoCelular.getText()));
        
        if(dao.inserir(cliente)){
            this.avisos.sucesso("Inserido com sucesso");
            funcao1();
        }else{
            System.out.println("Falha!");
        }
        }
    }//GEN-LAST:event_confirmarActionPerformed

    private void telainiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telainiActionPerformed
        Tela_inicial ini = new Tela_inicial(this.tela);
        setVisible(false);
        tela.add(ini);
        ini.requestFocus();
    }//GEN-LAST:event_telainiActionPerformed

    private void cadastroDividasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroDividasActionPerformed
        Cadastro_Dividas ini = new Cadastro_Dividas(this.tela);
        setVisible(false);
        tela.add(ini);
        ini.requestFocus();
    }//GEN-LAST:event_cadastroDividasActionPerformed

    private void formularioCobrancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formularioCobrancaActionPerformed
       Formulario_Cobranca ini = new Formulario_Cobranca(this.tela);
        setVisible(false);
        tela.add(ini);
        ini.requestFocus();
    }//GEN-LAST:event_formularioCobrancaActionPerformed

    private void formularioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formularioClienteActionPerformed
        FormularioCliente ini = new FormularioCliente(this.tela);
        setVisible(false);
        tela.add(ini);
        ini.requestFocus();
    }//GEN-LAST:event_formularioClienteActionPerformed

    private void historicoNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historicoNotaActionPerformed
        HistoricoNotaFiscal ini = new HistoricoNotaFiscal(this.tela);
        setVisible(false);
        tela.add(ini);
        ini.requestFocus();
    }//GEN-LAST:event_historicoNotaActionPerformed

    private void confActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confActionPerformed
       Configuracoes ini = new Configuracoes(this.tela);
        setVisible(false);
        tela.add(ini);
        ini.requestFocus();
    }//GEN-LAST:event_confActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        if(this.cpf.excluir()){
        Tela_Usuario cad = new Tela_Usuario(this.tela);
        setVisible(false);
        tela.add(cad);
        cad.requestFocus();
        }else{ 
        }
    }//GEN-LAST:event_sairActionPerformed
    
    public void funcao1(){
        textoNome.setText("");
        textoCpf.setText("");
        textoCelular.setText("");
        textoEmail.setText("");
        textoDDD.setText("");
        textoDataNascimento.setText("");
        textoEndereco.setText("");
        textoTelefone.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastroDividas;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton conf;
    private javax.swing.JButton confirmar;
    private javax.swing.JButton formularioCliente;
    private javax.swing.JButton formularioCobranca;
    private javax.swing.JButton historicoNota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton sair;
    private javax.swing.JButton telaini;
    private javax.swing.JTextField textoCelular;
    private javax.swing.JTextField textoCpf;
    private javax.swing.JTextField textoDDD;
    private javax.swing.JTextField textoDataNascimento;
    private javax.swing.JTextField textoEmail;
    private javax.swing.JTextField textoEndereco;
    private javax.swing.JTextField textoNome;
    private javax.swing.JTextField textoTelefone;
    // End of variables declaration//GEN-END:variables
}
