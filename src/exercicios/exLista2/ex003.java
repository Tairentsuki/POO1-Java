package exercicios.exLista2;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        String letraDigitada = entrada.nextLine();

        if(letraDigitada.equalsIgnoreCase("F")){
            System.out.println("Você digitou F");
        }else if(letraDigitada.equalsIgnoreCase("M")){
            System.out.println("Você digitou M");
        }
    }
}
