//14. Faça um programa que mostre os n termos da Série a seguir:
//        • S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m.

package exercicios.exLista3;

import java.util.Scanner;

public class Ex014 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite quantos números da série você deseja ver: ");
        int qnt = entrada.nextInt();

        for (int contador = 1; contador <= qnt; contador++) {
            int denominador = (2 * contador) - 1;
            double resultado = (double)  contador / denominador;

            System.out.println(contador + "° Termo: " + contador + "/" + denominador
                    + " | Resultado: " + resultado);
        }

        entrada.close();
    }
}