import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int number = scanner.nextInt();

        if (isFibonacci(number)) {
            System.out.println(number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(number + " não pertence à sequência de Fibonacci.");
        }
        scanner.close();
    }
    public static boolean isFibonacci(int n) {
        int a = 0, b = 1;
        int fibonacci = a + b;
        while (fibonacci <= n) {
            if (fibonacci == n) {
                return true;
            }
            a = b;
            b = fibonacci;
            fibonacci = a + b;
        }
        return false;
    }
}
