import java.util.Scanner;
public class Cashback {
public static void main(String[] args) {
	Scanner ler=new Scanner(System.in);
	double cashback, preco;
	System.out.println("Digite o valor da compra abaixo:");
	preco=ler.nextDouble();
	if(preco>5000) {
		cashback=preco*15/100;
		System.out.println("o seu cashback sera "+cashback);
	}else if(preco>2000){
		cashback=preco*12.5/100;
		System.out.println("o seu cashback sera "+cashback);
	}	else if(preco>1000){
		cashback=preco*10/100;
		System.out.println("o seu cashback sera "+cashback);
	}else if(preco>100){
		cashback=preco*8/100;
		System.out.println("o seu cashback sera "+cashback);
	}else {
		cashback=preco*5/100;
		System.out.println("o seu cashback sera "+cashback);
	}
	}
}
