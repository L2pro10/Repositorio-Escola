import java.util.Scanner;
public class Troca {
	public static void main (String args[]) {
		   Scanner ler=new Scanner(System.in);
		   int valorA, valorB, valorC;
		   System.out.println("Digite o valor A");
		  valorA=ler.nextInt();
		   System.out.println("Digite o valor B");
		   valorB=ler.nextInt();
		   valorC = valorA;
		   valorA = valorB;
		   valorB = valorC;
		   System.out.println("O valor A é " + valorA);
		   System.out.println("O valor B é " + valorB);
	   }

}
