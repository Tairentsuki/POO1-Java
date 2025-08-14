//8. Altere o programa anterior para mostrar no final a soma dos números.

package exercicios.exLista3;

import java.util.Scanner;

public class ex008 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o 1° número: ");
        int n1 = entrada.nextInt();
        System.out.print("Digite o 2° número: ");
        int n2 = entrada.nextInt();

        int soma = 0;
        int valor_inicial = Math.min(n1, n2);
        int valor_final = Math.max(n1, n2);

        for(int contador = valor_inicial; contador <= valor_final; contador++){
            System.out.println(contador);
            soma += contador;
        }

        System.out.printf("A soma dos números que estão no intervalo de %d à %d é %d", valor_inicial, valor_final, soma);
    }
}