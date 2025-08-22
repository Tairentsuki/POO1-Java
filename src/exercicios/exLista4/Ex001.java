//1. Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.
package exercicios.exLista4;

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int TAM_VETOR = 5;

        int[] numeros = new int[TAM_VETOR];

        for(int contador = 0; contador < TAM_VETOR; contador++){
            System.out.print("Digite o " + (contador+1) + "° número do vetor: ");
            numeros[contador] = entrada.nextInt();
        }

        for(int n : numeros){
            System.out.println(n);
        }
    }
}
