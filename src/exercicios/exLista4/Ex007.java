//7. Faça um Programa que leia um vetor de 5 números inteiros, mostre a soma, a multiplicação
//e os números.

package exercicios.exLista4;

import java.util.Scanner;

public class Ex007{
    public static void main(String[] args){
        final int TAM_VETOR = 5;

        int[] numeros = new int[TAM_VETOR];
        int somatorio = 0;
        int produtorio = 1;

        Scanner entrada = new Scanner(System.in);
        for(int contador = 0; contador < TAM_VETOR; contador++){
            try{

            System.out.printf("Digite o %d° número: ", (contador+1));
            numeros[contador] = entrada.nextInt();
            somatorio += numeros[contador];
            produtorio *= numeros[contador];
            } catch (Exception e) {
                entrada.nextLine();
                System.out.println("Por favor, digite um número inteiro. Tente novamente.");
            }
        }
        entrada.close();

        System.out.println("Números digitados: ");
        for(int numero : numeros){
            System.out.printf("| %d | ", numero);
        }
        System.out.println();
        System.out.println("Somatório: " + somatorio);
        System.out.println("Produtório: " + produtorio);
    }
}