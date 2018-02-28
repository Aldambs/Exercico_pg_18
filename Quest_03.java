package Exercicio_18;

import java.util.Scanner;

public class Quest_03 {
    /**
     * Faça um algoritmo para ler um número inteiro e informar se o número 
     * é par ou ímpar.
     */
    public static void main(String[] args) {
       
        Scanner ler = new Scanner(System.in);
        int n;
        
        System.out.println("Informe o número:");
        n = ler.nextInt();
        
        if(n % 2 == 0){
            System.out.println("Número par");
        }else{
            System.out.println("Número ímpar");
        }
    }
    
}
