package dioApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SuppliterT {
    public static void main(String[]args){

        /* Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";
        //Usar o Supplier para obter uma lista com 5 saudações
        List<String> listaSaudacao = Stream.generate(saudacao)
                .limit(5)
                .collect(Collectors.toList());
            //Imprimir as saudações geradas
        listaSaudacao.forEach(s -> System.out.println(s));*/

        List<String>colors = Arrays.asList("red","black","orange","blue","yellow");

        String result = colors.stream()
                .filter(color ->color.length()<6)
                .sorted(Comparator.comparing(String::length).reversed())
                .map(color -> new StringBuilder(color).reverse().toString())
                .collect(Collectors.joining(","));

        System.out.println(result);

    }
}
