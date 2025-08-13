package exercicios.exLista1;

import java.util.Scanner;

public class ex012 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua altura em metros: ");
        float altura = entrada.nextFloat();

        float pesoIdealM = (float) ((72.7*altura) - 58);
        float pesoIdealF = (float) ((62.1*altura) - 44.7);

        System.out.printf("Para homens o peso ideal é %.2f Kg", pesoIdealM);
        System.out.printf("\nPara mulheres o peso ideal é %.2f Kg", pesoIdealF);

    }
}
