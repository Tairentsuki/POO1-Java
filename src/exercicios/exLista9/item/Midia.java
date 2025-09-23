package exercicios.exLista9.item;

public class Midia extends Item{
    private String gravadora;
    private float duracao;

    public Midia(int codigo){
        super(codigo);
    }

    public Midia(int codigo, String gravadora){
        super(codigo);
        setGravadora(gravadora);
    }

    public Midia(int codigo, String gravadora, float duracao, String descricao){
        super(codigo, descricao);
        setGravadora(gravadora);
        setDuracao(duracao);
    }

    public float getDuracao() {
        return duracao;
    }

    public void setDuracao(float duracao) {
        if(duracao > 0){
            this.duracao = duracao;
        }
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        if(gravadora.length() > 3){
            this.gravadora = gravadora;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Midia{");
        sb.append("duracao=").append(duracao);
        sb.append(", gravadora='").append(gravadora).append('\'');
        sb.append('}').append("\n");
        sb.append(super.toString());
        return sb.toString();
    }
}
