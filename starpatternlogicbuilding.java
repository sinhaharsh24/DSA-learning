public class starpatternlogicbuilding {

    // Pattern 1
    public static void main1() {
        int i, j;
        int n = 6;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Pattern 2
    public static void main2() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    // Pattern 3
    public static void main3() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    // Pattern 4
    public static void main4() {
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Pattern 5
    public static void main5() {
        int x = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(x + " ");
                x++;
            }
            System.out.println();
        }
    }

    // Pattern 6
    public static void main6() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 4; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    // pattern 7
    public static void main7() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int i = 3; i >= 1; i--) {
            for (int j = 2; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++ ) {
                System.out.print(" " + "*");
            }
            System.out.println();
        }

        
    }

    public static void main8() {
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main9() {
        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // The main method to run all patterns
    public static void main(String[] args) {
        System.out.println("Pattern 1:");
        main1();
        System.out.println();

        System.out.println("Pattern 2:");
        main2();
        System.out.println();

        System.out.println("Pattern 3:");
        main3();
        System.out.println();

        System.out.println("Pattern 4:");
        main4();
        System.out.println();

        System.out.println("Pattern 5:");
        main5();
        System.out.println();

        System.out.println("Pattern 6:");
        main6();
        System.out.println();

        System.out.println("Pattern 7:");
        main7();
        System.out.println();
        
        System.out.println("Pattern 8:");
        main8();
        System.out.println();

        System.out.println("Pattern 9:");
        main9();
        System.out.println();
    }
}
