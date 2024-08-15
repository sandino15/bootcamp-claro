package map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adiconarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisaPorNome(String nome){
        Integer numeroPornome = null;
        if (!agendaContatoMap.isEmpty()){
          numeroPornome = agendaContatoMap.get(nome);
        }

        return numeroPornome;
    }

    public static void main(String[]args){

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adiconarContato("Camila", 123456);
        agendaContatos.adiconarContato("Camila", 5665);
        agendaContatos.adiconarContato("camila Cavalcante",111111);
        agendaContatos.adiconarContato("Camila Dio", 654987);
        agendaContatos.adiconarContato("Maria Silva", 121212121);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Maria Silva");
        agendaContatos.exibirContatos();

        System.out.println("meu numero é: " + agendaContatos.pesquisaPorNome("Camila Dio"));

    }
}
