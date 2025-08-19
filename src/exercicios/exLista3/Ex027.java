//27. O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de 1,99 e agora
//possui uma loja de conveniências. Faça um programa que implemente uma caixa
//registradora rudimentar. O programa deverá receber um número desconhecido de valores
//referentes aos preços das mercadorias. Um valor zero deve ser informado pelo operador para
//indicar o final da compra. O programa deve então mostrar o total da compra e perguntar o
//valor em dinheiro que o cliente forneceu, para então calcular e mostrar o valor do troco.
//Após esta operação, o programa deverá voltar ao ponto inicial, para registrar a próxima
//compra.

package exercicios.exLista3;

import java.util.Scanner;

public class Ex027 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        while (true) {
        System.out.println("=".repeat(50));
        System.out.println("Digite 0 para finalizar a compra");
        System.out.println("=".repeat(50));
            double total = 0.0;
            int contador = 1;

            while (true) {
                System.out.print("Produto " + contador + ": R$ ");
                double preco = entrada.nextDouble();

                if (preco == 0) {
                    break;
                }

                total += preco;
                contador++;
            }

            System.out.println("Total: R$ " + String.format("%.2f", total));

            double dinheiro;
            do {
                System.out.print("Dinheiro: R$ ");
                dinheiro = entrada.nextDouble();

                if (dinheiro < total) {
                    System.out.println("Valor insuficiente! Faltam R$ " + String.format("%.2f", (total - dinheiro)));
                }
            } while (dinheiro < total);

            double troco = dinheiro - total;
            System.out.println("Troco: R$ " + String.format("%.2f", troco));
            System.out.println();
        }
    }
}