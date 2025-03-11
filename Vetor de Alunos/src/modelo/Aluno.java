// classe responsavel por cada objeto aluno individualmente

package modelo;

public class Aluno {

    private String prontuario;
    private String nome;
    private String curso;
    private Integer anoIngresso;
    private Double notaProva;
    private Double notaTrabalho;
    private Double frequencia;

    // construtores reduzem a quantidade de linhas de código ao preencher uma classe na main
    // alem disso, podem ser utilizados para "iniciar" uma variavel com um valor ja alocado
    // esses valores podem ser alterados depois, eh so pra nao ficar nulo
    
    // podem haver varios construtores para cumprir cada necessidade no codigo, contanto que seus parametros sejam diferentes
    
    // public Aluno () {} <- construtor padrao
    
    // construtor vazio, sem parametros
    public Aluno() {
        anoIngresso = 2025;
        notaProva = 0.0;
        notaTrabalho = 0.0;
        frequencia = 0.0;
    }

    // construtor parcial, so existem alguns atributos como parametro
    // os demais atributos, como notaProva e frequencia, ja ficam inicializados com o valor 0
    public Aluno(String prontuario, String nome, String curso, Integer anoIngresso) {
        this.prontuario = prontuario;
        this.nome = nome;
        this.curso = curso;
        this.anoIngresso = anoIngresso;
        notaProva = 0.0;
        notaTrabalho = 0.0;
        frequencia = 0.0;
    }

    // construtor completo, possui todos os atributos da classe
    public Aluno(String prontuario, String nome, String curso, Integer anoIngresso, Double notaProva, Double notaTrabalho, Double frequencia) {
        this.prontuario = prontuario;
        this.nome = nome;
        this.curso = curso;
        this.anoIngresso = anoIngresso;
        this.notaProva = notaProva;
        this.notaTrabalho = notaTrabalho;
        this.frequencia = frequencia;
    }

    // Getters
    public String getProntuario() {
        return prontuario;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public Integer getAnoIngresso() {
        return anoIngresso;
    }

    public Double getNotaProva() {
        return notaProva;
    }

    public Double getNotaTrabalho() {
        return notaTrabalho;
    }

    public Double getFrequencia() {
        return frequencia;
    }

    // Setters
    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setAnoIngresso(Integer anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public void setNotaProva(Double notaProva) {
        this.notaProva = notaProva;
    }

    public void setNotaTrabalho(Double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    public void setFrequencia(Double frequencia) {
        this.frequencia = frequencia;
    }
    
    // toda operacao realizada em relação a um unico aluno é feita na classe aluno
    
    // fazer media
    public double getMedia () {
        return (notaProva + notaTrabalho)/2;
    }
    
    // saber se ta aprovado
    public boolean isAprovado () {
        return getMedia() >= 6 && frequencia >= 75;
    }
    
    // se foi reprovado por falta
    public boolean isReprovadoFalta () {
        return frequencia < 75; // já retorna true ou false baseado no resultado dessa comparacao
    }

}
