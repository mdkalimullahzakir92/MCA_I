/*In Java, Throwable is the superclass of all errors and exceptions. 
This means that every object that can be thrown by the Java Virtual Machine (JVM) or by the 
throw statement is an instance of the Throwable class or one of its subclasses. 
*/
public class Throws_Example {

    public int divide(int numerator, int denominator) throws ArithmeticException {

        if (denominator == 0)
//        {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
//            throw new ArithmeticException("Cannot divide by zero");
            throw new ArithmeticException("wrong ");

//        }
        return numerator / denominator;

    }

    public static void main(String[] args) {

        System.out.println("Abdullah");
        Throws_Example calc = new Throws_Example();

        try {

            int result = calc.divide(10, 0); // This will throw an ArithmeticException

            System.out.println(result);

        } catch (ArithmeticException e) {

            System.out.println("Error: " + e.getMessage());

        }

    }

}
