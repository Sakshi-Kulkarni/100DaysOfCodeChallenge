import java.util.*;

public class day4PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("positive number");
        } else if (num == 0) {
            System.out.println("Neither positive nor negative");
        } else {
            System.out.println("Negative number");
        }
    }
}
