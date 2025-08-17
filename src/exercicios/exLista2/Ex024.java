package exercicios.exLista2;

import java.util.Scanner;

public class Ex024 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double n1 = entrada.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2 = entrada.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double n3 = entrada.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        if (media == 10) {
            System.out.println("Aprovado com Distinção! Média: " + media);
        } else if (media >= 7) {
            System.out.println("Aprovado. Média: " + media);
        } else {
            System.out.println("Reprovado. Média: " + media);
        }
    }
}
