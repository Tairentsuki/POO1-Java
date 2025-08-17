package exercicios.exLista2;

import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Em qual turno você estuda? (M-matutino, V-vespertino, N-noturno): ");
        String turno = entrada.nextLine();

        if (turno.equalsIgnoreCase("M")) {
            System.out.println("Bom Dia!");
        } else if (turno.equalsIgnoreCase("V")) {
            System.out.println("Boa Tarde!");
        } else if (turno.equalsIgnoreCase("N")) {
            System.out.println("Boa Noite!");
        } else {
            System.out.println("Turno inválido!");
        }
    }
}
