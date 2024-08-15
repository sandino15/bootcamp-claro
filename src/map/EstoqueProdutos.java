package map;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProduto() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotal() {
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterprodutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;

    }

    public static void main(String[]args){
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.exibirProduto();

        estoqueProdutos.adicionarProduto(1L,"produto A", 10, 5.0);
        estoqueProdutos.adicionarProduto(2L,"produto B", 5, 10.0);
        estoqueProdutos.adicionarProduto(3L,"produto C", 2, 15.0);
        estoqueProdutos.adicionarProduto(4L,"produto d", 2, 15.0);

        estoqueProdutos.exibirProduto();

        System.out.println("Valor total de estoque: R$ " + estoqueProdutos.calcularValorTotal());
        System.out.println("produto mais caro: " + estoqueProdutos.obterprodutoMaisCaro());
    }
}
