package exercicios;

import java.util.Scanner;

public class Idade{
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        int anoAtual, anoNascimento, idade;
        int idadeMaisVelho = Integer.MIN_VALUE;
        int idadeMaisNovo = Integer.MAX_VALUE;
        
        int[] idades = new int[10];
 
        System.out.print("Digite o ano atual: ");
        anoAtual = scanner.nextInt();
 
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o ano de nascimento do usuário " + (i + 1) + ": ");
            anoNascimento = scanner.nextInt();
            idade = anoAtual - anoNascimento;
 
            idades[i] = idade;
 
            if (idade > idadeMaisVelho) {
                idadeMaisVelho = idade;
            }
 
            if (idade < idadeMaisNovo) {
                idadeMaisNovo = idade;
            }
        }
 
        System.out.println("\nIdades dos usuários:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Usuário " + (i + 1) + ": " + idades[i] + " anos");
        }
 
        System.out.println("\nIdade do usuário mais velho: " + idadeMaisVelho + " anos");
        System.out.println("Idade do usuário mais novo: " + idadeMaisNovo + " anos");
 
        scanner.close();
    }
}
