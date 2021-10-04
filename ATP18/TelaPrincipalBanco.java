
public class TelaPrincipalBanco{
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        
        conta.setAgencia(0120);
        conta.setNumero(123098980);
        conta.setCodigo(12);
        conta.setSaldo(1500.00);

        int a = conta.getAgencia();
        System.out.println(a);

        int n = conta.getNumero();
        System.out.println(n);

        int c = conta.getCodigo();
        System.out.println(c);

        double s = conta.getSaldo();
        System.out.println(s);
    }

}