import java.util.Scanner;
public class Idade {
public static void main(String[] args) {
	int  an,aa,idade;
	Scanner ler = new Scanner (System.in);
	System.out.println("escreva a sua data de nascimento");
	an = ler.nextInt();
	System.out.println("escrva o ano atual");
	aa = ler.nextInt();
	idade = aa-an;
    if (idade<10) {
		System.out.println("você é uma criança de "+idade+" anos");
    }
    else if (idade<=18){
    	System.out.println("você é um adolescente de "+idade+" anos");
    }
    else if (idade<60) {
    	System.out.println("você é um adulto de "+idade+" anos");
    }
    else {
    	System.out.println("você é um idoso de "+idade+" anos");}}}
    

    