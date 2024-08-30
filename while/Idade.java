package exercicios;
import java.util.Scanner;
public class Idade {
public static void main(String[] args) {
	Scanner ler=new Scanner(System.in);
	int idade, ano, i=1, anoNasc;
	while (i<=6) {
	System.out.println("digite seu ano de nascimento");
	anoNasc = ler.nextInt();
	System.out.println("digite ano atual");
	ano = ler.nextInt();
	idade=ano-anoNasc;
	if (idade<18) {
		System.out.println("voce e menor de idade");
	}else {
		System.out.println("voce e maior de idade");
	}
	i=i+1;
	
	}
}
}
