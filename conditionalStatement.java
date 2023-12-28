import java.util.*;

public class conditionalStatement {
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);

      // Start Practice 

    /* int year = 2023;
      boolean a = (year % 4) == 0;
      boolean b = (year % 100) != 0;
      boolean c = ((year % 100) == 0 && (year % 400 == 0));
      String leafYear = " ";
      if(a && (b || c)){
        leafYear = "This is leaf year " + year;
      }else{
        leafYear = "This is not leaf year " + year;
      }
      System.out.println(leafYear);
      
      */ 






















      // Leaf Year
    /*  int year = sc.nextInt();

      boolean x = (year % 4) == 0;
      boolean y = (year % 100) != 0;
      boolean z = ((year % 100 == 0 ) && (year % 400 == 0));

      if(x && (y || z)){
        System.out.println(year + " is leaf year");
      }else{
        System.out.println(year + " is not a leaf year");
      }
*/

    /*   System.out.println("Enter Intger Value");
      int val = sc.nextInt();
      String resultValue = " ";
      if(val > 0){
        resultValue = "This Value is Positive "+ val;
      }else{
        resultValue = "This Value is Negative "+ val;
      }
      System.out.println(resultValue); */

      // End Practice 

      // 8. Make Calculator
   /*    System.out.println("Enter First number : ");
      int num1 = sc.nextInt();
      System.out.println("Enter Operator like -,+,*,/,% ");
      char operator = sc.next().charAt(0);
      System.out.println("Enter Second number : ");
      int num2 = sc.nextInt();

      int result = 0;
     
       switch(operator){
        case '+' : result = num1 + num2; break;
        case '-' : result = num1 - num2; break;
        case '*' : result = num1 * num2; break;
        case '/' : result = num1 / num2; break;
        case '%' : result = num1 % num2; break;
        default : result = 0;
       }

       System.out.println("Calculated value is :" + result); */



       // 7. Use Switch Case 
      /*  int number = 1;
       String food = "";
       switch(number){
        case 1 : food = "Pizza hat"; break;
        case 2 : food = "KFC"; break;
        case 3 : food = "McDon"; break;
        case 4 : food = "Domenos"; break;
        default : food = "Have no money!"; 
       }
       System.out.print(food); */

       // 6. Use tarnery Operator || show pass : fail
        /*int marks = 78;
        String reportcard = marks >= 33 ? "Pass" : "fail";
        String card = "Student Report Card : " + reportcard;
        System.out.println(card); */

       // 5. find largest of 4 number
    /* int a=122,b=5,c=8,d=18;
       if((a >= b) && (a >= c) && (a >= d)){
        System.out.println("A is the largest.");
       }else if((b >= c) && (b >= d)){
        System.out.println("B is the largest");
       }else if (c >= d){
        System.out.println("C is the largest");
       }else{
        System.out.println("D is the largest");
       }
       */

       // 4. calculate income tax
     /* int income = 1400000;
       int tax;
       if(income <= 500000){
            tax = 0;
       }else if(income >=500000 && income <= 1000000){
            tax = (int) (income*0.2);
       }else{
            tax = (int) (income * 0.3);
       }
       System.out.println("Total tax on a income " + tax);
       */

       // 3.  if elseif else
      /* int age = 15;
       if(age >= 18){
        System.out.println("You are an audlt man");
       }else if(age >= 13 && age <=18 ){
        System.out.println("You are a teenage boy");
       }else{
        System.out.println("You are childern");
       }*/

        // 2. find odd and Even Number
      /*   int number = sc.nextInt();
        if(number % 2 == 0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        } */

       // 1. find largest number
      /*   int a = 16, b = 8;
        if(a > b){
            System.out.println("A is largest number : " + a);
        }else{
            System.out.println("B is largest number : "+ b);
        } */

    }
}
