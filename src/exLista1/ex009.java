package exLista1;
import java.util.Scanner;

public class ex009 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Conversor de graus celsius para Fahrenheit");
		System.out.print("Digite os graus celsius:");
		
		float graus_celsius = entrada.nextFloat();
		float graus_farenheit = (graus_celsius*9/5)+32;
		
		System.out.printf("%.2f °C \n", graus_celsius);
		System.out.printf("%.2f °F", graus_farenheit);
		entrada.close();
	}
}
