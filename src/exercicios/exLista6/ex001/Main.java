//1. Faça um programa que peça ao usuário nome e sobrenome separadamente
//e após junte-os com a mensagem “Seu nome completo é: Nome
//SobreNome”;

package exercicios.exLista6.ex001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        System.out.print("Digite o nome: ");
        pessoa.setNome(entrada.nextLine());
        System.out.print("Digite o sobrenome: ");
        pessoa.setSobrenome(entrada.nextLine());

        System.out.println(pessoa);
    }
}
