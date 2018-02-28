package Exercicio_18;

import java.util.Scanner;

public class Quest_04 {
    /**
     * Faça um algoritmo para ler dois número inteiro A e B informar se A é 
     * divisivel por B.
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int A, B;
        
        System.out.println("Escreva o primeiro número:");
        A = ent.nextInt();
        System.out.println("Escreva o segundo número:");
        B = ent.nextInt();
        
        if(A % B == 0){
            System.out.println("A divisivel por B");
        }else{
            System.out.println("A não é divisivel por B"); 
        }
    }
}
