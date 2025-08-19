//34. Faça um programa que leia uma quantidade indeterminada de números positivos e conte
//quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada
//de dados deverá terminar quando for lido um número negativo.

package exercicios.exLista3;

import java.util.Scanner;

public class Ex034 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite numeros positivos (numero negativo para sair):");

        int intervalo0ao25 = 0;
        int intervalo26ao50 = 0;
        int intervalo51ao75 = 0;
        int intervalo76ao100 = 0;
        int foraIntervalo = 0;

        while (true) {
            System.out.print("Digite um numero: ");
            int numero = entrada.nextInt();

            if (numero < 0) {
                break;
            }

            if (numero <= 25) {
                intervalo0ao25++;
            } else if (numero <= 50) {
                intervalo26ao50++;
            } else if (numero <= 75) {
                intervalo51ao75++;
            } else if (numero <= 100) {
                intervalo76ao100++;
            } else {
                foraIntervalo++;
            }
        }

        System.out.println("\n=== CONTAGEM POR INTERVALOS ===");
        System.out.printf("Numeros no intervalo [0-25]: %d\n", intervalo0ao25);
        System.out.printf("Numeros no intervalo [26-50]: %d\n", intervalo26ao50);
        System.out.printf("Numeros no intervalo [51-75]: %d\n", intervalo51ao75);
        System.out.printf("Numeros no intervalo [76-100]: %d\n", intervalo76ao100);
        System.out.printf("Numeros fora dos intervalos: %d\n", foraIntervalo);

        entrada.close();
    }
}