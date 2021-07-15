
package view;

import avisos.Avisos;
import java.util.Calendar;
import java.util.Date;
import model.bean.CadastroDividas;
import model.dao.CadastroClienteDao;
import model.dao.CadastroDividasDao;
import model.dao.CpfDao;


public class Cadastro_Dividas extends javax.swing.JPanel {

    private String formapagamento = null;
    private CadastroDividas divida;
    private CadastroDividasDao dao = new CadastroDividasDao();
    private CadastroClienteDao doa = new CadastroClienteDao();
    private CpfDao cpf1 = new CpfDao();
    private Avisos avisos = new Avisos(); 
    Tela tela;
    
    public Cadastro_Dividas(Tela tela) {
        initComponents();
        this.tela=tela;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escolha = new javax.swing.ButtonGroup();
        nome = new javax.swing.JTextField();
        cpf = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter cpf2= new javax.swing.text.MaskFormatter("###.###.###-##");
            cpf = new javax.swing.JFormattedTextField(cpf2);
        }
        catch (Exception e){
        }
        valor = new javax.swing.JTextField();
        dtcompra = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("##/##/####");
            dtcompra = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        descricao = new javax.swing.JTextField();
        parcelamento = new javax.swing.JTextField();
        dtvencimento = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("##/##/####");
            dtvencimento = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }

        Date data = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(data);
        int dia = cal.get(Calendar.DAY_OF_MONTH);
        int mes = cal.get(Calendar.MONTH)+1;
        int ano = cal.get(Calendar.YEAR);
        if(dia<10){
            dtcompra.setText("0"+dia+mes+ano);
        }else{
            dtcompra.setText(""+dia+mes+ano);
        }
        cash = new javax.swing.JRadioButton();
        cartao = new javax.swing.JRadioButton();
        cancelar = new javax.swing.JButton();
        confirm = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        telaini = new javax.swing.JButton();
        telacliente = new javax.swing.JButton();
        formularioD = new javax.swing.JButton();
        formularioC = new javax.swing.JButton();
        historico = new javax.swing.JButton();
        conf = new javax.swing.JButton();
        teladividas = new javax.swing.JLabel();

        setLayout(null);

        nome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nome.setBorder(null);
        nome.setOpaque(false);
        nome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nomeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                nomeMouseReleased(evt);
            }
        });
        add(nome);
        nome.setBounds(310, 220, 410, 30);

        cpf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cpf.setBorder(null);
        cpf.setOpaque(false);
        add(cpf);
        cpf.setBounds(310, 280, 210, 20);

        valor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        valor.setBorder(null);
        valor.setOpaque(false);
        valor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                valorMousePressed(evt);
            }
        });
        add(valor);
        valor.setBounds(310, 330, 210, 30);

        dtcompra.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dtcompra.setBorder(null);
        dtcompra.setOpaque(false);
        add(dtcompra);
        dtcompra.setBounds(550, 440, 200, 30);

        descricao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        descricao.setBorder(null);
        descricao.setOpaque(false);
        add(descricao);
        descricao.setBounds(310, 500, 540, 20);

        parcelamento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        parcelamento.setBorder(null);
        parcelamento.setOpaque(false);
        add(parcelamento);
        parcelamento.setBounds(310, 440, 210, 30);

        dtvencimento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dtvencimento.setBorder(null);
        dtvencimento.setOpaque(false);
        add(dtvencimento);
        dtvencimento.setBounds(770, 440, 210, 30);

        escolha.add(cash);
        cash.setContentAreaFilled(false);
        cash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashActionPerformed(evt);
            }
        });
        add(cash);
        cash.setBounds(320, 390, 20, 21);

        escolha.add(cartao);
        cartao.setContentAreaFilled(false);
        cartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartaoActionPerformed(evt);
            }
        });
        add(cartao);
        cartao.setBounds(450, 390, 20, 21);

        cancelar.setBorder(null);
        cancelar.setContentAreaFilled(false);
        add(cancelar);
        cancelar.setBounds(310, 560, 180, 30);

        confirm.setBorder(null);
        confirm.setContentAreaFilled(false);
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        add(confirm);
        confirm.setBounds(660, 560, 180, 30);

        sair.setBorder(null);
        sair.setContentAreaFilled(false);
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        add(sair);
        sair.setBounds(40, 560, 170, 40);

        telaini.setBorder(null);
        telaini.setContentAreaFilled(false);
        telaini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telainiActionPerformed(evt);
            }
        });
        add(telaini);
        telaini.setBounds(80, 180, 90, 20);

        telacliente.setBorder(null);
        telacliente.setContentAreaFilled(false);
        telacliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telaclienteActionPerformed(evt);
            }
        });
        add(telacliente);
        telacliente.setBounds(30, 220, 180, 20);

        formularioD.setBorder(null);
        formularioD.setContentAreaFilled(false);
        formularioD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formularioDActionPerformed(evt);
            }
        });
        add(formularioD);
        formularioD.setBounds(10, 333, 230, 20);

        formularioC.setBorder(null);
        formularioC.setContentAreaFilled(false);
        formularioC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formularioCActionPerformed(evt);
            }
        });
        add(formularioC);
        formularioC.setBounds(23, 390, 200, 20);

        historico.setBorder(null);
        historico.setContentAreaFilled(false);
        historico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historicoActionPerformed(evt);
            }
        });
        add(historico);
        historico.setBounds(23, 450, 210, 20);

        conf.setBorder(null);
        conf.setContentAreaFilled(false);
        conf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confActionPerformed(evt);
            }
        });
        add(conf);
        conf.setBounds(63, 500, 120, 20);

        teladividas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Tela de cadastro de dividas.png"))); // NOI18N
        add(teladividas);
        teladividas.setBounds(0, 0, 1000, 610);
    }// </editor-fold>//GEN-END:initComponents

    private void cashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashActionPerformed
        formapagamento = "Dinheiro";
    }//GEN-LAST:event_cashActionPerformed

    private void cartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartaoActionPerformed
        formapagamento = "Cartão";
    }//GEN-LAST:event_cartaoActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
      
        divida = new CadastroDividas(nome.getText(),cpf.getText(),Double.parseDouble(valor.getText()),formapagamento,Integer.parseInt(parcelamento.getText()),dtcompra.getText(),dtvencimento.getText(),descricao.getText(),"Devendo");
        
        if(dao.inserir(divida)){
            this.avisos.sucesso("Inserido com sucesso");
            funcao1();
        }else{
            System.out.println("Erro!");
        }
    }//GEN-LAST:event_confirmActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
       if(this.cpf1.excluir()){
        Tela_Usuario cad = new Tela_Usuario(this.tela);
        setVisible(false);
        tela.add(cad);
        cad.requestFocus();
        }else{ 
        }
    }//GEN-LAST:event_sairActionPerformed

    private void telainiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telainiActionPerformed
       Tela_inicial ini = new Tela_inicial(this.tela);
        setVisible(false);
        tela.add(ini);
        ini.requestFocus();
    }//GEN-LAST:event_telainiActionPerformed

    private void telaclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telaclienteActionPerformed
        Tela_Cadastro_Cliente ini = new Tela_Cadastro_Cliente(this.tela);
        setVisible(false);
        tela.add(ini);
        ini.requestFocus();
    }//GEN-LAST:event_telaclienteActionPerformed

    private void formularioDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formularioDActionPerformed
       Formulario_Cobranca ini = new Formulario_Cobranca(this.tela);
        setVisible(false);
        tela.add(ini);
        ini.requestFocus();
    }//GEN-LAST:event_formularioDActionPerformed

    private void formularioCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formularioCActionPerformed
        FormularioCliente ini = new FormularioCliente(this.tela);
        setVisible(false);
        tela.add(ini);
        ini.requestFocus();
    }//GEN-LAST:event_formularioCActionPerformed

    private void historicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historicoActionPerformed
       HistoricoNotaFiscal ini = new HistoricoNotaFiscal(this.tela);
        setVisible(false);
        tela.add(ini);
        ini.requestFocus();
    }//GEN-LAST:event_historicoActionPerformed

    private void confActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confActionPerformed
       Configuracoes ini = new Configuracoes(this.tela);
        setVisible(false);
        tela.add(ini);
        ini.requestFocus();
    }//GEN-LAST:event_confActionPerformed

    private void nomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomeMousePressed
        if(cpf.getText().equals("")){
            System.out.println("ESTA VAZIO O CAMPO CPF!!!");
        }else{
            nome.setText(doa.nome(cpf.getText()));
        }
    }//GEN-LAST:event_nomeMousePressed

    private void nomeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomeMouseReleased
    }//GEN-LAST:event_nomeMouseReleased

    private void valorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valorMousePressed
      if(cpf.getText().equals("")){
            System.out.println("ESTA VAZIO O CAMPO CPF!!!");
        }else{
            nome.setText(doa.nome(cpf.getText()));
        }
    }//GEN-LAST:event_valorMousePressed

    public void funcao1(){
        nome.setText("");
        cpf.setText("");
        dtvencimento.setText("");
        descricao.setText("");
        parcelamento.setText("");
        valor.setText("");
   }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JRadioButton cartao;
    private javax.swing.JRadioButton cash;
    private javax.swing.JButton conf;
    private javax.swing.JButton confirm;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField descricao;
    private javax.swing.JTextField dtcompra;
    private javax.swing.JTextField dtvencimento;
    private javax.swing.ButtonGroup escolha;
    private javax.swing.JButton formularioC;
    private javax.swing.JButton formularioD;
    private javax.swing.JButton historico;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField parcelamento;
    private javax.swing.JButton sair;
    private javax.swing.JButton telacliente;
    private javax.swing.JLabel teladividas;
    private javax.swing.JButton telaini;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables
}
