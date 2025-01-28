import java.util.Arrays;
import java.util.Scanner;

public class multidimension_array {
    public static void main(String[] args) {
        //int[][] arr = new int[3][3];
        //int[][] arr2 = new int[3][]; // number of columns should not be equal to the
        Scanner sc = new Scanner(System.in);

        int[][] arr4 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] arr3 = new int[3][3];
        //input in the multidim array
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                arr3[i][j] = sc.nextInt();

            }
        }
        // output in the multidim array
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
        // another way of printing the array using toString funtion
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(Arrays.toString(arr3[i]));
        }

        for (int[] ints : arr3) {   //enhanced for loop
            System.out.println(Arrays.toString(ints));
        }



    }
}
