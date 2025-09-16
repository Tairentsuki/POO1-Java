package outrosEx;

import java.util.Scanner;

public class av {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int num = 5;

        int[][] matriz = new int[num][num];
        int maior = 0;
        int menor = 0;
        int soma = 0;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.println("Digite: ");
                matriz[i][j] = (int) (Math.random() * 100) - 50;
                if(matriz[i][j] < menor || (j==0 && i ==0)){
                    menor = matriz[i][j];
                }
                if(matriz[i][j] > maior || (j==0 && i ==0)){
                    maior = matriz[i][j];
                }
            }
        }


        int linhas = num;
        int colunas = num;

        System.out.print(" ");
        System.out.printf("=".repeat(maior+Math.abs(menor)+9));
        System.out.print("\n ");
        System.out.printf("=".repeat(maior+Math.abs(menor)+9));
        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < colunas; coluna++) {


                if(matriz[linha][coluna] > 0){
                    System.out.printf("\n ---| ", matriz[linha][coluna]);
                    System.out.print("-".repeat(Math.abs(menor)));
                }else{
                    System.out.printf("\n %03d| ", matriz[linha][coluna]);
                    System.out.print("-".repeat(Math.abs(menor)-Math.abs(matriz[linha][coluna])));

                }

                for (int contador = 1; contador <= Math.abs(matriz[linha][coluna]); contador++) {
                    System.out.print("#");
                }

                if(matriz[linha][coluna] > 0){
                    System.out.print("-".repeat(maior-matriz[linha][coluna]));
                    System.out.printf("|%03d", matriz[linha][coluna]);
                }

                if(matriz[linha][coluna]  <= 0){
                    System.out.print("-".repeat(maior));
                    System.out.print("|");
                    System.out.print("---");
                }
            }
        }

        System.out.print("\n ");
        System.out.printf("=".repeat(maior+Math.abs(menor)+9));
        System.out.print("\n ");
        System.out.printf("=".repeat(maior+Math.abs(menor)+9));
        matriz[0][0] = 0;

//        System.out.printf("\n\n\n\n\n");
//        System.out.println(matriz[0][1]);
//        for (int i = 0; i < num; i++) {
//            for (int j = 0; j < num; j++) {
//                System.out.print(matriz[i][j] + " : ");
//                while (matriz[i][j] != 0) {
//                    System.out.print("#");
//                    if (matriz[i][j] > 0) {
//                        matriz[i][j]--;
//                    }
//                    if (matriz[i][j] < 0) {
//                        matriz[i][j]++;
//                    }
//                }
//                System.out.println();
//            }
//        }


    }
}

