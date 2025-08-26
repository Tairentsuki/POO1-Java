//5. Criar uma loteria com 6 números de 1 a 60. Solicitar ao usuário quantas cartelas deseja
//preencher criar uma matriz deste tamanho para armazenar os valores que serão criados
//aleatoriamente. No final analisar cada uma das cartelas e mostrar ao lado do números (ordenados
//em ordem crescente e não repetidos dentro da mesma cartela) o total de acertos.
//Permitir gravar e ler estes dados de um arquivo.

package exercicios.exLista5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String NOME_PASTA = "src/exercicios/exLista5/arquivos_ex005";
        final int NUMEROS_POR_CARTELA = 6;
        final int NUMERO_MAXIMO = 60;

        while (true) {
            System.out.println("\n===== LOTERIA 6/60 =====");
            System.out.println("1. Gerar novo sorteio e cartelas");
            System.out.println("2. Carregar sorteio de arquivo");
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

            int[] numerosSorteados = null;
            int[][] cartelas = null;

            switch (opcao) {
                case 1:
                    Random random = new Random();
                    ArrayList<Integer> sorteioUnico = new ArrayList<>();
                    while (sorteioUnico.size() < NUMEROS_POR_CARTELA) {
                        int num = random.nextInt(NUMERO_MAXIMO) + 1;
                        if (!sorteioUnico.contains(num)) {
                            sorteioUnico.add(num);
                        }
                    }
                    Collections.sort(sorteioUnico);
                    numerosSorteados = new int[NUMEROS_POR_CARTELA];
                    for(int i=0; i < NUMEROS_POR_CARTELA; i++) numerosSorteados[i] = sorteioUnico.get(i);

                    int nCartelas = 0;
                    while (nCartelas <= 0) {
                        try {
                            System.out.print("\nDigite quantas cartelas deseja gerar: ");
                            nCartelas = scanner.nextInt();
                            if(nCartelas <= 0) System.out.println("O número deve ser positivo.");
                        } catch (InputMismatchException e) {
                            System.out.println("Erro: Digite um número inteiro.");
                            scanner.next();
                        }
                    }
                    cartelas = new int[nCartelas][NUMEROS_POR_CARTELA];
                    for (int i = 0; i < nCartelas; i++) {
                        ArrayList<Integer> cartelaUnica = new ArrayList<>();
                        while (cartelaUnica.size() < NUMEROS_POR_CARTELA) {
                            int num = random.nextInt(NUMERO_MAXIMO) + 1;
                            if (!cartelaUnica.contains(num)) {
                                cartelaUnica.add(num);
                            }
                        }
                        for(int j=0; j < NUMEROS_POR_CARTELA; j++) cartelas[i][j] = cartelaUnica.get(j);
                    }
                    System.out.println("Sorteio e cartelas gerados com sucesso!");

                    System.out.print("\nDeseja salvar este sorteio? (s/n): ");
                    if (scanner.next().equalsIgnoreCase("s")) {
                        System.out.print("Digite o nome do arquivo (ex: loteria.txt): ");
                        String nomeArquivo = scanner.next();
                        File diretorio = new File(NOME_PASTA);
                        if (!diretorio.exists()) diretorio.mkdirs();
                        File arquivoFinal = new File(diretorio, nomeArquivo);
                        try (PrintWriter writer = new PrintWriter(new FileWriter(arquivoFinal))) {
                            for(int i=0; i < NUMEROS_POR_CARTELA; i++) writer.print(numerosSorteados[i] + " ");
                            writer.println();
                            writer.println(nCartelas);
                            for (int i = 0; i < nCartelas; i++) {
                                for(int j=0; j < NUMEROS_POR_CARTELA; j++) writer.print(cartelas[i][j] + " ");
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
                        numerosSorteados = new int[NUMEROS_POR_CARTELA];
                        for(int i=0; i < NUMEROS_POR_CARTELA; i++) numerosSorteados[i] = fileScanner.nextInt();
                        int nLidas = fileScanner.nextInt();
                        cartelas = new int[nLidas][NUMEROS_POR_CARTELA];
                        for (int i = 0; i < nLidas; i++) {
                            for(int j=0; j < NUMEROS_POR_CARTELA; j++) cartelas[i][j] = fileScanner.nextInt();
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

            if (numerosSorteados != null && cartelas != null) {
                System.out.println("\n--- RESULTADO DA LOTERIA ---");
                System.out.print("Números Sorteados: ");
                for (int num : numerosSorteados) {
                    System.out.printf("%02d ", num);
                }
                System.out.println("\n\n--- Análise das Cartelas ---");

                for (int i = 0; i < cartelas.length; i++) {
                    int[] cartelaAtual = cartelas[i];
                    Arrays.sort(cartelaAtual);

                    int acertos = 0;
                    for (int numeroDaCartela : cartelaAtual) {
                        for (int numeroSorteado : numerosSorteados) {
                            if (numeroDaCartela == numeroSorteado) {
                                acertos++;
                                break;
                            }
                        }
                    }

                    System.out.printf("Cartela %02d: [", i + 1);
                    for (int j = 0; j < cartelaAtual.length; j++) {
                        System.out.printf("%02d%s", cartelaAtual[j], j < cartelaAtual.length - 1 ? ", " : "");
                    }
                    System.out.printf("] -> Acertos: %d%n", acertos);
                }
            }
        }
    }
}