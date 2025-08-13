package exercicios.exLista2;

import java.util.Scanner;

public class ex019 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = entrada.nextDouble();

        if (a == 0) {
            System.out.println("Não é uma equação do segundo grau.");
            return;
        }

        System.out.print("Digite o valor de B: ");
        double b = entrada.nextDouble();

        System.out.print("Digite o valor de C: ");
        double c = entrada.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else if (delta == 0) {
            double raiz = -b / (2 * a);
            System.out.printf("A equação possui uma raiz real: %.2f\n", raiz);
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("A equação possui duas raízes reais: %.2f e %.2f\n", raiz1, raiz2);
        }
    }
}
