package FACULDADE;

import java.util.ArrayList;
import java.util.List;

public class Curso implements Acao{
    private String codigo;
    private String nome;
    private List<String> disciplinaObrigatorias;
    private List<String> disciplinaEletivas;

    public Curso(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.disciplinaObrigatorias = new ArrayList<>();
        this.disciplinaEletivas = new ArrayList<>();


    }

    public void adicionarDisciplinaObrigatorias(Disciplina disciplina){
        this.disciplinaObrigatorias.add(disciplina.getNome());

    }
    public void adicionarDisciplinaEletivas(Disciplina disciplina){
        this.disciplinaEletivas.add(disciplina.getNome());

    }
    @Override
    public String apresentar(){
        return ("-- INFORMAÇÕES DO CURSO --"+"\n"+
                "nome: "+ this.getNome()+"\n"+
                "Codigo: "+ this.getCodigo()+"\n"+
                "Disciplinas Obrigatorias: "+ this.getDisciplinaObrigatorias()+ "\n"+
                "Disciplinas Eletivas: "+ this.getDisciplinaEletivas()+ "\n"+ "-------------");
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
