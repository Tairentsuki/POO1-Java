//11. Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de
//números pares e a quantidade de números impares.

package exercicios.exLista3;

import java.util.Scanner;

public class ex011 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int quantidade_de_numeros = 10;

        int qnt_pares = 0;
        int qnt_impares = 0;
        int n;

        for (int contador = 1; contador <= quantidade_de_numeros; contador++) {
            System.out.printf("Digite o %d° número: ", contador);
            n = entrada.nextInt();

            qnt_pares += n % 2 == 0 ? 1 : 0;
            qnt_impares += n % 2 == 1 ? 1 : 0;
        }

        System.out.printf("\nVocê digitou %d números pares", qnt_pares);
        System.out.printf("\nVocê digitou %d números ímpares", qnt_impares);

    }
}
