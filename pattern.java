import  java.util.*;

public class pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

       // int num = sc.nextInt();

        sc.close();

        // Solid Rectange
        int r=4,c=5;
        for(int a=1; a<=r; a++){
            for(int b=1; b<=c; b++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        } 

        // Hollow Rectange
      /*   int r=4,c=5;
        for(int a = 1; a <= r; a++){
            for(int b = 1; b <= c; b++){
                if(a == 1 || b == 1 || r == a || c == b){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }               
            }
            System.out.println(" ");
        } */

        // Half pri
       /*  int r=4,c=5;
        for(int a=1; a<=r; a++){
            for(int b=1; b<=a; b++){
                System.out.print("*");
            }
            System.out.println(" ");
        } */

        // Tabel
  
      /*   for(int a=1; a<=10; a++){
            for(int b=1; b<=10; b++){
                int result = a*b;
                System.out.print(result + "  ");
            }
            System.out.println(" ");
        }
        */



        






    }
}
