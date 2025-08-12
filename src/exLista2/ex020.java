package exLista2;

import java.util.Scanner;

public class ex020 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um ano com 4 dígitos: ");
        int ano = entrada.nextInt();

        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

        if (bissexto) {
            System.out.println(ano + " é bissexto.");
        } else {
            System.out.println(ano + " não é bissexto.");
        }
    }
}
