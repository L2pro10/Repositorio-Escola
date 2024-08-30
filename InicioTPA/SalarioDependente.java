import java.util.Scanner;

public class SalarioDependente {
   public static void main (String args[]) {
	   Scanner ler=new Scanner(System.in);
	   int salario, dependentes, aux, novoSalario;
	   System.out.println("digite o seu salario");
	   salario=ler.nextInt();
	   System.out.println("Digite o numero de dependentes");
	   dependentes=ler.nextInt();
	   novoSalario=salario + dependentes * 55;
	   System.out.println("Seu salario novo é " + novoSalario);
   }
}