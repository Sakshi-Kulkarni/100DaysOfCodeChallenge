import java.util.*;

public class day9_NumberOfDigits {
    static int countDigit(int num)
    {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            ++count;
        }
        return count;
        /* 2nd logic
        
        // converting number to string using
        // to_string in C++
        String num = Integer.toString(n);
 
        // calculate the size of string
 
        System.out.println(+num.length()); */
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println(countDigit(num));
    }
}
