public class Cuenta {

    private int numeroCuenta;
    private double saldo;
    private int NIP;

    public Cuenta(int cuenta, double inicial, int NIP) {
        numeroCuenta = cuenta;
        saldo = inicial;
        this.NIP=NIP;
    }

    public void depositar(double cantidad) {
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) {
        saldo = saldo - cantidad;
    }

    public double saldo() {
        return saldo;
    }

    public void compra(double cantidad) {
        saldo = saldo - cantidad;
    }
}