//2. Crie um programa que solicite o preço de cinco produtos em cinco supermercados
//diferentes, ao final o programa deve mostrar:
//        • Os preços em cada um dos supermercados;
//• A média de preço por produto;
//• A soma de preços por supermercado;
//• O valor total no supermercado mais barato e no mais caro;
//Permitir gravar e ler estes dados de um arquivo.

package exercicios.exLista5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class Ex002 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Para definir . em vez de ,
        Scanner scanner = new Scanner(System.in);
        final String NOME_PASTA = "src/exercicios/exLista5/arquivos_ex002";
        final int N_PRODUTOS = 5;
        final int N_SUPERMERCADOS = 5;

        while (true) {
            System.out.println("\n===== CONTROLE DE PREÇOS DE SUPERMERCADO =====");
            System.out.println("1. Inserir novos preços");
            System.out.println("2. Ler preços de um arquivo");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = 0;
            try {
                opcao = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Erro: Opção inválida.");
                scanner.next();
                continue;
            }

            double[][] precos = null;

            switch (opcao) {
                case 1:
                    precos = new double[N_PRODUTOS][N_SUPERMERCADOS];
                    System.out.println("\n--- Inserção de Preços ---");
                    for (int i = 0; i < N_PRODUTOS; i++) {
                        for (int j = 0; j < N_SUPERMERCADOS; j++) {
                            while (true) {
                                try {
                                    System.out.printf("Digite o preço do Produto %d no Supermercado %d: ", i + 1, j + 1);
                                    precos[i][j] = scanner.nextDouble();
                                    break;
                                } catch (InputMismatchException e) {
                                    System.out.println("Erro: Digite um valor numérico válido.");
                                    scanner.next();
                                }
                            }
                        }
                    }

                    System.out.print("\nDeseja salvar estes dados em um arquivo? (s/n): ");
                    if (scanner.next().equalsIgnoreCase("s")) {
                        System.out.print("Digite o nome do arquivo (ex: precos.txt): ");
                        String nomeArquivo = scanner.next();
                        File diretorio = new File(NOME_PASTA);
                        if (!diretorio.exists()) {
                            diretorio.mkdirs();
                        }
                        File arquivoFinal = new File(diretorio, nomeArquivo);
                        try (PrintWriter writer = new PrintWriter(new FileWriter(arquivoFinal))) {
                            for (int i = 0; i < N_PRODUTOS; i++) {
                                for (int j = 0; j < N_SUPERMERCADOS; j++) {
                                    writer.print(precos[i][j] + " ");
                                }
                                writer.println();
                            }
                            System.out.println("Dados salvos com sucesso em '" + arquivoFinal.getPath() + "'!");
                        } catch (IOException e) {
                            System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
                        }
                    }
                    break;
                case 2:
                    System.out.print("\nDigite o nome do arquivo para ler: ");
                    String nomeArquivoLeitura = scanner.next();
                    File arquivoParaLer = new File(NOME_PASTA, nomeArquivoLeitura);
                    try (Scanner fileScanner = new Scanner(arquivoParaLer)) {
                        fileScanner.useLocale(Locale.US);
                        precos = new double[N_PRODUTOS][N_SUPERMERCADOS];
                        for (int i = 0; i < N_PRODUTOS; i++) {
                            for (int j = 0; j < N_SUPERMERCADOS; j++) {
                                precos[i][j] = fileScanner.nextDouble();
                            }
                        }
                        System.out.println("Dados lidos com sucesso de '" + arquivoParaLer.getPath() + "'!");
                    } catch (FileNotFoundException e) {
                        System.out.println("Erro: Arquivo '" + arquivoParaLer.getPath() + "' não encontrado.");
                    } catch (Exception e) {
                        System.out.println("Erro ao ler o arquivo. Verifique o formato.");
                    }
                    break;
                case 3:
                    System.out.println("Encerrando...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

            if (precos != null) {
                System.out.println("\n--- Tabela de Preços ---");
                System.out.print("Produto\t\t");
                for (int j = 0; j < N_SUPERMERCADOS; j++) {
                    System.out.printf("Sup. %d\t\t", j + 1);
                }
                System.out.println();
                for (int i = 0; i < N_PRODUTOS; i++) {
                    System.out.printf("Produto %d\t", i + 1);
                    for (int j = 0; j < N_SUPERMERCADOS; j++) {
                        System.out.printf("R$ %.2f\t\t", precos[i][j]);
                    }
                    System.out.println();
                }

                System.out.println("\n--- Análise de Preços ---");
                System.out.println("\n• Média de preço por produto:");
                for (int i = 0; i < N_PRODUTOS; i++) {
                    double somaProduto = 0;
                    for (int j = 0; j < N_SUPERMERCADOS; j++) {
                        somaProduto += precos[i][j];
                    }
                    System.out.printf("  - Produto %d: R$ %.2f%n", i + 1, somaProduto / N_SUPERMERCADOS);
                }

                System.out.println("\n• Soma de preços por supermercado:");
                double[] somaSupermercado = new double[N_SUPERMERCADOS];
                for (int j = 0; j < N_SUPERMERCADOS; j++) {
                    for (int i = 0; i < N_PRODUTOS; i++) {
                        somaSupermercado[j] += precos[i][j];
                    }
                    System.out.printf("  - Supermercado %d: R$ %.2f%n", j + 1, somaSupermercado[j]);
                }

                int supMaisBaratoIdx = 0;
                int supMaisCaroIdx = 0;
                for (int j = 1; j < N_SUPERMERCADOS; j++) {
                    if (somaSupermercado[j] < somaSupermercado[supMaisBaratoIdx]) {
                        supMaisBaratoIdx = j;
                    }
                    if (somaSupermercado[j] > somaSupermercado[supMaisCaroIdx]) {
                        supMaisCaroIdx = j;
                    }
                }

                System.out.println("\n• Supermercado mais barato e mais caro:");
                System.out.printf("  - Mais barato: Supermercado %d (Custo total: R$ %.2f)%n", supMaisBaratoIdx + 1, somaSupermercado[supMaisBaratoIdx]);
                System.out.printf("  - Mais caro:   Supermercado %d (Custo total: R$ %.2f)%n", supMaisCaroIdx + 1, somaSupermercado[supMaisCaroIdx]);
            }
        }
    }
}