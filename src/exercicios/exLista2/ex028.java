package exercicios.exLista2;

import java.util.Scanner;

public class ex028 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = entrada.nextDouble();

        entrada.nextLine();

        System.out.print("Qual operação deseja realizar? (+, -, *, /): ");
        String op = entrada.nextLine();

        double resultado = 0;
        boolean valido = true;

        switch (op) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Divisão por zero não é permitida.");
                    valido = false;
                } else {
                    resultado = num1 / num2;
                }
                break;
            default:
                System.out.println("Operação inválida.");
                valido = false;
        }

        if (valido) {
            System.out.println("Resultado: " + resultado);

            if (resultado % 2 == 0) {
                System.out.println("O resultado é par.");
            } else {
                System.out.println("O resultado é ímpar.");
            }

            if (resultado > 0) {
                System.out.println("O resultado é positivo.");
            } else if (resultado < 0) {
                System.out.println("O resultado é negativo.");
            } else {
                System.out.println("O resultado é zero.");
            }

            if (resultado == Math.floor(resultado)) {
                System.out.println("O resultado é inteiro.");
            } else {
                System.out.println("O resultado é decimal.");
            }
        }
    }
}
