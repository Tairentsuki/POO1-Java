package exercicios.exLista10.computador;

public class Mouse {
    private String marca;
    private String tipo;

    public Mouse(String marca, String tipo) {
        this.marca = marca;
        this.tipo = tipo;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mouse [Marca=").append(marca);
        sb.append(", Tipo=").append(tipo).append("]");
        return sb.toString();
    }
}
