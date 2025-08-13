package exercicios.exLista1;

import java.util.Scanner;
import static java.lang.Math.ceil;

public class ex015 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float coberturaTinta = 3; // m² por litro
        float tamanhoLataEmLitros = 18;
        float valorLata = 80;

        System.out.print("Digite a área a ser pintada (M²): ");
        float area = entrada.nextFloat();

        // Quantos litros de tinta serão necessários
        double litrosNecessarios = area / coberturaTinta;

        // Quantidade de latas, arredondando para cima
        double latasNecessarias = ceil(litrosNecessarios / tamanhoLataEmLitros);

        double precoTotal = latasNecessarias * valorLata;

        System.out.println("São necessárias " + (int)latasNecessarias + " latas de tinta.");
        System.out.println("Preço total: R$ " + precoTotal);
    }
}
