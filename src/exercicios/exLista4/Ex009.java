//9. Faça um programa que peça um texto e coloque-o em um vetor onde cada carácter ocupará
//uma posição do vetor.

package exercicios.exLista4;

import java.util.Scanner;

public class Ex009{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira um texto: ");
        String texto = entrada.nextLine();

        String[] vetorTexto = texto.split("");
        for(String caractere : vetorTexto){
            System.out.printf("%s", caractere);
        }
    }
}