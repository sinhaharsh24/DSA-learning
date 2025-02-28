import java.util.ArrayList;

public class usearraylisttostoretargetindex {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,4,5};
        System.out.println(find(arr, 4, 0));
        System.out.println(findtarget(arr, 4, 0));
        System.out.println(findtargetlast(arr, 4, arr.length-1));
        findAllIndex(arr, 4,0);
        System.out.println(list);
        
    }
    static boolean find(int[] arr, int target, int index){
        if (index == arr.length) {
            return false;
            
        }
        return arr[index] == target || find(arr, target, index + 1);
    }
    static int findtarget(int[] arr, int target, int index) {
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }else {
            return findtarget(arr, target, index + 1);
        }
    }

    static int findtargetlast(int[] arr, int target, int index) {
        if (index == -1){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }else {
            return findtargetlast(arr, target, index - 1);
        }
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index) {
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }

    static ArrayList findAllIndexes(int[] arr, int target, int index , ArrayList<Integer> list) {
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    } 
        
        
    
    
}
