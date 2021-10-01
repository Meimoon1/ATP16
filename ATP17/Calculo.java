package ATP17;

public class Calculo {
    //Taxas de cada imposto
    private double taxaIss = 0.005; 
    private double taxaIof = 0.002;
    private double taxaIr = 0.008;

    //Método criado para calculo do imposto ISS
    public double calcularIss(double valorRecebido){
        double impostoCalculado = valorRecebido * taxaIss;
        return impostoCalculado;
    }

    //Método criado para calculo do imposto IOF
    public double calcularIof(double valorRecebido){
        double impostoCalculado = valorRecebido * taxaIof;
        return impostoCalculado;    
    }

    //Método criado para calculo do imposto IR
    public double calcularIr(double valorRecebido){
        double impostoCalculado = valorRecebido * taxaIr;
        return impostoCalculado;
    }
}
