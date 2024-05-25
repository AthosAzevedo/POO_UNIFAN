package FACULDADE;

public class AlunoPosGraduacao extends AlunoGraduacao {
    private Professor orientador;

    public AlunoPosGraduacao(String nome, String endereco, String matricula, Curso curso, Professor orientador) {
        super(nome, endereco, matricula, curso);
        this.orientador = orientador;
        setTipo("AlUNO PÓS GRADUAÇÃO");
    }

    @Override
    public String apresentar() {
        String iMedia;
        if (isMediaCalculada()){
            iMedia = "Media do Aluno: "+ getMedia();
        }else {
            iMedia = "Media ainda não disponivel";
        }
        return ("--INFORMAÇÕES DE "+this.getTipo()+"--" + "\n" +
                "Nome: " + this.getNome() + "\n" +
                "Matricula: " + this.getMatricula() + "\n" +
                "Curso: " + this.getCurso().getNome() + "\n" +
                "Orientador: " + this.getOrientador().getNome() + "\n"+
                iMedia +
                "\n"+"---------------");
    }

    @Override
    public float calcularMedia(float nota1, float nota2, float nota3) {
        return super.calcularMedia(nota1, nota2, nota3);
    }

    public String escreverTese(String tema, Professor orientador){
        return (this.getNome()+" escreveu sua tese sobre "+"''"+tema+"''"+" com sucesso, sob a " +
                "orientação de "+this.getOrientador().getNome());
    }


    public Professor getOrientador() {
        return orientador;
    }

    public void setOrientador(Professor orientador) {
        this.orientador = orientador;
    }
}
