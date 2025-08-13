package exercicios.exLista2;

import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o 1° número: ");
        float n1 = entrada.nextFloat();
        System.out.print("Digite o 2° número: ");
        float n2 = entrada.nextFloat();
        System.out.print("Digite o 3° número: ");
        float n3 = entrada.nextFloat();

        if (n1 > n2 && n1 > n3) {
            System.out.println(n1);
            if (n2 > n3) {
                System.out.println(n2);
                System.out.println(n3);
            } else {
                System.out.println(n3);
                System.out.println(n2);
            }
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2);
            if (n1 > n3) {
                System.out.println(n1);
                System.out.println(n3);
            } else {
                System.out.println(n3);
                System.out.println(n1);
            }
        } else if (n3 > n1 && n3 > n2) {
            System.out.println(n3);
            if (n1 > n2) {
                System.out.println(n1);
                System.out.println(n2);
            } else {
                System.out.println(n2);
                System.out.println(n1);
            }
        }
    }
}
