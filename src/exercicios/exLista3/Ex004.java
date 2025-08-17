//4. Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa
//anual de crescimento de 3% e que a população de B seja 200000 habitantes com uma taxa de
//crescimento de 1.5%. Faça um programa que calcule e escreva o número de anos necessários
//para que a população do país A ultrapasse ou iguale a população do país B, mantidas as
//taxas de crescimento. Altere o programa anterior permitindo ao usuário informar as
//populações e as taxas de crescimento iniciais. Valide a entrada e permita repetir a
//operação.

package exercicios.exLista3;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        double popA;
        do{
            System.out.print("Digite a população do país A: ");
            popA = entrada.nextDouble();
            if(popA <= 0){
                System.out.println("\nPor favor, digite um número maior que 0. \nTente novamente.");
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            }
        }while(popA <= 0);

        System.out.print("Digite a taxa de crescimento da população do país A (0-100)%: ");
        double taxaA = entrada.nextDouble()/100;

        double popB;
        do{
            System.out.print("Digite a população do país B: ");
            popB = entrada.nextDouble();
        }while(popB <= 0);

        System.out.print("Digite a taxa de crescimento da população do país B (0-100)%: ");
        double taxaB = entrada.nextDouble()/100;


        double log_a_div_b = Math.log(popB / popA);
        double log_taxaA_div_taxaB = Math.log((1 + taxaA) / (1 + taxaB));
        double anos = Math.ceil(log_a_div_b / log_taxaA_div_taxaB);
        System.out.println("Anos: " + anos);

/*
        int anos = 0;
        while (popA < popB){
            popA += popA*taxaA;
            popB += popB*taxaB;
            anos++;
            System.out.println("=-=-=-=-=-=-= Log =-=-=-=-=-=-=");
            System.out.println("CalculoTaxaA: " + popA);
            System.out.println("PopA: " + popA);
            System.out.println("PopB: " + popB);
            System.out.println("Anos" + anos);
            System.out.println("=-=-=-=-=-=-= Log =-=-=-=-=-=-=");
        }
*/

        System.out.println("Foram necessários "+ anos + " para a população do país A ultrapassar a população B");
        System.out.println("População do país A:" + (int) popA);
        System.out.println("Taxa de crescimento do país A:" + (int) popA);
        System.out.println("População do país B:" + (int) popB);
        System.out.println("Taxa de crescimento do país B:" + (int) popB);
    }
}