//10. Faça um programa que peça uma data no padrão dd/mm/aaaa, valide esta data e coloque
//cada item em uma posição de um vetor de inteiros de tamanho 3.

package exercicios.exLista4;

import java.util.Scanner;

public class Ex010 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Digite uma data no padrão dd/mm/aaaa: ");
            String dataInput = scanner.nextLine();

            int[] dataArray = validarData(dataInput);

            if (dataArray != null) {
                System.out.println("---");
                System.out.println("Data validada com sucesso!");
                System.out.println("Dia: " + dataArray[0]);
                System.out.println("Mês: " + dataArray[1]);
                System.out.println("Ano: " + dataArray[2]);
                break;
            } else {
                System.out.println("---");
                System.out.println("Erro: Data inválida. Tente novamente.");

            }

        }
        scanner.close();
    }

    /**
     * Valida uma string de data e a converte para um array de inteiros.
     *
     * @param dataString A string de data no formato dd/mm/aaaa.
     * @return Um array de inteiros [dia, mês, ano] se a data for válida, ou null caso contrário.
     */
    public static int[] validarData(String dataString) {
        // 1. Verificação do formato
        if (!dataString.matches("\\d{2}/\\d{2}/\\d{4}")) {
            return null;
        }

        String[] partes = dataString.split("/");

        int dia, mes, ano;
        try {
            dia = Integer.parseInt(partes[0]);
            mes = Integer.parseInt(partes[1]);
            ano = Integer.parseInt(partes[2]);
        } catch (NumberFormatException e) {
            return null;
        }

        if (ano < 1 || mes < 1 || mes > 12 || dia < 1) {
            return null;
        }

        int[] diasNoMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        boolean isBissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
        if (isBissexto) {
            diasNoMes[2] = 29;
        }

        if (dia > diasNoMes[mes]) {
            return null;
        }

        return new int[]{dia, mes, ano};
    }
}