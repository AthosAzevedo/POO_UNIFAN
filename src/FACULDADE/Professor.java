package FACULDADE;
import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa{
    private String departamento;
    private List<String> disciplinasMinistradas;

    public Professor(String nome, String endereco, String departamento ) {
        super(nome, endereco);
        this.departamento = departamento;
        this.disciplinasMinistradas = new ArrayList<>();

    }

    @Override
    public String apresentar(){
        return ("-- INFORMAÇÕES DO PROFESSOR --"+"\n"+
                "Nome: "+this.getNome()+"\n"+
                "Departamento: "+ this.getDepartamento()+"\n"+
                "Disciplinas Ministradas: "+ this.getDisciplinasMinistradas()+"\n"+"-------------");
    }

    public void adicionarDisciplina(Disciplina disciplina){
        this.disciplinasMinistradas.add(disciplina.getNome());

    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public List<String> getDisciplinasMinistradas() {
        return disciplinasMinistradas;
    }

    public void setDisciplinasMinistradas(List<String> disciplinasMinistradas) {
        this.disciplinasMinistradas = disciplinasMinistradas;
    }
}
