//figura tantos do livro
//Aqui eu tentei fazer sozinho com as informações do algoritmo em pseudocódigo

import java.util.Scanner;


public class GradeBookTest {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        GradeBook curso = new GradeBook(null);


        System.out.printf("Insira o nome do curso: ");
        String cursin = input.nextLine();
        curso.setNomeCurso(cursin);

        curso.BoasVindas();

        curso.DeterminaMediaClasse();

    }

}
