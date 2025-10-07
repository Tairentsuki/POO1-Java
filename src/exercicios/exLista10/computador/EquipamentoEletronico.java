package exercicios.exLista10.computador;

public class EquipamentoEletronico {
    private float tensao;
    private float consumo;

    public EquipamentoEletronico(float tensao, float consumo) {
        this.tensao = tensao;
        this.consumo = consumo;
    }

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tensão: ").append(tensao).append("V");
        sb.append(", Consumo: ").append(consumo).append("W");
        return sb.toString();
    }
}
