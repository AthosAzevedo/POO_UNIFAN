package FACULDADE;

public class AlunoPosGraduacao extends AlunoGraduacao {
    public AlunoPosGraduacao(String nome, String endereco, String matricula, Curso curso) {
        super(nome, endereco, matricula, curso);
    }

    @Override
    public void calcularMedia() {
        super.calcularMedia();
    }
}
