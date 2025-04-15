import java.util.Scanner;
import java.math.BigDecimal;

public class BigFunction {
        static final BigDecimal pi = BigDecimal.valueOf(Math.PI);
        static final BigDecimal e = BigDecimal.valueOf(Math.E);
        // usinng BigDecimal pow() method
        static BigDecimal piPowEpowX(BigDecimal x){
                double  a = Math.pow(Math.E, x.intValue());
                BigDecimal fun = pi.pow((int)a);
                return fun;
        }
        // usinng Math.pow() method
        static BigDecimal piPowEpowX(double x){
                double a =Math.pow(Math.PI, Math.pow(Math.E, x));
                System.out.println("-----using double PI^(e^x) ="+ a);
                return BigDecimal.valueOf(a);
        }
        public static void main(String[] args) {
                Scanner cin = new Scanner(System.in);
                System.out.print("Enter the value of x:       ");
                BigDecimal x = cin.nextBigDecimal();
                System.out.println("PI^(e^x)= "+ piPowEpowX(x));
                System.out.println("PI^(e^x)= "+ piPowEpowX(x.intValue()));
                cin.close();
        }
}
