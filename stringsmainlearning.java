public class stringsmainlearning {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 19};
        int num = 10;
        String a = "harsh sinha";
        System.out.println(a);
//        a = "harsh"; //the value of a is changed and original first value gone to garbage collection
//        System.out.println(a);
        String b = "harsh sinha";
        System.out.println(b); //string is added to string pool
        System.out.println(a == b);

        //how to create diff object with same value
        String c = new String("harsh");
        String d = new String("harsh");
        System.out.println(c == d);
        //now they are in different string pool so they are different

        //when you need to check only value we use equal() method
        
    }
}
