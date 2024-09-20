package exercícios;
import java.util.*;
public class Fibonacci {
public static void main(String[] args) {
	Scanner ler=new Scanner (System.in);
	int fibo=2, nAnterior=0,nAtual=1, resultado, i;
	System.out.println("digite quantas vezes que voce deseja que o Fibonacci seja calculado:");
	i = ler.nextInt();
	while (fibo<=i) {
		resultado=nAnterior+nAtual;
		System.out.println(resultado);
		nAnterior=nAtual;
		nAtual=resultado;
		fibo++;
	}
}
}
