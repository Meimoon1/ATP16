public class ContaCorrente {
    private double saldo;
    private double taxaSaque = 7.50;
    private int codigoCliente;

    public ContaCorrente(double saldo,  int codigoCliente){
        this.saldo = saldo;
        this.codigoCliente = codigoCliente;      
    }

    public double saque(double valor){
        double valorFinal = this.saldo - valor  - taxaSaque;
        return valorFinal;
    }

    public double deposito(double valor){
        double valorFinal = this.saldo + valor;
        return valorFinal;
    }

    public String toString(){
        String mensagem = " \nSaldo: R$ "+ saldo + " \nTaxa Saque: R$ " + taxaSaque + " \nCódigo do cliente: "+ codigoCliente;
        return mensagem;
    }
    
    
}
