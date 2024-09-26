import java.util.Scanner;

public class desconto2 {
	   public static void main (String args[]) {
		   Scanner ler=new Scanner(System.in);
		   double preco, desconto, novoValor, precoFinal;
		   System.out.println("digite o preço do produto");
		   preco=ler.nextInt();
		   System.out.println("digite o desconto em porcentagem");
		   desconto=ler.nextInt();
		   novoValor=preco * desconto / 100;
		   precoFinal=preco - novoValor;
		   System.out.println("o novo preço é " + precoFinal);
	   }
}