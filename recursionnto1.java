public class recursionnto1 {
    public static void main(String[] args) {
        fun(1); //for 12345
        //for 54321 it will be fun(5)
        funboth(5);
        
    }
    static void fun(int n){
        if(n == 6) { //for 54321 it will be 0 insted of six
            return;
        }
        System.out.println(n);
        fun(n+1); //for 54321 it will be fun(n-1)
        //this is recursion call here we call the function regullarly
    }    
    static void funboth(int n){
        if(n == 0) {
            return;
        }
        System.out.println(n);
        funboth(n-1);
        System.out.println(n);
    }
}
