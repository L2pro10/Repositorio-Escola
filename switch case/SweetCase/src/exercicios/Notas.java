package exercicios;
import java.util.Scanner;
public class Notas {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    int mb, b, r, i, alunos, nota, porc;
    System.out.println("digite a quantidade de alunos na sala");
    alunos = in.nextInt();
    System.out.println("digite a quantidade de mb na sala");
    mb = in.nextInt();
    System.out.println("digite a quantidade de b na sala");
    b = in.nextInt();
    System.out.println("digite a quantidade de r na sala");
    r = in.nextInt();
    System.out.println("digite a quantidade de i na sala");
    i = in.nextInt();
    System.out.println("digite a nota que deseja verificar (mb=1 b=2 r=3 i=4)");
    nota = in.nextInt();
    switch(nota) {
    case 1:
    	porc= 100*mb/alunos;
    	System.out.println("a porcentagem dessas notas é "+porc);
    	break;
    case 2:
    	porc= 100*b/alunos;
    	System.out.println("a porcentagem dessas notas é "+porc);
    	break;
    case 3:
    	porc= 100*r/alunos;
    	System.out.println("a porcentagem dessas notas é "+porc);
    	break;
    case 4:
    	porc= 100*i/alunos;
    	System.out.println("a porcentagem dessas notas é "+porc);
        default:
        	System.out.println("nota inexistente");
    	}

}
}
