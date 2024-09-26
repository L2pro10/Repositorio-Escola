package exercícios;
import java.util.*;
public class idade {
public static void main(String[] args) {
  Scanner ler = new Scanner(System.in);
  int i=1, id, fx1=0, fx2=0, fx3=0, fx4=0, fx5=0, selecao, total=0;
	double  porc1, porc2, porc3, porc4, porc5;
  while (i<=15) {
		System.out.println("digite a idade da "+i+"° pessoa");
		id=ler.nextInt();
		i++;
		if(id>61) {
			fx5++;
		}
		else if(id>45) {
			fx4++;
		}
		else if(id>30) {
			fx3++;
		}
		else if(id>15) {
			fx2++;
		}
		else { 
			fx1++;
		}
	}
	total = fx1+fx2+fx3+fx4+fx5;
		porc1=100*fx1/total;
		porc2=100*fx2/total;
		porc3=100*fx3/total;
		porc4=100*fx4/total;
		porc5=100*fx5/total;
		System.out.println("digite o numero da faixa etária que você quer vizualizar");
		selecao=ler.nextInt();
		switch(selecao) { 
		case 1:
			System.out.println("a quantidade de pessoas na faixa 1 é "+fx1+" e a porcentagem é "+porc1);
		break;
		case 2:
			System.out.println("a quantidade de pessoas na faixa 1 é "+fx2+" e a porcentagem é "+porc2);
		break;
		case 3:
			System.out.println("a quantidade de pessoas na faixa 1 é "+fx3+" e a porcentagem é "+porc3);
		break;
		case 4:
			System.out.println("a quantidade de pessoas na faixa 1 é "+fx4+" e a porcentagem é "+porc4);	
		break;
		case 5: 
			System.out.println("a quantidade de pessoas na faixa 1 é "+fx5+" e a porcentagem é "+porc5);
		default:
			System.out.println("opção inexistente");
			break;
		}
}
}


