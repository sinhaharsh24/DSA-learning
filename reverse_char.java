
import java.util.Scanner;

public class reverse_char {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int temp = 0;

        while(n > 0) {
            int i = n % 10;
            n = n / 10;
            temp = temp * 10 + i;

        }
        System.out.print(temp);
    }
    
}
