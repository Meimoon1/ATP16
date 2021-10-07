public class TelaCalculadora {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();

       double r =  c.Soma(12.34, 34.12);
       int r1 = c.Soma(2, 4);
       float  r2 = c.Soma(1.2222222, 3.9909090, 8.909);
       long  r3 = c.Soma(89E23, 99E12,890E12);
       
    }
    
}
