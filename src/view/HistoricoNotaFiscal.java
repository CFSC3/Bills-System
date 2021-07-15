
package view;

import conexao.Formularios;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.NotaFiscal;
import model.dao.CpfDao;
import model.dao.NotaFiscalDao;

public class HistoricoNotaFiscal extends javax.swing.JPanel {

    private NotaFiscalDao dao = new NotaFiscalDao();
    private NotaFiscalC c;
    private CpfDao cpf = new CpfDao();
    Tela tela;
    
    public HistoricoNotaFiscal(Tela tela) {
        initComponents();
        this.tela=tela;
        DefaultTableModel cob = (DefaultTableModel) historiconf.getModel();
        historiconf.setRowSorter(new TableRowSorter(cob));
        setVisible(true);
        gerar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hnf = new javax.swing.JScrollPane();
        historiconf = new javax.swing.JTable();
        telaini = new javax.swing.JButton();
        cadastroC = new javax.swing.JButton();
        cadastroD = new javax.swing.JButton();
        formularioD = new javax.swing.JButton();
        formularioC = new javax.swing.JButton();
        conf = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        pesquisar = new javax.swing.JButton();
        formu = new javax.swing.JButton();
        textoPesquisa = new javax.swing.JTextField();
        telaHNF = new javax.swing.JLabel();

        setLayout(null);

        historiconf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número de Serie", "Nome Do Cliente", "Descrição", "Data de Pagamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        historiconf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                historiconfMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                historiconfMouseReleased(evt);
            }
        });
        hnf.setViewportView(historiconf);
        if (historiconf.getColumnModel().getColumnCount() > 0) {
            historiconf.getColumnModel().getColumn(0).setResizable(false);
            historiconf.getColumnModel().getColumn(1).setResizable(false);
            historiconf.getColumnModel().getColumn(2).setResizable(false);
            historiconf.getColumnModel().getColumn(3).setResizable(false);
        }

        add(hnf);
        hnf.setBounds(280, 140, 710, 402);

        telaini.setBorder(null);
        telaini.setContentAreaFilled(false);
        telaini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telainiActionPerformed(evt);
            }
        });
        add(telaini);
        telaini.setBounds(80, 180, 90, 20);

        cadastroC.setBorder(null);
        cadastroC.setContentAreaFilled(false);
        cadastroC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroCActionPerformed(evt);
            }
        });
        add(cadastroC);
        cadastroC.setBounds(30, 230, 180, 20);

        cadastroD.setBorder(null);
        cadastroD.setContentAreaFilled(false);
        cadastroD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroDActionPerformed(evt);
            }
        });
        add(cadastroD);
        cadastroD.setBounds(30, 280, 180, 20);

        formularioD.setBorder(null);
        formularioD.setContentAreaFilled(false);
        formularioD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formularioDActionPerformed(evt);
            }
        });
        add(formularioD);
        formularioD.setBounds(10, 340, 230, 20);

        formularioC.setBorder(null);
        formularioC.setContentAreaFilled(false);
        formularioC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formularioCActionPerformed(evt);
            }
        });
        add(formularioC);
        formularioC.setBounds(20, 393, 210, 20);

        conf.setBorder(null);
        conf.setContentAreaFilled(false);
        conf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confActionPerformed(evt);
            }
        });
        add(conf);
        conf.setBounds(60, 510, 130, 20);

        sair.setBorder(null);
        sair.setContentAreaFilled(false);
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        add(sair);
        sair.setBounds(40, 570, 170, 30);

        pesquisar.setBorder(null);
        pesquisar.setContentAreaFilled(false);
        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });
        add(pesquisar);
        pesquisar.setBounds(670, 73, 40, 40);

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

        textoPesquisa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textoPesquisa.setBorder(null);
        textoPesquisa.setOpaque(false);
        textoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoPesquisaActionPerformed(evt);
            }
        });
        add(textoPesquisa);
        textoPesquisa.setBounds(280, 80, 390, 30);

        telaHNF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Tela histórico de nota.png"))); // NOI18N
        add(telaHNF);
        telaHNF.setBounds(0, -5, 1000, 620);
    }// </editor-fold>//GEN-END:initComponents

    private void historiconfMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historiconfMousePressed
        String nds = String.valueOf(historiconf.getValueAt(historiconf.getSelectedRow(), 0));
        System.out.println(nds);
        c = new NotaFiscalC(null,true,nds);
    }//GEN-LAST:event_historiconfMousePressed

    private void historiconfMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historiconfMouseReleased
       
    }//GEN-LAST:event_historiconfMouseReleased

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
        gerarPesquisaNome();
    }//GEN-LAST:event_pesquisarActionPerformed

    private void textoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoPesquisaActionPerformed

    private void formuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formuActionPerformed
         String s = "C:\\Users\\Dih\\JaspersoftWorkspace\\Projeto final\\HNF.jasper";
        Formularios f = new Formularios(s);
        f.mostrar();
    }//GEN-LAST:event_formuActionPerformed

     public void gerar(){
       DefaultTableModel cob = (DefaultTableModel) historiconf.getModel();
      cob.setNumRows(0);
        NotaFiscalDao dao = new NotaFiscalDao();  
        for(NotaFiscal d:dao.read()){
            cob.addRow(new Object[]{d.getNumeroDeSerie(),d.getNomeCliente(),d.getDescricao(),d.getDataPagamento()});
        }
    }

       public void gerarPesquisaNome(){
        DefaultTableModel cob = (DefaultTableModel) historiconf.getModel();
      cob.setNumRows(0);
        NotaFiscalDao dao = new NotaFiscalDao();  
        for(NotaFiscal d:dao.pesquisaNome(textoPesquisa.getText())){
            cob.addRow(new Object[]{d.getNumeroDeSerie(),d.getNomeCliente(),d.getDescricao(),d.getDataPagamento()});
        }
        }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastroC;
    private javax.swing.JButton cadastroD;
    private javax.swing.JButton conf;
    private javax.swing.JButton formu;
    private javax.swing.JButton formularioC;
    private javax.swing.JButton formularioD;
    private javax.swing.JTable historiconf;
    private javax.swing.JScrollPane hnf;
    private javax.swing.JButton pesquisar;
    private javax.swing.JButton sair;
    private javax.swing.JLabel telaHNF;
    private javax.swing.JButton telaini;
    private javax.swing.JTextField textoPesquisa;
    // End of variables declaration//GEN-END:variables
}
