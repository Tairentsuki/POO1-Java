package exercicios.exLista10.computador;

public class Processador {
    private String marca;
    private String modelo;
    private float clock;
    private float cache;

    public Processador(String marca, String modelo, float clock, float cache) {
        this.marca = marca;
        this.modelo = modelo;
        this.clock = clock;
        this.cache = cache;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public float getClock() { return clock; }
    public void setClock(float clock) { this.clock = clock; }
    public float getCache() { return cache; }
    public void setCache(float cache) { this.cache = cache; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Processador [Marca=").append(marca);
        sb.append(", Modelo=").append(modelo);
        sb.append(", Clock=").append(clock).append("GHz");
        sb.append(", Cache=").append(cache).append("MB]");
        return sb.toString();
    }
}
