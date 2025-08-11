package exLista2;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        float n1 = entrada.nextFloat();

        if(n1 < 0){
            System.out.println("O valor digitado é negativo.");
        }else if(n1> 0){
            System.out.println("O valor digitado é positivo.");
        }else{
            System.out.println("Você digitou 0.");
        }
    }
}
