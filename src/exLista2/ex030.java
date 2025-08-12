package exLista2;

import java.util.Scanner;

public class ex030 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Número de litros vendidos: ");
        double litros = entrada.nextDouble();

        entrada.nextLine();
        System.out.print("Tipo de combustível (A-álcool, G-gasolina): ");
        String tipo = entrada.nextLine().toUpperCase();

        double precoLitro = 0;
        double descontoPorLitro = 0;

        if (tipo.equals("A")) {
            precoLitro = 1.90;
            if (litros <= 20) {
                descontoPorLitro = 0.03;
            } else {
                descontoPorLitro = 0.05;
            }
        } else if (tipo.equals("G")) {
            precoLitro = 2.50;
            if (litros <= 20) {
                descontoPorLitro = 0.04;
            } else {
                descontoPorLitro = 0.06;
            }
        } else {
            System.out.println("Tipo de combustível inválido.");
            return;
        }

        double precoTotal = precoLitro * litros;
        double desconto = precoTotal * descontoPorLitro;
        double valorAPagar = precoTotal - desconto;

        System.out.printf("Preço total: R$ %.2f\n", precoTotal);
        System.out.printf("Desconto: R$ %.2f\n", desconto);
        System.out.printf("Valor a pagar: R$ %.2f\n", valorAPagar);
    }
}
