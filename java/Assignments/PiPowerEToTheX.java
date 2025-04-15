import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class PiPowerEToTheX {
    private static final BigDecimal PI = new BigDecimal(Math.PI);
    private static final BigDecimal E = new BigDecimal(Math.E);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the value of x: ");
        BigDecimal x = scanner.nextBigDecimal();

        // Calculate e^x
        BigDecimal eToTheX = calculateEToTheX(x);

        // Calculate pi^(e^x)
        BigDecimal result = calculatePiPower(eToTheX);

        // Display the result
        System.out.printf("pi^(e^%.2f) is: %s%n", x, result);

        // Close the scanner
        scanner.close();
    }

    private static BigDecimal calculateEToTheX(BigDecimal x) {
        // Use MathContext for precision
        MathContext mc = new MathContext(20, RoundingMode.HALF_UP);
        return E.pow(x.intValue(), mc);
    }

    private static BigDecimal calculatePiPower(BigDecimal exponent) {
        MathContext mc = new MathContext(20, RoundingMode.HALF_UP);
        return PI.pow(exponent.intValue(), mc);
    }
}