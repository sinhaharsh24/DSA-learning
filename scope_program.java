public class scope_program {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        {
            // this in curly bracets are called block
            // value from this can't be accessed outside the block
            // int a = 10; // this can't be initialized again as is it already initialized outside the block
            a = 100; // value can be changed in this
            int c = 0; // initialized inside the block can be initialized outside the block
        }
        System.out.println(a); // here the value of a which is changed inside the block is used as it is changed
        int c = 100; // it can be reinitialized outside the block
        c = 2000; // changed outside the block can be print in the output
       // System.out.println(c); this will not be accessed as the value of this is in another block and it is not accessible
        System.out.println(c);

        // System.out.println(num); here the value of num is not accessible as it is not in the function
    }

    static void something() {
        // System.out.println(a);  here a can't be accessed as it is defined outside the function so it is called funtion scoping
        int num = 10;

    }
}
