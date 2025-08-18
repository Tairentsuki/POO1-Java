//19. Faça um programa que mostre todos os primos entre 1 e N sendo N um número inteiro
//fornecido pelo usuário. O programa deverá mostrar também o número de divisões que ele
//executou para encontrar os números primos.

package exercicios.exLista3;

import java.util.Scanner;

public class Ex019 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o até qual número quer encontrar os números primos: ");
        int limite = entrada.nextInt();
        int contagemDeDivisoesGeral = 0;
        for (int n = 1; n <= limite; n++) {
            int contagemDeDivisoes = 0;
            for (int contador = 1; contador <= n; contador++) {
                if (n % contador == 0) {
                    contagemDeDivisoes++;
                    contagemDeDivisoesGeral++;
                }
            }
            if(contagemDeDivisoes == 2){
                System.out.println("O número " + n + " é primo.");
            }
        }
        System.out.println("Foram executadas " + contagemDeDivisoesGeral + " divisões.");

    }
}
