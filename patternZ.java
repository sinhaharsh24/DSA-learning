
public class patternZ {
    public static void main(String[] args) {
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i == 0 || i == n - 1 || j == n - i -1) {
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//
//        }
        int n = 10;

//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                for (int k = 0; k <= 5; k++) {
//                    System.out.print("*");
//                }
//                for (int l = 6; l < n ; l++) {
//                    System.out.print("-");
//                }
//            }
//            System.out.println();
//        }


        //american flag
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" * ");
            }
            for (int k = 0; k < n; k++) {
                System.out.print("----");
            }
            System.out.println();
        }
        for (int z = 0; z < 5; z++) {
            for (int q = 0; q < 35 ; q++) {
                System.out.print("--");
            }
            System.out.println();

        }


    }
}
