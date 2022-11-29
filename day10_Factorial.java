import java.util.*;
public class day10_Factorial{
    static int factorial(int n){
        int fact=1;
        if (n==0) {
 return 1 ;
       }
        
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
System.out.println(factorial(n));
    }
}