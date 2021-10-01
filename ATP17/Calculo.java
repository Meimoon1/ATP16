package ATP17;

public class Calculo {
    private double taxaIss = 0.005;

    public double calcularIss(double valorRecebido){
        double imposto = valorRecebido * taxaIss;
        return imposto;
    }
    
    
}
