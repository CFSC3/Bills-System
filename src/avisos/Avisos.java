
package avisos;

import javax.swing.JOptionPane;


public class Avisos {

    public Avisos() {
        
    }
    
    public boolean inserir(){
        
        Object[] options = { "Sim", "Não" };
        
        int bb = JOptionPane.showOptionDialog(null, "Deseja mesmo inserir?", "Aviso",
        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
        null, options, options[0]);

        if(bb==0){        
        return true;
        }else{
            return false;
        }
    }
    
    public boolean atualizar(){
        
        Object[] options = { "Sim", "Não" };
        
        int bb = JOptionPane.showOptionDialog(null, "Deseja mesmo atualizar?", "Aviso",
        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
        null, options, options[0]);

        if(bb==0){        
        return true;
        }else{
            return false;
        }
    }
    
    public boolean excluir(){
        
        Object[] options = { "Sim", "Não" };
        
        int bb = JOptionPane.showOptionDialog(null, "Deseja mesmo excluir?", "Aviso",
        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
        null, options, options[0]);

        if(bb==0){        
        return true;
        }else{
            return false;
        }
    }
    
    public boolean sair(){
        
        Object[] options = { "Sim", "Não" };
        
        int bb = JOptionPane.showOptionDialog(null, "Deseja mesmo mesmo sair durante o processo?", "Aviso",
        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
        null, options, options[0]);

        if(bb==0){        
        return true;
        }else{
            return false;
        }
    }
    
    public void sucesso(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
    public void erro(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
    public boolean cancelar(){
        
        Object[] options = { "Sim", "Não" };
        
        int bb = JOptionPane.showOptionDialog(null, "Deseja mesmo cancelar?", "Aviso",
        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
        null, options, options[0]);

        if(bb==0){        
        return true;
        }else{
            return false;
        }
    }
    
    public boolean mudar(){
        
        Object[] options = { "Pago", "Cancelar" };
        
        int bb = JOptionPane.showOptionDialog(null, "Situação", "Aviso",
        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
        null, options, options[0]);

        if(bb==0){        
        return true;
        }else{
            return false;
        }
    }
    
    public void naoencontrado(String mensagem){
          JOptionPane.showMessageDialog(null, mensagem);        
    }
    
}