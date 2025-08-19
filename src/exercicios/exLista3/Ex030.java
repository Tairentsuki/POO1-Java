//30. Uma academia deseja fazer um senso entre seus clientes para descobrir o mais alto, o
//mais baixo, a mais gordo e o mais magro, para isto você deve fazer um programa que
//pergunte a cada um dos clientes da academia seu código, sua altura e seu peso. O final da
//digitação de dados deve ser dada quando o usuário digitar 0 (zero) no campo código. Ao
//encerrar o programa também deve ser informados os códigos e valores do clente mais alto,
//do mais baixo, do mais gordo e do mais magro, além da média das alturas e dos pesos dos
//clientes.

package exercicios.exLista3;

import java.util.Scanner;

public class Ex030 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Academia - Censo de Clientes");

        int codigo;
        double altura, peso;

        int codigoMaisAlto = 0, codigoMaisBaixo = 0;
        int codigoMaisGordo = 0, codigoMaisMagro = 0;
        double maiorAltura = Double.MIN_VALUE, menorAltura = Double.MAX_VALUE;
        double maiorPeso = Double.MIN_VALUE, menorPeso = Double.MAX_VALUE;

        double somaAlturas = 0.0, somaPesos = 0.0;
        int contador = 0;

        while (true) {
            System.out.print("Código do cliente (0 para sair): ");
            codigo = entrada.nextInt();

            if (codigo == 0) {
                break;
            }

            System.out.print("Altura (em metros): ");
            altura = entrada.nextDouble();

            System.out.print("Peso (em kg): ");
            peso = entrada.nextDouble();

            contador++;
            somaAlturas += altura;
            somaPesos += peso;

            if (altura > maiorAltura) {
                maiorAltura = altura;
                codigoMaisAlto = codigo;
            }
            if (altura < menorAltura) {
                menorAltura = altura;
                codigoMaisBaixo = codigo;
            }

            if (peso > maiorPeso) {
                maiorPeso = peso;
                codigoMaisGordo = codigo;
            }
            if (peso < menorPeso) {
                menorPeso = peso;
                codigoMaisMagro = codigo;
            }

            System.out.println();
        }

        if (contador > 0) {
            double mediaAlturas = somaAlturas / contador;
            double mediaPesos = somaPesos / contador;

            System.out.println("=== RELATÓRIO DO CENSO ===");
            System.out.printf("Cliente mais alto: Código %d - %.2fm\n", codigoMaisAlto, maiorAltura);
            System.out.printf("Cliente mais baixo: Código %d - %.2fm\n", codigoMaisBaixo, menorAltura);
            System.out.printf("Cliente mais gordo: Código %d - %.2fkg\n", codigoMaisGordo, maiorPeso);
            System.out.printf("Cliente mais magro: Código %d - %.2fkg\n", codigoMaisMagro, menorPeso);
            System.out.printf("Media das alturas: %.2fm\n", mediaAlturas);
            System.out.printf("Media dos pesos: %.2fkg\n", mediaPesos);
            System.out.printf("Total de clientes: %d\n", contador);
        } else {
            System.out.println("Nenhum cliente foi cadastrado.");
        }

        entrada.close();
    }
}