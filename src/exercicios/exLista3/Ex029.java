//29. Desenvolva um programa que faça a tabuada de um número qualquer inteiro que será
//digitado pelo usuário, mas a tabuada não deve necessariamente iniciar em 1 e terminar em
//10, o valor inicial e final devem ser informados também pelo usuário.
//Obs: Você deve verificar se o usuário não digitou o final menor que o inicial.

package exercicios.exLista3;

import java.util.Scanner;

public class Ex029 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Montar a tabuada de: ");
        int numero = entrada.nextInt();

        int inicio, fim;
        do {
            System.out.print("Comecar por: ");
            inicio = entrada.nextInt();

            System.out.print("Terminar em: ");
            fim = entrada.nextInt();

            if (fim < inicio) {
                System.out.println("O valor final nao pode ser menor que o inicial. Tente novamente.");
            }
        } while (fim < inicio);

        System.out.printf("Vou montar a tabuada de %d comecando em %d e terminando em %d:%n", numero, inicio, fim);

        for (int contador = inicio; contador <= fim; contador++) {
            int resultado = numero * contador;
            System.out.printf("%d x %d = %d%n", numero, contador, resultado);
        }

        entrada.close();
    }
}