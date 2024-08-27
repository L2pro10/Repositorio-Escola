package exercicios;
import java.util.Scanner;
public class Futebol {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int idade;
			System.out.println("digite a idade do aluno");
			idade = in.nextInt();
			switch(idade) {
			case 6:
				System.out.println("categoria dente de leite");
				break;
			case 7:
				System.out.println("categoria junior");
				break;
			case 8:
				System.out.println("categoria junior max");
				break;
			case 9:
				System.out.println("categoria junior master");
				break;
			case 10:
				System.out.println("categoria master");
				break;
			default:
					System.out.println("nao se encaixa em nenhuma categoria");

		}

	}
	}


