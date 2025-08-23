//6. Faça um Programa que peça as quatro notas de 10 alunos, calcule e armazene num vetor a
//média de cada aluno, imprima o número de alunos com média maior ou igual a 7.0.

package exercicios.exLista4;

import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        final int QNT_NOTAS = 4;
        final int QNT_ALUNOS = 10;

        double[] medias = new double[QNT_ALUNOS];
        int mediaMaiorOuIgualA7 = 0;

        Scanner entrada = new Scanner(System.in);

        for (int contador_alunos = 0; contador_alunos < QNT_ALUNOS; contador_alunos++) {
            double nota_aux = 0;
            for (int contador_notas = 0; contador_notas < QNT_NOTAS; contador_notas++) {
                System.out.printf("\nDigite a %d° nota do %d° aluno: ", (contador_notas + 1), (contador_alunos + 1));
                try {
                    //nota_aux += entrada.nextDouble();
                    nota_aux += Math.random()*10;
                } catch (Exception e) {
                    entrada.nextLine();
                    System.out.println("Por favor, digite apenas números reais ou inteiros. Tente novamente.");
                    contador_notas--;
                }
            }
            medias[contador_alunos] = nota_aux / QNT_NOTAS;
            System.out.printf("\nMédia do %d° aluno: %.2f\n", (contador_alunos+1), medias[contador_alunos]);
            if (medias[contador_alunos] >= 7) {
                mediaMaiorOuIgualA7++;
            }
        }

        entrada.close();
        System.out.println();
        for (double media : medias) {
            System.out.printf("  | %.2f |  ", media);
        }
        System.out.printf("\nQuantidade de médias maiores ou iguais a 7: %d. \nSendo elas: ", mediaMaiorOuIgualA7);
        for (double media : medias) {
            if(media >= 7){
            System.out.printf(" | %.2f | ", media);

            }
        }
    }
}