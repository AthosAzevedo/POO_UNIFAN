package FACULDADE;

public class AlunoGraduacao extends Aluno{
    public AlunoGraduacao(String nome, String endereco, String matricula, Curso curso) {
        super(nome, endereco, matricula, curso);
        setTipo("AlUNO GRADUAÇÃO");
    }

    @Override
    public String apresentar() {
        return super.apresentar();
    }

    @Override
    public float calcularMedia(float nota1, float nota2, float nota3) {
        return super.calcularMedia(nota1, nota2, nota3);
    }
}
