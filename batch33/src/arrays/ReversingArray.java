package arrays;

public class ReversingArray {
    public static void main(String[] args) {
            int[] originalArray = {1, 2, 3, 4, 5};
        System.out.print("Original Array: ");
        printArray(originalArray);
            // Reverse the array
            reverseArray(originalArray);

            // Print the results


            System.out.print("Reversed Array: ");
            printArray(originalArray);
        }

        public static void reverseArray(int[] arr) {
            int length = arr.length;
            for (int i = 0; i < length / 2; i++) {
                // Swap elements at i and length - 1 - i
                int temp = arr[i];
                arr[i] = arr[length - 1 - i];
                arr[length - 1 - i] = temp;
            }
        }

        public static void printArray(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }


