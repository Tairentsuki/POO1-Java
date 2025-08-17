package exercicios.exLista2;
import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n1 = entrada.nextInt();

        if(n1 % 2 == 0){
            n1++;
            System.out.println("O número era par, agora é impar: " + n1);
        }else{
            n1--;
            System.out.println("O número era ímpar, agora é par: " + n1);
        }
    }
}
