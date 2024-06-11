public class Tut3Q1 {
    public static void main(String[] args) {
        // Using for loop
        System.out.println("Using for loop:");
        for (int i = 0; i <= 14; i += 2) {
            if (i == 6 || i == 8) {
                continue;
            }
            System.out.println(i);
        }

        // Using while loop
        System.out.println("Using while loop:");
        int j = 0;
        while (j <= 14) {
            if (j == 6 || j == 8) {
                j += 2;
                continue;
            }
            System.out.println(j);
            j += 2;
        }
    }
}