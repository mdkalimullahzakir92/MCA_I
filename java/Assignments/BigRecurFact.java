package Assignments;// factorial of big integer number using recursive function
import java.util.Scanner;
import java.math.BigInteger;

class BigRecurFact {
        static BigInteger fact(Long n) {
                if (n <= 1)
                        return BigInteger.ONE;
                return BigInteger.valueOf(n).multiply(fact(n - 1));
                // return f;
        }
        public static void main(String[] arg) {
                long n;
                System.out.print("Enter the value of n        ");
                Scanner cin = new Scanner(System.in);
                n = cin.nextLong();
                System.out.println("factorial of " + n + " = " + fact(n));
                cin.close();
        }
}