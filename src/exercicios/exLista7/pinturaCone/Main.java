package exercicios.exLista7.pinturaCone;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Exemplo 1 ---");
        Cone cone1 = new Cone(1, 8, 6);
        System.out.println(cone1);

        System.out.println("\n--- Exemplo 2 ---");
        Cone cone2 = new Cone(2, 9, 3.5);
        System.out.println(cone2);

        System.out.println("\n--- Exemplo 3 ---");
        Cone cone3 = new Cone(2, 13.9, 20);
        System.out.println(cone3);

        // Teste com os dados do Exemplo 4
        System.out.println("\n--- Exemplo 4 ---");
        Cone cone4 = new Cone(3, 16.53, 37.78);
        System.out.println(cone4);
    }
}