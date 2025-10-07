package exercicios.exLista10.homeTheater;

public class EquipamentoEletronico {
    private float tensao;
    private float consumo;

    public float getTensao() {
        return tensao;
    }

    public void setTensao(float tensao) {
        this.tensao = tensao;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tensão: ").append(tensao);
        sb.append("V, Consumo: ").append(consumo);
        sb.append("W");
        return sb.toString();
    }
}
