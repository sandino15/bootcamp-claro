package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private static Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void  adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(Set<Contato> contatoSet){
        System.out.println(AgendaContatos.contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoesPorNome = new HashSet<>();
        for (Contato c : contatoSet){
            if (c.getNome().startsWith(nome)){
                contatoesPorNome.add(c);

            }
        }
        return contatoesPorNome;
    }

    public Set<Contato> pesquisarPorNumero(String numero){
        Set<Contato> contatoesPornumero = new HashSet<>();
        for (Contato c : contatoSet){
            if (c.getNome().startsWith(numero)){
                contatoesPornumero.add(c);

            }
        }
        return contatoesPornumero;
    }

    public Contato atualizarContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[]agrs){
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("san", 992016589);
        agendaContatos.adicionarContato("vany", 992016588);
        agendaContatos.adicionarContato("Olga", 992016587);
        agendaContatos.adicionarContato("san", 992016589);

        agendaContatos.exibirContato(contatoSet);

        System.out.println(agendaContatos.pesquisarPorNome("san"));




        System.out.println("Contato atualizado: " + agendaContatos.atualizarContato("Olga", 92016586));



    }
}
