import java.util.Arrays;

public class stringbuilderlearning {
    public static void main(String[] args) {
        //stringbuilder is used to decrease the use to memory as it didn't create new object everytime
        StringBuilder str = new StringBuilder();
        str.append("Hello");
        System.out.println(str);
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            str.append(ch);

        }
        System.out.println(str.toString());
        System.out.println(str.reverse());
        for (int i = 0; i < 26; i++) {
            str.append((char) ('a' + i));
        }
        System.out.println(str.toString());
        System.out.println(Arrays.toString(str.toString().toCharArray()));


        String name = "harsh Sinha"; //string to array
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toUpperCase());

    }
}
