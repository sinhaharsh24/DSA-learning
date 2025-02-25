public class factorialrecursion{
    public static void main(String[] args) {
        //5! =  5*4*3*2*1 = 120
        int answer = factorial(5);
        System.out.println(answer);
        
    }
    static int factorial(int n){
        if(n <= 1) {
            return  1;
        }
        int ans = n * factorial(n-1);
        
        //return n * factorial(n-1);
        return ans;

    }
    
}
