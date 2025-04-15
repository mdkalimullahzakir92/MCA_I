import java.util.Random;
import java.util.Scanner;

public class RaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the size of array: ");
        int size = sc.nextInt(); // 5
        double [][] x = new double[size][];
        for (int i = 0 ; i< x.length  ; i++) //0 1 2 3 4
            x[i] = new double[i + 1];
        Random random = new Random();
        int i;
        for (i=0 ; i<x.length; i++)
            for(int j=0; j<x[i].length; j++)
                x[i][j] = random.nextDouble(1);
        for (i=0 ; i<x.length; i++) {
            for (int j = 0; j < x[i].length; j++)
                System.out.print(x[i][j] + " ");
            System.out.println();
        }
        sc.close();
    }
}
