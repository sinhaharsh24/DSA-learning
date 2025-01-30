import java.sql.SQLOutput;

public class string_linersearch {
    public static void main(String[] args) {
        String name = "harsh";
        char target = 'r';
        System.out.println(search(name,target));


    }
    static boolean search2(String str, char target){
        if(str.length() == 0){  //here length() is a function which was just arr.length in linear search
            return false;
        }

        for(char ch : str.toCharArray()){   //for each loop it converts the string to char and then in array
            if(ch == target){
                return true;
            }
        }
        return false;

    }

    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == target){
                return true;
            }
        }
        return false;

    }

}
