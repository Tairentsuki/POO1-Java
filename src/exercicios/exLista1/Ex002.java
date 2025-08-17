package exercicios.exLista1;

import java.util.Scanner;

public class Ex002 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		float n1 = entrada.nextFloat();
		System.out.println("O número digitado foi: "+n1);
		
		entrada.close();
	}
}
