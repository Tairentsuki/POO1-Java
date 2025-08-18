//20. Faça um programa que calcule e mostre a média aritmética de N notas.

package exercicios.exLista3;

import java.util.Scanner;

public class Ex020{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite quantas notas deseja inserir: ");
        int numeroDeNotas = entrada.nextInt();
        float[] notas = new float[numeroDeNotas];

        for(int contador = 1; contador <= numeroDeNotas; contador++){
            System.out.print("Digite a "+contador+ "° nota: ");
            notas[contador-1] = entrada.nextFloat();

        }

        float somatorio = 0;
        for(float elemento : notas){
            somatorio+= elemento;
        }
        float media = somatorio/notas.length;
        System.out.println("A média das notas é: " + media);

    }
}