//3. Faça um programa que leia e valide as seguintes informações:
//a. Nome: maior que 3 caracteres;
//b. Idade: entre 0 e 150;
//c. Salário: maior que zero;
//d. Sexo: 'f' ou 'm';
//e. Estado Civil: 's', 'c', 'v', 'd';

package exercicios.exLista3;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        String nome;
        do{
            System.out.print("Digite seu nome: ");
            nome = entrada.nextLine();
            if(nome.length() <= 3){
                System.out.println("\nPor favor, insira um nome com mais de 3 caracteres. Tente novamente.\n\n");
            }
        }while(nome.length() <= 3);

        int idade;
        do{
            System.out.print("Digite sua idade: ");
            idade = entrada.nextInt();
            if(idade < 0 || idade > 150){
                System.out.println("\nPor favor, insira uma idade entre 0 e 150. Tente novamente.\n\n");
            }
        }while(idade < 0 || idade > 150);

        float salario;
        do{
            System.out.print("Digite seu salario: ");
            salario = entrada.nextFloat();
            if(salario <= 0){
                System.out.println("\nPor favor, insira um salario maior que 0. Tente novamente.\n\n");
            }
        }while(salario <= 0);

        entrada.nextLine();
        String sexo;
        do{
            System.out.print("Digite seu sexo (M/F): ");
            sexo = entrada.nextLine().toUpperCase();
            if(!sexo.equals("M") && !sexo.equals("F")){
                System.out.println("\nPor favor, insira M para masculino ou F para feminino. Tente novamente.\n\n");
            }
        }while(!sexo.equals("M") && !sexo.equals("F"));

        String estado_civil;
        do{
            System.out.print("Digite seu estado civil (S/C/V/D): ");
            estado_civil = entrada.nextLine().toUpperCase();
            if(!estado_civil.equals("S") && !estado_civil.equals("C") && !estado_civil.equals("V") && !estado_civil.equals("D")){
                System.out.println("\nPor favor, insira uma das letras corrêspondentes");
                System.out.println("S - Solteiro(a)");
                System.out.println("C - Casado(a)");
                System.out.println("V - Viúvo(a)");
                System.out.println("D - Divorciado(a)");
                System.out.println("Tente novamente.\n\n");
            }
        }while(!estado_civil.equals("S") && !estado_civil.equals("C") && !estado_civil.equals("V") && !estado_civil.equals("D"));

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("sexo: " + sexo);
        System.out.println("estado_civil: " + estado_civil);

    }
}
