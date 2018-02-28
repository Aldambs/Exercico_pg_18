package Exercicio_18;

import java.util.Scanner;

public class Quest_05 {
    /**
     * Faça um algoritmo para ler dois números inteiros e escrever o maior.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int n1, n2;
        
        System.out.println("Qual é o primeiro valor?");
        n1 = ler.nextInt();
        System.out.println("Qual é o segundo valor?");
        n2 = ler.nextInt();
        
        if(n1 > n2){
            System.out.println("N1 é maior que N2: " +n1);
        }else{
            System.out.println("N2 é maior que N1: " +n2);
        }
    }
    
}
