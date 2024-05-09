package FACULDADE;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<String> listaInicial = new ArrayList<>();
        listaInicial.add("a");
        listaInicial.add("b");
        List<String> listasecundaria = new ArrayList<>();
        listasecundaria.add("1");
        listasecundaria.add("2");
//
        Curso c = new Curso("Eng","205555", listaInicial,listasecundaria);
//        Aluno a = new Aluno("Athos","Fsa","2132",c);
//
//        System.out.println(c.getDisciplinaObrigatorias()+"\n"+c.getDisciplinaEletivas());
//        Professor p = new Professor("kiko","feira","artes",listasecundaria);
//        Disciplina d = new Disciplina("Matematica","oaoa",20,p);

//        p.adicionarDisciplina(d);
//        System.out.println(p.getDisciplinasMinistradas());

        Aluno a = new Aluno("Athos","Feira","2132",c);
        a.calcularMedia();
    }
}