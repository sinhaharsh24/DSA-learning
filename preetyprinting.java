public class preetyprinting {
    public static void main(String[] args) {
        float a = 453.1274f;
        //these are called placeholders
        System.out.printf("%.2f", a); //%.2f will round off till 2 digits
        System.out.println();
        System.out.printf("%.3f",Math.PI);
        System.out.println();
        System.out.printf("hellow my name is %s and I am %.3f tall"," harsh", a);
    }
}
