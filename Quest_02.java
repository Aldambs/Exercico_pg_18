package Exercicio_18;

import java.util.Scanner;

public class Quest_02 {
    /**
     * Faça um algoritmo para ler dois números inteiros e informa se estes números
     * são iguais ou diferente.
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int n1, n2;
        
        System.out.println("Informe o primeiro número:");
        n1 = ler.nextInt();
        System.out.println("Informe o segundo número:");
        n2 = ler.nextInt();
        
        if(n1 == n2){
            System.out.println("Número iguais");
        }else 
            System.out.println("Número diferente");
        
    }
}
