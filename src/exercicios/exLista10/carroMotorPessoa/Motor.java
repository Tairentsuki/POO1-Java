package exercicios.exLista10.carroMotorPessoa;

public class Motor {
    private String marca;
    private float potencia;
    private int cilindros;
    private String combustivel;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Marca: ").append(marca);
        sb.append(", Potência: ").append(potencia);
        sb.append(", Cilindros: ").append(cilindros);
        sb.append(", Combustível: ").append(combustivel);
        return sb.toString();
    }
}
