//15. Mostre e calcule a série S = (37*38)/1 + (36*37)/2 + (35*36)/3 + ... + (1*2)/37.

package exercicios.exLista3;

public class Ex015 {
    public static void main(String[] args) {
        int numerador = 37;
        int denominador = 38;
        int divisor = 1;

        double resultado = 0;
        while (numerador > 1){
            resultado += ((double) numerador * denominador) / divisor;
            System.out.printf("(%d * %d)/%d \n+ ", numerador, denominador, divisor);
            numerador--;
            denominador--;
            divisor++;
        }
        resultado += ((double) numerador * denominador) / divisor;
        System.out.printf("(%d * %d)/%d \n= ", numerador, denominador, divisor);
        System.out.println(resultado);

    }
}
