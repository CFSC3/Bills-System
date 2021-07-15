
package view;

import avisos.Avisos;
import conexao.Formularios;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.CadastroDividas;
import model.bean.FormularioClientes;
import model.bean.NotaFiscal;
import model.dao.CadastroDividasDao;
import model.dao.CpfDao;
import model.dao.FormularioClienteDao;
import model.dao.NotaFiscalDao;


public class Formulario_Cobranca extends javax.swing.JPanel {

    private FormularioClienteDao d = new FormularioClienteDao();
    private CadastroDividasDao dao = new CadastroDividasDao();  
    private NotaFiscalDao fdao = new NotaFiscalDao();
    private NotaFiscal fn = new NotaFiscal();
    private CpfDao cpf = new CpfDao();
    private FormularioClientes fc;
    private Avisos av = new Avisos();
    private int pressao=0;
    private int cob =1;
    long x;
    String m;
    Tela tela;

    public Formulario_Cobranca(Tela tela) {
        initComponents();
        this.tela=tela;
        DefaultTableModel cob = (DefaultTableModel) cobranca.getModel();
        cobranca.setRowSorter(new TableRowSorter(cob));
        setVisible(true);
        gerar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabelacobranca = new javax.swing.JScrollPane();
        cobranca = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        formu = new javax.swing.JButton();
        telaini = new javax.swing.JButton();
        cadastroC = new javax.swing.JButton();
        cadastroD = new javax.swing.JButton();
        formularioC = new javax.swing.JButton();
        historico = new javax.swing.JButton();
        conf = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        receber = new javax.swing.JLabel();

        recebidos = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        pesquisar = new javax.swing.JButton();
        textoPesquisa = new javax.swing.JTextField();
        telacobranca = new javax.swing.JLabel();

        setLayout(null);

        tabelacobranca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cobranca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cobranca.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        cobranca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome do Cliente", "Descrição", "Parcelas", "Valor", "Data de Vencimento", "Situação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cobranca.setToolTipText("");
        cobranca.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cobranca.setGridColor(new java.awt.Color(102, 102, 102));
        cobranca.setOpaque(false);
        cobranca.getTableHeader().setReorderingAllowed(false);
        cobranca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cobrancaMousePressed(evt);
            }
        });
        tabelacobranca.setViewportView(cobranca);

        add(tabelacobranca);
        tabelacobranca.setBounds(270, 170, 710, 370);

        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(450, 120, 90, 30);

        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(700, 120, 60, 30);

        formu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Icone-dowload-documento (1).png"))); // NOI18N
        formu.setBorder(null);
        formu.setContentAreaFilled(false);
        formu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formuActionPerformed(evt);
            }
        });
        add(formu);
        formu.setBounds(900, 60, 60, 60);

        telaini.setBorder(null);
        telaini.setContentAreaFilled(false);
        telaini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telainiActionPerformed(evt);
            }
        });
        add(telaini);
        telaini.setBounds(80, 170, 90, 30);

        cadastroC.setBorder(null);
        cadastroC.setContentAreaFilled(false);
        cadastroC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroCActionPerformed(evt);
            }
        });
        add(cadastroC);
        cadastroC.setBounds(30, 220, 180, 20);

        cadastroD.setBorder(null);
        cadastroD.setContentAreaFilled(false);
        cadastroD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroDActionPerformed(evt);
            }
        });
        add(cadastroD);
        cadastroD.setBounds(30, 280, 180, 20);

        formularioC.setBorder(null);
        formularioC.setContentAreaFilled(false);
        formularioC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formularioCActionPerformed(evt);
            }
        });
        add(formularioC);
        formularioC.setBounds(20, 390, 210, 20);

        historico.setBorder(null);
        historico.setContentAreaFilled(false);
        historico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historicoActionPerformed(evt);
            }
        });
        add(historico);
        historico.setBounds(20, 450, 210, 20);

        conf.setBorder(null);
        conf.setContentAreaFilled(false);
        conf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confActionPerformed(evt);
            }
        });
        add(conf);
        conf.setBounds(60, 500, 130, 20);

        sair.setBorder(null);
        sair.setContentAreaFilled(false);
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        add(sair);
        sair.setBounds(40, 563, 170, 30);

        receber.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        receber.setText("Receber: R$ ");
        add(receber);
        receber.setBounds(340, 570, 210, 20);

        recebidos.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        recebidos.setText("Recebidos: R$");
        add(recebidos);
        recebidos.setBounds(560, 570, 230, 17);

        total.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        total.setText("Total: R$");
        add(total);
        total.setBounds(800, 570, 180, 17);

        pesquisar.setBorder(null);
        pesquisar.setContentAreaFilled(false);
        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });
        add(pesquisar);
        pesquisar.setBounds(670, 73, 40, 40);

        textoPesquisa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textoPesquisa.setBorder(null);
        textoPesquisa.setOpaque(false);
        add(textoPesquisa);
        textoPesquisa.setBounds(280, 80, 390, 30);

        telacobranca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Tela formulário de cobrança.png"))); // NOI18N
        add(telacobranca);
        telacobranca.setBounds(0, 0, 1000, 610);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        gerar();
        cob=1;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        gerar2();
        cob=0;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void telainiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telainiActionPerformed
        Tela_inicial ini = new Tela_inicial(this.tela);
        setVisible(false);
        tela.add(ini);
        ini.requestFocus();
    }//GEN-LAST:event_telainiActionPerformed

    private void cadastroCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroCActionPerformed
       Tela_Cadastro_Cliente ini = new Tela_Cadastro_Cliente(this.tela);
        setVisible(false);
        tela.add(ini);
        ini.requestFocus();
    }//GEN-LAST:event_cadastroCActionPerformed

    private void cadastroDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroDActionPerformed
         Cadastro_Dividas ini = new Cadastro_Dividas(this.tela);
        setVisible(false);
        tela.add(ini);
        ini.requestFocus();
    }//GEN-LAST:event_cadastroDActionPerformed

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

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        if(this.cpf.excluir()){
        Tela_Usuario cad = new Tela_Usuario(this.tela);
        setVisible(false);
        tela.add(cad);
        cad.requestFocus();
        }else{ 
        }
    }//GEN-LAST:event_sairActionPerformed

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
      pesquisarNome();
    }//GEN-LAST:event_pesquisarActionPerformed

    private void formuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formuActionPerformed
        String s = "C:\\Users\\Dih\\JaspersoftWorkspace\\Projeto final\\Cob.jasper";
        Formularios f = new Formularios(s);
        f.mostrar();
    }//GEN-LAST:event_formuActionPerformed

    private void cobrancaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cobrancaMousePressed
        if(cob==1){
        pressao++;
        if(pressao>2){
            if(av.mudar()){
               //int i = cobranca.getSelectedColumn()+1;
               //for(int i = 0;i < cobranca.getSelectedColumn();i++){
                    System.out.println(cobranca.getSelectedColumn());
            cobranca.setValueAt("Pago", cobranca.getSelectedColumn()-1, 5);
            //}
                
            pago(cobranca.getSelectedColumn());
            pressao=0;
            }else{
                pressao=0;
            }
        }else{
        }
        }
    }//GEN-LAST:event_cobrancaMousePressed

    public void gerar(){
       DefaultTableModel cob = (DefaultTableModel) cobranca.getModel();
      cob.setNumRows(0);
        CadastroDividasDao dao = new CadastroDividasDao();  
        for(CadastroDividas d:dao.read()){
            cob.addRow(new Object[]{d.getNome(),d.getDescricao(),d.getParcelamento(),d.getValor(),d.getDataVencimento(),d.getSituacao()});
        }
        receber.setText("A receber: R$ "+this.dao.devendo());
        recebidos.setText("Recebidos: R$ "+this.dao.pago());
        total.setText("Total: R$ "+this.dao.total());
    }
    
     public void pesquisarNome(){
     DefaultTableModel cob = (DefaultTableModel) cobranca.getModel();
      cob.setNumRows(0);
        CadastroDividasDao dao = new CadastroDividasDao();  
        for(CadastroDividas d:dao.pesquisaNome(textoPesquisa.getText())){
            cob.addRow(new Object[]{d.getNome(),d.getDescricao(),d.getParcelamento(),d.getValor(),d.getDataVencimento(),d.getSituacao()});
        }
    }
    
    public void gerar2(){
        DefaultTableModel cob = (DefaultTableModel) cobranca.getModel();
      cob.setNumRows(0);
        CadastroDividasDao dao = new CadastroDividasDao();  
        for(CadastroDividas d:dao.read2()){
            cob.addRow(new Object[]{d.getNome(),d.getDescricao(),d.getParcelamento(),d.getValor(),d.getDataVencimento(),d.getSituacao()});
        }
    }
    
    public void pago(int op){
        
        for(int i = 0;i<op;i++){
            if(cobranca.getValueAt(i, 5).equals("Pago")){
                if(dao.atualizarSituacao(String.valueOf(cobranca.getValueAt(i, 0)), String.valueOf(cobranca.getValueAt(i, 1)))){
                    System.out.println("Sucesso1");
                    mediaDias(i);
                    descricao();
                    fc = new FormularioClientes(String.valueOf(cobranca.getValueAt(i, 0)),m,"ativo",dao.retornarDUC(String.valueOf(cobranca.getValueAt(i, 0)),String.valueOf(cobranca.getValueAt(i, 1))),dao.retornarCpf(String.valueOf(cobranca.getValueAt(i, 0))));
                    if(d.Atualizar(fc)){
                        System.out.println("Sucesso");
                    }else{
                        System.out.println("Falha!");
                    }
                }else{
                    System.out.println("Erro!");
                }
                if(dao.capto(String.valueOf(cobranca.getValueAt(i, 0)), String.valueOf(cobranca.getValueAt(i, 1)))){
                    System.out.println("Sucesso2");
                    gerar();
                }else{
                    System.out.println("Erro!");
                }
            }else{
                System.out.println("Nenhuma a ser gerada");
            }
        }
}
    
    public void mediaDias(int i){
        
         Date data = new Date(); 
         Calendar cal = Calendar.getInstance(); 
         cal.setTime(data); 
         int dia = cal.get(Calendar.DAY_OF_MONTH); 
         int mes = cal.get(Calendar.MONTH)+1; 
         int ano = cal.get(Calendar.YEAR);
         
        DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
        df.setLenient(false);
        Date d1 = null;
        try {
            d1 = df.parse (String.valueOf(cobranca.getValueAt(i, 4)));
        } catch (ParseException ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println (String.valueOf(cobranca.getValueAt(i, 4)));
        Date d2 = null;
        try {
            d2 = df.parse (dia+"/"+mes+"/"+ano);
        } catch (ParseException ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println (d2);
        long dt = (d2.getTime() - d1.getTime()) + 3600000; // 1 hora para compensar horário de verão
        x = dt / 86400000L;
        System.out.println (dt / 86400000L);
    }
    
    public void descricao(){
        if(x<0){
            m = "Pagamento antecipado ao dia do vencimento";
        }else if(x>0){
            m = "Pagamento com "+x+" dias de atraso ao dia do vencimento";
        }else{
            m = "Pagamento feito no dia do vencimento";
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastroC;
    private javax.swing.JButton cadastroD;
    private javax.swing.JTable cobranca;
    private javax.swing.JButton conf;
    private javax.swing.JButton formu;
    private javax.swing.JButton formularioC;
    private javax.swing.JButton historico;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton pesquisar;
    private javax.swing.JLabel receber;
    private javax.swing.JLabel recebidos;
    private javax.swing.JButton sair;
    private javax.swing.JScrollPane tabelacobranca;
    private javax.swing.JLabel telacobranca;
    private javax.swing.JButton telaini;
    private javax.swing.JTextField textoPesquisa;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
