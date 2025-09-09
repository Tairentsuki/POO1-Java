//2. Faça um programa que mostre os números que constam no intervalo entre
//        dois números que serão informados, se o usuário entrar com os valores em
//        ordem inversa o programa deve fazer dar um aviso ao usuário que irá fazer
//        a inversão.

package aulas.aula5.ex002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2;

        System.out.print("Digite o primeiro número: ");
        n1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        n2 = entrada.nextInt();

        Numeros numeros = new Numeros(n1, n2);
        numeros.mostrarIntervalo();
        entrada.close();
    }
}
