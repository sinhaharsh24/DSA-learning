import java.util.Scanner;

public class linear_searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to search: ");
        int target = sc.nextInt();

        int[] arr = {23,42,43,434,3345,63434,74,28,922,110};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("yes the number is at index " + i);
            }
        }
    }
}
