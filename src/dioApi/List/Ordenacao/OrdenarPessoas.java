package dioApi.List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarPessoas {

    private List<Pessoas> pessoasList;

    public OrdenarPessoas() {
        this.pessoasList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoasList.add(new Pessoas(nome, idade, altura));
    }

    public List<Pessoas> odenadoPorIdade(){
        List<Pessoas> pessoasPorIdade = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoas> ordenarPorAltura(){
        List<Pessoas> pessoasPorAltura = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorAltura, new Pessoas.ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[]args){
        OrdenarPessoas ordenarPessoas = new OrdenarPessoas();

        ordenarPessoas.adicionarPessoa("nome 1",20, 1.56);
        ordenarPessoas.adicionarPessoa("nome2",30, 1.80);
        ordenarPessoas.adicionarPessoa("nome3",25, 1.70);
        ordenarPessoas.adicionarPessoa("nome4",17, 1.56);


        System.out.println(ordenarPessoas.ordenarPorAltura());
        System.out.println(ordenarPessoas.odenadoPorIdade());
    }
}
