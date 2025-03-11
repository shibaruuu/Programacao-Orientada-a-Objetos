// começando a utilizar o modelo mvc !!!
// a classe AlunosControle eh responsavel pelo vetor de alunos

package controle;

import modelo.Aluno;

public class AlunosControle {

    private Aluno[] alunos = new Aluno[20];
    private Integer tamanhoVet = 0;

    public Integer getTamanhoVetor() {
        return tamanhoVet;
    }

    public void adicionar(Aluno aluno) {
        alunos[tamanhoVet] = aluno;
        tamanhoVet++;
    }
    
    public Aluno getAluno(String prontuario) {
        int posicao = -1;
        for (int i = 0; i < tamanhoVet; i++) {
            // tem que usar equals pra procurar string
            // se usar == ele vai comparar o tamanho logico da string e nao se os caracteres sao iguais
            if (alunos[i].getProntuario().equals(prontuario)) {
                posicao = i;
            }
        }
        if (posicao != -1) {
            return alunos[posicao];
        }
        else {
            return null;
        }
    }

    public Aluno getAluno(int posicao) {
        if (posicao < tamanhoVet) {
            return alunos[posicao];
        }
        else {
            return null;
        }
    }

    public Aluno[] getAlunos() {
        return alunos;
    }
    
    public int localizarAluno(String prontuario) {
        int posicao = -1;
        for (int i = 0; i < tamanhoVet; i++) {
            if (alunos[i].getProntuario().equals(prontuario)) {
                posicao = i;
            }
        }
        return posicao;
    }
    
    public boolean excluir(String prontuario) {
        int posicao = localizarAluno(prontuario);
        
        if (posicao != -1) {
            alunos[posicao] = null;
            
            for (int i = posicao; i < tamanhoVet; i++) {
                alunos[posicao] = alunos[posicao+1];
            }
            
            tamanhoVet--;
            
            return true;
        }
        else {
            return false;
        }
    }

    public boolean alterar(String prontuario, String novoNome, String novoCurso, Integer novoAno) {
        int posicao = localizarAluno(prontuario);
        Aluno a;
        
        a = getAluno(posicao);
        
        if (posicao != -1) {
            a.setNome(novoNome);
            a.setCurso(novoCurso);
            a.setAnoIngresso(novoAno);
            return true;
        }
        else {
            return false;
        }
    }
    
    public int quantidadeAlunosAprovados () {
        int contador = 0;
        Aluno a;
        
        for (int i = 0; i < getTamanhoVetor(); i++) {
            a = getAluno(i);
            
            if (a.isAprovado()) {
                contador++;
            }
        }
        
        return contador;
    }
    
}
