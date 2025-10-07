package exercicios.exLista10.carroMotorPessoa;

public class Carro {
    private String fabricante;
    private String modelo;
    private String cor;
    private int ano;
    protected Pessoa dono;
    protected Motor motor;

    public String toString() {
        return "Fabricante: " + fabricante +
                ", Modelo: " + modelo +
                ", Cor: " + cor +
                ", Ano: " + ano +
                ", Dono: " + (dono != null ? dono.toString() : "Nenhum") +
                ", Motor: " + (motor != null ? motor.toString() : "Nenhum");
    }
}
