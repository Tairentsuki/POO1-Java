package exercicios.exLista10.computador;

public class HD {
    private String marca;
    private String modelo;
    private float capacidade;
    private int rpm;

    public HD(String marca, String modelo, float capacidade, int rpm) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.rpm = rpm;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public float getCapacidade() { return capacidade; }
    public void setCapacidade(float capacidade) { this.capacidade = capacidade; }
    public int getRpm() { return rpm; }
    public void setRpm(int rpm) { this.rpm = rpm; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HD [Marca=").append(marca);
        sb.append(", Modelo=").append(modelo);
        sb.append(", Capacidade=").append(capacidade).append("GB");
        sb.append(", RPM=").append(rpm).append("]");
        return sb.toString();
    }
}
