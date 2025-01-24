
import java.util.Scanner;

public class largest_number{
    public static void main(String[] args) {
        //largest number
        //Q. Find the largest number between three numbers?
        Scanner i = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int a = i.nextInt();
        int b = i.nextInt();
        int c = i.nextInt();
        
        /* 
        //first method
        int max = a;
        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }*/

        /* 
        //second method
        int max = 0;
        if (a > b) {
        max = a;
        }else { 
        max = b;
        }
        if (c > max ) {
        max = c;
        }*/

        //third method
        int max = Math.max(c ,Math.max(a, b));
       

        System.out.println(max);
        

    }
    
}
