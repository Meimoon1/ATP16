package ATP17;

public class Principal {
    public static void main(String[] args) {
        Calculo c = new Calculo();

       double r = c.calcularIss(1500);
       System.out.println(r);
       double r1 = c.calcularIof(4000);
       System.out.println(r1);
       double r2 = c.calcularIr(2000);
       System.out.println(r2);
        

    }
    
}
