package desafios.aula2;

import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class GeradorDeGrafico {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        // Obter valores
        System.out.print("Qual a quantidade de numeros que devem ser gerados em uma amostra aleatória:");
        int qnt = entrada.nextInt();
        System.out.print("Quais os valores mínimos possiveis da amostra:");
        int valor_minimo = entrada.nextInt();
        System.out.print("Quais os valores maximos possiveis da amostra:");
        int valor_maximo = entrada.nextInt();

        // Gerar valores aleatórios
        Random random = new Random();
        String valores = "['y', 'x'],";
        for(int contador = 1; contador <= qnt; contador++){
            if(contador < qnt){
                valores += "" +
                        "\n['" + contador + "'," + (random.nextInt(valor_minimo, valor_maximo) + 1) + "],";
            }else{
                valores += "\n[" + (random.nextInt(valor_minimo, valor_maximo) + 1) + "," + contador + "]";
            }
        }

        System.out.println(valores);

        // Gerar arquivo
        String caminhoArquivo = "src/desafios/aula2/grafico.html";
        String conteudo = Files.readString(Path.of("src/desafios/aula2/GoogleCharts.html")).replace("<<valores>>", valores);
        System.out.println(conteudo);
        try {
            FileWriter writer = new FileWriter(caminhoArquivo);
            writer.write(conteudo);
            writer.close();
            System.out.println("Arquivo criado com sucesso!");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao criar o arquivo: " + e.getMessage());
        }
    }
}