package exercicios.exLista6.ex007;

class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void envelhecer(int anos) {
        idade+= anos;
        if (idade < 21) {
            crescer(0.5);
        }
    }

    public void engordar(double quilos) {
        peso += quilos;
    }

    public void emagrecer(double quilos) {
        peso -= quilos;
    }

    public void crescer(double centimetros) {
        altura += centimetros;
    }
}