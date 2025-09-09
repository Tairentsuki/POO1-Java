//4. Faça um Programa que pergunte quanto você ganha por hora e o número de
//        horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido
//        mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8%
//        para o INSS e 5% para o sindicato, faça um programa que nos dê:
//        - Salário bruto.
//        - Quanto pagou ao INSS.
//        - Quanto pagou ao sindicato.
//        - O salário líquido.
//        Calcule os descontos e o salário líquido, conforme a tabela abaixo:
//        + Salário Bruto : R$
//        - IR (11%) : R$
//        - INSS (8%) : R$
//        - Sindicato ( 5%) : R$
//        = Salário Liquido : R$
//        Obs.: Salário Bruto - Descontos = Salário Líquido
//        Utilize métodos para calcular cada um dos descontos, o total de descontos e
//        o salário líquido.

package exercicios.exLista6.ex004;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        FolhaPagamento folha = new FolhaPagamento();

        System.out.print("Digite quanto você ganha por hora: R$ ");
        folha.setValorHora(entrada.nextDouble());

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        folha.setHorasTrabalhadas(entrada.nextDouble());

        folha.mostrarResumo();

        entrada.close();
    }
}
