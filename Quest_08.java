package Exercicio_18;

import java.util.Scanner;

public class Quest_08 {
    /**
     * Faça um algoritmo para ler os coeficiente de uma equação do segundo grau
     * e escrever as suas raízes. Sabe - se que delta = b^2 -4 *a * c e suas raizes 
     * x1 = -b + raiz delta / 2 * a e x2 = -b - raiz delta / 2 * a
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
        double a, b, c, x1, x2, delta;
        
        System.out.println("Digite o valor de a:");
        a = ent.nextDouble();
        System.out.println("Digite o valor de b:");
        b = ent.nextDouble();
        System.out.println("Digite o valor de c:");
        c = ent.nextDouble();
        
        delta = (b*b) - 4 *a * c;
        
        if(delta > 0){
            x1 = (-b + Math.sqrt(delta))/ 2 * a;
            x2 = (-b - Math.sqrt(delta))/ 2 * a;
            System.out.println("O valor da raiz é:\n" +x1);
            System.out.println("O valor da raiz é:\n" +x2);
        }else{
            if(delta < 0){
                x1 = (-b )/ 2 * a;
                System.out.println("O valor da raiz é:\n" +x1);
            }else{
                System.out.println("Não existe raiz real!");
            }
        }
    }
    
}
