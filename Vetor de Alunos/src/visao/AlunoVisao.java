// a classe visao faz a interacao com o usuario

package visao;

import controle.AlunosControle;
import java.util.Scanner;
import modelo.Aluno;

public class AlunoVisao {
    
    private AlunosControle controle = new AlunosControle();

    public void cadastrarAluno() {
        Scanner ler = new Scanner(System.in);
        Aluno aluno = new Aluno();
        
        System.out.print("Prontuario: ");
        aluno.setProntuario(ler.nextLine());
        
        System.out.print("Nome: ");
        aluno.setNome(ler.nextLine());

        System.out.print("Curso: ");
        aluno.setCurso(ler.nextLine());

        System.out.print("Ingressou em: ");
        aluno.setAnoIngresso(ler.nextInt());
        
        controle.adicionar(aluno);
        
    }
    
    public void excluirAluno () {
        Scanner ler = new Scanner(System.in);
        String prontuario;
        
        System.out.print("\nInsira o prontuario do aluno: ");
        prontuario = ler.nextLine();
        
        controle.excluir(prontuario);
    }
    
    public void alterarAluno () {
        Scanner ler = new Scanner(System.in);
        String prontuario;
        
        System.out.print("\nInsira o prontuario a ser alterado: ");
        prontuario = ler.nextLine();
        
        System.out.print("Novo nome: ");
        String nome = ler.nextLine();

        System.out.print("Novo curso: ");
        String curso = ler.nextLine();

        System.out.print("Ingressou em: ");
        Integer ano = ler.nextInt();
        
        controle.alterar(prontuario, nome, curso, ano);
    }
    
    public void lancarNotas () {
        Scanner ler = new Scanner(System.in);
        String prontuario;
        
        System.out.print("\nInsira o prontuario do aluno: ");
        prontuario = ler.nextLine();
        // aloca a posicao que foi retornada pelo metodo localizarAluno nesse int posicao q criei agora
        int posicao = controle.localizarAluno(prontuario);
        
        if (posicao != -1) {
            Aluno aluno = controle.getAluno(posicao);
            // apresenta o aluno so pra ve se ta certo
            
            System.out.print("\nNota da prova: ");
            aluno.setNotaProva(ler.nextDouble());
        
            System.out.print("Nota do trabalho: ");
            aluno.setNotaTrabalho(ler.nextDouble());
        }
        else {
            System.out.println("\nAluno não existente!");
        }
    }
    
    public void lancarFrequencia () {
        Scanner ler = new Scanner(System.in);
        String prontuario;
        
        System.out.print("\nInsira o prontuario do aluno: ");
        prontuario = ler.nextLine();
        
        int posicao = controle.localizarAluno(prontuario);
        
        if (posicao != -1) {
            Aluno aluno = controle.getAluno(posicao);
            
            System.out.print("\nPorcentagem da frequencia do aluno: ");
            aluno.setFrequencia(ler.nextDouble());
        }
        else {
            System.out.println("\nAluno não existente!");
        }
        
    }
    
    public void apresentarAlunos() {
        Aluno a;
        System.out.println("\n");
        for (int i = 0; i < controle.getTamanhoVetor(); i++) {
            a = controle.getAluno(i);

            System.out.println(a.getProntuario() + " - " +
                               a.getNome() + " - " +
                               a.getCurso() + " - " +
                               a.getAnoIngresso()
                    );
        }
    }
    
    public void apresentarDadosMediaAlunos () {
        Aluno a;
        System.out.println("\n");
        for (int i = 0; i < controle.getTamanhoVetor(); i++) {
            a = controle.getAluno(i);
            
            System.out.println(a.getProntuario() + " - " +
                               a.getNome() + " - " +
                               a.getCurso() + " - " +
                               a.getMedia()
                    );
        }
    }

    public void apresentarNotaFrequenciaAluno () {
        Scanner ler = new Scanner(System.in);
        String prontuario;
        Aluno a;
        
        System.out.print("\nInsira o prontuario do aluno: ");
        prontuario = ler.nextLine();
        
        int posicao = controle.localizarAluno(prontuario);
        a = controle.getAluno(posicao);
        
        System.out.println(a.getNome()
                            + "\nNota da prova: " + a.getNotaProva()
                            + "\nNota do trabalho: " + a.getNotaTrabalho()
                            + "\nFrequencia: " + a.getFrequencia()
                            );
        
    }
    
    public void apresentarDadosMediaSituacaoAluno () {
        Scanner ler = new Scanner(System.in);
        String prontuario;
        Aluno a;
        
        System.out.print("\nInsira o prontuario do aluno: ");
        prontuario = ler.nextLine();
        
        int posicao = controle.localizarAluno(prontuario);
        a = controle.getAluno(posicao);
        
        System.out.println("\n" +
                           a.getProntuario() + " - " +
                           a.getNome() + " - " +
                           a.getCurso() + " - " +
                           a.getAnoIngresso()
                           + "\nNota da prova: " + a.getNotaProva()
                           + "\nNota do trabalho: " + a.getNotaTrabalho()
                           + "\nFrequencia: " + a.getFrequencia()
                           );
        if (a.isAprovado())
            System.out.println("Situação: APROVADO");
        else
            System.out.println("Situação: REPROVADO");
    }
    
    public void apresentarAlunosAprovados () {
        System.out.println("\nQuantidade de alunos aprovados: "
                            + controle.quantidadeAlunosAprovados());
    }

    public void apresentarAlunosPorCurso () {
        Scanner ler = new Scanner(System.in);
        String curso;
        Aluno a;
        
        System.out.print("\nInsira o curso: ");
        curso = ler.nextLine();
        
        System.out.println("\n");
        for (int i = 0; i < controle.getTamanhoVetor(); i++) {
            a = controle.getAluno(i);
            if (a.getCurso().equals(curso)) {
                System.out.println(a.getProntuario() + " - " +
                               a.getNome() + " - " +
                               a.getCurso() + " - " +
                               a.getAnoIngresso()
                    );
            } else {
                
            }
        }
    }
    
    public void apresentarReprovadosFalta () {
        Aluno a;
        
        System.out.println("\nAlunos reprovados por falta: ");
        
        for (int i = 0; i < controle.getTamanhoVetor(); i++) {
            a = controle.getAluno(i);
            
            if (a.isReprovadoFalta()) {
                System.out.println(a.getProntuario() + " - " +
                                   a.getNome() + " - " +
                                   a.getCurso() + " - Frequência: " +
                                   a.getFrequencia()
                    );
            }
        }
    }
    
}
