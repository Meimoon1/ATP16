public class Teste {
    public static void main(String[] args) {
        Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        //objeto da conta
        c.setSaldo(15000.00);
        double saldoInicial = c.getSaldo();
        c.setCodigo(1180);
        c.transferencia(340.00);
        
        
        //objeto da conta corrente
        cc.setSaldo(6000.00);
        double saldoInC = cc.getSaldo();
        cc.setCodigo(1190);
        cc.transferencia(78.98);
        cc.transferencia(790.11);
        cc.transferencia(190.08);
        cc.transferencia(12.03);
        cc.transferencia(15.00);
        cc.transferencia(98.78);
        
        
        
        System.out.println("--------------Conta-----------");
        System.out.printf(" Código Cliente: %d \n Saldo Inicial: %.2f \n Saldo Após transferência: %.2f \n", c.getCodigo(),saldoInicial, c.getSaldo());
        System.out.println("---------Conta Corrente--------");
        System.out.printf(" Código Cliente: %d \n Saldo Inicial: %.2f  \n Saldo Após 6 transferência: %.2f\n", cc.getCodigo(),saldoInC, cc.getSaldo());
      
        
        

    }
}
