package exercicios.exLista2;

import java.util.Scanner;

public class ex017 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();

        double media = (nota1 + nota2) / 2;

        String conceito;
        if (media >= 9 && media <= 10) {
            conceito = "A";
        } else if (media >= 7.5) {
            conceito = "B";
        } else if (media >= 6) {
            conceito = "C";
        } else if (media >= 4) {
            conceito = "D";
        } else if (media >= 0) {
            conceito = "E";
        } else {
            conceito = "Inválido";
        }

        System.out.printf("Notas: %.2f e %.2f\n", nota1, nota2);
        System.out.printf("Média: %.2f\n", media);
        System.out.println("Conceito: " + conceito);

        if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
            System.out.println("APROVADO");
        } else if (conceito.equals("D") || conceito.equals("E")) {
            System.out.println("REPROVADO");
        }
    }
}
