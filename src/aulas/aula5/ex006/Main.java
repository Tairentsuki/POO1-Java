package aulas.aula5.ex006;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== QUADRADO ===");
        System.out.print("Digite o tamanho do lado: ");
        double lado = scanner.nextInt();

        Quadrado quadrado = new Quadrado(lado);

        System.out.printf("Lado: %.2f\n", quadrado.retornarLado());
        System.out.printf("Área: %.2f\n", quadrado.calcularArea());

        scanner.close();
    }
}
