//1. Faça um programa que peça ao usuário nome e sobrenome separadamente
//e após junte-os com a mensagem “Seu nome completo é: Nome
//SobreNome”;

package aulas.aula5.ex001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String nome;
        String sobrenome;

        System.out.print("Digite o nome: ");
        nome = entrada.nextLine();
        System.out.print("Digite o sobrenome: ");
        sobrenome = entrada.nextLine();

        Pessoa pessoa = new Pessoa(nome, sobrenome);
        System.out.println(pessoa);
    }
}
