import java.util.Scanner;
public class IMC {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	double peso,altura, imc;
	System.out.println("escreva seu peso");
	peso = ler.nextDouble();
	System.out.println("escreva sua altura");
	altura = ler.nextDouble();
	imc = peso/(altura*altura);
	if (imc<=18.5) {
		System.out.println("excesso de magreza");
	}else if (imc<=25) {
		System.out.println("peso normal");
	}else if (imc<=30) {
		System.out.println("acima do peso");
	}else if (imc<=35) {
		System.out.println("obesidade grau 1");
	}else if (imc<=40) {
		System.out.println("obesidade grau 2");
	}else {
		System.out.println("obesidade grau 3");
	}
}
}

