package loopsandconditions;

public class PatternPrinting {




        public static void main(String[] args) {
            int rows = 5; // You can change the number of rows as needed

            for (int i = 0; i < rows; i++) {
                // Print '+'
                for (int j = 0; j < (4 - i); j++) { // Decrement '+' by 1 in each subsequent row
                    System.out.print("+");
                }

                // Print '-'
                for (int k = 0; k < (i + 2); k++) { // Increment '-' by 1 in each subsequent row
                    System.out.print("-");
                }

                // Move to the next line after each row
                System.out.println();
            }
        }
    }

