import java.util.*;

public class loop {

    public static void multiTable(int number){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter positive number : ");
        int num = sc.nextInt();

        for(int a=1; a<=10; a++){
           int table = num*a;
           System.out.println(num + " * "+ a + " = " + table);
        }
    }
    public static void main(String args[]){

        multiTable(8);
       // Scanner sc = new Scanner(System.in);

        // Start Practice

        // 3. Write a program to print the multiplication table of number N, entered by user
       


        // 2. Write a program to find the factorial of any number entered by the user
      
      /*   int num;
        int fact=1;
        System.out.print("Enter any positive Integer : ");
        num = sc.nextInt();

        for(int i=1; i <=num; i++){
            fact = fact * i;
        }
       System.out.println("factories of "+ num + " is : " + fact);
*/
        
        //1. Write a program that reads a set of integers,and then prints the sum of the even and odd integers.

      /*   int num;
        int choose;
        int evenNum = 0;
        int oddNum = 0;

        do{
            System.out.print("Enter Number : ");
            num = sc.nextInt();

            if(num % 2 == 0){
                evenNum += num;
            }else{
                oddNum += num;
            }

            System.out.print("Do you want to contiune ? Press 1 or Not than press 0 : ");
            choose = sc.nextInt();
        }while(choose == 1);

        System.out.println("Sum of Even Number : "+ evenNum);
        System.out.println("Sum of Odd Number : "+ oddNum); */

        //End practice

        // 6. Check if a number is prime or not 
     /*    Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num == 2){
            System.out.print("This is prime number");
        }else{
            //   num-1
            boolean isPrime = true;
            for(int i=2; i<=Math.sqrt(num); i++){
                if(num % i == 0){
                    isPrime = false;
                }
            }
    
            if(isPrime == true){
                System.out.print("This is a prime number "+ num);
            }else{
                System.out.print("This not a prime number "+ num);
            }
        }
        */

        // 5. break statement
       /*  for(int i=1; i<=10;  i++){
            if(i == 3){
                break;
               // continue;
            }
            System.out.println(i);
        }
        System.out.println("found the value that we are needed");
*/

      /* int num = 8;
        do{
            System.out.println("do while loop run atlest one");
            num++;
        }while(num <= 10); */

        // 4. Revers the given number
     /*  int num = 54321;
        int revers = 0;
        while(num > 0){
            int lastgidit = num % 10;
            revers = (revers * 10) + lastgidit;
            num /=10;
        }
        System.out.print(revers); */

        // 3. Print Revers of a number
     /* int num = 12345;

        while(num > 0){
            int lastdigit = num % 10;
            num /=10;
            System.out.print(lastdigit + " ");
        } */ 

        // 2. Print square of star
      /*   int a = 5;
        int b = 6;
        for(int i=1; i<=a; i++){
            for(int j=1; j<=b; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        } */ 
    
        // 1. Sum of natural numbers
    /*     int num = 5;
        int sum = 0;
        int i = 0;
        while(i <= num){
            sum += i;
            i++;
        }
        System.out.println(sum);
        */

        // print table 
        /* int count = 1;
           int num = 10;
            int table = 3;
            while(count <= num){
                System.out.print(count * table + " ");
                count++;
            } */

        

    }
}
