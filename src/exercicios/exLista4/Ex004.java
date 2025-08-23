//4. Faça um Programa que leia um vetor de 10 caracteres, e diga quantas consoantes foram
//lidas. Imprima as consoantes.

package exercicios.exLista4;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        final int QNT_CARACTERES = 10;
        String[] caracteres = new String[QNT_CARACTERES];

        Scanner entrada = new Scanner(System.in);

        for (int pos_caractere = 0; pos_caractere < QNT_CARACTERES; pos_caractere++) {
            System.out.print("Digite um caractere: ");
            caracteres[pos_caractere] = entrada.nextLine();

            if(caracteres[pos_caractere].length() > 1){
                System.out.println("Por favor, digite apenas um caractere. Tente novamente.");
                System.out.println("pos_caractere: "+ pos_caractere);
                pos_caractere--;
            }
        }
        String mensagem = "Foram digitadas as seguintes consoantes: ";
        int qnt_consoantes = 0;
        for (int pos_caractere = 0; pos_caractere < QNT_CARACTERES; pos_caractere++) {

            switch (caracteres[pos_caractere].toLowerCase()) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    break;
                default:
                    if (pos_caractere < (QNT_CARACTERES - 1)) {
                        mensagem += caracteres[pos_caractere] + ", ";
                    } else {
                        mensagem += caracteres[pos_caractere];
                    }
                    qnt_consoantes++;
            }
        }
        System.out.println(mensagem);
        System.out.println("O número de consoantes é: " + qnt_consoantes);
    }
}