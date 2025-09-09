package exercicios.exLista6.ex010;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Televisor tv = new Televisor();
        tv.setCanal(1);
        tv.setVolume(10);

        System.out.println("=== TELEVISOR ===");

        while (true) {
            System.out.printf("\nCanal atual: %d | Volume atual: %d\n", tv.getCanal(), tv.getVolume());
            System.out.println("1-Mudar canal \n2-Aumentar volume \n3-Diminuir volume \n4-Definir volume \n0-Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Novo canal (1-100): ");
                    tv.mudarCanal(scanner.nextInt());
                    break;
                case 2:
                    tv.aumentarVolume();
                    break;
                case 3:
                    tv.diminuirVolume();
                    break;
                case 4:
                    System.out.print("Novo volume (0-100): ");
                    tv.definirVolume(scanner.nextInt());
                    break;
                case 0:
                    scanner.close();
                    return;
            }
        }
    }
}