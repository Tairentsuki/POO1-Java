package exercicios.exLista10.carroMotorPessoa;

public class Carro {
    private String fabricante;
    private String modelo;
    private String cor;
    private int ano;
    protected Pessoa dono;
    protected Motor motor;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fabricante: ").append(fabricante);
        sb.append(", Modelo: ").append(modelo);
        sb.append(", Cor: ").append(cor);
        sb.append(", Ano: ").append(ano);
        sb.append(", Dono: ").append(dono != null ? dono.toString() : "Nenhum");
        sb.append(", Motor: ").append(motor != null ? motor.toString() : "Nenhum");
        return sb.toString();
    }
}
