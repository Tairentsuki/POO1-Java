package exercicios.exLista10.carroMotorPessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa dono = new Pessoa();

        Motor motor = new Motor();

        Carro carro = new Carro();
        carro.dono = dono;
        carro.motor = motor;

        System.out.println(carro.toString());
    }
}

