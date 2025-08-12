package exLista2;

import java.util.Scanner;

public class ex022 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro menor que 1000: ");
        int num = entrada.nextInt();

        if (num < 0 || num >= 1000) {
            System.out.println("Número inválido.");
            return;
        }

        int centenas = num / 100;
        int dezenas = (num % 100) / 10;
        int unidades = num % 10;

        System.out.print(num + " = ");
        if (centenas > 0) System.out.print(centenas + " centena" + (centenas > 1 ? "s" : "") + ", ");
        if (dezenas > 0) System.out.print(dezenas + " dezena" + (dezenas > 1 ? "s" : "") + " e ");
        System.out.print(unidades + " unidade" + (unidades > 1 ? "s" : "") + "\n");
    }
}
