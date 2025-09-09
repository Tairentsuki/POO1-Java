//2. Faça um programa que mostre os números que constam no intervalo entre
//        dois números que serão informados, se o usuário entrar com os valores em
//        ordem inversa o programa deve fazer dar um aviso ao usuário que irá fazer
//        a inversão.

package exercicios.exLista6.ex002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Numeros numeros = new Numeros();

        System.out.print("Digite o primeiro número: ");
        numeros.setN1(entrada.nextInt());

        System.out.print("Digite o segundo número: ");
        numeros.setN2(entrada.nextInt());

        numeros.mostrarIntervalo();

        entrada.close();
    }
}
