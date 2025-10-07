package exercicios.exLista10.computador;

public class PlacaMae {
    private String marca;
    private String modelo;
    protected Processador processador;
    protected HD hd;
    protected Memoria memoria;

    public PlacaMae(String marca, String modelo, Processador processador, HD hd, Memoria memoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.processador = processador;
        this.hd = hd;
        this.memoria = memoria;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public Processador getProcessador() { return processador; }
    public void setProcessador(Processador processador) { this.processador = processador; }
    public HD getHd() { return hd; }
    public void setHd(HD hd) { this.hd = hd; }
    public Memoria getMemoria() { return memoria; }
    public void setMemoria(Memoria memoria) { this.memoria = memoria; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\tPlaca Mãe: ").append(marca).append(" ").append(modelo);
        sb.append("\n\t\t").append(processador.toString());
        sb.append("\n\t\t").append(memoria.toString());
        sb.append("\n\t\t").append(hd.toString());
        return sb.toString();
    }
}
