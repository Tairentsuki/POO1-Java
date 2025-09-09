package aulas.aula5.ex002;

public class Numeros {
    private int n1, n2;

    public void mostrarIntervalo() {

        if (n1 == n2) {
            System.out.println("Os números são iguais. Não há intervalo.");
            return;
        }

        if (n1 > n2) {
            System.out.println("Você digitou os valores em ordem inversa. O programa fará a inversão.");
            int aux = n1;
            n1 = n2;
            n2 = aux;
        }

        System.out.println("Números entre " + n1 + " e " + n2 + ":");
        for (int i = n1 + 1; i < n2; i++) {
            System.out.println(i);
        }
    }

    public Numeros() {
    }

    public Numeros(int n1) {
        setN1(n1);
    }

    public Numeros(int n1, int n2) {
        setN1(n1);
        setN2(n2);
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
}
