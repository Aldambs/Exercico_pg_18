package Exercicio_18;

import java.util.Scanner;

public class Quest_09 {
    /**
     * Faça um algoritmo para ler três valores reais e informar se estes podem 
     * ou não formar os lados de um triângulo. Para que três valores possam 
     * formar os lados de um triângulo cada lado deve ser menor que a soma dos
     * outros dois.
     */
    public static void main(String[] args) {
       Scanner ent = new Scanner(System.in);
       double x, y, z;
       
        System.out.println("DIGITE O VALOR DE X:");
        x = ent.nextDouble();
        System.out.println("DIGITE O VALOR DE Y:");
        y = ent.nextDouble();
        System.out.println("DIGITE O VALOR DE Z:");
        z = ent.nextDouble();
       
        if((y + z) > x && (y + x)> z && (x + z) > y){
            System.out.println("Forma um triângulo!");
        }else{
            System.out.println("Não forma um triângulo!");
        }
    } 
}
