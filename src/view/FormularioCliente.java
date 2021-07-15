
package view;

import conexao.Formularios;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.FormularioClientes;
import model.dao.CpfDao;
import model.dao.FormularioClienteDao;


public class FormularioCliente extends javax.swing.JPanel {

    Tela tela;
    private CpfDao cpf = new CpfDao();
    private FormularioClienteDao fd = new FormularioClienteDao();
    
    public FormularioCliente(Tela tela) {
        initComponents();
        setVisible(true);
        this.tela=tela;
        DefaultTableModel cob = (DefaultTableModel) formuCliente.getModel();
        formuCliente.setRowSorter(new TableRowSorter(cob));
        gerar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        formuCliente = new javax.swing.JTable();
        telaIni = new javax.swing.JButton();
        cadastroC = new javax.swing.JButton();
        cadastroD = new javax.swing.JButton();
        formularioD = new javax.swing.JButton();
        historico = new javax.swing.JButton();
        conf = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        pesquisar = new javax.swing.JButton();
        textoPesquisa = new javax.swing.JTextField();
        formu = new javax.swing.JButton();
        telaCliente = new javax.swing.JLabel();

        setLayout(null);

        formuCliente.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        formuCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Descrição", "Situação", "Data da Última Compra"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        formuCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formuClienteMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formuClienteMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(formuCliente);
        if (formuCliente.getColumnModel().getColumnCount() > 0) {
            formuCliente.getColumnModel().getColumn(0).setResizable(false);
            formuCliente.getColumnModel().getColumn(1).setResizable(false);
            formuCliente.getColumnModel().getColumn(1).setPreferredWidth(180);
            formuCliente.getColumnModel().getColumn(2).setResizable(false);
            formuCliente.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1);
        jScrollPane1.setBounds(280, 170, 700, 390);

        telaIni.setBorder(null);
        telaIni.setContentAreaFilled(false);
        telaIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telaIniActionPerformed(evt);
            }
        });
        add(telaIni);
        telaIni.setBounds(80, 170, 90, 30);

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

        formularioD.setBorder(null);
        formularioD.setContentAreaFilled(false);
        formularioD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formularioDActionPerformed(evt);
            }
        });
        add(formularioD);
        formularioD.setBounds(10, 330, 230, 20);

        historico.setBorder(null);
        historico.setContentAreaFilled(false);
        historico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historicoActionPerformed(evt);
            }
        });
        add(historico);
        historico.setBounds(20, 450, 200, 20);

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
        sair.setBounds(30, 563, 180, 30);

        pesquisar.setBorder(null);
        pesquisar.setContentAreaFilled(false);
        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });
        add(pesquisar);
        pesquisar.setBounds(680, 70, 20, 40);

        textoPesquisa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textoPesquisa.setBorder(null);
        textoPesquisa.setOpaque(false);
        add(textoPesquisa);
        textoPesquisa.setBounds(280, 80, 380, 30);

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

        telaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Tela formulário de clientes.png"))); // NOI18N
        add(telaCliente);
        telaCliente.setBounds(0, 0, 1000, 610);
    }// </editor-fold>//GEN-END:initComponents

    private void telaIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telaIniActionPerformed
        Tela_inicial ini = new Tela_inicial(this.tela);
        setVisible(false);
        tela.add(ini);
        ini.requestFocus();
    }//GEN-LAST:event_telaIniActionPerformed

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

    private void formuClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formuClienteMousePressed
        InfoCliente ini = new InfoCliente(this.tela,String.valueOf(fd.retornaCpf(String.valueOf(formuCliente.getValueAt(formuCliente.getSelectedRow(), 0)))));
        setVisible(false);
        tela.add(ini);
        ini.requestFocus();      
    }//GEN-LAST:event_formuClienteMousePressed

    private void formuClienteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formuClienteMouseReleased
    }//GEN-LAST:event_formuClienteMouseReleased

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
       gerarPesquisaNome();
    }//GEN-LAST:event_pesquisarActionPerformed

    private void formuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formuActionPerformed
        String s = "C:\\Users\\Dih\\JaspersoftWorkspace\\Projeto final\\Cliente.jasper";
        Formularios f = new Formularios(s);
        f.mostrar();
    }//GEN-LAST:event_formuActionPerformed

    public void gerar(){
       DefaultTableModel cob = (DefaultTableModel) formuCliente.getModel();
      cob.setNumRows(0);
        FormularioClienteDao dao = new FormularioClienteDao();  
        for(FormularioClientes d:dao.read()){
            cob.addRow(new Object[]{d.getNomeCliente(),d.getDescricao(),d.getSituacao(),d.getDataUltimaCompra()});
        }
    }

     public void gerarPesquisaNome(){
         DefaultTableModel cob = (DefaultTableModel) formuCliente.getModel();
      cob.setNumRows(0);
        FormularioClienteDao dao = new FormularioClienteDao();  
        for(FormularioClientes d:dao.pesquisaNome(textoPesquisa.getText())){
            cob.addRow(new Object[]{d.getNomeCliente(),d.getDescricao(),d.getSituacao(),d.getDataUltimaCompra()});
        }
    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastroC;
    private javax.swing.JButton cadastroD;
    private javax.swing.JButton conf;
    private javax.swing.JButton formu;
    private javax.swing.JTable formuCliente;
    private javax.swing.JButton formularioD;
    private javax.swing.JButton historico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pesquisar;
    private javax.swing.JButton sair;
    private javax.swing.JLabel telaCliente;
    private javax.swing.JButton telaIni;
    private javax.swing.JTextField textoPesquisa;
    // End of variables declaration//GEN-END:variables
}
