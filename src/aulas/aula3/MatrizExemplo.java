package aulas.aula3;

import java.util.Scanner;

import java.util.Random;

public class MatrizExemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int LINHAS = 5;
        final int COLUNAS = 5;
        int[][] matriz = new int[LINHAS][COLUNAS];
        int soma = 0;
        int maior = 0;
        int menor = 0;

        for (int linha = 0; linha < LINHAS; linha++) {
            for (int coluna = 0; coluna < COLUNAS; coluna++) {
                System.out.printf("Digite um número para a matriz na posição [%d][%d]: ", linha, coluna);
                //matriz[linha][coluna] = scanner.nextInt();
                matriz[linha][coluna] = (int) (Math.random()*100)-50;
                System.out.println();
                soma += matriz[linha][coluna];

                if (matriz[linha][coluna] > maior || (linha == 0 && coluna == 0)) {
                    maior = matriz[linha][coluna];
                }
                if (matriz[linha][coluna] < menor || (linha == 0 && coluna == 0)) {
                    menor = matriz[linha][coluna];
                }
            }
        }

        System.out.println("=".repeat(50));
        for (int linha = 0; linha < LINHAS; linha++) {
            for (int coluna = 0; coluna < COLUNAS; coluna++) {
                if(matriz[linha][coluna] < 0){
                    System.out.printf(" | %03d | ", matriz[linha][coluna]);
                }else{
                    System.out.printf(" | %04d | ", matriz[linha][coluna]);
                }
            }
            System.out.println();
        }
        System.out.println("=".repeat(50));


        System.out.println("O maior número da matriz é: " + maior);
        System.out.println("O menor número da matriz é: " + menor);
    }
}
