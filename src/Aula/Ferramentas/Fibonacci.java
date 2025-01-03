package Aula.Ferramentas;

// os primeiros n numeros de fibonacci

public class Fibonacci {
    public static void main(String[] args) {
        int n = 32; // You can change the value of 'n' to generate a different number of Fibonacci numbers.

        System.out.println("Fibonacci Sequence up to " + n + " terms:");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int num) {
        if (num <= 1) {
            return num;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }
}