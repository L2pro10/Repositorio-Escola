package exercicios;
import java.util.Scanner;
public class Zodiaco {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int d, m;
	System.out.println("digite o dia em que voce nasceu");
    d = in.nextInt();
    System.out.println("digite o mes em que voce nasceu");
    m = in.nextInt();
    switch(m) {
    case 1:
    	if(d<21) {
    		System.out.println("voce e de capricornio");
    	}else {
    		System.out.println("voce e de aquario");
    	}
        break;
    case 2:	
    	if(d<18) {
    		System.out.println("voce e de aquario");
    	}else {
    		System.out.println("voce e de peixes");
    	}
        break;
    case 3:	
    	if(d<20) {
    		System.out.println("voce e de peixes");
    	}else {
    		System.out.println("voce e de aries");
    	}
        break;
    case 4:	
    	if(d<20) {
    		System.out.println("voce e de aries");
    	}else {
    		System.out.println("voce e de touro");
    	}
        break;
    case 5:
    	if(d<20) {
    		System.out.println("voce e de touro");
    	}else {
    		System.out.println("voce e de gemeos");
    	}        
        break;
    case 6:	
    	if(d<20) {
    		System.out.println("voce e de gemeos");
    	}else {
    		System.out.println("voce e de cancer");
    	}
        break;
    case 7:	
    	if(d<22) {
    		System.out.println("voce e de cancer");
    	}else {
    		System.out.println("voce e de leao");
    	}
        break;
    case 8:	
    	if(d<22) {
    		System.out.println("voce e de leao");
    	}else {
    		System.out.println("voce e de virgem");
    	}
        break;
    case 9:	
    	if(d<22) {
    		System.out.println("voce e de virgem");
    	}else {
    		System.out.println("voce e de libra");
    	}
        break;
    case 10:	
    	if(d<22) {
    		System.out.println("voce e de libra");
    	}else {
    		System.out.println("voce e de escorpiao");
    	}
        break;
    case 11:	
    	if(d<21) {
    		System.out.println("voce e de escorpiao");
    	}else {
    		System.out.println("voce e de sargitario");
    	}
        break;
    case 12:	
    	if(d<21) {
    		System.out.println("voce e de sargitario");
    	}else {
    		System.out.println("voce e de capricornio");
    	}
        break;
    	default:
    		System.out.println("mes ou ida invalido");
    }
}
}
