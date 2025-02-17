public class funtioncallrecursionexample {
    public static void main(String[] args) {
        //print message hello world 5 times using function call
        message();
        //print the numbers from 1 to 5 using function call
        print1(1);

    }
    public static void message() {
        System.out.println("Hello World");
        message1();
    }
    public static void message1() {
        System.out.println("Hello World");
        message2();
    }
    public static void message2() {
        System.out.println("Hello World");
        message3();
    }
    public static void message3() {
        System.out.println("Hello World");
        message4();
    }
    public static void message4() {
        System.out.println("Hello World");
    }
    static void print1(int n) {
        System.out.println(n);
        print2(2);
    }
    static void print2(int n) {
        System.out.println(n);
        print3(3);
    }
    static void print3(int n) {
        System.out.println(n);
        print4(4);
    }
    static void print4(int n) {
        System.out.println(n);
        print5(5);
    }
    static void print5(int n) {
        System.out.println(n);
    }


}
