
package view;

import model.dao.CadastroClienteDao;
import model.dao.CpfDao;


public class InfoCliente extends javax.swing.JPanel {

    private CadastroClienteDao dao = new CadastroClienteDao(); 
    private CpfDao cpf2 = new CpfDao();
    private String cpfc;
    private String cpfcA;
    Tela tela2;
    
    public InfoCliente(Tela tela, String cpf) {
        this.tela2=tela;
        initComponents();
        setVisible(true);
        this.cpfc = cpf;
        mostrar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nome = new javax.swing.JLabel();
        cpf = new javax.swing.JLabel();
        dn = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        endereco = new javax.swing.JLabel();
        dtc = new javax.swing.JLabel();
        sair = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        tela = new javax.swing.JLabel();

        setLayout(null);

        nome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nome.setText("Nome");
        add(nome);
        nome.setBounds(350, 100, 460, 50);

        cpf.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cpf.setText("CPF");
        add(cpf);
        cpf.setBounds(350, 160, 450, 50);

        dn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        dn.setText("Data de Nascimento");
        add(dn);
        dn.setBounds(350, 220, 470, 50);

        email.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        email.setText("Email");
        add(email);
        email.setBounds(350, 280, 390, 60);

        endereco.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        endereco.setText("Endereço");
        add(endereco);
        endereco.setBounds(350, 350, 630, 60);

        dtc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        dtc.setText("DDD:   Telefone:    Celular:");
        add(dtc);
        dtc.setBounds(350, 430, 650, 60);

        sair.setBorder(null);
        sair.setContentAreaFilled(false);
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        add(sair);
        sair.setBounds(30, 563, 180, 30);

        alterar.setBorder(null);
        alterar.setContentAreaFilled(false);
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });
        add(alterar);
        alterar.setBounds(390, 560, 180, 40);

        voltar.setBorder(null);
        voltar.setContentAreaFilled(false);
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        add(voltar);
        voltar.setBounds(680, 570, 180, 30);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(890, 60, 73, 23);

        tela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Tela de dados do cliente.png"))); // NOI18N
        add(tela);
        tela.setBounds(0, 0, 1000, 615);
    }// </editor-fold>//GEN-END:initComponents

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        ClienteAtualizar ini = new ClienteAtualizar(this.tela2,cpfc);
        setVisible(false);
        tela2.add(ini);
        ini.requestFocus();
    }//GEN-LAST:event_alterarActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        FormularioCliente ini = new FormularioCliente(this.tela2);
        setVisible(false);
        tela2.add(ini);
        ini.requestFocus();
    }//GEN-LAST:event_voltarActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
       if(this.cpf2.excluir()){
        Tela_Usuario cad = new Tela_Usuario(this.tela2);
        setVisible(false);
        tela2.add(cad);
        cad.requestFocus();
        }else{ 
        }
    }//GEN-LAST:event_sairActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new HistoriCli(new javax.swing.JFrame(),true,cpfcA);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void mostrar(){
        if(dao.cliente(cpfc)){
            nome.setText("Nome: "+dao.getA());
            cpf.setText("CPF: "+dao.getB());
            dn.setText("Data de Nascimento: "+dao.getC());
            email.setText("Email: "+dao.getD());
            endereco.setText("Endereço: "+dao.getE());
            dtc.setText("DDD: "+dao.getF()+"   Telefone: "+dao.getG()+"   Celular: "+dao.getH());
            cpfcA=dao.getB();
        }else{
            System.err.println("Erro!!");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterar;
    private javax.swing.JLabel cpf;
    private javax.swing.JLabel dn;
    private javax.swing.JLabel dtc;
    private javax.swing.JLabel email;
    private javax.swing.JLabel endereco;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel nome;
    private javax.swing.JButton sair;
    private javax.swing.JLabel tela;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
