package exercicios.exLista6.ex008;

class ContaBancaria {
    private int numeroConta;
    private String nome;
    private double saldo;

    public ContaBancaria(int numeroConta, String nome, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = saldoInicial;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void incluirConta(int numero, String nomeCliente, double saldoInicial) {
        this.numeroConta = numero;
        this.nome = nomeCliente;
        this.saldo = saldoInicial;
    }

    public void alterarNome(String novoNome) {
        if (validarNome(novoNome)) {
            this.nome = novoNome;
            System.out.println("Nome alterado com sucesso!");
        } else {
            System.out.println("Nome inválido!");
        }
    }

    public void deposito(double valor) {
        if (validarDeposito(valor)) {
            saldo += valor;
            System.out.printf("Depósito realizado. Novo saldo: R$ %.2f\n", saldo);
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    public void saque(double valor) {
        if (validarSaque(valor)) {
            saldo -= valor;
            System.out.printf("Saque realizado. Novo saldo: R$ %.2f\n", saldo);
        } else {
            System.out.println("Saque inválido! Verifique o valor ou saldo.");
        }
    }

    private boolean validarNome(String nome) {
        return nome != null && !nome.trim().isEmpty();
    }

    private boolean validarDeposito(double valor) {
        return valor > 0;
    }

    private boolean validarSaque(double valor) {
        return valor > 0 && valor <= saldo;
    }
}