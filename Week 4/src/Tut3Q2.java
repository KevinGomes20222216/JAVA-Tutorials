public class Tut3Q2 {
    public static void main(String[] args) {
        printPattern1();
        System.out.println();
        printPattern2();
    }

    public static void printPattern1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void printPattern2() {
        int rows = 5;
        int stars = 1;
        int spaces = 4;

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();
            spaces--;
            stars += 2;
        }
    }
}