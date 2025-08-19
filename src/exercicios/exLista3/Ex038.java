//38. Faça um programa que peça um numero inteiro positivo e em seguida mostre este numero
//invertido.
//Exemplo:
//12376489
//=> 98467321

package exercicios.exLista3;

import java.util.Scanner;

public class Ex038 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero inteiro positivo: ");
        int numero = entrada.nextInt();

        int numeroInvertido = 0;
        int numeroOriginal = numero;

        while (numero > 0) {
            int digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero = numero / 10;
        }

        System.out.println(numeroOriginal + " => " + numeroInvertido);

        entrada.close();
    }
}