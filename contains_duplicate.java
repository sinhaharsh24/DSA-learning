import java.util.Arrays;
import java.util.HashMap;

public class contains_duplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(Arrays.toString(duplicatepresent(arr)));
    }

    // static boolean duplicatepresent(int[] arr){
    //     HashMap<Integer,Integer> map = new HashMap<>();
    //     for (int i = 0; i < arr.length; i++) {
    //         if(map.containsKey(arr[i])){
    //             return true;
    //         }
    //         map.put(arr[i],1);
            
    //     }
    //     return false;
    // }

    static int[] duplicatepresent(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                searchinthearray(arr,arr[i]);
                if(i == 0){
                    return null;
                }
                return new int[] {i,i};
                
            }
            map.put(arr[i],1);
            
        }
        return null;
    }

    static int searchinthearray(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return 0;
    }
}
