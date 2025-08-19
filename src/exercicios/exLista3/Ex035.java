//35. O cardápio de uma lanchonete é o seguinte:
//Especificação Código Preço
//Cachorro Quente 100 R$ 1,20
//Bauru Simples 101 R$ 1,30
//Bauru com ovo 102 R$ 1,50
//Hambúrguer 103 R$ 1,20
//Cheeseburguer 104 R$ 1,30
//Refrigerante 105 R$ 1,00
//
//Faça um programa que leia o código dos itens pedidos e as quantidades desejadas. Calcule e
//mostre o valor a ser pago por item (preço * quantidade) e o total geral do pedido. Considere
//que o cliente deve informar quando o pedido deve ser encerrado.

package exercicios.exLista3;

import java.util.Scanner;

public class Ex035 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== LANCHONETE ===");
        System.out.println("100 - Cachorro Quente - R$ 1,20");
        System.out.println("101 - Bauru Simples - R$ 1,30");
        System.out.println("102 - Bauru com ovo - R$ 1,50");
        System.out.println("103 - Hamburguer - R$ 1,20");
        System.out.println("104 - Cheeseburguer - R$ 1,30");
        System.out.println("105 - Refrigerante - R$ 1,00");
        System.out.println("0 - Finalizar pedido");
        System.out.println();

        double totalGeral = 0.0;

        while (true) {
            System.out.print("Digite o codigo do item (0 para finalizar): ");
            int codigo = entrada.nextInt();

            if (codigo == 0) {
                break;
            }

            System.out.print("Digite a quantidade: ");
            int quantidade = entrada.nextInt();

            double preco;
            String item;

            switch (codigo) {
                case 100:
                    preco = 1.20;
                    item = "Cachorro Quente";
                    break;
                case 101:
                    preco = 1.30;
                    item = "Bauru Simples";
                    break;
                case 102:
                    preco = 1.50;
                    item = "Bauru com ovo";
                    break;
                case 103:
                    preco = 1.20;
                    item = "Hamburguer";
                    break;
                case 104:
                    preco = 1.30;
                    item = "Cheeseburguer";
                    break;
                case 105:
                    preco = 1.00;
                    item = "Refrigerante";
                    break;
                default:
                    System.out.println("Codigo invalido!");
                    continue;
            }

            double valorItem = preco * quantidade;
            totalGeral += valorItem;

            System.out.printf("%s - Quantidade: %d - Valor: R$ %.2f\n", item, quantidade, valorItem);
            System.out.println();
        }

        System.out.printf("TOTAL GERAL DO PEDIDO: R$ %.2f\n", totalGeral);

        entrada.close();
    }
}