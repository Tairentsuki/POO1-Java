//24. Faça um programa que calcule o valor total investido por um colecionador em sua
//coleção de CDs e o valor médio gasto em cada um deles. O usuário deverá informar a
//quantidade de CDs e o valor para em cada um.

package exercicios.exLista3;

import java.util.Scanner;

public class Ex024 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de CDs: ");
        int quantidadeCds = entrada.nextInt();

        double valorTotal = 0.0;

        for (int i = 1; i <= quantidadeCds; i++) {
            System.out.print("Digite o valor do CD " + i + ": R$ ");
            double valorCd = entrada.nextDouble();
            valorTotal += valorCd;
        }

        double valorMedio = valorTotal / quantidadeCds;

        System.out.println("\nResultados:");
        System.out.println("Quantidade de CDs: " + quantidadeCds);
        System.out.println("Valor total investido: R$ " + String.format("%.2f", valorTotal));
        System.out.println("Valor medio por CD: R$ " + String.format("%.2f", valorMedio));

        entrada.close();
    }
}