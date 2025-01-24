
import java.util.Scanner;

public class temperature_program {
    public static void main(String[] args) {
        Scanner i = new Scanner (System.in);
        System.out.print("Enter the temp in C: ");
        float tempc = i.nextFloat();
        float tempf = (tempc * 9/5) + 32;
        System.out.println(tempf);





    }
    
}
