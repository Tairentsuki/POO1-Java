package exercicios.exLista6.ex011;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BombaCombustivel bomba = new BombaCombustivel();

        System.out.println("=== BOMBA DE COMBUSTÍVEL ===");
        System.out.print("Digite o tipo de combustível: ");
        bomba.setTipoCombustivel(scanner.nextLine());
        System.out.print("Digite o valor por litro: ");
        bomba.setValorLitro(scanner.nextDouble());
        System.out.print("Digite a quantidade inicial na bomba: ");
        bomba.setQuantidadeCombustivel(scanner.nextDouble());

        while (true) {
            System.out.printf("\nCombustível: %s | Valor/Litro: R$ %.2f | Quantidade: %.2f L\n", bomba.getTipoCombustivel(), bomba.getValorLitro(), bomba.getQuantidadeCombustivel());
            System.out.println("1-Abastecer por valor \n2-Abastecer por litro \n3-Alterar valor \n4-Alterar combustível \n5-Alterar quantidade \n0-Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor a abastecer: R$ ");
                    bomba.abastecerPorValor(scanner.nextDouble());
                    break;
                case 2:
                    System.out.print("Litros a abastecer: ");
                    bomba.abastecerPorLitro(scanner.nextDouble());
                    break;
                case 3:
                    System.out.print("Novo valor por litro: R$ ");
                    bomba.alterarValor(scanner.nextDouble());
                    break;
                case 4:
                    scanner.nextLine(); // consumir quebra
                    System.out.print("Novo tipo de combustível: ");
                    bomba.alterarCombustivel(scanner.nextLine());
                    break;
                case 5:
                    System.out.print("Nova quantidade: ");
                    bomba.alterarQuantidadeCombustivel(scanner.nextDouble());
                    break;
                case 0:
                    scanner.close();
                    return;
            }
        }
    }
}