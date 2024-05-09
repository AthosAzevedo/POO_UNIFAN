package FACULDADE;

import FACULDADE.Curso;
import FACULDADE.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aluno extends Pessoa {
    private String matricula;
    private Curso curso;
    private List<Float> notas;

    public Aluno(String nome, String endereco, String matricula, Curso curso) {
        super(nome, endereco);
        this.matricula = matricula;
        this.curso = curso;
        this.notas = new ArrayList<>(); // Inicializando a lista de notas
    }

    public void calcularMedia() {
        System.out.println("Quantas notas serão calculadas? ");
        Scanner scanner = new Scanner(System.in);
        int soma= 0;
        int qntdNota = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < qntdNota; i++) {
            System.out.println("Nota " + (i + 1) + ": ");
            float nota = Float.parseFloat(scanner.nextLine());
            this.notas.add(nota);
        }
        for (float numero : this.notas) {
            soma += numero;
        }
        float media = (float) soma / notas.size();
        System.out.println("A media de "+this.getNome()+": "+media);
    }

    @Override
    public void apresentar() {
        System.out.println("--INFORMAÇÕES DE ALUNO--" + "\n" +
                "Nome: " + this.getNome() + "\n" +
                "Matricula: " + this.getMatricula() + "\n" +
                "Curso: " + this.getCurso().getNome() + "\n");
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Float> getNotas() {
        return notas;
    }

    public void setNotas(List<Float> notas) {
        this.notas = notas;
    }
}
