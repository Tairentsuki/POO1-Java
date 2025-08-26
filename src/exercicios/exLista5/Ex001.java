//1. Faça um programa que peça ao usuário um valor inteiro impar entre 3 e 11 (inclusive 3 e
//        11, valide esta entrada), após isto crie uma matriz quadrada (inteiros) do tamanho do número
//        informado pelo usuário. Permita que o usuário informe os valores para cada uma das
//        posições da matriz. Após isto calcula e mostre as seguintes informações sobre a matriz:
//        • Soma dos elementos;
//        • Média dos elementos (duas casas decimais);
//        • Maior valor;
//        • Menor valor;
//        • Contador de pares;
//        • Contador de ímpares;
//        • Soma da diagonal principal;
//        • Soma da diagonal secundária;
//        • Mostrar a Matriz (formatada);

package exercicios.exLista5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ex001 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Para definir . em vez de ,
        Scanner scanner = new Scanner(System.in);

        final String NOME_PASTA = "src/exercicios/exLista5/arquivos_ex001";

        while (true) {
            System.out.println("\n===== ANÁLISE DE MATRIZ QUADRADA =====");
            System.out.println("1. Criar e analisar uma nova matriz");
            System.out.println("2. Ler matriz de um arquivo e analisar");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = 0;
            try {
                opcao = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Erro: Opção inválida. Digite um número.");
                scanner.next();
                continue;
            }

            int[][] matrizParaAnalisar = null;

            switch (opcao) {
                case 1:
                    int tamanho = 0;
                    while (true) {
                        try {
                            System.out.print("\nDigite um valor inteiro ímpar entre 3 e 11: ");
                            tamanho = scanner.nextInt();
                            if (tamanho >= 3 && tamanho <= 11 && tamanho % 2 != 0) {
                                break;
                            } else {
                                System.out.println("Erro: O valor deve ser um inteiro ímpar entre 3 e 11.");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Erro: Entrada inválida. Por favor, digite um número inteiro.");
                            scanner.next();
                        }
                    }

                    System.out.println("\n--- Inserção de Valores na Matriz ---");
                    int[][] novaMatriz = new int[tamanho][tamanho];
                    for (int i = 0; i < tamanho; i++) {
                        for (int j = 0; j < tamanho; j++) {
                            while (true) {
                                try {
                                    System.out.printf("Digite o valor para a posição [%d][%d]: ", i, j);
                                    novaMatriz[i][j] = scanner.nextInt();
                                    break;
                                } catch (InputMismatchException e) {
                                    System.out.println("Erro: Entrada inválida. Digite um número inteiro.");
                                    scanner.next();
                                }
                            }
                        }
                    }

                    matrizParaAnalisar = novaMatriz;

                    System.out.print("\nDeseja salvar esta matriz em um arquivo? (s/n): ");
                    String resposta = scanner.next().toLowerCase();
                    if (resposta.equals("s")) {
                        System.out.print("Digite o nome do arquivo (ex: matriz.txt): ");
                        String nomeArquivo = scanner.next();

                        File diretorio = new File(NOME_PASTA);

                        if (!diretorio.exists()) {
                            diretorio.mkdirs();
                        }

                        File arquivoFinal = new File(diretorio, nomeArquivo);

                        try (PrintWriter writer = new PrintWriter(new FileWriter(arquivoFinal))) {
                            writer.println(tamanho);
                            for (int i = 0; i < tamanho; i++) {
                                for (int j = 0; j < tamanho; j++) {
                                    writer.print(novaMatriz[i][j] + " ");
                                }
                                writer.println();
                            }
                            System.out.println("Matriz salva com sucesso em '" + arquivoFinal.getPath() + "'!");
                        } catch (IOException e) {
                            System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
                        }
                    }
                    break;

                case 2:
                    System.out.print("\nDigite o nome do arquivo para ler (ex: matriz.txt): ");
                    String nomeArquivoLeitura = scanner.next();

                    File arquivoParaLer = new File(NOME_PASTA, nomeArquivoLeitura);

                    try (Scanner fileScanner = new Scanner(arquivoParaLer)) {
                        int tamanhoLido = fileScanner.nextInt();
                        int[][] matrizLida = new int[tamanhoLido][tamanhoLido];
                        for (int i = 0; i < tamanhoLido; i++) {
                            for (int j = 0; j < tamanhoLido; j++) {
                                matrizLida[i][j] = fileScanner.nextInt();
                            }
                        }
                        matrizParaAnalisar = matrizLida;
                        System.out.println("Matriz lida com sucesso do arquivo '" + arquivoParaLer.getPath() + "'!");
                    } catch (FileNotFoundException e) {
                        System.out.println("Erro: Arquivo '" + arquivoParaLer.getPath() + "' não encontrado.");
                    } catch (Exception e) {
                        System.out.println("Erro ao ler o arquivo. Verifique o formato dos dados: " + e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

            if (matrizParaAnalisar != null) {
                int tamanhoAnalise = matrizParaAnalisar.length;
                long somaTotal = 0;
                int contadorPares = 0, contadorImpares = 0;
                long somaDiagPrincipal = 0, somaDiagSecundaria = 0;
                int maiorValor = matrizParaAnalisar[0][0], menorValor = matrizParaAnalisar[0][0];

                for (int i = 0; i < tamanhoAnalise; i++) {
                    for (int j = 0; j < tamanhoAnalise; j++) {
                        int elemento = matrizParaAnalisar[i][j];
                        somaTotal += elemento;
                        if (elemento > maiorValor) maiorValor = elemento;
                        if (elemento < menorValor) menorValor = elemento;
                        if (elemento % 2 == 0) contadorPares++; else contadorImpares++;
                        if (i == j) somaDiagPrincipal += elemento;
                        if (i + j == tamanhoAnalise - 1) somaDiagSecundaria += elemento;
                    }
                }
                double media = (double) somaTotal / (tamanhoAnalise * tamanhoAnalise);

                System.out.println("\n--- Matriz Analisada ---");
                for (int i = 0; i < tamanhoAnalise; i++) {
                    for (int j = 0; j < tamanhoAnalise; j++) {
                        System.out.printf("%d\t", matrizParaAnalisar[i][j]);
                    }
                    System.out.println();
                }

                System.out.println("\n--- Análise da Matriz ---");
                System.out.println("• Soma dos elementos: " + somaTotal);
                System.out.printf("• Média dos elementos: %.2f%n", media);
                System.out.println("• Maior valor: " + maiorValor);
                System.out.println("• Menor valor: " + menorValor);
                System.out.println("• Contador de pares: " + contadorPares);
                System.out.println("• Contador de ímpares: " + contadorImpares);
                System.out.println("• Soma da diagonal principal: " + somaDiagPrincipal);
                System.out.println("• Soma da diagonal secundária: " + somaDiagSecundaria);
            }
        }
    }
}