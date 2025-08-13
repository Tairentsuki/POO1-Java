package exercicios.exLista2;

import java.util.Scanner;

public class ex032 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Tipo de carne (F-File Duplo, A-Alcatra, P-Picanha): ");
        String tipo = entrada.nextLine().toUpperCase();

        System.out.print("Quantidade em Kg: ");
        double qtd = entrada.nextDouble();

        entrada.nextLine();
        System.out.print("Pagamento com cartão Tabajara? (S/N): ");
        String cartao = entrada.nextLine().toUpperCase();

        double precoKg;
        String nomeCarne;

        switch (tipo) {
            case "F":
                nomeCarne = "Filé Duplo";
                precoKg = qtd <= 5 ? 4.90 : 5.80;
                break;
            case "A":
                nomeCarne = "Alcatra";
                precoKg = qtd <= 5 ? 5.90 : 6.80;
                break;
            case "P":
                nomeCarne = "Picanha";
                precoKg = qtd <= 5 ? 6.90 : 7.80;
                break;
            default:
                System.out.println("Tipo de carne inválido.");
                return;
        }

        double precoTotal = precoKg * qtd;
        double desconto = 0;

        if (cartao.equals("S")) {
            desconto = precoTotal * 0.05;
        }

        double valorPagar = precoTotal - desconto;

        System.out.println("----- CUPOM FISCAL -----");
        System.out.println("Carne: " + nomeCarne);
        System.out.printf("Quantidade: %.2f Kg\n", qtd);
        System.out.printf("Preço total: R$ %.2f\n", precoTotal);
        System.out.println("Pagamento com cartão Tabajara: " + (cartao.equals("S") ? "Sim" : "Não"));
        System.out.printf("Valor do desconto: R$ %.2f\n", desconto);
        System.out.printf("Valor a pagar: R$ %.2f\n", valorPagar);
    }
}
