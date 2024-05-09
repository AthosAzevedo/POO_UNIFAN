package FACULDADE;

import java.util.Scanner;

public class AlunoGraduacao extends Aluno{
    Scanner scanner = new Scanner(System.in);

    public AlunoGraduacao(String nome, String endereco, String matricula, Curso curso) {
        super(nome, endereco, matricula, curso);
    }

    @Override
    public void calcularMedia() {
        super.calcularMedia();
    }
}
