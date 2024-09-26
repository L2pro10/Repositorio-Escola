import java.util.Scanner;
public class Imposto {
public static void main(String[] args) {
	Scanner ler=new Scanner (System.in);
	double sal, irpf, novoSalario;
	System.out.println("digite seu salario");
	sal = ler.nextDouble();
	if (sal>3582) {
		irpf = sal*27.5/100;
		novoSalario = sal-irpf;
		System.out.println("seu salario ficou " +novoSalario+"R$");
	}else if (sal>=2866.70) {
		irpf = sal*22.5/100;
		novoSalario = sal-irpf;
		System.out.println("seu salario ficou " +novoSalario+"R$");
	}else if (sal>=2150) {
		irpf = sal*15/100;
		novoSalario = sal-irpf;
		System.out.println("seu salario ficou " +novoSalario+"R$");
	}else if (sal>=1434.60) {
		irpf = sal*7.5/100;
		novoSalario = sal-irpf;
		System.out.println("seu salario ficou "+novoSalario+"R$");
	}else {
		System.out.println("seu salario nao sofrera alteracao");
	}
}
}
