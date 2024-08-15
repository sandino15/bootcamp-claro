package dioApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDio {
    public static void main(String[]args){
        //Criar uma lista de palavras
        List <String> palavaras = Arrays.asList("java","kotlin", "phyton", "javascript", "c", "go", "ruby");

        // Criar uma Predicate que verifica se a palavra tem mais de 5 caracteres
       Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() >5;

        //Usar o SStram para filtrar as palavras com mais de 5 caracteres e, em seguida,
        //imprir cada palavra que passou no filtro
        palavaras.stream()
                .filter(maisDeCincoCaracteres)
                .forEach(System.out::println);
    }
}
