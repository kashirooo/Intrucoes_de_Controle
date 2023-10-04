//imagem 4.12 do livro
//onde vamos analisar a entrada do usuario e saber se mais a media de alunos aprovados, para instruções de controles aninhadas
import java.util.Scanner;

public class Analises {
    
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // incializando as variaveis
        int aprovado = 0;
        int reprovado = 0;
        int notaContador = 1;
        int resultado;

        while (notaContador <= 10){

            //solicita o usuario uma entrada e obtém o valor fornecido pelo usuario
            System.out.printf("1 - Aprovado\n2 - Reprovado\nInsira o resultado do aluno %d: ", notaContador);
            resultado = input.nextInt();

            if(resultado == 1){
                aprovado = aprovado + 1;
            }
            else{
                reprovado = reprovado + 1;
            }

            notaContador = notaContador + 1;

            System.out.printf("Alunos aprovados: %d e Alunos Reprovados: %d\n\n", aprovado, reprovado);

            if(aprovado > 8){
                System.out.print("Mérito do Professor");
            }

        } // fim do main
    }
}
