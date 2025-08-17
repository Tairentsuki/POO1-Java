package exercicios.exLista1;
import java.util.Scanner;

public class Ex003 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		float n1 = entrada.nextFloat();
		
		System.out.print("Digite o segundo número: ");
		float n2 = entrada.nextFloat();
		
		float soma = n1+n2;
		
		System.out.println(n1 + " + " + n2 + " = " + soma);
		
		entrada.close(); 
	}
}
