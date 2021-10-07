public class TelaBanco {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1500.00, 12);
        

        double deposito = cc.deposito(150.98);
        double saque = cc.saque(120.00);

        System.out.println(cc);
        System.out.printf(" \nSaldo após depósito: %.2f", deposito);
        System.out.println("\n---------------------------------------");
        System.out.println(cc);
        System.out.printf(" Saldo após saque: %.2f", saque);
        
    }
}
