package exLista1;

import java.util.Scanner;

public class ex013 {
    public static void main(String[] args) {
        float valorDaMultaPKG = 4;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva o peso dos peixes em KG: ");
        float peso = entrada.nextFloat();

        float excesso = peso - 50;
        float valorDaMulta = excesso * valorDaMultaPKG;

        System.out.printf("Você está com %.2f Kg em excesso e a multa é de R$ %.2f", excesso, valorDaMulta);

    }
}
