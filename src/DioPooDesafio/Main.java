package DioPooDesafio;

import java.time.LocalDate;

public class Main {

    public static void main(String []args){

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao(" Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javaScript");
        curso2.setDescricao(" Descrição curso javaScript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("memoria de jva");
        mentoria.setDescricao(" decrição mentoria java");
        mentoria.setData(LocalDate.now());

        Conteudo conteudo = new Curso();

        /*System.out.println(conteudo);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Descrição do bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devSan = new Dev();

        devSan.setNome("Sandino");
        devSan.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Sandino: " + devSan.getConteudosInscritos());
        devSan.progredir();
        devSan.progredir();
        System.out.println("__________");
        System.out.println("Conteudos Inscritos Sandino: " + devSan.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Sandino: " + devSan.getConteudoConcluidos());
        System.out.println("XP: " + devSan.calcularTotalXp());
        System.out.println("__________");

        Dev devVany = new Dev();
        devVany.setNome("Vany");
        devVany.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Vany:" + devSan.getConteudosInscritos());
        devVany.progredir();
        devVany.progredir();
        devVany.progredir();
        System.out.println("__________");
        System.out.println("Conteudos Inscritos Vany:" + devSan.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Vany:" + devSan.getConteudoConcluidos());
        System.out.println("XP: " + devVany.calcularTotalXp());

    }
}
