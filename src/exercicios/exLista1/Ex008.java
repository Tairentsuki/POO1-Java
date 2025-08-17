package exercicios.exLista1;

import java.util.Scanner;

public class Ex008 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite quanto você ganha por hora: ");
		Double valor_hora = entrada.nextDouble();

		System.out.print("Digite quantas horas foram trabalhadas no mês: ");
		Double horas_mensais = entrada.nextDouble();

		Double salario = valor_hora * horas_mensais;

		System.out.printf("Salário: %.2f", salario);
		entrada.close();
	}
}
