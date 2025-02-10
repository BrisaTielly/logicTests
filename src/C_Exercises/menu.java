package C_Exercises;

public class menu {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(2000);
        contaCorrente.consultarSaldo();
        contaCorrente.depositar(200);
        contaCorrente.consultarSaldo();

        ContaPoupanca contaPoupanca = new ContaPoupanca(100);
        contaPoupanca.consultarSaldo();
        contaPoupanca.depositar(100);
        contaPoupanca.consultarSaldo();
    }
}
