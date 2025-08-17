//7. Faça um programa que receba dois números inteiros e gere os números inteiros que estão
//no intervalo compreendido por eles.

package exercicios.exLista3;

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o 1° número: ");
        int n1 = entrada.nextInt();
        System.out.print("Digite o 2° número: ");
        int n2 = entrada.nextInt();

        int valor_inicial = Math.min(n1, n2);
        int valor_final = Math.max(n1, n2);

        for(int contador = valor_inicial; contador <= valor_final; contador++){
            System.out.println(contador);
        }
    }
}