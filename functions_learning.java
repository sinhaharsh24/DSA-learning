import java.util.Scanner;
/* function syntax
return_type name() {
  body
  return statement;
 */

public class functions_learning {
    public static void main(String[] args) {
        //Q function for sum of two numbers

        sum();
        int add = sum3(23,34);
        System.out.println(add);

        String name = "harsh sinha";
        changename(name);   // here we have given the value of name string
        System.out.println(name);
        // system.out.println(naam);
        // this can't be accessed as it is outside the function this is called scoping
        

    }

    private static void changename(String naam) {
        naam = "mayank";
        // this will be useless as naam is object of name and it will take the value from it
    }

    static int sum3(int p, int q) {
        int sum = p + q;
        return sum;
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
