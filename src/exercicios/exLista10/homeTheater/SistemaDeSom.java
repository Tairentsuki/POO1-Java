package exercicios.exLista10.homeTheater;

public class SistemaDeSom extends EquipamentoEletronico {
    private String marca;
    private String modelo;
    private float potencia;

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

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sistema de Som [Marca: ").append(marca);
        sb.append(", Modelo: ").append(modelo);
        sb.append(", Potência: ").append(potencia).append("W, ");
        sb.append(super.toString());
        sb.append("]");
        return sb.toString();
    }
}
