//1. Faça um programa em Java que crie uma matriz de X linhas por X colunas e peça para o
//usuário informar os valores dos elementos desta matriz, após isto o programa deve analisar a
//matriz e encontrar o maior valor da matriz, menor valor da matriz, soma de todos os valores
//da matriz e média. Deve mostrar os valores em formato de matriz, ou seja, respeitando o
//número de linhas e colunas. Deve também mostrar uma saída dos valores em linha, um
//abaixo do outro, apresentando um gráfico usando o símbolo “#” para representar os valores,
//conforme exemplo abaixo.
//5: #####
//        3: ###
//        ...
//Não esqueça de montar um código que possa funcionar independente do número de linhas e
//colunas e a matriz sempre deve ser quadrada, ou seja, o número de linhas sempre será igual
//ao número de colunas. (10,0)
//Critérios de Avaliação
//Criação da matriz: (1,00)
//Leitura e armazenamento dos valores: (2,00)
//Maior: (1,00)
//Menor: (1,00)
//Soma: (1,00)
//Média: (1,00)
//Gráfico: (3,00)

package provas;

import java.util.Scanner;

public class Prova1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int LINHAS = 2;
        final int COLUNAS = 2;

        int[][] matriz = new int[LINHAS][COLUNAS];

        for (int linha = 0; linha < LINHAS; linha++) {
            for (int coluna = 0; coluna < COLUNAS; coluna++) {
                System.out.printf("Digite o valor da matriz na posição [%d][%d]: ", linha, coluna);
                matriz[linha][coluna] = entrada.nextInt();
            }
        }

        int soma = 0;
        double media;
        int maior = matriz[0][0];
        int menor = matriz[0][0];

        System.out.printf("\n| %s | %s |\n", "Col1", "Col2");

        for (int[] linha : matriz) {
            System.out.print("| ");
            for (int elemento : linha) {
                System.out.printf("%04d | ", elemento);
                soma += elemento;
                if(elemento > maior){
                    maior = elemento;
                }
                if(elemento < menor){
                    menor = elemento;
                }
            }
            System.out.println();
        }

        media = (double) soma / (LINHAS * COLUNAS);

        System.out.println();
        System.out.println(" Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        System.out.println();
        System.out.println("Gráfico");
        for(int[] linha : matriz){
            for(int elemento : linha){
                System.out.printf("%04d: %s\n", elemento, "#".repeat(elemento));
            }
        }
    }
}
