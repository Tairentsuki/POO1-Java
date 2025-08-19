//22. Numa eleição existem três candidatos. Faça um programa que peça o número total de
//votantes. Peça para cada votante votar e ao final mostrar o número de votos de cada
//candidato.

package exercicios.exLista3;

import java.util.Scanner;

public class Ex022 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite quantos votantes há: ");
        int totalVotantes = entrada.nextInt();

        int[] votos = new int[3];
        int voto;
        for (int contador = 1; contador <= totalVotantes; contador++) {
            System.out.println("\n\n\n");
            do {
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("Votante " + contador);
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

                System.out.print("""
                        Vote em um dos candidatos inserindo o número correspondente: \
                        
                         (1) - Candidato 1 \
                        
                         (2) - Candidato 2 \
                        
                         (3) - Candidato 3 \
                        
                         Digite o número correspondênte ao candidato escolhido:\s""");
                voto = entrada.nextInt();
                switch (voto) {
                    case 1:
                    case 2:
                    case 3:
                        votos[voto - 1]++;
                        break;
                    default:
                        System.out.println("\n\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                        System.out.println("Por favor insira um número válido (1-3), tente novamente.");
                        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                }
            } while (voto < 1 || voto > 3);
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Total de votos");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Candidato 1: " + votos[0]);
        System.out.println("Candidato 2: " + votos[1]);
        System.out.println("Candidato 3: " + votos[2]);
        if (votos[0] > votos[1] && votos[0] > votos[2]) {
            System.out.println("O candidato 1 venceu com " + votos[0] + " votos");
        } else if (votos[1] > votos[0] && votos[1] > votos[2]) {
            System.out.println("O candidato 2 venceu com " + votos[1] + " votos");
        } else {
            System.out.println("O candidato 3 venceu com " + votos[2] + " votos");
        }

    }
}