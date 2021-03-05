package jogovelha;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class JogoVelha extends JFrame{
    
    ImageIcon iconCirculo = new ImageIcon(getClass().getResource("circulo.png"));
    ImageIcon iconX = new ImageIcon(getClass(). getResource("x.png"));
    
    
    JPanel pTela = new JPanel(new GridLayout(3, 3, 10, 10));
    JLabel lInfo = new JLabel();
    
    public JogoVelha(){
        
        configurarJanela();
        configurarTela();
        
    }
    
    public void configurarTela(){
        add(BorderLayout.CENTER,pTela);
        add(BorderLayout.NORTH,lInfo);
        pTela.setBackground(Color.BLACK);
        lInfo.setFont(new Font("Arial", Font.BOLD, 35));
        lInfo.setForeground(new Color(50, 200, 50));
        lInfo.setHorizontalAlignment(SwingConstants.CENTER);
        
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
