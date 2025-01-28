import java.util.Arrays;

public class var_args {
    public static void main(String[] args) {
        something(2,34,56,78,43,2,34,456,67);

    }

    static void something(int ...v) {     //int ...v is used when we don't know how many number of arguments are actually present
        System.out.println(Arrays.toString(v));
        System.out.println(v.length);
    }
}
