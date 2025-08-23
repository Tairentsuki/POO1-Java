//5. Faça um Programa que leia 20 números inteiros e armazene-os num vetor. Armazene os
//números pares no vetor PAR e os números IMPARES no vetor impar. Imprima os três
//vetores.

package exercicios.exLista4;

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int QNT_NUMEROS = 20;

        int[] numeros = new int[QNT_NUMEROS];
        int qnt_pares = 0;
        int qnt_impares = 0;

        for (int contador = 0; contador < QNT_NUMEROS; contador++) {
            try {
                System.out.printf("Digite o %d° número inteiro: ", (contador + 1));
                numeros[contador] = entrada.nextInt();
//                numeros[contador] = (int) (Math.random()*100); // Aleatório para testes
                if (numeros[contador] % 2 == 0) {
                    qnt_pares++;
                } else {
                    qnt_impares++;
                }

            } catch (Exception e) {
                entrada.nextLine();
                System.out.println("Entrada inválida, porta favor digite um número inteiro. Tente novamente.");
                contador--;
            }
        }


        int[] numeros_pares = new int[qnt_pares];
        int[] numeros_impares = new int[qnt_impares];
        int aux_pares = 0;
        int aux_impares = 0;

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                numeros_pares[aux_pares] = numero;
                aux_pares++;
            } else {
                numeros_impares[aux_impares] = numero;
                aux_impares++;
            }
        }

        System.out.println("\n\nVetor completo");
        for (int numero : numeros) {
            System.out.printf("%d ", numero);
        }

        System.out.println("\n\nVetor de pares");
        for (int numero : numeros_pares) {
            System.out.printf("%d ", numero);
        }

        System.out.println("\n\nVetor de impares");
        for (int numero : numeros_impares) {
            System.out.printf("%d ", numero);
        }
    }
}