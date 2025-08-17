//2. Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao
//nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.
package exercicios.exLista3;

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        String nome = entrada.nextLine();

        String senha;
        do{
            System.out.print("Insira sua senha: ");
            senha = entrada.nextLine();
            if(senha.equalsIgnoreCase(nome)){
                System.out.println("Por favor, insira uma senha diferente do nome, tente novamente.\n");
            }
        }while(senha.equalsIgnoreCase(nome));
        System.out.println("Dados de "+ nome +" cadastrados com sucesso ");

    }
}
