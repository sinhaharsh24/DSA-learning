import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class array_list {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList<>(10);//syntax for ArrayList

//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        list.add(8);
//        list.add(9);
//        list.add(10);
//        list.add(11);
//        list.add(12);
//        list.add(13);
//
//        System.out.println(list.contains(5)); // .contains() is used to check wheater the list contains the value
//
//        System.out.println(list);
//        list.set(1, 7);  //use to change any element from the list
//        System.out.println(list);
//        list.remove(2); // use to remove a index from the list
//        System.out.println(list);

//        for (int i = 0; i < 5 ; i++) {
//            list.add(in.nextInt());
//
//        }
//        for (int i = 0; i < 5 ; i++) {
//            System.out.print(list.get(i) + " ");  // list[index] will not work here to print the index
//        }
//
//        System.out.println(list.get(3));
//        int a = list.get(3);
//        System.out.println(a);

//
        // Q1 swap values in array
        // Q2 max value from the array
        // Q3 reverse the elements from the array
        int[] arr = {2, 3, 4, 5, 6, 7};
        reverse(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println(max(arr));

    }
    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start < end) {
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static int max(int[] arr) {
        int max = arr[0];   //take the variable max which is intially the value of first element of the array
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) { //checking one by one that if the value of max is smaller than index used
                max = arr[i];
            }
        }
        return max;
    }
}
