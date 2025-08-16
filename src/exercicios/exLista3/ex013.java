//13. Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
//Ex.: 5!=5.4.3.2.1=120

package exercicios.exLista3;

import java.util.Scanner;

public class ex013{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int n = entrada.nextInt();

        System.out.printf("%d! = ", n);
        int contador;
        for(contador = n; contador > 1; contador--){
            n *= contador-1;
            System.out.printf(" %d x", (contador));
        }
        System.out.printf(" %d = %d", contador, n);

    }
}