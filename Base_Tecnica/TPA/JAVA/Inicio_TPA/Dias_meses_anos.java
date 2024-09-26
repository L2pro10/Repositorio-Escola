import java.util.Scanner;

public class Dias_meses_anos {
   public static void main (String args[]) {
	   Scanner ler=new Scanner(System.in);
	   double dias,meses,anos;
	   System.out.println("Escreva a quantidade de dias");
	   dias=ler.nextDouble();
	   meses=dias/30;
	   anos=meses/12;
	   System.out.println("A quantidade de meses é " + meses);
	   System.out.println("A quantidade de anos é " + anos);
   }
}