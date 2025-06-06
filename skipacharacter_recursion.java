public class skipacharacter_recursion {
    public static void main(String[] args) {
        String finding = "baccddaahaaa";
        skip("", finding);
        System.out.println(skipa(finding));
    }
    static void skip(String p, String up){
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            skip(p, up.substring(1));
        }else{
            skip(p + ch, up.substring(1));
        }
    }

    static String skipa(String up){
        if(up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            return skipa(up.substring(1));
        }else{
            return ch + skipa(up.substring(1));
        }
    }
}
