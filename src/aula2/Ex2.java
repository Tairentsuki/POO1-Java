package aula2;
// Pergunte um valor e só aceite o valor se for positivo, caso contrário continue solicitando.
// Usando Do While

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valor_par;
        do {
            System.out.print("Insira um valor par: ");
            valor_par = entrada.nextInt();
            if (valor_par % 2 != 0) {

                System.out.println("\n\n\n\n\n\n=-=-=-=-=-=-=-=-=-=-=-= Valor inválido =-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println(valor_par + " não é par.");
                System.out.println("Por favor, insira um valor par.");
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-= Valor inválido =-=-=-=-=-=-=-=-=-=-=-=\n\n");
            }
        } while (valor_par % 2 != 0);

    }
}
