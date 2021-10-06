public class Teste {
    public static void main(String[] args) {
        Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();

        c.setSaldo(1500);
        //double saldo =c.getSaldo();
        c.setCodigo(1180);
        //double codigo = c.getCodigo();
        double r = c.transferencia(340.00);

        System.out.printf(" Código Cliente: %d \n Saldo: %.2f \n Saldo Após transferência: %.2f\n", c.getCodigo(), c.getSaldo(), r);
        
    }
}
