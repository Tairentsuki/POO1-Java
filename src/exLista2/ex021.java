package exLista2;

import java.util.Scanner;

public class ex021 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma data (dd/mm/aaaa): ");
        String data = entrada.nextLine();

        String[] partes = data.split("/");

        if (partes.length != 3) {
            System.out.println("Data inválida");
            return;
        }

        try {
            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]);
            int ano = Integer.parseInt(partes[2]);

            boolean dataValida = true;

            if (ano < 1) dataValida = false;
            if (mes < 1 || mes > 12) dataValida = false;

            int[] diasNoMes = {31, (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            if (dia < 1 || dia > diasNoMes[mes - 1]) dataValida = false;

            if (dataValida) {
                System.out.println("Data válida.");
            } else {
                System.out.println("Data inválida.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Data inválida.");
        }
    }
}
