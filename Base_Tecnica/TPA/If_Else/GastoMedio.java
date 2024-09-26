import java.util.Scanner;
public class GastoMedio {
   public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	double dp,ctc,gmc;
	System.out.println("Escreva em km a distancia percorrida:");
	dp = ler.nextDouble();
	System.out.println("Escreva a capacidade do tanque de combustivel:");
	ctc = ler.nextDouble();
	gmc=dp/ctc;
	if (gmc>=10) {
		System.out.println("o gasto médio do seu carro é "+gmc+" logo seu carro é econômico");
	}
	else {
		System.out.println("o gasto médio do seu carro é "+gmc+" logo seu carro não é econômico");
	}
}
}
