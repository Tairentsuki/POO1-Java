package aulas.aula5.pt2;

public class FamiliaMain {
    public static void main(String[] args) {
        Familia rodrigo = new Familia();
        rodrigo.setNome("Rodrigo");
        Familia.setSobrenome("Curvêllo");

        Familia iran = new Familia();
        iran.setNome("Iran");
        Familia.setSobrenome("Outra Familia");

        System.out.printf("%s %s\n", rodrigo.getNome(), Familia.getSobrenome());
        System.out.printf("%s %s\n", iran.getNome(), Familia.getSobrenome());
    }
}
