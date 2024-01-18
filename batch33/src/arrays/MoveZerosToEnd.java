package arrays;

public class MoveZerosToEnd {


        public static void main(String[] args) {
            int[] numbers = {0, 3, 0, 2, 8, 4, 0, 1};

            // Move zeros to the end
            moveZeros(numbers);

            // Print the result
            System.out.print("Array after moving zeros: ");
            printArray(numbers);
        }

        public static void moveZeros(int[] nums) {
            int nonZeroIndex = 0;

            // Iterate through the array
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    // Move non-zero elements to the front
                    nums[nonZeroIndex++] = nums[i];
                }
            }

            // Fill the remaining elements with zeros
            while (nonZeroIndex < nums.length) {
                nums[nonZeroIndex++] = 0;
            }
        }

        public static void printArray(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }


