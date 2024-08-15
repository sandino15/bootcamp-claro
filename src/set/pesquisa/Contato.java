package set.pesquisa;

import java.util.Objects;

public class Contato {
    private String nome;
    private String contato;
    private int numero;

    public Contato(String nome, int numero) {
        this.nome = nome;
        this.contato = contato;
        this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public String getContato() {
        return contato;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato1)) return false;
        return getNumero() == contato1.getNumero() && Objects.equals(getContato(), contato1.getContato());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getContato(), getNumero());
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", contato='" + contato + '\'' +
                ", numero=" + numero +
                '}';
    }
}
