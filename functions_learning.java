import java.util.Scanner;

public class functions_learning {
    public static void main(String[] args) {
        //Q function for sum of two numbers
        int i = 0;
        while (i < 10) {
            sum();
            i++;
        }

    }
    static void sum() {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter the first number: ");
        a = sc.nextInt();
        System.out.print("Enter the second number: ");
        b = sc.nextInt();
        c = a + b;
        System.out.println(c);
    }
}
