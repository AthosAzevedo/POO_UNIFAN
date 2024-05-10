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

        List<String> disciplinaObrigatoria = new ArrayList<>();
        disciplinaObrigatoria.add("Calculo 1");
        disciplinaObrigatoria.add("Logica em Programção");
        disciplinaObrigatoria.add("Progamção Orientada a Gambiarra");
        List<String> disciplinaEletiva = new ArrayList<>();
        disciplinaEletiva.add("Meio Ambiente");
        disciplinaEletiva.add("Robotica");


//
        Curso c = new Curso("102030","Engenharia",disciplinaObrigatoria,disciplinaEletiva);
//        Aluno a = new Aluno("Athos","Fsa","2132",c);
        c.apresentar();
//
//        System.out.println(c.getDisciplinaObrigatorias()+"\n"+c.getDisciplinaEletivas());
        Professor p = new Professor("kiko","feira","artes",disciplinaEletiva);

        Disciplina d[] = new Disciplina[5];
        d[0] = new Disciplina("Logica em Progamação","0101110",36,p);
        d[1] = new Disciplina("Progamação Orientada a Objetos","1010110",32,p);
        d[2] = new Disciplina("Calculo 1","0110011",36,p);
        d[3] = new Disciplina("Matématica Aplicada","01001010",36,p);
        d[4] = new Disciplina("Algebra Linear","0110101010",36,p);


        p.adicionarDisciplina(d[0]);
        p.adicionarDisciplina(d[2]);
        p.adicionarDisciplina(d[3]);
        p.apresentar();



//        p.adicionarDisciplina(d);


//        Aluno a = new Aluno("Athos","Feira","2132",c);
////        a.calcularMedia();
//
//        AlunoPosGraduacao ap = new AlunoPosGraduacao("Jeca","Feira de Santana","29io",c,p);
//        ap.escreverTese("Inteligencia Artificial",p);
    }
}