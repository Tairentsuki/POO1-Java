package exercicios.exLista10.computador;

public class Gabinete {
    private String modelo;
    private String tipo;
    private int baias;
    protected PlacaMae placaMae;

    public Gabinete(String modelo, String tipo, int baias, PlacaMae placaMae) {
        this.modelo = modelo;
        this.tipo = tipo;
        this.baias = baias;
        this.placaMae = placaMae;
    }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public int getBaias() { return baias; }
    public void setBaias(int baias) { this.baias = baias; }
    public PlacaMae getPlacaMae() { return placaMae; }
    public void setPlacaMae(PlacaMae placaMae) { this.placaMae = placaMae; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nGabinete: ").append(modelo);
        sb.append(" (Tipo: ").append(tipo);
        sb.append(", Baias: ").append(baias).append(")");
        sb.append(placaMae.toString());
        return sb.toString();
    }
}
