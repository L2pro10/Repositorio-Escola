import java.util.Scanner;
public class Prova {
public static void main(String[] args) {
	Scanner ler=new Scanner (System.in);
    int n1, n2, m, novaProva, mediaFinal;
    System.out.println("digite a sua primeira nota");
    n1 = ler.nextInt();
    System.out.println("digite sua segunda nota");
    n2 = ler.nextInt();
    m = (n1 + n2)/2;
    if (m<3) {
    	System.out.println("voce esta reprovado");
    }else if (m>=6) {
    	System.out.println("voce esta apovado");

    }    else if(m<6){
    	System.out.println("voce fara uma prova de recuperacao");
    	System.out.println("digite a nota da sua prova de recuperacao");
    	novaProva = ler.nextInt();
    	mediaFinal = (novaProva + m)/2;
    	if (mediaFinal>=6) {
    		System.out.println("voce esta aprovado");
    	}else {
    		System.out.println("voce esta reprovado");
    	}
    }
}
}


