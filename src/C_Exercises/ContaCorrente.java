package C_Exercises;

public class ContaCorrente extends ContaBancaria{
    public ContaCorrente() {
        super();
    }

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void consultarSaldo() {
        System.out.println(saldo);
    }
    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

}
