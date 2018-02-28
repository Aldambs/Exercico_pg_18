package Exercicio_18;

import java.util.Scanner;

public class Quest_11 {
    /**
     * Faça um algoritmo para ler três números positivos e escrevê-los em ordem 
     * crescente.
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
        byte n1, n2, n3;
        
        System.out.println("Digite o primeiro número:");
        n1 = ent.nextByte();
        System.out.println("Digite o segundo número:");
        n2 = ent.nextByte();
        System.out.println("Digite o terceiro número:");
        n3 = ent.nextByte();
        
        if((n1 > 0) && (n2 > 0) && (n3 > 0)){
            if((n1 < n2) && (n2 < n3)){
                System.out.println(n1 + "," +n2+ "," +n3);
            }else{
               if((n1 < n3) && (n3 < n2)){
                   System.out.println(n1 + "," +n3+ "," +n2);
               }else{
                   if((n2 < n1) && (n1 < n3)){
                       System.out.println(n2 + "," +n1+ "," +n3);
                   }else{
                       if((n2 < n3) && (n3 < n1)){
                           System.out.println(n2 + "," +n3+ "," +n1);
                       }else{
                           if((n3 < n1) && (n1 < n2)){
                               System.out.println(n3 + "," +n1+ "," +n2);
                           }else{
                               System.out.println(n3 + "," +n2+ "," +n1);
                           }
                       }
                   }
               }                   
            }     
        }
    }
    
}
