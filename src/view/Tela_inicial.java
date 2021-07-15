
package view;

import java.sql.ResultSet;
import conexao.ConexaoSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JLabel;
import model.dao.CadastroUsuarioDao;
import model.dao.CpfDao;


public class Tela_inicial extends javax.swing.JPanel {

    Connection conexao = null;
    Tela tela;
    private CpfDao cpf = new CpfDao();
    private CadastroUsuarioDao c = new CadastroUsuarioDao();
    private ArrayList<String> a = new ArrayList<>();
    
    public Tela_inicial(Tela tela) {
        initComponents();
        this.tela = tela;
        setVisible(true);
        conexao=ConexaoSQL.getConexao();
        data();
    }

    Tela_inicial(JLabel tela) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastroCliente = new javax.swing.JButton();
        cadastrodividas = new javax.swing.JButton();
        formularioCobranca = new javax.swing.JButton();
        formularioCliente = new javax.swing.JButton();
        historiconotafiscal = new javax.swing.JButton();
        configuracoes = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        Calendar data = Calendar.getInstance();
        int hora = data.get(Calendar.HOUR_OF_DAY);
        int min = data.get(Calendar.MINUTE);
        int seg = data.get(Calendar.SECOND);
        boasVindas = new javax.swing.JLabel();
        dvs = new javax.swing.JLabel();
        av1 = new javax.swing.JLabel();
        av2 = new javax.swing.JLabel();
        av3 = new javax.swing.JLabel();
        av4 = new javax.swing.JLabel();
        av5 = new javax.swing.JLabel();
        av6 = new javax.swing.JLabel();
        av7 = new javax.swing.JLabel();
        telamenu = new javax.swing.JLabel();

        setLayout(null);

        cadastroCliente.setBorder(null);
        cadastroCliente.setContentAreaFilled(false);
        cadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroClienteActionPerformed(evt);
            }
        });
        add(cadastroCliente);
        cadastroCliente.setBounds(30, 230, 180, 20);

        cadastrodividas.setBorder(null);
        cadastrodividas.setContentAreaFilled(false);
        cadastrodividas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrodividasActionPerformed(evt);
            }
        });
        add(cadastrodividas);
        cadastrodividas.setBounds(30, 280, 180, 20);

        formularioCobranca.setBorder(null);
        formularioCobranca.setContentAreaFilled(false);
        formularioCobranca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formularioCobrancaActionPerformed(evt);
            }
        });
        add(formularioCobranca);
        formularioCobranca.setBounds(13, 340, 220, 10);

        formularioCliente.setBorder(null);
        formularioCliente.setContentAreaFilled(false);
        formularioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formularioClienteActionPerformed(evt);
            }
        });
        add(formularioCliente);
        formularioCliente.setBounds(23, 389, 200, 20);

        historiconotafiscal.setBorder(null);
        historiconotafiscal.setContentAreaFilled(false);
        historiconotafiscal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historiconotafiscalActionPerformed(evt);
            }
        });
        add(historiconotafiscal);
        historiconotafiscal.setBounds(20, 450, 200, 20);

        configuracoes.setBorder(null);
        configuracoes.setContentAreaFilled(false);
        configuracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configuracoesActionPerformed(evt);
            }
        });
        add(configuracoes);
        configuracoes.setBounds(63, 500, 120, 30);

        sair.setBorder(null);
        sair.setContentAreaFilled(false);
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        add(sair);
        sair.setBounds(30, 560, 180, 40);

        boasVindas.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        if(hora>5 && hora<12){
            boasVindas.setText("Bom dia, "+c.nomeR());
        }else if(hora>13 && hora<18){
            boasVindas.setText("Boa tarde, "+c.nomeR());
        }else{
            boasVindas.setText("Boa noite, "+c.nomeR());
        }
        add(boasVindas);
        boasVindas.setBounds(300, 70, 560, 60);

        dvs.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        dvs.setText("Dívidas da semana");
        add(dvs);
        dvs.setBounds(300, 180, 180, 22);

        av1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        add(av1);
        av1.setBounds(320, 220, 550, 20);

        av2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        add(av2);
        av2.setBounds(320, 250, 550, 20);

        av3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        add(av3);
        av3.setBounds(320, 280, 550, 20);

        av4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        add(av4);
        av4.setBounds(320, 310, 550, 20);

        av5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        add(av5);
        av5.setBounds(320, 340, 550, 20);

        av6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        add(av6);
        av6.setBounds(320, 370, 550, 20);

        av7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        add(av7);
        av7.setBounds(320, 400, 550, 20);

        telamenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Tela menu.png"))); // NOI18N
        add(telamenu);
        telamenu.setBounds(0, -10, 1000, 630);
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroClienteActionPerformed
       Tela_Cadastro_Cliente ini = new Tela_Cadastro_Cliente(this.tela);
        setVisible(false);
        tela.add(ini);
        ini.requestFocus();
    }//GEN-LAST:event_cadastroClienteActionPerformed

    private void cadastrodividasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrodividasActionPerformed
        Cadastro_Dividas ini = new Cadastro_Dividas(this.tela);
        setVisible(false);
        tela.add(ini);
        ini.requestFocus();
    }//GEN-LAST:event_cadastrodividasActionPerformed

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

    private void historiconotafiscalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historiconotafiscalActionPerformed
      HistoricoNotaFiscal ini = new HistoricoNotaFiscal(this.tela);
        setVisible(false);
        tela.add(ini);
        ini.requestFocus();
    }//GEN-LAST:event_historiconotafiscalActionPerformed

    private void configuracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configuracoesActionPerformed
        Configuracoes ini = new Configuracoes(this.tela);
        setVisible(false);
        tela.add(ini);
        ini.requestFocus();
    }//GEN-LAST:event_configuracoesActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        if(this.cpf.excluir()){
        Tela_Usuario cad = new Tela_Usuario(this.tela);
        setVisible(false);
        tela.add(cad);
        cad.requestFocus();
        }else{ 
        }
    }//GEN-LAST:event_sairActionPerformed


    public void data(){
         Date data = new Date(); 
         Calendar cal = Calendar.getInstance(); 
         cal.setTime(data); 
         int dia = cal.get(Calendar.DAY_OF_MONTH); 
         int mes = cal.get(Calendar.MONTH)+1; 
         int ano = cal.get(Calendar.YEAR);
         
         Date data1 = new Date(); 
         Calendar cal1 = Calendar.getInstance(); 
         cal.setTime(data1); 
         int dia1 = cal.get(Calendar.DAY_OF_MONTH)+7; 
         int mes1 = cal.get(Calendar.MONTH)+1; 
         int ano1 = cal.get(Calendar.YEAR);
         
         if(dia1>31 && mes1>02 && mes1<02){
             dia1=01;
             mes1=mes1+1;
             System.out.println(dia+" "+mes+" "+ano);
             System.out.println(dia1+" "+mes1+" "+ano1);
             semana(dia+"/"+mes+"/"+ano,dia1+"/"+mes1+"/"+ano1);
         }else if(dia1>28 && mes1>1 && mes1<3){
             dia1=01;
             mes1=mes1+1;
             System.out.println(dia+" "+mes+" "+ano);
             System.out.println(dia1+" "+mes1+" "+ano1);
             semana(dia+"/"+mes+"/"+ano,dia1+"/"+mes1+"/"+ano1);
         }else{
             System.out.println(dia+" "+mes+" "+ano);
             System.out.println(dia1+" "+mes1+" "+ano1);
             
             if(dia<10){
             semana("0"+dia+"/"+mes+"/"+ano,"0"+dia1+"/"+mes1+"/"+ano1);
             }
         }
    }
    
    public void semana(String s1,String s2){
        
        String sql = "select nomecliente,descricao,date_format(dataVencimento,\"%d/%m/%Y\") from dividas where date_format(dataVencimento,\"%d/%m/%Y\") >= '"+s1+"' and date_format(dataVencimento,\"%d/%m/%Y\") <= '"+s2+"' and cpfusuario = '"+cpf.retornar()+"' and situacao = 'Devendo' order by dataVencimento asc;";
        conex();
        
        PreparedStatement st = null;
        ResultSet rs = null;
        try{
            st = conexao.prepareStatement(sql);
            rs= st.executeQuery();
            while(rs.next()){
                a.add(rs.getString("nomecliente")+" - "+rs.getString("descricao")+" - "+rs.getString("date_format(dataVencimento,\"%d/%m/%Y\")"));
                System.out.println(rs.getString("nomecliente"));
                System.out.println(rs.getString("descricao"));
            }                    
        }catch(SQLException ex){
            System.err.println("ERRO: "+ex);
        }finally{
            ConexaoSQL.fecharConexao(conexao, null, null);
        }
        System.out.println(a.size());
        listar();
        
    }
    
    public void conex(){
        conexao = ConexaoSQL.getConexao();
    }
    
    public void listar(){
        if(a.size()==7){
        av1.setText(a.get(0));
        av2.setText(a.get(1));
        av3.setText(a.get(2));
        av4.setText(a.get(3));
        av5.setText(a.get(4));
        av6.setText(a.get(5));
        av7.setText(a.get(6));
        
        }else if(a.size()==6){
        av1.setText(a.get(0));
        av2.setText(a.get(1));
        av3.setText(a.get(2));
        av4.setText(a.get(3));
        av5.setText(a.get(4));
        av6.setText(a.get(5));
        
        }else if(a.size()==5){
        av1.setText(a.get(0));
        av2.setText(a.get(1));
        av3.setText(a.get(2));
        av4.setText(a.get(3));
        av5.setText(a.get(4));
        
        }else if(a.size()==4){
        av1.setText(a.get(0));
        av2.setText(a.get(1));
        av3.setText(a.get(2));
        av4.setText(a.get(3));
        
        }else if(a.size()==3){
        av1.setText(a.get(0));
        av2.setText(a.get(1));
        av3.setText(a.get(2));
        
        }else if(a.size()==2){
        av1.setText(a.get(0));
        av2.setText(a.get(1)); 
        
        }else if(a.size()==1){
          av1.setText(a.get(0));
        }else{
        av1.setText("Não há dívidas a serem cobradas essa semana.");
    }
    }
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel av1;
    private javax.swing.JLabel av2;
    private javax.swing.JLabel av3;
    private javax.swing.JLabel av4;
    private javax.swing.JLabel av5;
    private javax.swing.JLabel av6;
    private javax.swing.JLabel av7;
    private javax.swing.JLabel boasVindas;
    private javax.swing.JButton cadastroCliente;
    private javax.swing.JButton cadastrodividas;
    private javax.swing.JButton configuracoes;
    private javax.swing.JLabel dvs;
    private javax.swing.JButton formularioCliente;
    private javax.swing.JButton formularioCobranca;
    private javax.swing.JButton historiconotafiscal;
    private javax.swing.JButton sair;
    private javax.swing.JLabel telamenu;
    // End of variables declaration//GEN-END:variables
}
