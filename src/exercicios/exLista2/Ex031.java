package exercicios.exLista2;

import java.util.Scanner;

public class Ex031 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantidade de morangos (Kg): ");
        double morango = entrada.nextDouble();

        System.out.print("Quantidade de maçãs (Kg): ");
        double maca = entrada.nextDouble();

        double precoMorango = morango <= 5 ? 2.50 : 2.20;
        double precoMaca = maca <= 5 ? 1.80 : 1.50;

        double totalMorango = morango * precoMorango;
        double totalMaca = maca * precoMaca;

        double totalCompra = totalMorango + totalMaca;

        if (morango + maca > 8 || totalCompra > 25) {
            totalCompra *= 0.9;
        }

        System.out.printf("Total a pagar: R$ %.2f\n", totalCompra);
    }
}
