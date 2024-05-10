package FACULDADE;

public class AlunoPosGraduacao extends AlunoGraduacao {
    public AlunoPosGraduacao(String nome, String endereco, String matricula, Curso curso, Professor orientador) {
        super(nome, endereco, matricula, curso);
    }

    @Override
    public void calcularMedia() {
        super.calcularMedia();
    }

    public void escreverTese(String tema, Professor orientador){
        System.out.println(this.getNome()+" escreveu sua tese sobre "+"''"+tema+"''"+" com sucesso, sob a " +
                "orientação de "+orientador.getNome());
    }


}
