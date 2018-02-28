package Exercicio_18;

import java.util.Scanner;

public class Quest_07 {
    /**
     * Faça um algoritmo para ler duas variáveis inteiras A e B e garantir que
     * A e B fiquem em ordem crescente, ou seja, a variável A deverá armazenar o 
     * menor valor fornecido e a variável B o maior.
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int a, b, c;
        
        System.out.println("Digite o primeiro valor:");
        a = ent.nextInt();
        System.out.println("Digite o segundo valor:");
        b = ent.nextInt();
        
        if(a > b){
            c = a;
            a = b;
            b = c;
        }else{
            if(a <= b){
                c = a;
                a = b;
                b = c;
            }
            
            System.out.println("Na ordem é:\n" +a+ ":" +b);
        }
    }
    
}
