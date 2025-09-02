package desafios.Aula4;

import desafios.Aula4.Quadrado;

public class quadradoMain {
    public static void main(String[] args) {

        Quadrado q = new Quadrado();
        q.setCor("Amarelo");
        q.setLado(2);

        System.out.println("Lado: " + q.getLado());
        System.out.println("Cor: " + q.getCor());
        System.out.println("Perímetro: " + q.perimetro());
        System.out.println("Área: " + q.area());

        System.out.println(q);

    }
}
