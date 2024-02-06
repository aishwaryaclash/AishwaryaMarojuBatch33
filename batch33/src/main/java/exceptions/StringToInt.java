package exceptions;

public class StringToInt {

    public static void printConvertedInteger(String[] input) {
        try {
            int intValue = convertStringToInt(input);
            System.out.println("String \"" + input + "\" converted to integer: " + intValue);
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred for input \"" + input + "\": " + e.getMessage());
        }
    }

    public static int convertStringToInt(String input) throws NumberFormatException {
        return Integer.parseInt(input);
    }
}