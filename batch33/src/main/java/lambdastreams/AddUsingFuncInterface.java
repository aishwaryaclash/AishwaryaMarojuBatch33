package lambdastreams;
public class AddUsingFuncInterface {
    public static void main(String args[]){
        // Implementing addition using a lambda expression
        MathOperation addition = (a, b) -> a + b;

        // Example usage
        int result = addition.operate(5, 3);
        System.out.println("Result of addition: " + result);

    }
}
