package BancoDigitalDio;

public class Principal {
    public static void main(String[]args){
        Cliente cliente = new Cliente();
        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new Poupanca(cliente);



        cliente.setNome("san");
        cc.depositar(1000);
        cc.transferir(100,poupanca);
        cc.transferirPix(100,poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();



    }
}
