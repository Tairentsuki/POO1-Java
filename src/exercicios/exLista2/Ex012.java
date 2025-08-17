package exercicios.exLista2;

import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o salário atual: R$ ");
        double salario = entrada.nextDouble();

        double percentual;

        if (salario <= 280) {
            percentual = 20;
        } else if (salario <= 700) {
            percentual = 15;
        } else if (salario <= 1500) {
            percentual = 10;
        } else {
            percentual = 5;
        }

        double aumento = salario * percentual / 100;
        double novoSalario = salario + aumento;

        System.out.printf("Salário antes do reajuste: R$ %.2f\n", salario);
        System.out.printf("Percentual de aumento aplicado: %.0f%%\n", percentual);
        System.out.printf("Valor do aumento: R$ %.2f\n", aumento);
        System.out.printf("Novo salário após aumento: R$ %.2f\n", novoSalario);
    }
}
