package exercicios.exLista2;

import java.util.Scanner;

public class ex018 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o lado 1: ");
        double a = entrada.nextDouble();

        System.out.print("Digite o lado 2: ");
        double b = entrada.nextDouble();

        System.out.print("Digite o lado 3: ");
        double c = entrada.nextDouble();

        boolean formaTriangulo = (a + b > c) && (a + c > b) && (b + c > a);

        if (!formaTriangulo) {
            System.out.println("Os lados não formam um triângulo.");
        } else {
            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero.");
            } else if (a == b || b == c || a == c) {
                System.out.println("Triângulo Isósceles.");
            } else {
                System.out.println("Triângulo Escaleno.");
            }
        }
    }
}
