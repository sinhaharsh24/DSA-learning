import java.util.Scanner;

public class linear_searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to search: ");
        int target = sc.nextInt();

        int[] nums = {23,42,43,434,3345,63434,74,28,922,110};
        int ans = linearsearch(nums,target);
        System.out.println("the target is at" + ans);

//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == target) {
//                System.out.println("yes the number is at index " + i);
//            }
//        }



    }
        static int linearsearch(int[] arr ,int target) {
        if(arr.length == 0) return -1;

        //run the loop
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) return i;

        }
        return -1;


        }
}
