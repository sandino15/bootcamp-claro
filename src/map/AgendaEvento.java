package map;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEvento {
    Map<LocalDate, Evento> eventoMap;

    public AgendaEvento() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        // Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventoTreeMap);
    }

    public void obterProximoEvento() {
       /*Map<LocalDate, Evento>  eventoTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventoTreeMap);*/
        //eventoMap.get();

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximaEvento = null;
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        for (Map.Entry<LocalDate, Evento> entry : eventoTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximaEvento = entry.getValue();
                System.out.println("Proximo evento: " + proximaEvento + " acontera na data: " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEvento agendaEvento = new AgendaEvento();

        agendaEvento.adicionarEvento(LocalDate.of(2022, Month.JULY, 15),"Evento 1", "Atracao 1");
        agendaEvento.adicionarEvento(LocalDate.of(2022, 7, 9),"Evento 2", "Atracao 2");
        agendaEvento.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10),"Evento 3", "Atracao 3");
        agendaEvento.adicionarEvento(LocalDate.of(2024, 9, 15),"Evento 5", "Atracao 5");

        agendaEvento.exibirAgenda();

        agendaEvento.obterProximoEvento();


    }

}
