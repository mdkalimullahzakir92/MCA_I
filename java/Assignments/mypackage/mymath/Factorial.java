package mypackage.mymath;
import java.math.BigInteger;

public class Factorial {
        public BigInteger BigFactorial(int n ){
                BigInteger fact = BigInteger.ONE;
                for (int i = 2; i <= n; i++) 
                        fact = fact.multiply(BigInteger.valueOf(i));
                
                        return fact;
                }
        public long factorial(int n){
                long fact = 1;
                for (int i = 2; i <= n; i++) 
                        fact *= i;
                return fact;
        }
}