//13. Faça um Programa que leia dois vetores com 10 elementos cada. Gere um terceiro vetor de
//20 elementos, cujos valores deverão ser compostos pelos elementos intercalados dos dois
//outros vetores.

package exercicios.exLista4;

import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        final int TAM_VETOR1E2 = 10;
        final int TAM_VETOR3 = TAM_VETOR1E2 + TAM_VETOR1E2;

        String[] vetor1 = new String[TAM_VETOR1E2];
        String[] vetor2 = new String[TAM_VETOR1E2];
        String[] vetor3 = new String[TAM_VETOR3];

        for(int contador = 0; contador < TAM_VETOR1E2; contador++){
            System.out.printf("Digite o %d° elemento do vetor 1: ", (contador+1));
            vetor1[contador] = entrada.nextLine();
        }
        for(int contador = 0; contador < TAM_VETOR1E2; contador++){
            System.out.printf("Digite o %d° elemento do vetor 2: ", (contador+1));
            vetor2[contador] = entrada.nextLine();
        }
        for(int contador = 0; contador < TAM_VETOR1E2; contador++){
            vetor3[contador*2] = vetor1[contador];
            vetor3[contador*2+1] = vetor2[contador];
        }

        System.out.print("Vetor 3: ");
        for(String elemento : vetor3){
            System.out.printf(" %s ", elemento);
        }
    }
}
