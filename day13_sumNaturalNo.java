import java.util.*;

public class day13_sumNaturalNo{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        if (num == 0 || num < 0){
            System.out.println(0);
        }
        if(num >0){
            int sum=0;
            for(int i=1; i<= num ; i++){
                sum = sum + num ;
              }
             System.out.println(sum);


        }
    }
    //sum of natural numbers?

}