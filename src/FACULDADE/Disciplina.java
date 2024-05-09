package FACULDADE;

public class Disciplina {
    private String nome;
    private String codigo;
    private int cargaHoraria;
    private Professor professorResponsavel;

    public Disciplina(String nome,String codigo,int cargaHoraria, Professor professorResponsavel) {
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
        this.professorResponsavel = professorResponsavel;
    }

    public void apresentar(){
        System.out.println("-- INFORMAÇÕES DA DISCIPLINA --"+"\n"+
                    "Nome: "+ this.getNome()+"\n"+
                    "Codigo: "+this.getCodigo()+"\n"+
                    "Carga Horaria: "+ this.getCargaHoraria()+"\n"+
                    "Professor Responsavel: "+this.getProfessorResponsavel()+"\n");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }


    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setProfessorResponsavel(Professor professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }
}
