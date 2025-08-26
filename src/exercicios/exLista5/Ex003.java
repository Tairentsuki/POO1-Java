//3. Utilizando a estrutura de matriz, faça um programa que para um colégio que tem N (deve
//                                                                                             ser informado no início do programa) alunos e estes são avaliados em duas provas. O
//programa deve permitir digitação do nome do aluno e das duas notas e após isto mostrar as
//seguintes informações:
//        • Nome e as duas Notas de cada aluno;
//• A média de cada aluno;
//• A maior e menor nota (nome do aluno junto);
//• A maior e menor média (nome do aluno junto);
//• A média geral da turma;
//• O nome dos alunos acima e abaixo da Media Geral da Turma;
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
import java.util.ArrayList;

public class Ex003 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Para definir . em vez de ,

        Scanner scanner = new Scanner(System.in);
        final String NOME_PASTA = "src/exercicios/exLista5/arquivos_ex003";

        while (true) {
            System.out.println("\n===== SISTEMA DE NOTAS DO COLÉGIO =====");
            System.out.println("1. Inserir dados de nova turma");
            System.out.println("2. Ler dados de um arquivo");
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

            String[] nomes = null;
            double[][] notas = null;

            switch (opcao) {
                case 1:
                    int nAlunos = 0;
                    while (nAlunos <= 0) {
                        try {
                            System.out.print("\nDigite o número de alunos da turma: ");
                            nAlunos = scanner.nextInt();
                            if (nAlunos <= 0) System.out.println("O número deve ser positivo.");
                        } catch (InputMismatchException e) {
                            System.out.println("Erro: Digite um número inteiro.");
                            scanner.next();
                        }
                    }

                    nomes = new String[nAlunos];
                    notas = new double[nAlunos][2];

                    System.out.println();
                    for (int i = 0; i < nAlunos; i++) {
                        System.out.printf("--- Aluno %d ---\n", i + 1);
                        System.out.print("Nome: ");
                        nomes[i] = scanner.next();
                        for (int j = 0; j < 2; j++) {
                            while (true) {
                                try {
                                    System.out.printf("Nota da Prova %d: ", j + 1);
                                    notas[i][j] = scanner.nextDouble();
                                    break;
                                } catch (InputMismatchException e) {
                                    System.out.println("Erro: Digite um valor numérico.");
                                    scanner.next();
                                }
                            }
                        }
                    }

                    System.out.print("\nDeseja salvar estes dados em um arquivo? (s/n): ");
                    if (scanner.next().equalsIgnoreCase("s")) {
                        System.out.print("Digite o nome do arquivo (ex: turmaA.txt): ");
                        String nomeArquivo = scanner.next();
                        File diretorio = new File(NOME_PASTA);
                        if (!diretorio.exists()) {
                            diretorio.mkdirs();
                        }
                        File arquivoFinal = new File(diretorio, nomeArquivo);
                        try (PrintWriter writer = new PrintWriter(new FileWriter(arquivoFinal))) {
                            writer.println(nAlunos);
                            for (int i = 0; i < nAlunos; i++) {
                                writer.printf(Locale.US, "%s %.1f %.1f%n", nomes[i], notas[i][0], notas[i][1]);
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
                        int nLidos = fileScanner.nextInt();
                        nomes = new String[nLidos];
                        notas = new double[nLidos][2];
                        for (int i = 0; i < nLidos; i++) {
                            nomes[i] = fileScanner.next();
                            notas[i][0] = fileScanner.nextDouble();
                            notas[i][1] = fileScanner.nextDouble();
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

            if (nomes != null && notas != null) {
                int nAlunos = nomes.length;
                double[] medias = new double[nAlunos];
                double somaGeral = 0;

                System.out.println("\n--- Boletim da Turma ---");
                for (int i = 0; i < nAlunos; i++) {
                    double mediaAluno = (notas[i][0] + notas[i][1]) / 2.0;
                    medias[i] = mediaAluno;
                    somaGeral += mediaAluno;
                    System.out.printf("• Aluno: %-15s | P1: %4.1f | P2: %4.1f | Média: %4.1f%n", nomes[i], notas[i][0], notas[i][1], mediaAluno);
                }

                double maiorNota = notas[0][0];
                String alunoMaiorNota = nomes[0];
                double menorNota = notas[0][0];
                String alunoMenorNota = nomes[0];

                for (int i = 0; i < nAlunos; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (notas[i][j] > maiorNota) {
                            maiorNota = notas[i][j];
                            alunoMaiorNota = nomes[i];
                        }
                        if (notas[i][j] < menorNota) {
                            menorNota = notas[i][j];
                            alunoMenorNota = nomes[i];
                        }
                    }
                }

                double maiorMedia = medias[0];
                String alunoMaiorMedia = nomes[0];
                double menorMedia = medias[0];
                String alunoMenorMedia = nomes[0];

                for (int i = 1; i < nAlunos; i++) {
                    if (medias[i] > maiorMedia) {
                        maiorMedia = medias[i];
                        alunoMaiorMedia = nomes[i];
                    }
                    if (medias[i] < menorMedia) {
                        menorMedia = medias[i];
                        alunoMenorMedia = nomes[i];
                    }
                }

                double mediaGeral = somaGeral / nAlunos;

                System.out.println("\n--- Análise da Turma ---");
                System.out.printf("• Maior nota: %.1f (Aluno: %s)%n", maiorNota, alunoMaiorNota);
                System.out.printf("• Menor nota: %.1f (Aluno: %s)%n", menorNota, alunoMenorNota);
                System.out.printf("• Maior média: %.1f (Aluno: %s)%n", maiorMedia, alunoMaiorMedia);
                System.out.printf("• Menor média: %.1f (Aluno: %s)%n", menorMedia, alunoMenorMedia);
                System.out.printf("• Média geral da turma: %.2f%n", mediaGeral);

                ArrayList<String> acimaMedia = new ArrayList<>();
                ArrayList<String> abaixoMedia = new ArrayList<>();

                for (int i = 0; i < nAlunos; i++) {
                    if (medias[i] >= mediaGeral) {
                        acimaMedia.add(nomes[i]);
                    } else {
                        abaixoMedia.add(nomes[i]);
                    }
                }

                System.out.println("\n• Alunos com média igual ou acima da média da turma:");
                System.out.println("  " + (acimaMedia.isEmpty() ? "Nenhum" : String.join(", ", acimaMedia)));
                System.out.println("\n• Alunos com média abaixo da média da turma:");
                System.out.println("  " + (abaixoMedia.isEmpty() ? "Nenhum" : String.join(", ", abaixoMedia)));
            }
        }
    }
}