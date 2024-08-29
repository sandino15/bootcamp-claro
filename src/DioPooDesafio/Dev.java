package DioPooDesafio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);

    }
    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()){
            this.conteudoConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        }else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }
    public double calcularTotalXp(){
   return this.conteudoConcluidos
           .stream()
           .mapToDouble(conteudo -> conteudo.calcularXp())
           .sum();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudoConcluidos() {
        return conteudoConcluidos;
    }

    public void setConteudoConcluidos(Set<Conteudo> conteudoConcluidos) {
        this.conteudoConcluidos = conteudoConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dev dev)) return false;
        return Objects.equals(getConteudosInscritos(), dev.getConteudosInscritos()) && Objects.equals(getConteudoConcluidos(), dev.getConteudoConcluidos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getConteudosInscritos(), getConteudoConcluidos());
    }
}
