
import java.util.Stack;

public class reverse_a_string {
    public static void main(String[] args) {
        String s = "abdcfe";
        System.out.println(reverseString(s));
    }

    static String reverseString(String s){
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i)); 
        }

        StringBuilder res = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            res.append(st.pop());
        }

        return res.toString();
    }
    
    
}
