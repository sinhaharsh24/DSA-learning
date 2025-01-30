public class linearsearchinrange {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int target = 9;
        int start = 4;
        int end = array.length - 1;
        System.out.println(searchinrange(array, target, start, end));

    }

    static boolean searchinrange(int[] arr, int target, int start, int end) {
        if(arr.length == 0){
            return false;
        }

        for( int i = start; i <= end; i++) {
            if(arr[i] == target) {
                return true;
            }

        }
        return false;
    }
}
