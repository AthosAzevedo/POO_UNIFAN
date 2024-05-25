package FACULDADE;
//© MIZUTECH 2024 - Athos Azevedo

public class Main {
    public static void main(String[] args) {
//        Como toda boa faculdade deve ter pelo menos um curso
        Curso engSoftware = new Curso("0102930","Engenharia de Sofware");
//        E como toda bom curso deve ter pelos menos um professor
        Professor julio = new Professor("Julio o Brabo","Tomba","TI");
//        E todo bom professor deve ministar algumas disciplinas
        Disciplina poo = new Disciplina("POO","102009010",58,julio);
        Disciplina bd = new Disciplina("Banco de Dados II","01290200",38,julio);
        Disciplina ihm = new Disciplina("Interface Homem e Maquina", "01029021",38,julio);
        julio.adicionarDisciplina(poo);
        julio.adicionarDisciplina(bd);
        julio.adicionarDisciplina(ihm);
//        E como toda bom curso deve ter disciplinas eletivas
        engSoftware.adicionarDisciplinaEletivas(ihm);
//        E obrigatorias
        engSoftware.adicionarDisciplinaObrigatorias(poo);
        engSoftware.adicionarDisciplinaObrigatorias(bd);
//        E como nenhuma faculdade não funciona sem seus queridos alunos de gradução
        Aluno athos = new AlunoGraduacao("Athos Azevedo", "Feira de Santana",
                "10202332", engSoftware);
//        eos seus alunos de pos graduação que também não devem ficar sem seu orientador
        AlunoPosGraduacao fulano = new AlunoPosGraduacao("Fulano","Alagoinhas",
                "10204349", engSoftware, julio);

//        PRINT DO CURSO
        System.out.println(engSoftware.apresentar());
//        PRINT DAS DISCIPLINAS
        System.out.println(poo.apresentar());
        System.out.println(bd.apresentar());
        System.out.println(ihm.apresentar());
//        PRINT DOS ALUNOS
        System.out.println(athos.apresentar());
        System.out.println(fulano.apresentar());
//        PRINT DAS AÇÕES DOS ALUNOS
//          CALCULANDO MEDIA
        athos.calcularMedia(10f,10f,10f);
        fulano.calcularMedia(5f,9f,7f);
        System.out.println(athos.apresentar());
        System.out.println(fulano.apresentar());
//        ESCREVENDO TESE
        System.out.println(fulano.escreverTese("Inteligencia Artificial", julio));

    }
}