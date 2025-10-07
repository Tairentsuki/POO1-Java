package exercicios.exLista10.contaAvancada;

public abstract class ContaBancaria {
    protected Banco banco;
    protected int agencia;
    protected int numeroDaConta;
    protected double saldo;
    protected Pessoa correntista;

    public ContaBancaria(Banco banco, int agencia, int numeroDaConta, double saldo, Pessoa correntista) {
        this.banco = banco;
        this.agencia = agencia;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.correntista = correntista;
    }

    public boolean deposito(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            return true;
        }
        return false;
    }

    public boolean saque(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Correntista: ").append(correntista.getNome()).append("\n");
        sb.append("Banco: ").append(banco.getNome());
        sb.append(" | Agência: ").append(agencia);
        sb.append(" | Conta: ").append(numeroDaConta).append("\n");
        sb.append("Saldo: R$").append(String.format("%.2f", saldo));
        return sb.toString();
    }
}