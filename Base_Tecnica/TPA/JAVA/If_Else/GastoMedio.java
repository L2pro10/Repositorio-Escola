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
		System.out.println("o gasto m�dio do seu carro � "+gmc+" logo seu carro � econ�mico");
	}
	else {
		System.out.println("o gasto m�dio do seu carro � "+gmc+" logo seu carro n�o � econ�mico");
	}
}
}
