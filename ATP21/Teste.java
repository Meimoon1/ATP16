public class Teste {
    public static void main(String[] args) {
        Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();

        c.setSaldo(1500);
        //c.getSaldo();
        c.setCodigo(1180);
        //c.getCodigo();
        double r = c.transferencia(340.00);

        System.out.printf("Código Cliente: %d \n Saldo: %f \n Saldo Após transferência: \n", c.getSaldo(), c.getCodigo(), r);
        
    }
}
