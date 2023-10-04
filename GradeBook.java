//imagem 4.6 do livro
//GradeBook irá coletar a nota de 10 alunos e tirar a média da turma
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
        int média; // divisão das notas para se ter a média

        total = 0; // inicializa o total
        notaContador = 1; // inicializa o total de loops
        nota = 0;


        while (notaContador <= 10){
            System.out.printf("Insira a nota do aluno %d :", notaContador);
            nota = input.nextInt();
            total = total + nota;
            notaContador = notaContador + 1;
        }

        média = total / 10;
        notaContador = notaContador - 1;
        System.out.printf("A média dessa turma com %d alunos é de: %d", notaContador,média);
    } // fim do objeto DeterminaMediaClasse


} // fim do class
