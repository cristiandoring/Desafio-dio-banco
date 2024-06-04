public class Main{
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        //deposita 150 na conta corrente
        cc.depositar(150);

        //transfere 100 pra poupança
        cc.transferir(100, cp);

        //mostra saldo bancário
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
