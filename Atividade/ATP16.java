package Atividade;
import java.util.Scanner;

public class ATP16 {
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        CalculadoraTaxas c = new CalculadoraTaxas();
        System.out.println("-----------Transferência-----------");
        System.out.print("Informe o valor da transferência: \n");
        double transferencia = Double.parseDouble(sc.nextLine());
        double t = c.taxaTransferencia(transferencia);

        System.out.printf("A taxa da transferência foi: R$ %.2f \n",t);

        int opcao = 0;
        while(opcao != 2){
            Scanner src = new Scanner(System.in);
            
            System.out.println("------------- Saques--------------");
            System.out.println(" 1-Sacar \n 2-Sair");
            opcao = Integer.parseInt(src.next());
        
            switch(opcao){
                
                case 1:
                        double t2 = c.taxaSaque();
                        System.out.println("A taxa de saque é: "+t2 );

                break;
                case 2: 
                    System.out.println("----Saindo----");
                break;
                default:
                    System.out.println("Opção inválida");
                break;
            }  
        }
       
    
        

       

       
        
 

        

        
   }
    
}
