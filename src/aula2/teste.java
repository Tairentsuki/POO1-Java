package aula2;

public class teste {
    public static void main(String[] args) {

        System.out.println("=-=-=-=-=-=-=For=-=-=-=-=-=-=");
        for (int contador = 1; contador < 10; contador++) {
            System.out.println(contador);
        }

        System.out.println("=-=-=-=-=-=-=While=-=-=-=-=-=-=");
        int contador2 = 0;
        while (contador2 < 10) {
            System.out.println(contador2);
            contador2++;
        }

        System.out.println("=-=-=-=-=-=-=Do-while=-=-=-=-=-=-=");
        int contador3 = 0;
        do {
            System.out.println(contador3);
            contador3++;
        } while (contador3 < 10);

    }
}

