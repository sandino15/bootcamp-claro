package BancoDigitalDio;

public class Poupanca extends Conta {


    public Poupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato conta poupança ");
        super.imprimirInfoComuns();
    }
}
