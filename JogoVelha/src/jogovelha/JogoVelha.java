package jogovelha;

import javax.swing.JFrame;

public class JogoVelha extends JFrame{
    
    public JogoVelha(){
        
        configurarJanela();
        
    }
    
    public void configurarJanela(){
        
        setTitle(" JOGO DA VELHA ");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,200);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }

    public static void main(String[] args) {
        
        Jogo jogo = new Jogo();
       
    }
    
}
