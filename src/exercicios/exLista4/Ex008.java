//8. Dado um vetor contendo todas as letras do nosso alfabeto (minúsculas) gere uma senha para
//o usuário. Para isto o usuário deve informar o tamanho da senha que deseja, este tamanho
//deve ser menor que a quantidade de letras no vetor. A senha gerada deve seguir o padrão
//consoante+vogal para tamanhos pares e consoante+vogal e terminada em consoante para
//tamanhos ímpares.

package exercicios.exLista4;

import java.util.Scanner;


public class Ex008 {
    public static Boolean isVogal(String letra){
        return (letra.equalsIgnoreCase("A")
                || letra.equalsIgnoreCase("E")
                || letra.equalsIgnoreCase("I")
                || letra.equalsIgnoreCase("O")
                || letra.equalsIgnoreCase("U"));
    }

    public static String getVogalAleatoria(String[] alfabeto){
        while (true){
            int indiceSorteado = (int) (Math.random()*alfabeto.length);
            String letraSorteada = alfabeto[indiceSorteado];
            if(isVogal(letraSorteada)){
                return letraSorteada;
            }
        }
    }

    public static String getConsoanteAleatoria(String[] alfabeto){
        while (true){
            int indiceSorteado = (int) (Math.random()*alfabeto.length);
            String letraSorteada = alfabeto[indiceSorteado];
            if(!isVogal(letraSorteada)){
                return letraSorteada;
            }
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final String alfabetoCompleto = "abcdefghijklmnopqrstuvwxyz";
        String[] alfabeto = alfabetoCompleto.split("");

        int tamanhoDaSenha;

        while (true) {
            try {
                System.out.print("Digite o tamanho da senha desejada. (1 a " + (alfabeto.length - 1) + "): ");
                tamanhoDaSenha = entrada.nextInt();
                if (tamanhoDaSenha <= alfabeto.length-1) {
                    break;
                } else {
                    System.out.println("Entrada inválida, por favor, digite um número inteiro entre 1 e " + (alfabeto.length-1));
                }
            } catch (Exception e) {
                entrada.nextLine();
                System.out.println("Entrada inválida, por favor, digite um número inteiro entre 1 e " + (alfabeto.length-1));
            }
        }

        int numeroDePares = tamanhoDaSenha/2;
        String[] vetorSenha = new String[tamanhoDaSenha];

        for (int contador = 0; contador < numeroDePares; contador++){
            System.out.println(contador);
            vetorSenha[contador * 2] = getConsoanteAleatoria(alfabeto);
            vetorSenha[(contador * 2)+1] = getVogalAleatoria(alfabeto);
        }

        if(tamanhoDaSenha % 2 != 0){
            vetorSenha[tamanhoDaSenha-1] = getConsoanteAleatoria(alfabeto);
        }

        String senhaFinal = String.join("", vetorSenha);

        System.out.println("A senha gerada é: " + senhaFinal);
    }
}
