package exercicios.exLista2;

import java.util.Scanner;

public class Ex016 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a média do aluno: ");
        double media = entrada.nextDouble();

        if (media < 0 || media > 10) {
            System.out.println("Média inválida");
        } else if (media < 3) {
            System.out.println("Reprovado");
        } else if (media < 7) {
            System.out.println("Em Exame");
        } else {
            System.out.println("Aprovado");
        }
    }
}
