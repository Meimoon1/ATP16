package Atividade;

public class CalculadoraTaxas {
    int contSaque = 0;
    double taxa = 0;

    public double taxaTransferencia(double valorTransferido){
        double valorRetornado = valorTransferido* 0.001;
        return valorRetornado; // taxas sobre transferencia
    }

    
    public double taxaSaque(){
        contSaque +=1;
        
        if(contSaque%5 ==0){
            taxa = taxa + 1.30;
            return taxa;
        }else{
            return 0;
        }
      
    } 

    
   


    
}
