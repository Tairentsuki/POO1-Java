package exercicios.exLista6.ex006;

class Quadrado {
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void mudarLado(double novoLado) {
        this.lado = novoLado;
    }

    public double retornarLado() {
        return lado;
    }

    public double calcularArea() {
        return lado * lado;
    }
}