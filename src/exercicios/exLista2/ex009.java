package exercicios.exLista2;

import java.util.Scanner;

public class ex009 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float pesoIdeal;

        System.out.print("Digite sua altura em metros: ");
        float altura = entrada.nextFloat();

        System.out.print("Digite seu peso (Kg): ");
        float peso = entrada.nextFloat();
        entrada.nextLine();

        String sexo;

        while (true) {
            System.out.print("Insira seu sexo (M/F)");
            sexo = entrada.nextLine();
            if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")) {
                break;
            }
            System.out.println("Você digitou um valor inválido, tente novamente");
        }

        if (sexo.equalsIgnoreCase("M")) {
            pesoIdeal = (float) ((72.7 * altura) - 58);
        } else {
            pesoIdeal = (float) ((62.1 * altura) - 44.7);
        }


        System.out.printf("Sua altura é %.2f metros\n", altura);
        System.out.println("Seu peso é " + peso + " Kg");
        System.out.println("Seu sexo é " + sexo);
        System.out.printf("Seu peso ideal é %.2f Kg\n", pesoIdeal);
        if (peso < pesoIdeal) {
            System.out.println("Você está abaixo do peso ideal");
        } else if (peso > pesoIdeal) {
            System.out.println("Você está acima do peso ideal");
        } else {
            System.out.println("Você está no peso ideal");
        }
    }
}
