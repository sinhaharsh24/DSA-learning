public class sum_of_digits_using_recursion {
    public static void main(String[] args) {
        //sum(5) = 5+4+3+2+1;
        int answer = sum(5);
        System.out.println(answer);
        
    }
    static int sum(int n){
        if(n <= 1) {
            return  1;
        }
        int ans = n + sum(n-1);
        
        //return n + sum(n-1);
        return ans;

    }
    
}
