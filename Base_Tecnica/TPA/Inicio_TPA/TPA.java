import java.util.Scanner;

public class TPA {
   public static void main (String args[]) {
	   Scanner ler=new Scanner(System.in);
	   int anoNascimento,anoAtual,idade;
	   System.out.println("Digite seu ano de nascimento");
	   anoNascimento=ler.nextInt();
	   System.out.println("Digite o ano atual");
	   anoAtual=ler.nextInt();
	   idade=anoAtual - anoNascimento;
	   System.out.println("A idade do usu�rio � " + idade);
   }
}