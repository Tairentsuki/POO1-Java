package aulas.aula6.exercicios;

public class Main {
    public static void main(String[] args) {

        int cont = Exercicios.Ex001ContarSabadosEDomingos("2025-09-01", "2025-09-16");
        System.out.println("Contagem de sábados e domingos: " + cont);

        int cont2 = Exercicios.Ex002DiasUteis("2025-09-01", "2025-09-08");
        System.out.println("Contagem de dias úteis: " + cont2);


    }
}
