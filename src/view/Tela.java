
package view;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Tela extends JFrame{
    
    private Tela_Usuario telaUsuario = new Tela_Usuario(this);
    
    public Tela(){
        
        setTitle("Bills System");
        URL caminhoicone = getClass().getResource("/img/logo.png");
        Image iconetitulo = Toolkit.getDefaultToolkit().createImage(caminhoicone);
        setIconImage(iconetitulo);
        setSize(1000, 639);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setFocusable(false);
        add(telaUsuario);
        
    }

    public Tela(String s) {
    }
    
    public void d(){
        dispose();
    }
    
    public static void main(String[] agrs){
        new Tela();
    }
}
