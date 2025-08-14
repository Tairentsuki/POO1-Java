package exercicios.exLista3;

public class ex005 {
    public static void main(String[] args) {
        //Versão 1
//        for(int n = 1; n<=20; n++){
//            System.out.println(n);
//        }

        //Versão 2
        int inicio = 1;
        int limite = 20;
        int n;
        for(n = inicio; n<=limite-1; n++){
            System.out.print(n+ ", ");
        }
        System.out.println(n);

    }
}
