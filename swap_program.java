import java.util.Scanner;

public class swap_program {
    public static void main(String[] args) {
        //swap two numbers
        int a, b, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        a = sc.nextInt();
        System.out.println("Enter the second number");
        b = sc.nextInt();
        temp = a;
        a = b;
        b = temp;
        System.out.println("The first number is " + a + " and the second number is " + b);
    }
}
