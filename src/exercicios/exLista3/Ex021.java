    //21. Faça um programa que peça para n pessoas a sua idade, ao final o programa devera
    //verificar se a média de idade da turma varia entre 0 e 25,26 e 60 e maior que 60; e então,
    //dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.

    package exercicios.exLista3;

    import java.util.Scanner;

    public class Ex021 {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite o número de pessoas: ");
            int quantidadeDePessoas = entrada.nextInt();

            int somatorioIdades = 0;
            for (int contador = 1; contador <= quantidadeDePessoas; contador++) {
                System.out.println("Digite a idade da " + contador + "° pessoa: ");
                somatorioIdades += entrada.nextInt();
            }

            float media = (float) somatorioIdades/quantidadeDePessoas;
            System.out.println("A média das idades é " + media);

            if(media > 0 && media < 25.26){
                System.out.println("A turma é jovem");
            }else if(media >= 25.26 && media < 60){
                System.out.println("A turma é adulta");
            }else{
                System.out.println("A turma é idosa");
            }

        }
    }
