//26. O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende implantar a
//metodologia da tabelinha, que já é um sucesso na sua loja de 1,99. Você foi contratado para
//desenvolver o programa que monta a tabela de preços de pães, de 1 até 50 pães, a partir do
//preço do pão informado pelo usuário.

package exercicios.exLista3;

import java.util.Scanner;

public class Ex026 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Preço do pão: R$ ");
        double precoPao = entrada.nextDouble();

        System.out.println("Tabela de precos");

        for (int contador = 1; contador <= 50; contador++) {
            double valorTotal = contador * precoPao;
            System.out.printf("%03d: R$ %.2f%n", contador, valorTotal);
        }

        entrada.close();
    }
}