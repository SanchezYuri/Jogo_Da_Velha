package projetojv;
import java.util.Scanner;

public class ProjetoJV {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        jogoJV jogo = new jogoJV();
        String posicao;
        int valida = 0, jogadas = 0;
        
        while(true){//++++++++++++++
            System.out.println("::::Jogo da Velha::::");
            jogo.Mostrar();
            System.out.println(":::::::::::::::::::::");
            do{//Inicia Jogador 1
                System.out.println("Jogador 1, escolha onde jogar");
                posicao = ler.next();
                while(!jogo.Valido(posicao)){
                    System.out.println("Jogada invalida, jogue novamente");
                    System.out.println("Jogador 1, escolha onde jogar");
                    posicao = ler.next();
                    valida = 0;
                }
                jogo.Jogada(posicao, "X");
                valida = 1;
                
                
            }while(valida == 0);
            
            jogadas++;
            valida = 0;
            jogo.Mostrar();
            if(!jogo.Ganhou(jogadas).equals("null")){
                break;
            }
            
            do{//Inicia Jogador 2
                System.out.println("Jogador 2, escolha onde jogar");
                posicao = ler.next();
                while(!jogo.Valido(posicao)){
                    System.out.println("Jogada invalida, jogue novamente");
                    System.out.println("Jogador 2, escolha onde jogar");
                    posicao = ler.next();
                    valida = 0;
                }
                jogo.Jogada(posicao, "O");
                valida = 1;
                
                
            }while(valida == 0);
            
            jogadas++;
            valida = 0;
            jogo.Mostrar();
            if(!jogo.Ganhou(jogadas).equals("null")){
                break;
            
            
                }
         
        }
        System.out.println("O " + jogo.Ganhou(jogadas) + " Venceu");
    
    }
    
}