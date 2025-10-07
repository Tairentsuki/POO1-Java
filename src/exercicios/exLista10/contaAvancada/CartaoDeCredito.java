package exercicios.exLista10.contaAvancada;

public class CartaoDeCredito {
    private int numero;
    private String operadora;
    private double limite;
    private String tipoDeCartao;

    public CartaoDeCredito(int numero, String operadora, double limite, String tipoDeCartao) {
        this.numero = numero;
        this.operadora = operadora;
        this.limite = limite;
        this.tipoDeCartao = tipoDeCartao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String getTipoDeCartao() {
        return tipoDeCartao;
    }

    public void setTipoDeCartao(String tipoDeCartao) {
        this.tipoDeCartao = tipoDeCartao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CartaoDeCredito [Número=").append(numero);
        sb.append(", Operadora=").append(operadora);
        sb.append(", Limite=").append(limite);
        sb.append(", Tipo=").append(tipoDeCartao);
        sb.append("]");
        return sb.toString();
    }
}