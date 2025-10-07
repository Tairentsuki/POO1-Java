package exercicios.exLista10.homeTheater;

public class SistemaDeVideo extends EquipamentoEletronico {
    private String marca;
    private String modelo;
    private String tipo;
    private String resolucao;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sistema de Vídeo [Marca: ").append(marca);
        sb.append(", Modelo: ").append(modelo);
        sb.append(", Tipo: ").append(tipo);
        sb.append(", Resolução: ").append(resolucao).append(", ");
        sb.append(super.toString());
        sb.append("]");
        return sb.toString();
    }
}
