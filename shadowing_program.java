public class shadowing_program {
    // static data_type is used in this with int because we want to use it inside the whole function
    // if we don't put static in this then value of x can't be used in psvm
    static int x = 20; // this is the bigger orginal one and it is shadowed in the psvm by the local scope of the block

    public static void main(String[] args) {
        System.out.println(x);
        int x = 40; // it can be initialized inside this again as it is inside the block
        x = 30; // this will over shadow the original value of x as it is modified by the local variable
        System.out.println(x); // here the value of x

    }
}
