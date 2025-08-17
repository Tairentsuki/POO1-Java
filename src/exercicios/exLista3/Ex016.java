//16. Faça um programa que, dado um conjunto de N números, determine o menor valor, o
//maior valor e a soma dos valores.

package exercicios.exLista3;

import java.util.Scanner;

public class Ex016 {
    public static void main(String[] args) {
        int qnt, n, menor, maior, soma;
        Scanner entrada = new Scanner(System.in);


        System.out.print("Digite quantos números deseja inserir: ");
        qnt = entrada.nextInt();



        maior = 0;
        menor = 0;
        soma = 0;
        for (int contador = 1; contador <= qnt; contador++){
            System.out.print("Digite o " + contador + "° número: ");
            n = entrada.nextInt();
            if(n > maior || contador == 1){
                maior = n;
            }
            if(n < menor || contador == 1){
                menor = n;
            }
            soma += n;
        }

        System.out.println("O maior número digitado foi: " + maior);
        System.out.println("O menor número digitado foi: " + menor);
        System.out.println("A soma dos números digitados é: " + soma);

        entrada.close();
    }
}
