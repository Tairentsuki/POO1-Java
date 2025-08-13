package exercicios.exLista1;
import java.util.Scanner;

public class ex010 {
	public static void main(String[] args) { 
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o 1° número inteiro: ");
		int n1 = entrada.nextInt();
		System.out.print("Digite o 2° número inteiro ");
		int n2 = entrada.nextInt();
		
		System.out.print("Digite um número real: ");
		float n3 = entrada.nextFloat();
		
		float q1 = (float) n1*2 * (float) n2/2;
		System.out.println("O produto do dobro do primeiro com metade do segundo é: " + q1);

		float q2 = (float) n1*3 + n3;
		System.out.println("A soma do triplo do primeiro com o terceiro é: " + q2);
		
		float q3 = n3 * n3 * n3;
        System.out.println("o terceiro elevado ao cubo é :" + q3);
		entrada.close();
	}
}
