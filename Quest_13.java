package Exercicio_18;

import java.util.Scanner;

public class Quest_13 {
    /**
     * Faça um algoritmo para ler um salário e atualizá-lo de acordo com a
     * tabela abaixo.   FAIXA      SALARIAL       AUMENTO
                        até          500,00         50%
                        500,01   a   1.000,00       40%
                        1000,01  a   2.000,00       30%
                        2000,01  a   2.500,00       20%
                        acima    de  2.500,00       10%
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        double salário, aumento = 0;
        
        System.out.println("Informe o salário:");
        salário = ler.nextDouble(); 
        
        if(salário <= 500){
            aumento = ((salário*50)/100)+ salário;
        }else{
            if((salário > 500) && (salário <= 1000)){
                aumento = ((salário*40)/100)+ salário;
            }else{
                if((salário > 1000) && (salário <= 2000)){
                    aumento = ((salário*30)/100)+ salário;
                }else{
                    if((salário > 2000) && (salário <= 2500)){
                        aumento = ((salário*20)/100)+ salário;
                    }else{
                        if(salário > 2500){
                            aumento = ((salário*10)/100)+ salário;
                        }
                    }
                }
            }
        }
        System.out.println("Atualizado para: " +aumento);
    }
    
}
