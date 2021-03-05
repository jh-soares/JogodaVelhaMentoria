
package jogovelha;

import java.awt.Color;



public class Jogador {
    
       
    int jogadorVez = JOGADOR_1;
    
    public void mudarVez(){
        
        if(jogadorVez == 1){
            jogadorVez = 2;
            lInfo.setText("Jogador 2");
            lInfo.setForeground(Color.RED);            
        }else{
            jogadorVez = 1;
            lInfo.setText("Jogador 1");
            lInfo.setForeground(new Color(50,200,50));
        }
    }
    
    
    
    
/*    protected int [] tentativa = new int[2];
    protected int jogador;
    
    public Jogador(int jogador){
        this.jogador = jogador;
    }
    
    public abstract void jogar(Tabuleiro tabuleiro);
    
    public abstract void Tentativa(Tabuleiro tabuleiro);
    
    public boolean checaTentativa(int[] tentativa, Tabuleiro tabuleiro){
        if(tabuleiro.getPosicao(tentativa)==0){
            return true;
        }else{
            return false;
        }
    }
*/    
}
