public class reverseanumberusingrecursion {
    public static void main(String[] args) {
        int answer = reverse(12345); //return should be 54321
        System.out.println(answer);

    }
    static int reverse(int n){
        if(n%10 == n) return n;
        int digit = (n % 10) * (int) Math.pow(10, (int) Math.log10(n)) + reverse(n / 10);
        return digit;
    }
    
}
