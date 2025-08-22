package aulas.aula3;

import java.util.Scanner;

public class VetorExemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int TAMANHO_VETOR = 10;
        int[] numeros = new int [TAMANHO_VETOR];
        int soma = 0;
        int maiorNumero = 0;
        int menorNumero = 0;

        for (int i = 0; i < TAMANHO_VETOR; i++){
            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];

            if(numeros[i] > maiorNumero || i == 0){
                maiorNumero = numeros[i];
            }

            if(numeros[i] < menorNumero || i == 0){
                menorNumero = numeros[i];
            }
        }

        double media = soma / (double) TAMANHO_VETOR;
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Menor número: " + menorNumero);
        System.out.println("Maior número: " + maiorNumero);
        scanner.close();
    }
}
