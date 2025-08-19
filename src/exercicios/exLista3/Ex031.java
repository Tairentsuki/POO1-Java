//31. Faça um programa que leia dez conjuntos de dois valores, o primeiro representando o
//número do aluno e o segundo representando a sua altura em centímetros. Encontre o aluno
//mais alto e o mais baixo. Mostre o número do aluno mais alto e o número do aluno mais
//baixo, junto com suas alturas.

package exercicios.exLista3;

import java.util.Scanner;

public class Ex031 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Registro de Alturas dos Alunos");

        int numeroMaisAlto = 0, numeroMaisBaixo = 0;
        double maiorAltura = Double.MIN_VALUE, menorAltura = Double.MAX_VALUE;

        for (int contador = 1; contador <= 10; contador++) {
            System.out.printf("Aluno %d:%n", contador);
            System.out.print("Numero do aluno: ");
            int numeroAluno = entrada.nextInt();

            System.out.print("Altura (em cm): ");
            double altura = entrada.nextDouble();

            if (altura > maiorAltura) {
                maiorAltura = altura;
                numeroMaisAlto = numeroAluno;
            }

            if (altura < menorAltura) {
                menorAltura = altura;
                numeroMaisBaixo = numeroAluno;
            }

            System.out.println();
        }

        System.out.println("=== RESULTADO ===");
        System.out.printf("Aluno mais alto: Numero %d - %.2f cm\n", numeroMaisAlto, maiorAltura);
        System.out.printf("Aluno mais baixo: Numero %d - %.2f cm\n", numeroMaisBaixo, menorAltura);

        entrada.close();
    }
}