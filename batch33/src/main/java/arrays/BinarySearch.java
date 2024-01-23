package arrays;

public class BinarySearch {


        public static void main(String[] args) {
            int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int targetElement = 5;

            // Perform binary search
            int result = binarySearch(sortedArray, targetElement);

            // Print the result
            if (result != -1) {
                System.out.println("Element " + targetElement + " found at index " + result);
            } else {
                System.out.println("Element " + targetElement + " not found in the array");
            }
        }

        public static int binarySearch(int[] arr, int target) {
            int low = 0;
            int high = arr.length - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (arr[mid] == target) {
                    return mid;  // Element found, return its index
                } else if (arr[mid] < target) {
                    low = mid + 1;  // Search in the right half
                } else {
                    high = mid - 1;  // Search in the left half
                }
            }

            return -1;  // Element not found
        }
    }


