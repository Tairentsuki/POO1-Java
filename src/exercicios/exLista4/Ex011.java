//11. Faça um programa que tenha como entrada várias palavras separadas por ;
//(rodrigo;curvello;antonio;....) separe as palavras e coloque cada uma em uma posição do
//vetor

package exercicios.exLista4;

import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira as entradas, separando-as por ponto e vírgula(;): ");
        String[] vetorPalavra = entrada.nextLine().split(";");

        System.out.println("Palavras digitadas: ");
        for(String palavra : vetorPalavra){
            System.out.println(palavra);
        }

        entrada.close();
    }
}
