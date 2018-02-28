package Exercicio_18;

import java.util.Scanner;

public class Quest_12 {
    /**
     * Faça um algoritmo para ler o nome, as três notas e o número de faltas de
     * um aluno e escrever qual a sua situação final: Aprovado, Reprovado por 
     * Falta ou Reprovado por Média. A média para aprovação é 5,0 e o limite de 
     * faltas é 27. A reprovação por falta sobrepõe a reprovação por Média.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        float not1, not2, not3, media;
        int falt;
        String nome;
        
        System.out.println("Informe o nome do aluno:");
        nome = ler.nextLine();
        System.out.println("Informe a 1° nota:");
        not1 = ler.nextFloat();
        System.out.println("Informe a 2° nota:");
        not2 = ler.nextFloat();
        System.out.println("Informe a 3° nota:");
        not3 = ler.nextFloat();
        System.out.println("Informe o número de faltas:");
        falt = ler.nextInt();
        
        media = (not1 + not2 + not3)/3;
        
        if(media >=  5){          
                System.out.println("Aluno:" +nome);
                System.out.println("Média:" +media);
                System.out.println("ESTA APROVADO!");
            }else if (falt > 27){
                System.out.println("Aluno:" +nome);
                System.out.println("Média:" +media);
                System.out.println("ESTA REPROVADO POR FALTA!");
                
        }else{
            System.out.println("Aluno:" +nome);
            System.out.println("Média:" +media);
            System.out.println("ESTA REPROVADO POR MÉDIA!");
   
        }
    }
}

