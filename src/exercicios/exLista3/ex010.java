//10. Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro
//número elevado ao segundo número. Não utilize a função de potência da linguagem.

package exercicios.exLista3;

import java.util.Scanner;

public class ex010 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a base: ");
        double base = entrada.nextInt();
        System.out.print("Digite o expoente: ");
        double expoente = entrada.nextInt();

        double resultado = 1;
        for (double contador = 1; contador <= expoente; contador++){
            resultado *= base;
        }
        System.out.println("Resultado: " + resultado);
    }
}
