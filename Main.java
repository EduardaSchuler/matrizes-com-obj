import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String nomeAluno, nomeDisciplina, cursoAluno;
        int numTurma, qtdAlunos, matriculaAluno, x = 0;
        
        System.out.println("Digite o nome da Disciplina: ");
        nomeDisciplina = in.nextLine();
        System.out.println("Digite o número da tuma: ");
        numTurma = in.nextInt();
        System.out.println("Digite quantos alunos há na tuma: ");
        qtdAlunos = in.nextInt();
        
        Turma t = new Turma(nomeDisciplina, numTurma, qtdAlunos);
        
        do {
            System.out.println("Digite o nome do aluno: ");
            nomeAluno = in.nextLine();
            System.out.println("Digite a matricula deste aluno: ");
            matriculaAluno = in.nextInt();
            System.out.println("Digite o curso deste aluno; ");
            cursoAluno = in.nextLine();
            Aluno aluno = new Aluno(nomeAluno, matriculaAluno, cursoAluno);
            if (t.addAluno(aluno) == true){
                System.out.println("Aluno Adicionado");
                x++;
            } else {
                System.out.println("Aluno NÃO adicionado");
            }
        } while (x < qtdAlunos);
        
        System.out.println(t.toString());
    }
}
