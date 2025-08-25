//12. Faça um Programa que peça a idade e a altura de 5 pessoas, armazene cada informação no
//seu respectivo vetor. Imprima a idade e a altura na ordem inversa a ordem lida. Mostrar
//também idade e altura do mais velho, mais novo, mais baixo e mais alto. Mostrar idade e
//altura de quem está abaixo e acima da média de idade e altura;

package exercicios.exLista4;

import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int QNT_PESSOAS = 5;

        int[] idades = new int[QNT_PESSOAS];
        double[] alturas = new double[QNT_PESSOAS];
        int somatorioIdade = 0;
        double somatorioAltura = 0;
        double mediaIdades;
        double mediaAlturas;
        int indiceMaisVelho = 0;
        int indiceMaisNovo = 0;
        int indiceMaisAlto = 0;
        int indiceMaisBaixo = 0;

        for (int contador = 0; contador < QNT_PESSOAS; contador++) {
            System.out.printf("Digite a idade da %d° pessoa: ", contador + 1);
            idades[contador] = entrada.nextInt();
            somatorioIdade += idades[contador];

            System.out.printf("Digite a altura da %d° pessoa: ", contador + 1);
            alturas[contador] = entrada.nextDouble();
            somatorioAltura += alturas[contador];

            if (idades[contador] > idades[indiceMaisVelho]) {
                indiceMaisVelho = contador;
            }
            if (idades[contador] < idades[indiceMaisNovo]) {
                indiceMaisNovo = contador;
            }
            if (alturas[contador] > alturas[indiceMaisAlto]) {
                indiceMaisAlto = contador;
            }
            if (alturas[contador] < alturas[indiceMaisBaixo]) {
                indiceMaisBaixo = contador;
            }

        }
        System.out.println();

        mediaAlturas = somatorioAltura/QNT_PESSOAS;
        mediaIdades = (double) somatorioIdade/QNT_PESSOAS;


        System.out.print("Idades: ");
        for (int contador = QNT_PESSOAS; contador > 0; contador--) {
            System.out.printf("%d ", idades[contador - 1]);

        }
        System.out.println();

        System.out.print("Alturas: ");
        for (int contador = QNT_PESSOAS; contador > 0; contador--) {
            System.out.printf("%.2f ", alturas[contador - 1]);
        }

        System.out.println();
        System.out.println("-".repeat(50));
        System.out.println("Mais velho");
        System.out.println("Idade: " + idades[indiceMaisVelho]);
        System.out.println("Altura: " + alturas[indiceMaisVelho]);
        System.out.println("-".repeat(50));

        System.out.println("-".repeat(50));
        System.out.println("Mais novo");
        System.out.println("Idade: " + idades[indiceMaisNovo]);
        System.out.println("Altura: " + alturas[indiceMaisNovo]);
        System.out.println("-".repeat(50));

        System.out.println("-".repeat(50));
        System.out.println("Mais alto");
        System.out.println("Idade: " + idades[indiceMaisAlto]);
        System.out.println("Altura: " + alturas[indiceMaisAlto]);
        System.out.println("-".repeat(50));

        System.out.println("-".repeat(50));
        System.out.println("Mais baixo");
        System.out.println("Idade: " + idades[indiceMaisBaixo]);
        System.out.println("Altura: " + alturas[indiceMaisBaixo]);
        System.out.println("-".repeat(50));

        System.out.println("-".repeat(50));
        System.out.printf("Abaixo da média de idade (%.2f)\n", mediaIdades);
        for(int contador = 0; contador < QNT_PESSOAS; contador++){
            if(idades[contador] < mediaIdades){
                System.out.printf("Idade: %d | Altura: %.2f\n", idades[contador], alturas[contador]);
            }
        }
        System.out.println("-".repeat(50));

        System.out.println("-".repeat(50));
        System.out.printf("Acima da média de idade (%.2f)\n", mediaIdades);
        for(int contador = 0; contador < QNT_PESSOAS; contador++){
            if(idades[contador] > mediaIdades){
                System.out.printf("Idade: %d | Altura: %.2f\n", idades[contador], alturas[contador]);
            }
        }
        System.out.println("-".repeat(50));


        System.out.println("-".repeat(50));
        System.out.printf("Abaixo da média de alturas (%.2f)\n", mediaAlturas);
        for(int contador = 0; contador < QNT_PESSOAS; contador++){
            if(alturas[contador] < mediaAlturas){
                System.out.printf("Idade: %d | Altura: %.2f\n", idades[contador], alturas[contador]);
            }
        }
        System.out.println("-".repeat(50));

        System.out.println("-".repeat(50));
        System.out.printf("Acima da média de alturas (%.2f)\n", mediaAlturas);
        for(int contador = 0; contador < QNT_PESSOAS; contador++){
            if(alturas[contador] > mediaAlturas){
                System.out.printf("Idade: %d | Altura: %.2f\n", idades[contador], alturas[contador]);
            }
        }
        System.out.println("-".repeat(50));

        System.out.println("-".repeat(50));
        System.out.printf("Acima da média de idade(%.2f) e altura (%.2f)\n", mediaIdades, mediaAlturas);
        for(int contador = 0; contador < QNT_PESSOAS; contador++){
            if(idades[contador] > mediaIdades && alturas[contador] > mediaAlturas){
                System.out.printf("Idade: %d | Altura: %.2f\n", idades[contador], alturas[contador]);
            }
        }
        System.out.println("-".repeat(50));

        System.out.println("-".repeat(50));
        System.out.printf("Abaixo da média de idade(%.2f) e altura (%.2f)\n", mediaIdades, mediaAlturas);
        for(int contador = 0; contador < QNT_PESSOAS; contador++){
            if(idades[contador] < mediaIdades && alturas[contador] < mediaAlturas){
                System.out.printf("Idade: %d | Altura: %.2f\n", idades[contador], alturas[contador]);
            }
        }
        System.out.println("-".repeat(50));



    }
}
