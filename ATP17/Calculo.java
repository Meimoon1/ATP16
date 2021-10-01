package ATP17;

public class Calculo {
    private double taxaIss = 0.005;
    private double taxaIof = 0.002;
    private double taxaIr = 0.008;

    public double calcularIss(double valorRecebido){
        double imposto = valorRecebido * taxaIss;
        return imposto;
    }
    
    public double calcularIof(double valorRecebido){
        double imposto = valorRecebido * taxaIof;
        return imposto;    
    }

    public double calcularIr(double valorRecebido){
        double imposto = valorRecebido * taxaIr;
        return imposto;
    }
}
