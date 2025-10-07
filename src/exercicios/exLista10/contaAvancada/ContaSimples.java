package exercicios.exLista10.contaAvancada;

public class ContaSimples extends ContaBancaria {
    private double saldoPoupanca;

    public ContaSimples(Banco banco, int agencia, int numeroDaConta, double saldo, Pessoa correntista, double saldoPoupanca) {
        super(banco, agencia, numeroDaConta, saldo, correntista);
        this.saldoPoupanca = saldoPoupanca;
    }

    public boolean depositoPoupanca(double valor) {
        if (valor > 0) {
            this.saldoPoupanca += valor;
            return true;
        }
        return false;
    }

    public boolean saquePoupanca(double valor) {
        if (valor > 0 && this.saldoPoupanca >= valor) {
            this.saldoPoupanca -= valor;
            return true;
        }
        return false;
    }

    public double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("--- CONTA SIMPLES ---\n");
        sb.append(super.toString()).append("\n");
        sb.append("Saldo Poupança: R$").append(String.format("%.2f", saldoPoupanca));
        return sb.toString();
    }
}