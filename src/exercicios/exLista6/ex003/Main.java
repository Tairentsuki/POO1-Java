//3. Faça um programa que tenha uma função para calcular as quatro operações
//básicas de 2 números;

package exercicios.exLista6.ex003;

import java.util.Scanner;

public class Main {
    public static void Calcular(double n1, double n2) {

        System.out.printf("Soma: %f\nSubtração: %f\nMultiplicação: %f\n", n1+n2, n1-n2, n1*n2);

        if (n2 == 0){
            System.out.println("Divisão: Não é possivel dividir por 0");
        }else{
            System.out.printf("Divisão: %f", n1/n2);
        }

    }

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = entrada.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = entrada.nextDouble();

        Calcular(n1, n2);
    }
}
