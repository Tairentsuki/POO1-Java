//14. Foram anotadas as idades e alturas de 30 alunos. Faça um Programa que determine quantos
//alunos com mais de 13 anos possuem altura inferior à média de altura desses alunos.

package exercicios.exLista4;

public class Ex014 {
    public static void main(String[] args) {
        final int QNT_ALUNOS = 30;

        int[] idades = new int[QNT_ALUNOS];
        double[] alturas = new double[QNT_ALUNOS];
        double mediaAltura = 0;
        int quantidadeAcimaTrezeAnosAbaixoMediaAltura = 0;

        // Preencher com números aleatórios para teste;
        for(int contador = 0; contador < QNT_ALUNOS; contador++){
            idades[contador] = (int) (Math.random()*100);
            alturas[contador] = Math.random()*10%3;
            mediaAltura += alturas[contador];
        }
        mediaAltura /= QNT_ALUNOS;

        // Exibindo valores
        for(int contador = 0;contador < QNT_ALUNOS;contador++){
            System.out.printf("\n\nAluno: %d \nIdade: %d \nAltura: %.2f", contador+1, idades[contador], alturas[contador]);

            if(idades[contador] > 13 && alturas[contador] < mediaAltura){
                quantidadeAcimaTrezeAnosAbaixoMediaAltura++;
            }
        }

        System.out.printf("\n\nHá %d alunos acima de 13 anos com altura inferior a média.", quantidadeAcimaTrezeAnosAbaixoMediaAltura);


    }
}