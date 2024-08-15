package BancoDigitalDio;

abstract class Conta implements  IConta{
    private static final int AGENCIA_PADRAO = 1 ;
    private static  int SEQUENCIAL = 1 ;
    protected int agnecia;
    protected int numero;
    protected double saldo;
    protected  Cliente cliente;

    public  Conta(Cliente cliente){
        this.agnecia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL ++;
        this.cliente = cliente;

    }
    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
    this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

        this.sacar(valor);
        contaDestino.depositar(valor);
    }



    public int getAgnecia() {
        return agnecia;
    }

    public void setAgnecia(int agnecia) {
        this.agnecia = agnecia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    protected void imprimirInfoComuns() {
        System.out.println(String.format("Agencia : %d", this.agnecia));
        System.out.println(String.format("Numero : %d", this.numero));
        System.out.println(String.format("Saldo : %.2f", this.saldo));
        System.out.println(String.format("Cliente : %s", this.cliente.getNome()));

    }

}
