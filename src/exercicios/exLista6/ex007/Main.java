package exercicios.exLista6.ex007;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.println("=== PESSOA ===");
        System.out.print("Digite o nome: ");
        pessoa.setNome(scanner.nextLine());
        System.out.print("Digite a idade: ");
        pessoa.setIdade(scanner.nextInt());
        System.out.print("Digite o peso: ");
        pessoa.setPeso(scanner.nextDouble());
        System.out.print("Digite a altura (cm): ");
        pessoa.setAltura(scanner.nextDouble());

        System.out.println("\nDados iniciais:");
        System.out.printf("Nome: %s, Idade: %d, Peso: %.1f, Altura: %.1f cm\n", pessoa.getNome(), pessoa.getIdade(), pessoa.getPeso(), pessoa.getAltura());

        pessoa.envelhecer(1);
        pessoa.engordar(2.0);

        System.out.println("\nApós envelhecer 1 ano e engordar 2kg:");
        System.out.printf("Nome: %s, Idade: %d, Peso: %.1f, Altura: %.1f cm\n", pessoa.getNome(), pessoa.getIdade(), pessoa.getPeso(), pessoa.getAltura());

        scanner.close();
    }
}
