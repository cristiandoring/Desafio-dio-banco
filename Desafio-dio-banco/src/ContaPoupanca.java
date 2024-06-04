public class ContaPoupanca extends Conta {
    //classe ContaPopuança está herdando os métodos e atributos da classe Conta por meio do extends

    public void imprimirExtrato(){
        System.out.println("*** EXTRATO CONTA POUPANÇA ***");
        super.imprimirInfosComum();
    }

}
