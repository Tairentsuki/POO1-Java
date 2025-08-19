//23. Faça um programa que calcule o número médio de alunos por turma. Para isto, peça a
//quantidade de turmas e a quantidade de alunos para cada turma. As turmas não podem ter
//mais de 40 alunos.

package exercicios.exLista3;

import java.util.Scanner;

public class Ex023 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantidadeTurmas;
        do {
            System.out.print("Digite a quantidade de turmas: ");
            while (!entrada.hasNextInt()) {
                System.out.println("Digite apenas números inteiros. Tente novamente.");
                System.out.print("Digite a quantidade de turmas: ");
                entrada.next();
            }
            quantidadeTurmas = entrada.nextInt();
            if (quantidadeTurmas <= 0) {
                System.out.println("A quantidade de turmas deve ser maior que zero. Tente novamente.\n");
            }
        } while (quantidadeTurmas <= 0);

        int totalAlunos = 0;

        System.out.println("\nAgora informe a quantidade de alunos para cada turma:");
        System.out.println("(Lembre-se: máximo de 40 alunos por turma)\n");

        for (int i = 1; i <= quantidadeTurmas; i++) {
            int alunosTurma;
            do {
                System.out.printf("Turma %d - Digite a quantidade de alunos: ", i);
                while (!entrada.hasNextInt()) {
                    System.out.println("Digite apenas números inteiros. Tente novamente.");
                    System.out.printf("Turma %d - Digite a quantidade de alunos: ", i);
                    entrada.next();
                }
                alunosTurma = entrada.nextInt();

                if (alunosTurma < 0) {
                    System.out.println("A quantidade de alunos não pode ser negativa. Tente novamente.");
                } else if (alunosTurma > 40) {
                    System.out.println("Uma turma não pode ter mais de 40 alunos. Tente novamente.");
                } else if (alunosTurma == 0) {
                    System.out.println("Turma sem alunos cadastrada.");
                }

            } while (alunosTurma < 0 || alunosTurma > 40);

            totalAlunos += alunosTurma;
            System.out.printf("Turma %d: %d alunos cadastrados.\n\n", i, alunosTurma);
        }

        double media = (double) totalAlunos / quantidadeTurmas;

        System.out.println("=".repeat(50));
        System.out.println("RELATÓRIO FINAL");
        System.out.println("=".repeat(50));
        System.out.printf("Quantidade de turmas: %d%n", quantidadeTurmas);
        System.out.printf("Total de alunos: %d%n", totalAlunos);
        System.out.printf("Média de alunos por turma: %.2f%n", media);
        System.out.println("=".repeat(50));

        entrada.close();
    }

}