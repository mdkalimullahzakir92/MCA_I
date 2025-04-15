package Assignments;// iterative factorial of big integer number.

import java.math.BigInteger;
import java.util.Scanner;

class BigFactorial {
        public static void main(String[] args) {
                BigInteger fact = BigInteger.ONE;
                int n;
                System.out.print("Enter the value of n        ");
                Scanner cin = new Scanner(System.in);
                if (cin.hasNextInt()) {
                        n = cin.nextInt();
                        for (int i = 2; i <= n; i++) 
//                                fact = fact.multiply(BigInteger.valueOf(i));

                                fact = fact.multiply(BigInteger.valueOf(i));
                        System.out.println("factorial of " + n + " = " + fact);
                }
                cin.close();
        }
}