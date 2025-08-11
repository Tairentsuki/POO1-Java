package exLista1;
import java.util.Scanner;

public class ex006 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Calcular área de um circulo");
		System.out.print("Digite o valor do raio: ");
		Double r = entrada.nextDouble();
		
		double area = Math.PI * r * r;
		
		System.out.println("A área do circulo é: " + area);
		entrada.close();
		
	}
}
