package Atividade;


public class CalculadoraTaxas {
    

    public double taxaTransferencia(double valorTransferido){
        double valorRetornado = valorTransferido + valorTransferido* 0.001;
        return valorRetornado;
    }

    public double taxaSaque(int saques, double valorTransferido){
       if(saques >= 5){
            valorTransferido = valorTransferido + 1.30;
       }else{
           return valorTransferido;
       }
       return valorTransferido;
    }

    
}
