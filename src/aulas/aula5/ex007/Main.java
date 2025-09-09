package aulas.aula5.ex007;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;
        double peso, altura;

        System.out.println("=== PESSOA ===");

        System.out.print("Digite o nome: ");
        nome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        idade = scanner.nextInt();

        System.out.print("Digite o peso: ");
        peso = scanner.nextDouble();

        System.out.print("Digite a altura (cm): ");
        altura = scanner.nextDouble();

        Pessoa pessoa = new Pessoa(nome, idade, peso, altura);

        pessoa.envelhecer(1);
        pessoa.engordar(2.0);

        System.out.println(pessoa);

        scanner.close();
    }
}
