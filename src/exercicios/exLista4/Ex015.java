//15. Faça um programa que use um vetor de tamanho N (constante), peça ao usuário para
//informar os valores que devem ser validados, somente devem ser aceitos valores entre 0 e 20
//        (inclusive 0 e 20). Após isto deve ser gerado um gráfico com cada um dos valores conforme
//o exemplo abaixo (levando em consideração que os valores informados no vetor foram 4, 2
//                  e 1)
//4: ####
//2:##
//1:#

package exercicios.exLista4;

import java.util.Scanner;

public class Ex015{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        final int TAM_VETOR = 5;

        int[] numeros = new int[TAM_VETOR];

        for(int contador = 0; contador < TAM_VETOR; contador++){
            System.out.println("Contador: "+contador);
            try{
                System.out.printf("Insira o %02d° número inteiro de 0 à 20: ", contador+1);
                numeros[contador] = entrada.nextInt();
                if(numeros[contador] < 0 || numeros[contador] > 20){
                    System.out.println("Valor digitado fora do escopo de 0 à 20, tente novamente.");
                    contador--;
                }
            }catch(Exception e) {
                entrada.nextLine();
                System.out.print("Por favor, digite um número inteiro válido de 0 a 20. \nTente novamente.");
                contador--;
            }
        }

        for(int numero : numeros){
            System.out.printf("\n%02d : ", numero);
            for(int contador = 0; contador < numero; contador++){
                System.out.print("#");
            }
        }
    }
}