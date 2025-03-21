public class maximum_number_from_array {
    //finding the maximum number from the array
    public static void main(String[] args) {
        int[] arr = {3,2,5,7,6};
        System.out.println(max(arr));

    }
    static int max(int[] arr){
        int maximum = arr[0];
        int start = 0;
        int end = arr.length;
        for(int i = start; i < end; i++){
            if(maximum < arr[i]){
                maximum = arr[i];
            }
        }
        return maximum;
    }
    
}
