// aula sobre construtores, sobrecarga de metodos e listas/vetores

import java.util.Scanner;
import visao.AlunoVisao;

public class PrincipalVetores {

    public static void main(String[] args) {
        // acesso ao package visao
        AlunoVisao tela  = new AlunoVisao();
        
        Scanner ler = new Scanner(System.in);
        int opcao = 0;
        
        do {
            System.out.println("\n1 - Cadastrar aluno;");
            System.out.println("2 - Excluir aluno;");
            System.out.println("3 -  Alterar dados de aluno;");
            System.out.println("4 - Apresentar alunos;");
            System.out.println("5 - Lançar notas do aluno;");
            System.out.println("6 - Lançar frequência do aluno;");
            System.out.println("7 - Apresentar dados e situação de um aluno;");
            System.out.println("8 - Apresentar dados e média dos alunos;");
            System.out.println("9 - Apresentar alunos de determinado curso;");
            System.out.println("10 - Apresentar alunos reprovados por falta;");
            System.out.print("Insira uma opcao: ");
            opcao = ler.nextInt();
            
            switch (opcao) {
                case 1:
                    tela.cadastrarAluno();
                    break;
                case 2:
                    tela.excluirAluno();
                    break;
                case 3:
                    tela.alterarAluno();
                    break;
                case 4:
                    tela.apresentarAlunos();
                    break;
                case 5:
                    tela.lancarNotas();
                    break;
                case 6:
                    tela.lancarFrequencia();
                    break;
                case 7:
                    tela.apresentarDadosMediaSituacaoAluno();
                    break;
                case 8:
                    tela.apresentarDadosMediaAlunos();
                    break;
                case 9:
                    tela.apresentarAlunosPorCurso();
                    break;
                case 10:
                    tela.apresentarReprovadosFalta();
                    break;
                case 0:
                    System.out.println("\nSaindo...");
                    break;
                default:
                    System.out.println("\nOpção inválida!!!");
        }
        } while (opcao != 0);
    }
}

//        introducao da aula, tem anotacao
//        mas o professor nao usou no resto do programa
//        {
//        int[] vetorInt = new int[10];
//
//        System.out.println("Tamanho do vetor: " + vetorInt.length);
//
//        vetorInt[0] = 10;
//        vetorInt[1] = 15;
//
//        System.out.print("Elementos do vetor: ");
//        for (int i = 0; i < 2; i++) {
//            System.out.print(vetorInt[i] + " ");
//        }
//
//        System.out.println("\n");
//
//        // criando um vetor de alunos
//        Aluno[] turma = new Aluno[10];
//
//        // objeto aluno (ainda nao inserido no vetor)
//        Aluno aluno = new Aluno("PE0123456", "Joao", "BCC", 2024);
//
//        turma[0] = aluno; // insere o objeto "aluno" no vetor de alunos
//
//        System.out.println(aluno.getNome() + " - " + turma[0].getNome());
//
//        // nao tem problema fazer isso pq o Joao ja foi passado pro vetor, ele nao eh perdido
//        // mas a referencia que havia antes da classe Aluno para o objeto aluno foi perdida
//        // agora somente o vetor turma esta apontando para o espaco de memoria onde Joao foi alocado (turma[[0])
//        aluno.setNome("Maria");
//        System.out.println(aluno.getNome() + " - " + turma[0].getNome());
//
//        // colocando alunos de formas mais faceis
//        turma[1] = new Aluno("PE1010101", "Melissa", "TII", 2023);
//        turma[2] = new Aluno("PE0202020", "Andre", "TIM", 2022);
