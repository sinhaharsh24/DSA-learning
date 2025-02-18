public class fibonacchi_using_recursion {
    public static void main(String[] args) {
        System.out.println(number(6));
    }
    static int number(int n) {
        if(n < 2) return n;
        return number(n-1) + number(n-2);
        //not a tail recursion
    }
    
}
