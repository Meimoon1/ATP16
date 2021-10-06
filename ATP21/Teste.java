public class Teste {
    public static void main(String[] args) {
        Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        //objeto da  conta
        c.setSaldo(1500);
        c.setCodigo(1180);
        
        double r = c.transferencia(340.00);
        //objeto da conta corrente
        cc.setSaldo(6000);
        cc.setCodigo(1190);
        
        double r2 = cc.transferencia(120.00);

        System.out.printf(" Código Cliente: %d \n Saldo: %.2f \n Saldo Após transferência: %.2f\n", c.getCodigo(), c.getSaldo(), r);
        System.out.println("------------------------------");
        System.out.printf(" Código Cliente: %d \n Saldo: %.2f \n Saldo Após transferência: %.2f\n", cc.getCodigo(), cc.getSaldo(), r2);

    }
}
