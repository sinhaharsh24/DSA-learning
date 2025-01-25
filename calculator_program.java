
import java.util.Scanner;

public class calculator_program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = 0;


        while (true) {
            System.out.print("Enter the operator: ");
            char op = in.next().trim().charAt(0);


            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter first number: ");
                int a = in.nextInt();
                System.out.print("Enter the second number: ");
                int b = in.nextInt();

                if (op == '+') {
                    result = a + b;
                }
                if (op == '-') {
                    result = a - b;
                }
                if (op == '*') {
                    result = a * b;
                }
                if (op == '/') {
                    if (b != 0) {
                        result = a / b;
                    }
                }
                if (op == '%') {
                    result = a % b;
                }
            } else if ( op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("invalid operation");
            }
            System.out.println(result);


        }
    }
    
}
