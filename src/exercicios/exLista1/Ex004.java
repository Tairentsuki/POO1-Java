package exercicios.exLista1;
import java.util.Scanner;

public class Ex004 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a 1° nota: ");
		float n1 = entrada.nextFloat();
		
		System.out.print("Digite a 2° nota: ");
		float n2 = entrada.nextFloat();
		
		System.out.print("Digite a 3° nota: ");
		float n3 = entrada.nextFloat();
		
		System.out.print("Digite a 4° nota: ");
		float n4 = entrada.nextFloat();
		
		float media = (n1+n2+n3+n4) / 4;
		
		System.out.println("As notas digitadas foram: " + n1 + ", " + n2 + ", " + n3 + ", " + n4);
		System.out.println("A média das notas é: " + media);
		
		entrada.close();
	}
}
