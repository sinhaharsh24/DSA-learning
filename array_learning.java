import java.util.Arrays;
import java.util.Scanner;

public class array_learning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //syntax
        // data_type[] var_name {compile time}{in stack memory} = new datatype[size]; {run time} {in heap memory}
        int[] rolno = new int[5];
        // or by using directly
        int[] rol2 = { 23, 34 ,56}; // all attributes of the array should be of same datatype

        int[] ros ; // declaration of the array is here
        ros = new int[5]; // new memory is created for the array in the heap
        System.out.println(ros[1]); // print out 0 value as all values are [0,0,0,0,0]

        String[] array = new String[5];
        System.out.println(array[1]); // print output will be null [a literal]

        int[] arr = new int[5]; // in this we can't value of like 100 values one by one
        arr[0] = 12;
        arr[1] = 23;
        arr[2] = 34;
        arr[3] = 56;
        arr[4] = 23;
        System.out.println(arr[4]);
        System.out.println(Arrays.toString(arr)); // toString() method is used to print the array in string format it prints with [] and all

        //for loop is used to determine large value of data in the array
        for ( int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }

        for (int num : arr){  // enhanced for loop known as for each loop
            System.out.print(num); // in this num represent the values of element of array
        }

        String[] str = new String[5];
        for (int i = 0; i < str.length; i++){
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));

        // strings are unmutable in java whereas array are mutable in java
        int[] numbers = new int[5];
        System.out.println(Arrays.toString(numbers));
        change(numbers); // here we call the change function which contain some values to alter the array which initially was zero
        System.out.println(Arrays.toString(numbers));
    }

    static void change(int[] ar) {
        ar[1] = 12;

    }
}
