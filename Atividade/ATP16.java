package Atividade;
import java.util.Scanner;

public class ATP16 {
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        CalculadoraTaxas c = new CalculadoraTaxas();
        
        System.out.println("Informe o valor da transferência: ");
        double transferencia = Double.parseDouble(sc.nextLine());
        double t = c.taxaTransferencia(transferencia);

        System.out.printf("A taxa da transferência foi: R$ %.2f \n",t);

       /* System.out.println("*----------A cada cinco sanques, será cobrado um valor de R$ 1,30------------*");
        System.out.print("Informe a quantidade de sanques: ");
        int qtdsaques = Integer.parseInt(sc.nextLine());
        System.out.print("Informe o valor transferido: ");
        double valorT = Double.parseDouble(sc.nextLine());

       double t2= c.taxaSaque(qtdsaques, valorT); */
        
       // System.out.printf("O valor transferido total é: %.2f ", t2);

        

        
   }
    
}
