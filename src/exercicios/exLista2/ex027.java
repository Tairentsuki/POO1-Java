package exercicios.exLista2;

import java.util.Scanner;

public class ex027 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num = entrada.nextDouble();

        if (num == Math.floor(num)) {
            System.out.println("Número inteiro.");
        } else {
            System.out.println("Número decimal.");
        }
    }
}
