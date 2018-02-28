package Exercicio_18;

import java.util.Scanner;

public class Quest_01 {
    /**
     * Faça um algoritmo para ler um número inteiro e inferior se este é 
     * maior que 10.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        byte num;
        
        System.out.println("Digite o número:");
        num = ler.nextByte();
        
        if (num > 10){
            System.out.println("O valor digitado é maior: " +num);
        }else{
            System.out.println("O valor digitado é menor: " +num);     
        }
    }
}
