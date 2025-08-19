//28. O Departamento Estadual de Meteorologia lhe contratou para desenvolver um programa
//que leia as um conjunto indeterminado de temperaturas, e informe ao final a menor e a
//maior temperaturas informadas, bem como a média das temperaturas.

package exercicios.exLista3;

import java.util.Scanner;

public class Ex028 {
    public static void main(String[] args) {
        double menorTemperatura = 0;
        double maiorTemperatura = 0;
        double somaTemperaturas = 0;
        int contador = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Departamento Estadual de Meteorologia");
        System.out.print("(Digite 0 para finalizar)\nDigite a 1° temperatura (C°): ");
        double temperatura = entrada.nextDouble();
        if (temperatura != 0) {
            contador++;
        }

        if (temperatura != 0) {
            menorTemperatura = temperatura;
            maiorTemperatura = temperatura;
            somaTemperaturas = temperatura;

            while (true) {
                System.out.printf("Temperatura %d: ", (contador + 1));
                temperatura = entrada.nextDouble();

                if (temperatura == 0) {
                    break;
                }

                contador++;
                somaTemperaturas += temperatura;

                if (temperatura < menorTemperatura) {
                    menorTemperatura = temperatura;
                }
                if (temperatura > maiorTemperatura) {
                    maiorTemperatura = temperatura;
                }
            }
        }

        if (contador > 0) {
            double media = somaTemperaturas / contador;
            System.out.println("\nRelatório Meteorológico:");
            System.out.printf("Menor temperatura: %.2f°C %n", menorTemperatura);
            System.out.printf("Maior temperatura: %.2f°C %n", maiorTemperatura);
            System.out.printf("Media das temperaturas: %.2f°C %n", media);
            System.out.printf("Total de temperaturas registradas: %d %n", contador);
        } else {
            System.out.println("Nenhuma temperatura foi registrada.");
        }

        entrada.close();
    }
}