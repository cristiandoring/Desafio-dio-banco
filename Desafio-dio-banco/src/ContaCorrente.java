public class ContaCorrente extends Conta {
    //classe ContaCorrente está herdando os métodos e atributos da classe Conta por meio do extends

    public void imprimirExtrato(){
        System.out.println("*** EXTRATO CONTA CORRENTE ***");
        super.imprimirInfosComum();
    }

    
}
