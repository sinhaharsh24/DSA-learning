//the number is lucky when it's index is same as the number itself
public class array_lucky_number {
    public static void main(String[] args) {
        int[] arr = {12,24,2,34,56,78};
        System.out.println(luckyNumber(arr));

    }

    static int luckyNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i) {
                return i; // return the index of the lucky number
            }
        }
        return -1;
    }
}
