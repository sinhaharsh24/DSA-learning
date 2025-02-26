public class productofdigitsofnumber {
    public static void main(String[] args) {
        int answer = product(1342);
        System.out.println(answer);
    }
    static int product(int n){
        if(n%10 == n) return n;
        int ans = digit(n) * product(n / 10);
        return ans;
        
    }
    static int digit(int n){
        int atdigit = n % 10;
        return atdigit;
    }
    
}
