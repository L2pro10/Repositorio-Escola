import java.util.Scanner;
public class desconto {
	 public static void main (String args[]) {
		   Scanner ler=new Scanner(System.in);
		   double valor,desconto,novoValor,valorDesconto;
		   System.out.println("escreva o valor do produto");
		   valor=ler.nextDouble();
		   desconto=5;
		   novoValor=valor*desconto/100;
		   valorDesconto= valor-novoValor;
		   System.out.println("Após ser aplicado o desconto o valor do produto ficará " + valorDesconto);
	 }
}
