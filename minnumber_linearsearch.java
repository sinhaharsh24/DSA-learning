public class minnumber_linearsearch {
    public static void main(String[] args) {
        int[] array = {1212,243,5,78,6,2232,342345};
        System.out.println(min(array));
    }
    static int min(int[] array) {
        int minimum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimum){
                minimum = array[i];
            }
        }
        return minimum;

    }
}
