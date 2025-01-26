
import java.util.Scanner;

public class switch_statement {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String fruit = in.next();
        int day = in.nextInt();

//        if (fruit.equals("apple")) {
//            System.out.println("fruit is red");
//        }
            // using if else
//        if (fruit.equals("apple")) {
//            System.out.println("red fruit");
//        } else if (fruit.equals("banana")) {
//            System.out.println("yellow fruit");
//        } else if (fruit.equals("orange")) {
//            System.out.println("orange fruit");
//        } else if (fruit.equals("grape")) {
//            System.out.println("green fruit");
//        } else {
//            System.out.println("invalid fruit");
//        }

            // using switch condition
//        switch (fruit) {
//            case "apple":
//                System.out.println("red fruit");
//                break;
//
//            case "banana":
//                System.out.println("yellow fruit");
//                break;
//
//            case "orange":
//                System.out.println("orange fruit");
//                break;
//
//            case "grape":
//                System.out.println("green fruit");
//                break;
//
//            default:
//                System.out.println("invalid fruit");
//        }

        //using enhanced switch
        switch (fruit) {
            case "apple" -> System.out.println("red fruit");
            case "banana" -> System.out.println("yellow fruit");
            case "orange" -> System.out.println("orange fruit");
            case "grape" -> System.out.println("green fruit");
            default -> System.out.println("invalid fruit");
        }

        switch (day) {
            case 1,2,3,4,5 -> System.out.println("weakdays");
            case 6,7 -> System.out.println("weakends");
        }



    }
    
}
