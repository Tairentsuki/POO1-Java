package exercicios.exLista2;

import java.util.Scanner;

public class ex029 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int respostasPositivas = 0;

        String[] perguntas = {
                "Telefonou para a vítima?",
                "Esteve no local do crime?",
                "Mora perto da vítima?",
                "Devia para a vítima?",
                "Já trabalhou com a vítima?"
        };

        for (String pergunta : perguntas) {
            System.out.print(pergunta + " (S/N): ");
            String resposta = entrada.nextLine();

            if (resposta.equalsIgnoreCase("S")) {
                respostasPositivas++;
            }
        }

        if (respostasPositivas == 2) {
            System.out.println("Classificação: Suspeita");
        } else if (respostasPositivas >= 3 && respostasPositivas <= 4) {
            System.out.println("Classificação: Cúmplice");
        } else if (respostasPositivas == 5) {
            System.out.println("Classificação: Assassino");
        } else {
            System.out.println("Classificação: Inocente");
        }
    }
}
