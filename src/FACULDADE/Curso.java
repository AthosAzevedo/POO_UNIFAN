package FACULDADE;

import java.util.List;

public class Curso {
    private String codigo;
    private String nome;
    private List<String> disciplinaObrigatorias;
    private List<String> disciplinaEletivas;

    public Curso(String codigo, String nome, List<String> disciplinaObrigatorias, List<String> disciplinaEletivas) {
        this.codigo = codigo;
        this.nome = nome;
        this.disciplinaObrigatorias = disciplinaObrigatorias;
        this.disciplinaEletivas = disciplinaEletivas;
    }

    public void adicionarDisciplinaObrigatorias(Disciplina disciplina){
        this.getDisciplinaObrigatorias().add(disciplina.getNome());

    }
    public void adicionarDisciplinaEletivas(Disciplina disciplina){
        this.getDisciplinaEletivas().add(disciplina.getNome());

    }
    public void apresentar(){
        System.out.println("-- INFORMAÇÕES DO CURSO --"+"\n"+
                "nome: "+ this.getNome()+"\n"+
                "Codigo: "+ this.getCodigo()+"\n"+
                "Disciplinas Obrigatorias: "+ this.getDisciplinaObrigatorias()+ "\n"+
                "Disciplinas Eletivas: "+ this.getDisciplinaEletivas()+ "\n");
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<String> getDisciplinaObrigatorias() {
        return disciplinaObrigatorias;
    }

    public void setDisciplinaObrigatorias(List<String> disciplinaObrigatorias) {
        this.disciplinaObrigatorias = disciplinaObrigatorias;
    }

    public List<String> getDisciplinaEletivas() {
        return disciplinaEletivas;
    }

    public void setDisciplinaEletivas(List<String> disciplinaEletivas) {
        this.disciplinaEletivas = disciplinaEletivas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
