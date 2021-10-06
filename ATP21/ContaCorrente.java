public class ContaCorrente extends Conta {
    private double taxa_transferencia = 10.50;
    private double taxa_manutencao = 2.50;
    private int numero_transferencias = 0;

    @Override
    public void transferencia(double valor){  
        do{
            super.transferencia(valor);
            double novoSaldo = this.getSaldo()- taxa_transferencia;
            this.setSaldo(novoSaldo); 
            numero_transferencias++;
                if(numero_transferencias %5 ==0){
                    novoSaldo = novoSaldo - taxa_manutencao;
                }
        }while(numero_transferencias > 0);
    } 
}
