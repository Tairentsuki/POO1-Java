package exercicios.exLista10.carroMotorPessoa;

public class Main {
    public static void main(String[] args) {

        // instancia pessoa (dono)
        Pessoa dono = new Pessoa();

        // instancia motor
        Motor motor = new Motor();

        // instancia carro e associa dono e motor (campos protegidos)
        Carro carro = new Carro();
        carro.dono = dono;
        carro.motor = motor;

        // imprime representacao do carro (toString)
        System.out.println(carro.toString());
    }
}

