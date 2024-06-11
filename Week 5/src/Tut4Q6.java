public class Tut4Q6 {
    public static void main(String[] args) {
        int[] runs = {5, 12, 28, 34, 47, 52, 65, 71, 80, 99};
        int targetScore = 47;
        int matchIndex = binarySearch(runs, targetScore);

        if (matchIndex == -1) {
            System.out.println("The batsman did not score " + targetScore + " runs in any match.");
        } else {
            System.out.println("The batsman scored " + targetScore + " runs in match " + (matchIndex + 1) + ".");
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Target found, return the index
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // Target not found
    }
}