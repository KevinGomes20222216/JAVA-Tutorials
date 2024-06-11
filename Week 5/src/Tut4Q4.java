import java.util.Arrays;
public class Tut4Q4 {
    public static void main(String[] args) {
        int[] A = {2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Set A: " + Arrays.toString(A));

        System.out.print("Even numbers in A: ");
        findEvenNumbers(A);

        System.out.print("Numbers in A that, when multiplied by 2, are also in A: ");
        findDoubledNumbers(A);
    }

    public static void findEvenNumbers(int[] A) {
        for (int num : A) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void findDoubledNumbers(int[] A) {
        for (int num : A) {
            int doubledNum = num * 2;
            if (isInSet(A, doubledNum)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static boolean isInSet(int[] A, int num) {
        for (int element : A) {
            if (element == num) {
                return true;
            }
        }
        return false;
    }
}