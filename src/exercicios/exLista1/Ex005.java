package exercicios.exLista1;

import java.util.Scanner;

public class Ex005 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Conversor de metros para centímetros");
		System.out.print("Digite quantos metros deseja converter: ");
		float metros = entrada.nextFloat();
		float centimetros = metros * 100;
		
		System.out.println(metros + "M equivale(m) à " + centimetros + "cm");
		
		entrada.close();
	}
}
