package ATP17;

public class Principal {
    public static void main(String[] args) {
        Calculo c = new Calculo(); 

       double r = c.calcularIss(1500);
       System.out.printf("O imposto ISS do valor recebido é: %.2f \n", r);

       double r1 = c.calcularIof(4000);
       System.out.printf("O imposto IOF do valor recebido é: %.2f \n",r1);

       double r2 = c.calcularIr(2000);
       System.out.printf("O imposto IR do valor recebido é: %.2f \n", r2);       
    }
    
}
