public abstract class Conta implements :Conta{

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
}
