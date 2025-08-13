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
        int qnt;
        do{
            System.out.print("Qual a quantidade de numeros que devem ser gerados em uma amostra aleatória: ");
            qnt = entrada.nextInt();
            if(qnt<=0){
                System.out.println("A quantidade deve ser maior que 0, tente novamente.\n");
            }
        }while (qnt <= 0);
        System.out.print("Quais os valores mínimos possiveis da amostra: ");
        int valor_minimo = entrada.nextInt();
        System.out.print("Quais os valores maximos possiveis da amostra: ");
        int valor_maximo = entrada.nextInt();
        entrada.close();

        // Gerar valores aleatórios
        if(valor_minimo > valor_maximo){
            System.out.println("valores mínimos e máximos invertidos, será corrigido pelo programa.");
            int aux = valor_minimo;
            valor_minimo = valor_maximo;
            valor_maximo = aux;
        }

        Random random = new Random();
        String valores = "['y', 'x'],";
        for(int contador = 1; contador <= qnt; contador++){
            if(contador < qnt){
                valores += "\n['" + contador + "'," + (random.nextInt(valor_minimo, valor_maximo+1)) + "],";
            }else{
                valores += "\n['" + contador + "'," + (random.nextInt(valor_minimo, valor_maximo+1)) + "]";
            }
        }

        System.out.println(valores);

        // Gerar arquivo
        String caminhoArquivo = "src/desafios/aulas.aula2/grafico.html";
        String conteudo = Files.readString(Path.of("src/desafios/aulas.aula2/GoogleCharts.html")).replace("<<valores>>", valores);
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