package Atividade;

public class CalculadoraTaxas {
    private int contSaque = 0;
    
    private double taxaTransferencia = 0.00001;
    private double taxaSaque = 1.30;

    public double taxaTransferencia(double valorTransferido){
        double valorRetornado = valorTransferido* taxaTransferencia;
        return valorRetornado; // taxas sobre transferencia
    }

    public double taxaSaque(){
        contSaque +=1;
        
        if(contSaque%5 ==0){
            return taxaSaque;
        }else{
            return 0;
        }
      
    }    
}
