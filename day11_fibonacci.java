import java.util.*;

public class day11_fibonacci {

    static void fibonacci(int n) {
        int a = 0;
        int b = 1;

        System.out.println(0 + " " + 1);

        for (int i = 2; i < n; i++) {
            int sum = a + b;
            System.out.println("" + sum);
            a = b;
            b = sum;
        }
           /*Recursive call
           return fib(n - 1) + fib(n - 2);*/
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci(n);
    }
}