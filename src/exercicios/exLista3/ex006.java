// 6. Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.
package exercicios.exLista3;

public class ex006 {
    public static void main(String[] args) {
        int valor_inicial = 0;
        int valor_final = 50;
        for (int contador = valor_inicial; contador <= valor_final; contador++){
            if(contador % 2 == 1){
                System.out.println(contador);
            }
        }

    }
}
