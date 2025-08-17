package exercicios.exLista2;

import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor da sua hora: R$ ");
        double valorHora = entrada.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        int horas = entrada.nextInt();

        double salarioBruto = valorHora * horas;

        double ir;
        if (salarioBruto <= 900) {
            ir = 0;
        } else if (salarioBruto <= 1500) {
            ir = salarioBruto * 0.05;
        } else if (salarioBruto <= 2500) {
            ir = salarioBruto * 0.10;
        } else {
            ir = salarioBruto * 0.20;
        }

        double inss = salarioBruto * 0.10;
        double sindicato = salarioBruto * 0.03;
        double fgts = salarioBruto * 0.11;

        double totalDescontos = ir + inss + sindicato;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.printf("Salário Bruto: (%.2f * %d) : R$ %.2f\n", valorHora, horas, salarioBruto);
        System.out.printf("(-) IR (%.0f%%) : R$ %.2f\n", (ir == 0 ? 0 : (ir / salarioBruto * 100)), ir);
        System.out.printf("(-) INSS (10%%) : R$ %.2f\n", inss);
        System.out.printf("(-) Sindicato (3%%) : R$ %.2f\n", sindicato);
        System.out.printf("FGTS (11%%) : R$ %.2f\n", fgts);
        System.out.printf("Total de descontos : R$ %.2f\n", totalDescontos);
        System.out.printf("Salário Líquido : R$ %.2f\n", salarioLiquido);
    }
}
