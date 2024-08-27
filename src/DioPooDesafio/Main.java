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

        System.out.println(curso1);
        System.out.println(mentoria);
    }
}
