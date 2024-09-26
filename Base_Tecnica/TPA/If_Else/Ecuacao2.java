import java.util.Scanner;
import java.lang.Math;
public class Ecuacao2 {
public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
     double valA, valB, valC, delta, bhask1, raiz1, raiz2;
     System.out.println("digite o valor A");
	valA = ler.nextInt();
    System.out.println("digite o valor B");
	valB = ler.nextInt();
    System.out.println("digite o valor C");
	valC = ler.nextInt();
	delta = (valB*valB)-4*valA*valC;
	if(delta<0) {
    System.out.println("nao existe raizes");
	}else if(delta==0) {
		raiz1=-valB+Math.sqrt(delta)/(2*valA);
	}else {
		raiz1 = (-valB+Math.sqrt(delta))/(2*valA);
		raiz2 = (-valB-Math.sqrt(delta))/(2*valA);
		System.out.println("existe duas raizes reais para esse execicio, sendo essa "+raiz1+" positiva, ja essa "+raiz2+" negativa");
	}
}
}
