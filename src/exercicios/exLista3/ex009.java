//9. Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro
//entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve
//ser conforme o exemplo abaixo:
//        • Tabuada de 5:
//        5 x 1 = 5
//        5 x 2 = 10
//        ...
//        5 x 10 = 50
//
package exercicios.exLista3;

import java.util.Scanner;

public class ex009 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a tabuada escolhida: ");
        int tabuada = entrada.nextInt();

        System.out.printf("• Tabuada de %d:", tabuada);
        for (int contador = 1; contador <= 10; contador++){
            System.out.printf("\n%d x %d = %d", tabuada, contador, (tabuada*contador));
        }
    }
}
