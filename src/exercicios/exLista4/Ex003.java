package exercicios.exLista4;

import java.util.Scanner;

public class Ex003{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        final int QNT_NOTAS = 4;

        double[] notas = new double[QNT_NOTAS];

        for(int contador = 0; contador < QNT_NOTAS; contador++){
            System.out.print("Digite a " + (contador+1) + "° nota: ");
            notas[contador] = entrada.nextDouble();
        }
        double somatorio = 0;
        System.out.println("As notas digitadas foram: ");
        for(double nota: notas){
            System.out.println(nota);
            somatorio+= nota;
        }

        System.out.println("A média é: " + (somatorio/QNT_NOTAS));
    }
}
