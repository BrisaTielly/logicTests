package C_Exercises;

public abstract class ContaBancaria implements Conta {
    public double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }
}
