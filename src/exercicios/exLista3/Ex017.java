//17. Faça um programa que peça um número inteiro e determine se ele é ou não um número
//primo. Um número primo é aquele que é divisível somente por ele mesmo e por 1.

package exercicios.exLista3;

import java.util.Scanner;

public class Ex017{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = entrada.nextInt();

        int contagemDeDivisoes = 0;

        for(int contador = 1; contador <= n; contador++ ){
            if(n % contador == 0){
                contagemDeDivisoes += 1;
            }
        }

        System.out.println("O número foi dividido " + contagemDeDivisoes + " veze(s)");
        if(contagemDeDivisoes == 2){
            System.out.println("Portanto é primo.");
        }else{
            System.out.println("Portanto não é primo.");
        }
    }
}