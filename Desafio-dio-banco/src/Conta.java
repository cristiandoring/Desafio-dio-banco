public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero_conta;
    protected double saldo;

    public Conta(){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero_conta = SEQUENCIAL++;

    }
    public void sacar(double valor){
        saldo -= valor;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino){
       //tira dinheiro da própria conta 
        this.sacar(valor);

        //coloca dinheiro na conta destino
        contaDestino.depositar(valor);
    }

    public int getAgencia(){
        return agencia;
    }

    public int getNumeroConta(){
        return numero_conta;
    }

    public double getSaldo(){
        return saldo;
    }

    protected void imprimirInfosComum() {
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero_conta));
        System.out.println(String.format("Saldo: %2f", this.saldo));
    }
}
