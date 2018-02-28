package Exercicio_18;

import java.util.Scanner;

public class Quest_10 {
    /**
     * Faça um algoritmo para ler três valores reais e informar se estes podem 
     * ou não formar os lados de um triângulo e qual tipo de triângulo seria: 
     * Eqüilátero, isósceles ou Escalenos.
     */
    public static void main(String[] args) {
       Scanner ler = new Scanner (System.in);
       float a, b, c;
       
        System.out.println("Digite o valor de a:");
        a = ler.nextFloat();
        System.out.println("Digite o valor de b:");
        b = ler.nextFloat();
        System.out.println("Digite o valor de c:");
        c = ler.nextFloat();
        
        if(((b + c) > a && (b + a)> c && (a + c) > b)){
            if((a == b) && (a == c) && (b == c)){
                System.out.println("Forma um triângulo equilátero!");
            }else{
                if((a == b) || (a == c) || (b == c)){
                    System.out.println("Forma um triângulo isósceles");  
                }else{
                    System.out.println("Forma um triângulo escaleno");
                }
                
            }           
        }
    }
    
}
