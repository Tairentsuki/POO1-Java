//5. Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro. Depois
//modifique o programa para que ele mostre os números um ao lado do outro.

package exercicios.exLista3;

public class Ex005 {
    public static void main(String[] args) {
        //Versão 1
//        for(int n = 1; n<=20; n++){
//            System.out.println(n);
//        }

        //Versão 2
        int inicio = 1;
        int limite = 20;
        int n;
        for(n = inicio; n<=limite-1; n++){
            System.out.print(n+ ", ");
        }
        System.out.println(n);

    }
}
