package exLista2;

import java.util.Scanner;

public class ex025 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do saque (10 a 600): R$ ");
        int valor = entrada.nextInt();

        if (valor < 10 || valor > 600) {
            System.out.println("Valor inválido para saque.");
            return;
        }

        int restante = valor;

        int notas100 = restante / 100;
        restante %= 100;

        int notas50 = restante / 50;
        restante %= 50;

        int notas10 = restante / 10;
        restante %= 10;

        int notas5 = restante / 5;
        restante %= 5;

        int notas1 = restante;

        System.out.println("Notas para sacar R$ " + valor + ":");
        if (notas100 > 0) System.out.println(notas100 + " nota(s) de 100");
        if (notas50 > 0) System.out.println(notas50 + " nota(s) de 50");
        if (notas10 > 0) System.out.println(notas10 + " nota(s) de 10");
        if (notas5 > 0) System.out.println(notas5 + " nota(s) de 5");
        if (notas1 > 0) System.out.println(notas1 + " nota(s) de 1");
    }
}
