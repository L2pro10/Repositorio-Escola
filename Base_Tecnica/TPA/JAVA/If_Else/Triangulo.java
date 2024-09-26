import java.util.Scanner;
public class Triangulo {
public static void main(String[] args) {
	Scanner ler=new Scanner(System.in);
	double valA, valB, valC;
	System.out.println("escreva a medida A do triangulo");
	valA = ler.nextDouble();
	System.out.println("escreva a medida B do triangulo");
	valB = ler.nextDouble();
	System.out.println("escreva a medida C do triangulo");
	valC = ler.nextDouble();
	if(valA==valC && valC==valB){
		System.out.println("e um triangulo equilatero");
	}else if(valA!=valB && valB!=valC && valA!=valC){
		System.out.println("e um triangulo escaleno");
	}else {
		System.out.println("e um triangulo isósceles");
	}
	}
}
