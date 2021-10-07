public class TelaBanco {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1500.00, 12);
        

        double deposito = cc.deposito(150.98);
        double saque = cc.saque(120.00);

        System.out.printf(" \nDepósito: %.2f", deposito);
        System.out.printf(" \nSaque: %.2f", saque);
        System.out.println(cc);
    }
}
