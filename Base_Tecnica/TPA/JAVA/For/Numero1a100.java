package exercicios;

public class Numero1a100{
    public static void main(String[] args) {
        for (int numero = 1; numero <= 100; numero++) {
            System.out.println(numero);
            if (numero % 10 == 0) {
                System.out.println("Múltiplo de 10");
            }
        }
    }
}
