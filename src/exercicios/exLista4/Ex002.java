//2. Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa a
//ordem lida.

package exercicios.exLista4;

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        final int TAM_VETOR = 10;
        double[] vetor = new double[TAM_VETOR];

        for(int contador = 0; contador < TAM_VETOR; contador++){
            System.out.print("Digite o " + (contador+1) + "° número: ");
            vetor[contador] = entrada.nextDouble();
        }

        for(int contador = TAM_VETOR-1; contador >= 0; contador--){
            System.out.println(vetor[contador]);
        }

    }
}