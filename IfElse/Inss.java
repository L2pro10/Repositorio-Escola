import java.util.Scanner;
public class Inss {
public static void main(String[] args) {
	Scanner ler=new Scanner(System.in);
	double inss, sal;
	System.out.println("digite seu salario");
	sal=ler.nextDouble();
	if(sal>7786.02) {
		inss=sal*16/100;
		System.out.println("o seu inss sera "+inss);
	}else if(sal>4000.03) {
		inss=sal*14/100;
		System.out.println("o seu inss sera "+inss);
	}else if(sal>2666.68) {
		inss=sal*12/100;
		System.out.println("o seu inss sera "+inss);
	}else if(sal>1412) {
		inss=sal*9/100;
		System.out.println("o seu inss sera "+inss);
	}else {
		inss=sal*7.5/100;
		System.out.println("o seu inss sera "+inss);
	}
}
}
