//37. Desenvolver um programa para verificar a nota do aluno em uma prova com 10
//questões, o programa deve perguntar ao aluno a resposta de cada questão e ao final
//comparar com o gabarito da prova e assim calcular o total de acertos e a nota (atribuir 1
//ponto por resposta certa). Após cada aluno utilizar o sistema deve ser feita uma pergunta se
//outro aluno vai utilizar o sistema. Após todos os alunos terem respondido informar:
//a. Maior e Menor Acerto;
//b. Total de Alunos que utilizaram o sistema;
//c. A Média das Notas da Turma.
//Gabarito da Prova:
//01  A
//02  B
//03  C
//04  D
//05  E
//06  E
//07  D
//08  C
//09  B
//10  A

package exercicios.exLista3;

import java.util.Scanner;

public class Ex037 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        char[] gabarito = {'A', 'B', 'C', 'D', 'E', 'E', 'D', 'C', 'B', 'A'};

        int maiorNota = 0, menorNota = 10;
        int totalAlunos = 0;
        int somaNotas = 0;

        while (true) {
            System.out.printf("=== ALUNO %d ====%n", (totalAlunos + 1));

            int acertos = 0;

            for (int contador = 1; contador <= 10; contador++) {
                System.out.printf("Questao %02d: ", contador);
                char resposta = entrada.next().charAt(0);
                resposta = Character.toUpperCase(resposta);

                if (resposta == gabarito[contador - 1]) {
                    acertos++;
                }
            }

            totalAlunos++;
            somaNotas += acertos;

            if (acertos > maiorNota) {
                maiorNota = acertos;
            }
            if (acertos < menorNota) {
                menorNota = acertos;
            }

            System.out.printf("Nota do aluno: %d/10\n", acertos);

            System.out.print("Outro aluno vai usar o sistema? (S/N): ");
            char continuar = entrada.next().charAt(0);
            continuar = Character.toUpperCase(continuar);

            if (continuar != 'S') {
                break;
            }

            System.out.println();
        }

        double mediaNotas = (double) somaNotas / totalAlunos;

        System.out.println("\n=== RELATORIO DA TURMA ===");
        System.out.printf("Maior acerto: %d pontos%n", maiorNota);
        System.out.printf("Menor acerto: %d pontos%n", menorNota);
        System.out.printf("Total de alunos: %d%n", totalAlunos);
        System.out.printf("Media da turma: %.2f pontos%n", mediaNotas);

        entrada.close();
    }
}