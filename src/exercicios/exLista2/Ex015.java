package exercicios.exLista2;

import java.util.Scanner;

public class Ex015 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o preço de custo do produto: R$ ");
        double preco = entrada.nextDouble();

        System.out.print("Digite o código de origem (1 a 8): ");
        int codigo = entrada.nextInt();

        String procedencia;

        switch (codigo) {
            case 1:
                procedencia = "Sul";
                break;
            case 2:
                procedencia = "Norte";
                break;
            case 3:
                procedencia = "Leste";
                break;
            case 4:
                procedencia = "Oeste";
                break;
            case 5:
            case 6:
                procedencia = "Nordeste";
                break;
            case 7:
            case 8:
                procedencia = "Centro-oeste";
                break;
            default:
                procedencia = "Importado";
                break;
        }

        System.out.printf("Preço: R$ %.2f\nProcedência: %s\n", preco, procedencia);
    }
}
