
import java.util.Scanner;

public class alphabet_casecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        //chatAt is used to use the index charachter from the word 
        //example string word = "hello";
        //example sout(word.charAt(0));
        //output - h

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("it is a lower case letter");
        }else {
            System.out.println("it is a upper case letter");
        }

    }
    
}
