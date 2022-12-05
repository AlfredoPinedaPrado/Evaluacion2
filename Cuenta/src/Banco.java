import javax.swing.Timer;

public class Banco {

    public static void main(String[] args) {

        double totalCuenta;
//        Cuenta Cuenta1;
//        Cuenta1 = new Cuenta(25621541, 100.70,1234);
        Client Client1 = new Client(25451, 100.70, 1234, "Freddy");
        Client Client2 = new Client(94685, 500, 4578, "Jorge");
        totalCuenta = Client1.saldo();
        System.out.println("Total actual en la cuenta: " + totalCuenta + " pesos");

        System.out.println("-------------------------------------------------");

//Intenta realizar una compra con su tarjeta de crédito, pero es rechazada porque no tiene el límite de crédito suficiente.

        double compra = 200;
        if (totalCuenta - compra < 0) {
            System.out.println("Su saldo es insifuciente");
        }else{
            totalCuenta = totalCuenta - compra;
            System.out.println("Su saldo despues de la compra es: "+ totalCuenta + "pesos");
            System.out.println("-------------------------------------------------");         
        }

//Realiza un depósito a su tarjeta de débito

        double ingreso = 200;
        System.out.println("Se ingresan en la cuenta: " + ingreso + " pesos ");
        Client1.depositar(ingreso);

        System.out.println("-------------------------------------------------");

        totalCuenta = Client1.saldo();
        System.out.println("Total actual en la cuenta: " + totalCuenta + " pesos ");
        System.out.println("-------------------------------------------------");

        if (Client1.saldo() - compra < 0) {
            System.out.println("Su saldo es insifuciente");
        }else{
            totalCuenta = totalCuenta - compra;
            System.out.println("COMPRA EXITOSA.. por 200 pesos");
            System.out.println("Su saldo despues de la compra es: "+ totalCuenta + "pesos");
            System.out.println("-------------------------------------------------");         
        }
    
    }
    

}