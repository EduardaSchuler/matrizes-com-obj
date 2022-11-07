public class Turma{
    private String nomeDisciplina;
    private int numTurma;
    private Aluno[] vetor;
    private int proximoIndice;
    
    public Turma(String nomeDisciplina, int numTurma, int tamanho){
        this.nomeDisciplina = nomeDisciplina;
        this.numTurma = numTurma;
        vetor = new Aluno[tamanho];
        proximoIndice = 0;
    }
    
    public String getNomeDisciplina(){
        return nomeDisciplina;
    }
    
    public int getNumTurma(){
        return numTurma;
    }
    
    public boolean addAluno(Aluno a){
        vetor[proximoIndice] = a;
        proximoIndice++;
        return true;
    }
    
    public String toString(){
        String saida = "A disciplina " + getNomeDisciplina() + " turma " + getNumTurma();
            for (int i = 0; i < proximoIndice; i++){
                saida = saida + "\n" + vetor[i].toString(); 
            }
        return saida;
    }
}
