
import java.util.Arrays;

//pivot: choose any element from the array
//after first pass all the elements 
//pivot will be on RHS of pivot & elements > pivot will be at RHS of pivot
public class Quick_sort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        
    }
    static void sort(int[] nums,int low,int high){

        if(low >= high){
            return ;
        }
        int a = low;
        int b = high;
        int m = a + (b - a) / 2;
        int pivot = nums[m];

        while(a <= b) {
            while (nums[a] < pivot){
                a++;
            }
            while (nums[b] > pivot) {
                b--;
            }
            if (a <= b){
                int temp = nums[a];
                nums[a] = nums[b];
                nums[b] = temp;
                a++;
                b--;
            }
        }

        //now as the pivot is at correct pivot
        sort(nums,low,b);
        sort(nums,a,high);

    }
    
}
