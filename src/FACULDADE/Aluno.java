package FACULDADE;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private String matricula;
    private Curso curso;
    private float media;
    private boolean mediaCalculada;
    private String tipo;

    public Aluno(String nome, String endereco, String matricula, Curso curso) {
        super(nome, endereco);
        this.matricula = matricula;
        this.curso = curso;
        setMediaCalculada(false);
        this.tipo = "Aluno";
    }

    public float calcularMedia(float nota1, float nota2, float nota3) {
        setMediaCalculada(true);
        this.media = (nota1 + nota2 + nota3)/3;
        return this.media;
    }

    @Override
    public String apresentar() {
        String iMedia;
        if (isMediaCalculada()){
           iMedia = "Media do Aluno: "+ getMedia();
        }else {
            iMedia = "Media ainda não disponivel";
        }
        return ("--INFORMAÇÕES DE "+this.tipo+"--" + "\n" +
                "Nome: " + this.getNome() + "\n" +
                "Matricula: " + this.getMatricula() + "\n" +
                "Curso: " + this.getCurso().getNome() + "\n" + iMedia + "\n"+"---------------");
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

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public boolean isMediaCalculada() {
        return mediaCalculada;
    }

    public void setMediaCalculada(boolean mediaCalculada) {
        this.mediaCalculada = mediaCalculada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
