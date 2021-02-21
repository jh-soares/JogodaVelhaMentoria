
package jogovelha;


public class Tabuleiro {
    
    private int [][] tabuleiro = new int [3][3];
    
    public Tabuleiro(){
        zerarTabuleiro();
    }
    
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
    
}
