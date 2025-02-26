public class sumofdigitsofanumber {
    public static void main(String[] args) {
        int answer = add(1342);
        System.out.println(answer);
    }
    static int add(int n){
        if(n == 0) return 0;
        int ans = add(n / 10) + digit(n);
        return ans;
        
    }
    static int digit(int n){
        int atdigit = n % 10;
        return atdigit;
    }
    
}
