package exLista1;

import java.util.Scanner;
import static java.lang.Math.ceil;

public class ex016 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float coberturaPorLitro = 6; // m² por litro
        float tamanhoLata = 18;      // litros
        float precoLata = 80;
        float tamanhoGalao = 3.6f;   // litros
        float precoGalao = 25;

        System.out.print("Digite a área a ser pintada (M²): ");
        float area = entrada.nextFloat();

        double litrosNecessarios = area / coberturaPorLitro;

        // Situação 1: apenas latas de 18L
        int latasNecessarias = (int) ceil(litrosNecessarios / tamanhoLata);
        double precoTotalLatas = latasNecessarias * precoLata;

        // Situação 2: apenas galões de 3,6L
        int galoesNecessarios = (int) ceil(litrosNecessarios / tamanhoGalao);
        double precoTotalGaloes = galoesNecessarios * precoGalao;

        System.out.println("Apenas latas de 18L:");
        System.out.println(" - Quantidade: " + latasNecessarias);
        System.out.println(" - Preço total: R$ " + precoTotalLatas);

        System.out.println("\nApenas galões de 3,6L:");
        System.out.println(" - Quantidade: " + galoesNecessarios);
        System.out.println(" - Preço total: R$ " + precoTotalGaloes);
    }
}
