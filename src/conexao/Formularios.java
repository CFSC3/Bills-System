
package conexao;

import java.sql.Connection;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class Formularios {
    private String endereco;
    Connection conexao = ConexaoSQL.getConexao();

    public Formularios(String endereco) {
        this.endereco = endereco;
    }
    
    public void mostrar(){
        JasperPrint print = null;
        try{
            print = JasperFillManager.fillReport(endereco,null,conexao);
        }catch(Exception ex){
            System.err.println("ERRO: "+ex);
        }
        JasperViewer vier = new JasperViewer(print,false);
        vier.setVisible(true);
    }
}
