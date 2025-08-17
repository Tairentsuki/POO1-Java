package exercicios.exLista1;

import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a altura em metros: ");
        float altura = entrada.nextFloat();

        float pesoIdeal = (float) ((72.7*altura) - 58);

        System.out.printf("O peso ideal é %.2f Kg", pesoIdeal);

    }
}
