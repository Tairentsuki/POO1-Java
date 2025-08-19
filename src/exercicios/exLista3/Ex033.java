//33. Faça um programa que receba o valor de uma dívida e mostre uma tabela com os seguintes
//dados: valor da dívida, valor dos juros, quantidade de parcelas e valor da parcela.
//Os juros e a quantidade de parcelas seguem a tabela abaixo:
//Quantidade de Parcelas % de Juros sobre o valor inicial da dívida
//1 0
//3 10
//6 15
//9 20
//12 25

package exercicios.exLista3;

import java.util.Scanner;

public class Ex033 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor da divida: R$ ");
        double valorDivida = entrada.nextDouble();

        int[] parcelas = {1, 3, 6, 9, 12};
        int[] percentualJuros = {0, 10, 15, 20, 25};

        System.out.println("\nValor da Divida | Valor dos Juros | Quantidade de Parcelas | Valor da Parcela");
        System.out.println("=".repeat(80));

        for (int contador = 0; contador < parcelas.length; contador++) {
            double juros = valorDivida * percentualJuros[contador] / 100;
            double valorTotal = valorDivida + juros;
            double valorParcela = valorTotal / parcelas[contador];

            System.out.printf("R$ %12.2f | R$ %12.2f | %22d | R$ %11.2f%n",
                    valorTotal, juros, parcelas[contador], valorParcela);
        }

        entrada.close();
    }
}