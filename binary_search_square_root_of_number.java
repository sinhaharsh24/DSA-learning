public class binary_search_square_root_of_number {
    public static void main(String[] args) {
        int x = 49;
        int answer = squareroot(x);
        System.out.println(answer);
    }

    static int squareroot(int x){
        if (x < 2) {
            return x;
        }
        int start = 1;
        int end = x; 
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid <= x / mid) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
    
}
