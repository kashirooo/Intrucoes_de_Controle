//imagem 4.10 do livro
//GradeBook irá coletar a nota dos alunos até que o usuario pare a operação
//utilizando o controlador por sentinela
import java.util.Scanner;

public class GradeBook {
    
    private String NomeCurso;

    public GradeBook(String name){ //construtor do nome do curso
        NomeCurso = name;
    }

    public void setNomeCurso(String name){ // Para fazer a alteração do nome do curso
        NomeCurso = name;
    }

    public String getNomeCurso(){ //para retornar o nome do curso
        return NomeCurso;
    }

    public void BoasVindas(){ // mensagem de boas vindas
        System.out.printf("Bem vindo ao Livro de Notas do Curso %s\n", getNomeCurso());
    }//fim da mensagem de boas vindas

    public void DeterminaMediaClasse(){
        Scanner input = new Scanner (System.in);

        int total; // soma das notas inseridas pelo usuario
        int notaContador; //conta quantas notas foram inseridas
        int nota; // valor da nota inserida pelo usuário
        double media; // divisão das notas para se ter a média

        total = 0; // inicializa o total
        notaContador = 0; // inicializa o total de loops
        
        //fase de processamento
        //solicita a entrada e lê  a nota do usuario
        System.out.println("Insira a nota ou digite -1 para sair");
        nota = input.nextInt();

        //faz um looping até o valor de sentinela inserido pelo usuario
        while (nota != -1){

            total = total + nota;
            notaContador = notaContador + 1;

            //solicita a entrada e lê  a nota do usuario
            System.out.println("Insira a nota ou digite -1 para sair");
            nota = input.nextInt();

        } // fim do while

        // fase de termino
        //se o usuario inseriu ao menos uma nota

        if (notaContador != 0){
            media = total / notaContador;
            System.out.printf("A soma das %d notas foi de %d\n",notaContador, total);
            System.out.printf("a média desta turma é de %.2f\n", media);
        }
        else{
            System.out.println("Nenhuma nota inserida");
        } // fim da fase de termino
        
    } // fim do objeto DeterminaMediaClasse

} // fim do class
