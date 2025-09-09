package exercicios.exLista6.ex008;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA BANCÁRIO ===");
        System.out.print("Digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // consumir quebra de linha
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(numero, nome, saldoInicial);

        while (true) {
            System.out.println("\n1-Depósito \n2-Saque \n3-Alterar nome \n4-Consultar saldo \n0-Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor do depósito: ");
                    conta.deposito(scanner.nextDouble());
                    break;
                case 2:
                    System.out.print("Valor do saque: ");
                    conta.saque(scanner.nextDouble());
                    break;
                case 3:
                    scanner.nextLine(); // consumir quebra
                    System.out.print("Novo nome: ");
                    conta.alterarNome(scanner.nextLine());
                    break;
                case 4:
                    System.out.printf("Saldo atual: R$ %.2f\n", conta.getSaldo());
                    break;
                case 0:
                    scanner.close();
                    return;
            }
        }
    }
}
