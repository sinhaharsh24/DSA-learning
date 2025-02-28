public class arrayattargetrecursion {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,5};
        System.out.println(find(arr, 4, 0));
        System.out.println(findtarget(arr, 4, 0));
        System.out.println(findtargetlast(arr, 4, arr.length-1));
        
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
        
        
    

    
}