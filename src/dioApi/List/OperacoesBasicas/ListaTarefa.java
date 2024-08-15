package dioApi.List.OperacoesBasicas;

import dioApi.List.Pesquisa.CatalogoLivros;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    
     //atributo
    private List<Tarefa>tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t: tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("livro 1", "autor 1", 2020);
        catalogoLivros.adicionarLivro("livro 1", "autor 2", 2021);
        catalogoLivros.adicionarLivro("livro 2", "autor 2", 2022);
        catalogoLivros.adicionarLivro("livro 3", "autor 3", 2023);
        catalogoLivros.adicionarLivro("livro 4", "autor 4", 1997);

        System.out.println(catalogoLivros.pesquisarPorAutor("autor 3"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1997, 2023));
        System.out.println(catalogoLivros.pesquisarPorTitulo("livro 1"));
    }
}
