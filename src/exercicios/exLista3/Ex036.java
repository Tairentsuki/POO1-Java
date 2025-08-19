//36. Em uma eleição presidencial existem quatro candidatos. Os votos são informados por
//meio de código. Os códigos utilizados são:
//1 , 2, 3, 4 - Votos para os respectivos candidatos
//5  Voto Nulo
//6  Voto em Branco
//
//Faça um programa que calcule e mostre:
//O total de votos para cada candidato;
//O total de votos nulos;
//O total de votos em branco;
//A percentagem de votos nulos sobre o total de votos;
//A percentagem de votos em branco sobre o total de votos. Para finalizar o conjunto de votos
//tem-se o valor zero.

package exercicios.exLista3;

import java.util.Scanner;

public class Ex036 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== SISTEMA DE ELEICAO ===");
        System.out.println("1 - Jose Silva");
        System.out.println("2 - Joao Santos");
        System.out.println("3 - Maria Oliveira");
        System.out.println("4 - Ana Costa");
        System.out.println("5 - Voto Nulo");
        System.out.println("6 - Voto em Branco");
        System.out.println("0 - Finalizar votacao");
        System.out.println();

        int candidato1 = 0, candidato2 = 0, candidato3 = 0, candidato4 = 0;
        int votosNulos = 0, votosBrancos = 0;
        int totalVotos = 0;

        while (true) {
            System.out.print("Digite seu voto: ");
            int voto = entrada.nextInt();

            if (voto == 0) {
                break;
            }

            totalVotos++;

            switch (voto) {
                case 1:
                    candidato1++;
                    break;
                case 2:
                    candidato2++;
                    break;
                case 3:
                    candidato3++;
                    break;
                case 4:
                    candidato4++;
                    break;
                case 5:
                    votosNulos++;
                    break;
                case 6:
                    votosBrancos++;
                    break;
                default:
                    System.out.println("Voto invalido! Tente novamente.");
                    totalVotos--;
                    break;
            }
        }

        if (totalVotos > 0) {
            double percentualNulos = (double) votosNulos / totalVotos * 100;
            double percentualBrancos = (double) votosBrancos / totalVotos * 100;

            System.out.println("\n=== RESULTADO DA ELEICAO ===");
            System.out.printf("Jose Silva (1): %d votos\n", candidato1);
            System.out.printf("Joao Santos (2): %d votos\n", candidato2);
            System.out.printf("Maria Oliveira (3): %d votos\n", candidato3);
            System.out.printf("Ana Costa (4): %d votos\n", candidato4);
            System.out.printf("Votos Nulos: %d votos\n", votosNulos);
            System.out.printf("Votos em Branco: %d votos\n", votosBrancos);
            System.out.printf("Total de votos: %d\n", totalVotos);
            System.out.printf("Percentual de votos nulos: %.2f%% \n", percentualNulos);
            System.out.printf("Percentual de votos em branco: %.2f%%\n", percentualBrancos);
        } else {
            System.out.println("Nenhum voto foi registrado.");
        }

        entrada.close();
    }
}