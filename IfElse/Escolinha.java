import java.util.Scanner;
public class Escolinha {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int idade,dataNasc;
		System.out.println("digite seu ano de nascimento");
		dataNasc=ler.nextInt();
		idade=2024-dataNasc;
		if(idade>18) {
			System.out.println("voce nao pode jogar");
		}else if(idade>18) {
			System.out.println("voce jogara no juvenil 2");
	}else if(idade>16) {
		System.out.println("voce jogara no juvenil 2");
}else if(idade>14) {
	System.out.println("voce jogara no juvenil 1");
}else if(idade>10) {
	System.out.println("voce jogara no infantil 2");
}else if(idade>6) {
	System.out.println("voce jogara no infantil 1");
}else {
	System.out.println("voce jogara no dente de leite");
}
	}
}
