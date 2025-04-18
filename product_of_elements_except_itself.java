import java.util.Arrays;

public class product_of_elements_except_itself {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(findresult(arr)));
    }

    static int[] findresult(int[] arr){
        int[] result = new int[arr.length];
        Arrays.fill(result,1);

        int pre = 1, post = 1;

        for (int i = 0; i < arr.length; i++) {
            result[i] = pre;
            pre = arr[i] * pre;
        }

        for (int i = arr.length - 1; i >= 0 ; i--) {
            result[i] = result[i]*post;
            post = post*arr[i];
            
        } 
        return result;
    }
}
