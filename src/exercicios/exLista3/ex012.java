//12. A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,... Faça um
//programa capaz de gerar a série até o n−ésimo termo.

package exercicios.exLista3;

import java.util.Scanner;

public class ex012 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite quantos números da sequência de Fibonnacci deseja:  ");
        int qnt = entrada.nextInt();

        long n1 = 1;
        long n2 = 1;
        long n3;
        System.out.println(qnt);
        switch (qnt) {
            case 1:
                System.out.println("1° termo: 1");
                break;
            case 2:
                System.out.println("1° termo: 1");
                System.out.println("2° termo: 1");
                break;
            default:
                System.out.println("1° termo: 1");
                System.out.print("2° termo: 1");
                for (int contador = 3; contador <= qnt; contador++) {
                    n3 = n1+n2;
                    n1 = n2;
                    n2 = n3;
                    System.out.printf("\n%d° termo: %d", contador, (n3));

                }
                break;
        }

    }
}