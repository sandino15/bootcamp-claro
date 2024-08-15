package dioApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Function {
    public static void main(String[]args){
        //Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        //Usar a Function com expressão lambda para dobrar todos os números
       java.util.function.Function<Integer, Integer> dobrar = numero -> numero * 2;

       // Usar a função para dobrar os números no Stream e armazená-los em outra lista
        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrar)
                .collect(Collectors.toList());
        numerosDobrados.forEach(n -> System.out.println(n));
    }
}
