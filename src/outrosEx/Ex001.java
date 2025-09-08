
package outrosEx;

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n;

        while (true){
            System.out.print("Digite o valor de n: ");
            n = entrada.nextInt();
            if(n>=3){
                break;
            }else{
                System.out.println("O valor de n deve ser maior ou igual a 3. Tente novamente.");
            }
        }


        int[] serieNumerica = new int[n];

        serieNumerica[0] = 1;
        serieNumerica[1] = 1;
        for(int contador = 2; contador < n; contador++){
            serieNumerica[contador] = serieNumerica[contador-2] + serieNumerica[contador-1];
        }

        int somatoria = 0;
        int media;
        int maiorValor = serieNumerica[0];
        int menorValor = serieNumerica[0];

        for(int numero : serieNumerica){
            System.out.printf(" %d ", numero);
            somatoria += numero;

            if(numero < menorValor){
                menorValor = numero;
            }
            if(numero > maiorValor){
                maiorValor = numero;
            }
        }

        media = somatoria/n;

        System.out.println("A somatória é: " + somatoria);
        System.out.println("A média é: " + media);
        System.out.println("O menor valor é: "+ menorValor);
        System.out.println("O maior valor é: " + maiorValor);



    }
}