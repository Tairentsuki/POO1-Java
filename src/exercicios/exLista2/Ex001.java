package exercicios.exLista2;

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double maiorNumero;

        System.out.print("Digite o primeiro número: ");
        double n1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = entrada.nextDouble();

        if(n1 > n2){
            maiorNumero = n1;
        } else maiorNumero = n2;

        System.out.println("Maior número: " + maiorNumero);

    }
}
