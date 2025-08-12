package aula2;
// um programa onde um usuário escolha um número inicial e final de uma tabuada
// Se ele inverter o início e o fim, devemos avisar e ordenar, por exemplo 2000 - 1000 fazemos de 1000 a 2000
// Utilizando o for
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira a tabuada desejada: ");
        int tabuada = entrada.nextInt();

        System.out.print("Digite o valor inicial da tabuada: ");
        int valor_inicial = entrada.nextInt();

        System.out.print("Digite o valor final da tabuada: ");
        int valor_final = entrada.nextInt();

        if(valor_inicial > valor_final){
            System.out.println("Os valores iniciais e finais estão invertidos, será corrigido pelo programa.");
            int aux = valor_inicial;
            valor_inicial = valor_final;
            valor_final = aux;
        }

        System.out.println("=-=-=-=-=-=-= Tabuada =-=-=-=-=-=-=");

        for (int cont_aux = valor_inicial; cont_aux <= valor_final; cont_aux++){
            System.out.println(tabuada + " * " + cont_aux + " = " + tabuada*cont_aux );
        }
        System.out.println("=-=-=-=-=-=-= Tabuada =-=-=-=-=-=-=");


    }

}
