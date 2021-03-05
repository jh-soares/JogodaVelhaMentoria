
package jogovelha;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Tabuleiro extends JButton{
    
    private Tabuleiro[] tabuleiro = new Tabuleiro[9] ;
    
        int rodadas = 0;
        int quem == 0;
            
    public Tabuleiro(){
        
        setBackground(Color.WHITE);
        addActionListener(e - >{
        
            if(quem == 0){
                if(jogadorVez == JOGADOR_1){
                    setIcon(iconCirculo);
                    quem = JOGADOR_1;
                }else{
                    setIcon(iconX);
                    quem = JOGADOR_2;
                }
                if(testarVitoria(quem)){
                    JOptionPane.showMessageDialog(null, "Jogador " + quem + " Venceu!");
                    System.exit(0);
                }
                
                rodadas++;
                
                for(rodadas ==9){
                    JOptionPane.showMessageDialog(null, "Deu velha!");
                    System.exit(0);
                }
                mudavez();
            }
    });
        
    }
/*    
    public void zerarTabuleiro(){
        for(int linha=0; linha <3; linha++){
            for(int coluna=0; coluna<3; coluna++){
                tabuleiro[linha][coluna] = 0;
            }
                         
        }
    }
    
    public void exibeTabuleiro(){
        System.out.println();
        for (int linha=0; linha<3; linha++){
            for(int coluna=0; coluna<3; coluna++){
                
                if(tabuleiro[linha][coluna]==-1){
                    System.out.println(" X ");
                }
                if(tabuleiro[linha][coluna]==1){
                    System.out.println(" O ");
                }
                if(tabuleiro[linha][coluna]==0){
                    System.out.println("  ");
                }
                if (coluna==0 || coluna==1){
                    System.out.println(" | ");
                }
               
                System.out.println();
            }
        }       
    
    }
    
    public int getPosicao(int[] tentativa){
        
        return tabuleiro[tentativa[0]][tentativa[1]];
    }
    
    public void setPosicao(int[] tentativa, int jogador){
        if(jogador==1){
            tabuleiro[tentativa[0]] [tentativa[1]] = -1;
        }else{
            tabuleiro[tentativa[0]] [tentativa[1]] = 1;
        }
        
        exibeTabuleiro();
    }
    
    public int checaLinhas(){
        for(int linha=0; linha<3; linha++){
            if(tabuleiro[linha][0]+tabuleiro[linha][1]+tabuleiro [linha][2]==-3){
                return -1;
            }
            if(tabuleiro[linha][0]+tabuleiro[linha][1]+tabuleiro[linha][2]==3){
                return 1;
            }
        }
        
        return 0;
    }
    
    public int checaColunas(){
        for(int coluna=0; coluna <3; coluna++){
            if(tabuleiro[0][coluna]+tabuleiro[1][coluna]+tabuleiro[2][coluna]== -3){
                return -1;
            }
            if(tabuleiro[0][coluna]+tabuleiro[1][coluna]+tabuleiro[2][coluna]==3){
                return 1;
            }
        }
        
        return 0;
    }
    
    public int checaDiagonais(){
        if(tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2]== -3){
            return -1;
        }
        if(tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2]== 3){
            return 1;
        }
        if(tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][0]== -3){
            return -1;
        }
        if(tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][0]== 3){
            return 1;
        }
        
        return 0;
    }
    
    public boolean tabuleiroCompleto(){
        for(int linha=0; linha<3;linha++){
            for(int coluna=0; coluna<3; coluna++){
                if(tabuleiro[linha][coluna]==0){
                    return false;
                }
            }
        }
        
        return true;
    }  
*/    
}
