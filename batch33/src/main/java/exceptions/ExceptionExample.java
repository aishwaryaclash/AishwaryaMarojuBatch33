package exceptions;

//With try  catch
/*public class ExceptionExample{
    public static void exceptionExample(String s) {
        try {
            int si = Integer.parseInt(s);
            System.out.println("Converted String to Integer "+si);
        }catch (Exception e){
            System.out.println(e);
        }finally{
            System.out.println("This is Finally block");
        }



    }
    public static void main(String[] args){
        ExceptionExample.exceptionExample("h");
        ExceptionExample.exceptionExample("12");
    }
}*/

//with throws
public class ExceptionExample extends Exception{
    public static void exceptionExample(String s) {
        int si = Integer.parseInt(s);
        System.out.println("Converted String to Integer "+si);

    }
    public static void main(String[] args) throws Exception{
        ExceptionExample.exceptionExample("h");
        ExceptionExample.exceptionExample("12");
    }
}
