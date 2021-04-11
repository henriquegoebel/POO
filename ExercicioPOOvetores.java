/*
 *Construir um algoritmo que contenha 3 vetores:
- Nomes de produtos;
- Preços de cada produto;
- Quantidade de cada produto.
 *Contruir uma função para imprimir um dos produtos, informando o nome, preço e quantidade deste produto.
 */
package exerciciopoovetores;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author henriquegoebel
 */
public class ExercicioPOOvetores {
    
    static String[] nomeProduto = {"Coca-cola", "Fanta", "Sprite", "Guaraná"};
    static double[] precoProduto = {3.5, 3.2, 3, 2.5};
    static int[] quantidadeProduto = {100, 50, 30, 40};
   
    public static void main(String[] args) {
        
        Scanner posicao = new Scanner(System.in);
        
        System.out.println("Escolha um refrigerante:");
        System.out.println("1 - Coca-cola");
        System.out.println("2 - Fanta");
        System.out.println("3 - Sprite");
        System.out.println("4 - Guaraná");
        System.out.println("5 - Todos");
        
        
        
        int refrigerante = posicao.nextInt();
        
        if(refrigerante < 1 || refrigerante > 5){
            System.out.println("Escolha inválida, tente novamente: ");
            refrigerante = posicao.nextInt();
        }
        
        int i = refrigerante - 1;
        
        if (i > 3){
            for(int p = 0; p < 4; p++){
            imprimirProduto(p);
            }
        }else{
          imprimirProduto(i);  
        }
    
    }
    public static void imprimirProduto(int posicao){
        System.out.println("");
        System.out.println("Nome do Produto: " + nomeProduto[posicao]);
        System.out.println("Preço do Produto: " + precoProduto[posicao]);
        System.out.println("Quantidade do Produto: " + quantidadeProduto[posicao]);
        System.out.println(""); 
    }
    
}
