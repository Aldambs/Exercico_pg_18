package Exercicio_18;

import java.util.Scanner;

public class Quest_06 {
    /**
     *  Faça um algoritmo para ler dois números inteiros e escrevê-los 
     * em ordem crescente.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a, b;
        
        System.out.println("Qual é o primeiro valor?");
        a = ler.nextInt();
        System.out.println("Qual é o segundo valor?");
        b = ler.nextInt();
        
        if(a < b){
            System.out.println("Ordem crescente: " +a+ "," +b);
        }else{
            System.out.println("Ordem crescente: " +b+ "," +a);
        }
    }
    
}
