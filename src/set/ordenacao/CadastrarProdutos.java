package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastrarProdutos {

    private Set<Produto> produtoSet;

    public CadastrarProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(int cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> exibirProdutosPorNome = new TreeSet<>(produtoSet);

        return exibirProdutosPorNome;
    }

    public Set<Produto> exibirProdutoPorPreco() {
        Set<Produto> exibirProdutoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        exibirProdutoPorPreco.addAll(produtoSet);

        return exibirProdutoPorPreco;
    }

    public static void main(String[] args) {
        CadastrarProdutos cadastrarProdutos = new CadastrarProdutos();

        cadastrarProdutos.adicionarProduto(15, "Dipirona 1G", 15, 5);
        cadastrarProdutos.adicionarProduto(16, "Paracetamol", 4, 8);
        cadastrarProdutos.adicionarProduto(18, "Diclofenaco", 8, 9);

        System.out.println(cadastrarProdutos.exibirProdutoPorPreco());
        System.out.println(cadastrarProdutos.exibirProdutosPorNome());


    }
}
