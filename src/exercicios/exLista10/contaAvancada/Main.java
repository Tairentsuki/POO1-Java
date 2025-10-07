package exercicios.exLista10.contaAvancada;

public class Main {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("João da Silva", "Rua das Flores, 123");
        Pessoa p2 = new Pessoa("Maria Oliveira", "Avenida Central, 456");

        Banco banco = new Banco(1, "Banco Digital Nacional", 150);

        CartaoDeCredito cartao = new CartaoDeCredito(123456, "MasterCard", 5000.00, "Platinum");


        System.out.println("=============================================");
        ContaSimples cs = new ContaSimples(banco, 101, 9876, 1000.00, p1, 500.00);
        System.out.println("Estado inicial da Conta Simples:");
        System.out.println(cs);
        System.out.println("---------------------------------------------");

        System.out.println("Realizando operações na Conta Simples...");
        cs.deposito(200.00);
        cs.saque(150.00);
        cs.depositoPoupanca(300.00);
        cs.saquePoupanca(100.00);

        System.out.println("\nEstado final da Conta Simples:");
        System.out.println(cs);
        System.out.println("=============================================\n");

        System.out.println("=============================================");
        ContaEspecial ce = new ContaEspecial(banco, 102, 5432, 2500.00, p2, 10, 1000.00, cartao);
        System.out.println("Estado inicial da Conta Especial:");
        System.out.println(ce);
        System.out.println("---------------------------------------------");

        System.out.println("Realizando operações na Conta Especial...");
        ce.deposito(500.00);
        System.out.println(new StringBuilder("Saldo após depósito de R$500,00: R$")
                .append(String.format("%.2f", ce.saldo)));

        boolean saqueEspecial = ce.saque(3500.00);
        System.out.println(new StringBuilder("Tentativa de saque de R$3500,00: ")
                .append(saqueEspecial ? "Sucesso" : "Falha"));

        System.out.println("\nEstado final da Conta Especial:");
        System.out.println(ce);
        System.out.println("=============================================");
    }
}