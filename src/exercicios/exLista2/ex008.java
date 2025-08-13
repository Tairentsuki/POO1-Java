package exercicios.exLista2;
import java.util.Scanner;

public class ex008 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a 1° nota: ");
        float nota1 = entrada.nextFloat();
        System.out.print("Digite a 2° nota: ");
        float nota2 = entrada.nextFloat();

        float notaMedia = (nota1+nota2)/2;

        System.out.print("A nota média é " + notaMedia + " portanto o aluno está ");
        if(notaMedia >= 7){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
    }
}
