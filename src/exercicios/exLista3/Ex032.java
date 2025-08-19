//32. Foi feita uma estatística em cinco cidades brasileiras para coletar dados sobre acidentes
//de trânsito. Foram obtidos os seguintes dados:
//a. Código da cidade;
//b. Número de veículos de passeio (em 1999);
//c. Número de acidentes de trânsito com vítimas (em 1999). Deseja-se saber:
//d. Qual o maior e menor índice de acidentes de transito e a que cidade pertence;
//e. Qual a média de veículos nas cinco cidades juntas;
//f. Qual a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.

package exercicios.exLista3;

import java.util.Scanner;

public class Ex032 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Estatisticas de Transito - 5 Cidades");

        int codigoMaiorIndice = 0, codigoMenorIndice = 0;
        double maiorIndice = Double.MIN_VALUE, menorIndice = Double.MAX_VALUE;

        int somaVeiculos = 0;
        int somaAcidentesCidadesPequenas = 0;
        int contadorCidadesPequenas = 0;

        for (int contador = 1; contador <= 5; contador++) {
            System.out.printf("Cidade %d:%n", contador);
            System.out.print("Codigo da cidade: ");
            int codigo = entrada.nextInt();

            System.out.print("Numero de veiculos de passeio: ");
            int veiculos = entrada.nextInt();

            System.out.print("Numero de acidentes com vitimas: ");
            int acidentes = entrada.nextInt();

            double indiceAcidentes = (double) acidentes / veiculos;

            if (indiceAcidentes > maiorIndice) {
                maiorIndice = indiceAcidentes;
                codigoMaiorIndice = codigo;
            }
            if (indiceAcidentes < menorIndice) {
                menorIndice = indiceAcidentes;
                codigoMenorIndice = codigo;
            }

            somaVeiculos += veiculos;

            if (veiculos < 2000) {
                somaAcidentesCidadesPequenas += acidentes;
                contadorCidadesPequenas++;
            }

            System.out.println();
        }

        double mediaVeiculos = (double) somaVeiculos / 5;

        System.out.println("=== RELATORIO DE TRANSITO ===");
        System.out.printf("Maior indice de acidentes: Cidade %d - %.4f acidentes/veiculo\n", codigoMaiorIndice, maiorIndice);
        System.out.printf("Menor indice de acidentes: Cidade %d - %.4f acidentes/veiculo\n", codigoMenorIndice, menorIndice);
        System.out.printf("Media de veiculos nas 5 cidades: %.2f veiculos%n", mediaVeiculos);

        if (contadorCidadesPequenas > 0) {
            double mediaAcidentesCidadesPequenas = (double) somaAcidentesCidadesPequenas / contadorCidadesPequenas;
            System.out.printf("Media de acidentes em cidades com menos de 2000 veiculos: %.2f acidentes\n", mediaAcidentesCidadesPequenas);
        } else {
            System.out.println("Nenhuma cidade possui menos de 2000 veiculos.");
        }

        entrada.close();
    }
}