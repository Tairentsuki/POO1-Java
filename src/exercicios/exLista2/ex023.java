package exercicios.exLista2;

import java.util.Scanner;

public class ex023 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a idade do primeiro aluno: ");
        int idade1 = entrada.nextInt();

        System.out.print("Digite a idade do segundo aluno: ");
        int idade2 = entrada.nextInt();

        System.out.print("Digite a idade do terceiro aluno: ");
        int idade3 = entrada.nextInt();

        double media = (idade1 + idade2 + idade3) / 3.0;

        if (media < 25) {
            System.out.println("Turma Jovem");
        } else if (media <= 40) {
            System.out.println("Turma Adulta");
        } else {
            System.out.println("Turma Idosa");
        }
    }
}
