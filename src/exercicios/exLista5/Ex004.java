//4. Nas Olimpíadas do IFC estão ocorrendo várias competições, entre elas salto em
//distância, nesta competição cada atleta tem direito a cinco saltos, para valorizar o atleta
//mais constante é feita a média dos saltos, desprezando o pior salto. Você foi contratado para
//implementar um sistema que fará o controle desta competição, utilizando o recurso de Matriz,
//resolva os itens abaixo:
//
//        • Solicitar os cinco saltos de cada atleta;
//• Após o atleta saltar mostrar a média;
//• Permitir a utilização do sistema por N atletas (informado no inicio da aplicação);
//• Ao final, ou seja, após os N atletas digitarem os saltos o programa deve mostrar:
//        • Saltos de cada atleta, seguidos de sua média;
//• A média dos saltos do campeão e do último lugar;
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

public class Ex004 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Para definir . em vez de ,
        Scanner entrada = new Scanner(System.in);
        final String NOME_PASTA = "src/exercicios/exLista5/arquivos_ex004";
        final int N_SALTOS = 5;

        while (true) {
            System.out.println("\n===== OLIMPÍADAS IFC - SALTO EM DISTÂNCIA =====");
            System.out.println("1. Iniciar nova competição");
            System.out.println("2. Carregar competição de arquivo");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = 0;
            try {
                opcao = entrada.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Erro: Opção inválida.");
                entrada.nextLine();
                continue;
            }

            String[] nomes = null;
            double[][] saltos = null;

            switch (opcao) {
                case 1:
                    int nAtletas = 0;
                    while (nAtletas <= 0) {
                        try {
                            System.out.print("\nDigite o número de atletas: ");
                            nAtletas = entrada.nextInt();
                            if (nAtletas <= 0) System.out.println("O número deve ser positivo.");
                        } catch (InputMismatchException e) {
                            System.out.println("Erro: Digite um número inteiro.");
                        }
                    }
                    nomes = new String[nAtletas];
                    saltos = new double[nAtletas][N_SALTOS];

                    for (int i = 0; i < nAtletas; i++) {
                        entrada.nextLine();
                        System.out.printf("\n--- Atleta %d ---\n", i + 1);
                        System.out.print("Nome: ");
                        nomes[i] = entrada.nextLine();
                        double somaSaltos = 0;
                        double piorSalto = Double.MAX_VALUE;
                        for (int j = 0; j < N_SALTOS; j++) {
                            while (true) {
                                try {
                                    System.out.printf("Distância do salto %d: ", j + 1);
                                    saltos[i][j] = entrada.nextDouble();
                                    somaSaltos += saltos[i][j];
                                    if(saltos[i][j] < piorSalto) {
                                        piorSalto = saltos[i][j];
                                    }
                                    break;
                                } catch (InputMismatchException e) {
                                    System.out.println("Erro: Digite um valor numérico.");
                                    entrada.nextLine();
                                }
                            }
                        }
                        double mediaAtleta = (somaSaltos - piorSalto) / (N_SALTOS - 1);
                        System.out.printf("-> Média de %s: %.2f m%n", nomes[i], mediaAtleta);
                    }

                    entrada.nextLine();
                    System.out.print("\nDeseja salvar esta competição? (s/n): ");
                    String resposta = entrada.nextLine();
                    if (resposta.equalsIgnoreCase("s")) {
                        System.out.print("Digite o nome do arquivo (ex: saltos.txt): ");
                        String nomeArquivo = entrada.nextLine();
                        File diretorio = new File(NOME_PASTA);
                        if (!diretorio.exists()) diretorio.mkdirs();
                        File arquivoFinal = new File(diretorio, nomeArquivo);
                        try (PrintWriter writer = new PrintWriter(new FileWriter(arquivoFinal))) {
                            writer.println(nAtletas);
                            for (int i = 0; i < nAtletas; i++) {
                                writer.print(nomes[i] + " ");
                                for(int j = 0; j < N_SALTOS; j++){
                                    writer.print(saltos[i][j] + " ");
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
                    String nomeArquivoLeitura = entrada.nextLine();
                    File arquivoParaLer = new File(NOME_PASTA, nomeArquivoLeitura);
                    try (Scanner fileScanner = new Scanner(arquivoParaLer)) {
                        fileScanner.useLocale(Locale.US);
                        int nLidos = fileScanner.nextInt();
                        nomes = new String[nLidos];
                        saltos = new double[nLidos][N_SALTOS];
                        for (int i = 0; i < nLidos; i++) {
                            nomes[i] = fileScanner.nextLine();
                            for(int j = 0; j < N_SALTOS; j++){
                                saltos[i][j] = fileScanner.nextDouble();
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
                    entrada.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

            if (nomes != null && saltos != null) {
                System.out.println("\n--- RELATÓRIO FINAL DA COMPETIÇÃO ---");
                int nAtletas = nomes.length;
                double[] medias = new double[nAtletas];

                for (int i = 0; i < nAtletas; i++) {
                    double somaSaltos = 0;
                    double piorSalto = saltos[i][0];
                    for (int j = 0; j < N_SALTOS; j++) {
                        somaSaltos += saltos[i][j];
                        if (saltos[i][j] < piorSalto) {
                            piorSalto = saltos[i][j];
                        }
                    }
                    medias[i] = (somaSaltos - piorSalto) / (N_SALTOS - 1);
                }

                for(int i = 0; i < nAtletas; i++){
                    System.out.printf("\n• Atleta: %s\n", nomes[i]);
                    System.out.print("  Saltos: ");
                    for(int j = 0; j < N_SALTOS; j++){
                        System.out.printf("%.2f m | ", saltos[i][j]);
                    }
                    System.out.printf("\n  Média Final: %.2f m%n", medias[i]);
                }

                int campeaoIdx = 0;
                int ultimoIdx = 0;
                for(int i = 1; i < nAtletas; i++){
                    if(medias[i] > medias[campeaoIdx]){
                        campeaoIdx = i;
                    }
                    if(medias[i] < medias[ultimoIdx]){
                        ultimoIdx = i;
                    }
                }

                System.out.println("\n--- PÓDIO ---");
                System.out.printf("• Campeão: %s | Média: %.2f m%n", nomes[campeaoIdx], medias[campeaoIdx]);
                System.out.printf("• Último Lugar: %s | Média: %.2f m%n", nomes[ultimoIdx], medias[ultimoIdx]);
            }
        }
    }
}