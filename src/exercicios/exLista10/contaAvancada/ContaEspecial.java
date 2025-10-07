package exercicios.exLista10.contaAvancada;

public class ContaEspecial extends ContaBancaria {
    private int diasSemJuros;
    private double limite;
    protected CartaoDeCredito cartao;

    public ContaEspecial(Banco banco, int agencia, int numeroDaConta, double saldo, Pessoa correntista,
                         int diasSemJuros, double limite, CartaoDeCredito cartao) {
        super(banco, agencia, numeroDaConta, saldo, correntista);
        this.diasSemJuros = diasSemJuros;
        this.limite = limite;
        this.cartao = cartao;
    }

    @Override
    public boolean saque(double valor) {
        if (valor > 0 && (this.saldo + this.limite) >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("--- CONTA ESPECIAL ---\n");
        sb.append(super.toString()).append("\n");
        sb.append("Limite: R$").append(String.format("%.2f", limite));
        sb.append(" | Dias sem juros: ").append(diasSemJuros).append("\n");
        sb.append("Cartão Associado: ").append(cartao.toString());
        return sb.toString();
    }
}