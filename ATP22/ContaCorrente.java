public class ContaCorrente {
    private double saldo;
    private double taxaSaque = 7.50;
    private int codigoCliente;

    public ContaCorrente(double saldo, double taxaSaque, int codigoCliente){
        
    }

    public double saque(double valor){
        double valorFinal = this.saldo - valor  - taxaSaque;
        return valorFinal;
    }

    public double deposito(double valor){
        double valorFinal = this.saldo + valor;
        return valorFinal;
    }
    
}
