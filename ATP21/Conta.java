public class Conta{
    private double saldo;
    private int codigo_cliente;
 
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo(){
        return saldo;
    }

    public void setCodigo(int codigo_cliente){
        this.codigo_cliente = codigo_cliente;
    }
    public int getCodigo(){
        return codigo_cliente;
    }

    public double transferencia(double valor){
        double saldoFinal = this.getSaldo() - valor;
        return saldoFinal;
    }

    
}