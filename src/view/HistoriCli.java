
package view;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.HistoricoCliente;
import model.dao.FormularioClienteDao;

public class HistoriCli extends javax.swing.JDialog {

    private String cpf; 
    
    public HistoriCli(java.awt.Frame parent, boolean modal,String cpf) {
        super(parent, modal);
        System.out.println(cpf);
        setLocationRelativeTo(null);
        initComponents();
        this.cpf=cpf;
        setVisible(true);
        DefaultTableModel cob = (DefaultTableModel) tab.getModel();
        tab.setRowSorter(new TableRowSorter(cob));
        gerar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Data da Última Divida", "Descrição", "Situação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tab.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tab);
        if (tab.getColumnModel().getColumnCount() > 0) {
            tab.getColumnModel().getColumn(0).setResizable(false);
            tab.getColumnModel().getColumn(1).setResizable(false);
            tab.getColumnModel().getColumn(1).setPreferredWidth(50);
            tab.getColumnModel().getColumn(2).setResizable(false);
            tab.getColumnModel().getColumn(3).setResizable(false);
            tab.getColumnModel().getColumn(4).setResizable(false);
            tab.getColumnModel().getColumn(4).setPreferredWidth(170);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 640, 402);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
  /*  public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HistoriCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistoriCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistoriCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistoriCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HistoriCli dialog = new HistoriCli(new javax.swing.JFrame(), true,cpf);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }*/
    
    public void gerar(){
      DefaultTableModel cob = (DefaultTableModel) tab.getModel();
      cob.setNumRows(0);
        FormularioClienteDao dao = new FormularioClienteDao();  
        for(HistoricoCliente d:dao.readHistorico(cpf)){
            System.out.println(d);
            cob.addRow(new Object[]{d.getNomeCliente(),d.getCpf(),d.getDataUltimaCompra(),d.getDescricao(),d.getSituacao()});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tab;
    // End of variables declaration//GEN-END:variables
}
