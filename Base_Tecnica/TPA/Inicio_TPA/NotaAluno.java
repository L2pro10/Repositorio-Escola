import java.util.Scanner;

public class NotaAluno {
	   public static void main (String args[]) {
		   Scanner ler=new Scanner(System.in);
		   double n1, n2, n3, media;
		   System.out.println("digite a nota 1");
		   n1=ler.nextInt();
		   System.out.println("digite a nota 2");
		   n2=ler.nextInt();
		   System.out.println("digite a nota 3");
		   n3=ler.nextInt();
		   media=(n1 + n2 + n3) / 3;
		   System.out.println("sua media é " + media);
	   }
}
