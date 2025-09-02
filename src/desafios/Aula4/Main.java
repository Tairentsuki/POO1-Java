package desafios.Aula4;

import desafios.Aula4.Bola;

public class Main {
    public static void main(String[] args) {
        Bola bola = new Bola();
        bola.setCor("Amarelo");
        bola.setCircunferencia(10.5f);
        bola.setMaterial("Plástico");
        System.out.println(bola.getCor());
        System.out.println(bola.getCircunferencia());
        System.out.println(bola.getMaterial());
    }
}
