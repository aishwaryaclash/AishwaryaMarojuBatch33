package arrays;

public class BubbleSort {


        public static void main(String[] args) {
            int[] arrayToSort = {5, 2, 9, 1, 5, 6};

            // Sort the array
            bubbleSort(arrayToSort);

            // Print the sorted array
            System.out.print("Sorted Array: ");
            printArray(arrayToSort);
        }

        public static void bubbleSort(int[] arr) {
            int n = arr.length;

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Swap arr[j] and arr[j + 1]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }

        public static void printArray(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }


