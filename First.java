
import java.util.Scanner;

public class First {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rollno = input.nextInt();
        System.out.println("your roll number is " + rollno);

         int var = 60; //premitive datatype
         String something = "something"; //not a premitive datatype
        
         //type casting
        int num = (int) (67.56f);
         System.out.println(num);

         //automatic type promotion in expressions
        int a = 257;
        byte b = (byte) (a);
        System.out.println(b);
        
         //if program
        int i = 20;
        if (i == 20) {
        System.out.println("something");
        }
        
         //while program
        while (i != 30) {
         System.out.println(i);
         i++;
        }

       // for loop
        for (i = 20;i != 40; i++) {
         System.out.println(i);
        }

        

    

     }

    



} 