import java.util.*;
public class functionMethod{

    public static int calSum(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : " ); int num1 = sc.nextInt();
        System.out.print("Enter First Number : "); int num2 = sc.nextInt();
       
        int sum = calSum(num1, num2); 
        System.out.print("Sum of total : " + sum);

    }
}