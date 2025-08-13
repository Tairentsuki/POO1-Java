package exercicios.exLista1;

import java.util.Scanner;

public class ex014 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor recebido por hora (R$): ");
        float valorRecebidoPorHora = entrada.nextFloat();

        System.out.print("Digite o total de horas trabalhadas: ");
        float totalHorasTrabalhadas = entrada.nextFloat();

        float salarioBruto = valorRecebidoPorHora * totalHorasTrabalhadas;
        float valorImpostoDeRenda = salarioBruto * (float) 0.11;
        float valorInss = salarioBruto * (float) 0.08;
        float valorSindicato = salarioBruto * (float) 0.05;
        float salarioLiquido = salarioBruto - valorImpostoDeRenda - valorInss - valorSindicato;

        System.out.println("Salario bruto: R$ " + salarioBruto);
        System.out.println("Imposto de renda R$ " + valorImpostoDeRenda);
        System.out.println("INSS: R$ " + valorInss);
        System.out.println("Sindicato R$ " + valorSindicato);
        System.out.println("Salário liquido R$ " + salarioLiquido);

    }
}
