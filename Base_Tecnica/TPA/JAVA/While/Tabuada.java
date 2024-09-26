package exercicios;
import java.util.Scanner;
public class Tabuada {
public static void main(String[] args) {
	Scanner ler=new Scanner(System.in);
	int n,numero,i=1;
	System.out.println("digite um numero");
	n = ler.nextInt();
	while (i<11) {
		numero=n*i;
		System.out.println(numero);
		i=i+1;
	}
	
}
}
