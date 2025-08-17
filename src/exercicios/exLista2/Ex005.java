package exercicios.exLista2;

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        String letra = entrada.nextLine();

        if (letra.equalsIgnoreCase("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("A letra digitada é vogal.");
        } else {
            System.out.println("A letra digitada não é vogal.");
        }
    }
}
