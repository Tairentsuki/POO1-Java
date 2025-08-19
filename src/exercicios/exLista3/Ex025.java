//25. O Sr. Manoel Joaquim possui uma grande loja de artigos de R$ 1,99, com cerca de 10
//caixas. Para agilizar o cálculo de quanto cada cliente deve pagar ele desenvolveu um tabela
//que contém o número de itens que o cliente comprou e ao lado o valor da conta. Desta forma
//a atendente do caixa precisa apenas contar quantos itens o cliente está levando e olhar na
//tabela de preços. Você foi contratado para desenvolver o programa que monta esta tabela de
//preços, que conterá os preços de 1 até 50 produtos.

package exercicios.exLista3;

public class Ex025 {
    public static void main(String[] args) {
        double precoUnitario = 1.99;

        System.out.println("Tabela de precos");

        for (int contador = 1; contador <= 50; contador++) {
            double valorTotal = contador * precoUnitario;
            System.out.printf("%03d Item: R$ %.2f%n", contador, valorTotal);
        }
    }
}