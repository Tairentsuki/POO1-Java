package exercicios.exLista10.computador;

public class Memoria {
    private String marca;
    private String modelo;
    private float capacidade;
    private float velocidade;

    public Memoria(String marca, String modelo, float capacidade, float velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.velocidade = velocidade;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public float getCapacidade() { return capacidade; }
    public void setCapacidade(float capacidade) { this.capacidade = capacidade; }
    public float getVelocidade() { return velocidade; }
    public void setVelocidade(float velocidade) { this.velocidade = velocidade; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Memória [Marca=").append(marca);
        sb.append(", Modelo=").append(modelo);
        sb.append(", Capacidade=").append(capacidade).append("GB");
        sb.append(", Velocidade=").append(velocidade).append("MHz]");
        return sb.toString();
    }
}
