package C_Exercises;

public class ContaPoupanca  extends ContaBancaria{
    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void consultarSaldo() {
        System.out.println(saldo);
    }

    @Override
    public void depositar(double valor) {
        valor -= 0.01*saldo;
        saldo += valor;
    }
}
