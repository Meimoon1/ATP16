public class TelaCalculadora {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();

       double r =  c.Soma(12.34, 34.12);
       int r1 = c.Soma(2, 4);
       float  r2 = c.Soma(10.6f, 38.67f, 89.56f);
       long  r3 = c.Soma(99999999, 99999999,99999999);

       System.out.println(r);
       System.out.println(r1);
       System.out.println(r2);
       System.out.println(r3);
    }
    
}
