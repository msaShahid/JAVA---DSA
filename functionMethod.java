import java.util.*;
public class functionMethod{

    //1.  function
    public static void calSum(int a, int b){
        int sum = a + b;
        System.out.print("Sum of total : " + sum);
       // return sum;
    }
    // 2. swap function
    public static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Before swaping numbers num1 is 50 and num2 is 75");
        System.out.println("After swaping numbers num1 is "+ num1 + " and num2 is "+ num2);
    }
    // 3. Find the product of x and y
    public static int multiply(int x , int y) {
        int product = x * y;
        return product;
    }
    // 4. find the factorial of N number
    public static int factorial(int n){
        int f=1;
        for(int i=1; i<=n; i++){
            f = f * i;
        }
        return f;
    }

    // 5. Bionmial Coefficient
    public static int bioCoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int bioCoeff = fact_n / (fact_r * fact_nmr);
        return bioCoeff ;
    }

    // 6. Method Overloading: Overloading with different parameters and changing data type of arguments
    public static int sum(int a, int b){return a + b;};
    public static int sum(int a, int b, int c){ return a + b + c;};
    public static float sum(float a, float b){ return a + b;};

    public static void main(String args[]){
       // Scanner sc = new Scanner(System.in);
       // System.out.print("Enter First Number : " ); int num1 = sc.nextInt();
        /* System.out.print("Enter First Number : " ); int num1 = sc.nextInt();
        System.out.print("Enter First Number : "); int num2 = sc.nextInt();
        calSum(num1, num2); */

        //2.  swap - values || call by value
     /* 
        int a=5;
        int b=8;

        int temp = a;
        a = b;
        b = temp;
        System.out.println("Value is now change, original val of a is 5, Now A :" + a);
        System.out.println("Value is now change, original val of b is 8, Now A :" + b);
    */

        //Swap Number || call by reference
      /* int a = 50;
        int b = 75;
        swap(a, b);
        */

        // 3. multiply of two numbers || call method with return type
       /*  int product =  multiply(120, 9);
       System.out.println("the product of two number is : " + product); */

       // 4. find the factorial of number n
      /* int factValue = factorial(num1);
       System.out.println("Value of factorial of a number :  "+ num1 + " is " + factValue);
       */
    
       // 5. Bionmial Coefficient
       // System.out.println(bioCoeff(7,2));
    
       // 6. Function overloading
        System.out.println(sum(23,7));
        System.out.println(sum(17,3));
        System.out.println(sum(1.5f,3.5f));

       
       

    }
}