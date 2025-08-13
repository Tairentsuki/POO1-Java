//1. Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor
//   seja inválido e continue pedindo até que o usuário informe um valor válido.

package exLista3;

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float nota;
        do {
            System.out.print("Digite uma nota (0-10): ");
            nota = entrada.nextFloat();
            if (nota < 0 || nota > 10) {
                System.out.println("\n" + nota + " é um valor inválido.");
                System.out.println("Por favor, insira uma nota de 0 a 10.\n");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Você digitou a nota " + nota);
    }
}
