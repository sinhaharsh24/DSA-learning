public class reverseanumberusingrecursion {
    static int sum = 0;
    static void reverse(int n){
        if(n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse(n/10);
    }
    public static void main(String[] args) {
        reverse(12345);
        System.out.println(sum);

    }
    // static int reverse(int n){
    //     if(n%10 == n) return n;
    //     int digit = (n % 10) * (int) Math.pow(10, (int) Math.log10(n)) + reverse(n / 10);
    //     return digit;
    // }

    
    
}
