import java.util.ArrayList;

public class stringsmainlearning {
    public static void main(String[] args) {
//        int[] arr = {2, 3, 5, 4, 19};
//        int num = 10;
//        String a = "harsh sinha";
//        System.out.println(a);
//        a = "harsh"; //the value of a is changed and original first value gone to garbage collection
//        System.out.println(a);
//        String b = "harsh sinha";
//        System.out.println(b); //string is added to string pool
//        System.out.println(a == b);
//
//        //how to create diff object with same value
//        String c = new String("harsh");
//        String d = new String("harsh");
//        System.out.println(c == d);
//        //The new String("harsh") statement explicitly creates a new object in heap memory every time it is called.
//        //c and d are two different objects in memory.
//        //The == operator checks if both references point to the same memory location, which they do not.
//        //Therefore, c == d returns false.
//        //now they are in different string pool so they are different
//
//        //when you need to check only value we use equal() method
//        System.out.println(c.equals(d)); //this will give me true
//        //The .equals() method in the String class compares the actual content (value) of the string.
//        //Since both c and d store "harsh", .equals() returns true, even though they are different objects.
//        System.out.println(c.charAt(0)); //this will return the character at index
//
//        Integer num2 = new Integer(34); //wrapper class
//        System.out.println(num2.toString());

        System.out.println('a' + 'b');//ascii value of both will be added only as it is in ' ' not in " " which convert it from integer to string
        System.out.println("a" + "b"); //two strings are added
        //here "+" operator is used in both addition of ascii value of integer as well as adding two strings so it called as operator overloading


        System.out.println('a' + 3); //ascii value of a is added with integer 3
        System.out.println((char)('a' + 3)); // it can be converted by using char in sout

        System.out.println("a" + 1); // wrapper class is created as string is added with integer
        //integer is converted into Integer that will call tostring()

        System.out.println("harsh" + new ArrayList<>());
        System.out.println("harsh" + new Integer(56));
        String some = new Integer(56) + " " + new ArrayList<>();
        System.out.println(some);

        System.out.println();

        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series += ch; //appending in the series so much memory wastage
        }
        System.out.println(series);

    }
}
