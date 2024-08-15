package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerCodigoPorConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;

        for (Convidado c : convidadoSet){
            if (c.getCodigoConvidado() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }else {
                System.out.println("Não exite convidado com esse código de convite");
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }
    public static void main(String[]args){
        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();
        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " dentro do Set Convidados");

        conjuntoConvidado.adicionarConvidado("convidado1", 1234);
        conjuntoConvidado.adicionarConvidado("convidado2", 1220);
        conjuntoConvidado.adicionarConvidado("convidado3", 1284);
        conjuntoConvidado.adicionarConvidado("convidado4", 1285);
        conjuntoConvidado.adicionarConvidado("convidado5", 1284);



        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " dentro do Set Convidados");

        conjuntoConvidado.removerCodigoPorConvite(12);

        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " dentro do Set Convidados");

        conjuntoConvidado.exibirConvidados();
    }
}
