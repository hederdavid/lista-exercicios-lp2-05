package questao02;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0, numeroDivido = 0, divisor = 2;
        ArrayDeque<Integer> filaDivisores = new ArrayDeque<>();
        System.out.print("Digite um número: ");
        numero = scanner.nextInt();
        numeroDivido = numero;

        while (numeroDivido != 1) {
            if (numeroDivido % divisor == 0) {
                filaDivisores.add(divisor);
                numeroDivido = numeroDivido / divisor;
            } else {
                divisor++;
            }
        }

        System.out.println(numero + " Seus divisores: " + filaDivisores);
    }
}