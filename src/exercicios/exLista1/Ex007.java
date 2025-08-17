package exercicios.exLista1;
import java.util.Scanner;

public class Ex007 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escreva a largura de um dos lados do quadrado em cm: ");
		int largura = entrada.nextInt();
		int area = largura*largura;
		
		System.out.printf
		("A Area do quadrado de largura %d cm é de %d cm", largura, area);
		entrada.close();
	}
	
}

