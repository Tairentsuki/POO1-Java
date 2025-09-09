package exercicios.exLista6.ex005;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cardapio cardapio = new Cardapio();
        cardapio.declararItens();
        double totalPedido = 0;

        System.out.println("=== LANCHONETE ===");
        while (true) {
            System.out.print("Digite o código (0 para sair): ");
            int codigo = scanner.nextInt();
            if (codigo == 0) break;

            System.out.print("Digite a quantidade: ");
            int quantidade = scanner.nextInt();

            double preco = cardapio.buscarPreco(codigo);
            if (preco > 0) {
                double valorItem = preco * quantidade;
                totalPedido += valorItem;
                System.out.printf("Valor do item: R$ %.2f\n", valorItem);
            } else {
                System.out.println("Código inválido!");
            }
        }
        System.out.printf("Total geral: R$ %.2f\n", totalPedido);
        scanner.close();
    }
}