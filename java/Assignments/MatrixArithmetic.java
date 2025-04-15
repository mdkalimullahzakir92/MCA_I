package Assignments;

import java.util.*;

// Defining a square matrix class
class SMatrix {
        private final int[][] matrix;
        private final int n;

        SMatrix(int n) {
            this.n = n;
                matrix = new int[n][n];
                Random ranObj = new Random(); // populating matrix with random values
                for (int i = 0; i < n; i++)
                        for (int j = 0; j < n; j++)     
                                matrix[i][j] = ranObj.nextInt(2);
        }                                                               

        // Printing matrix method
        void printMatrix() {
                for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++)
                                System.out.print(matrix[i][j] + "\t");
                        System.out.println();
                }
        }

        SMatrix add(SMatrix A) {
                SMatrix B = new SMatrix(n);
                for (int i = 0; i < n; i++)
                        for (int j = 0; j < n; j++)
                                B.matrix[i][j] = matrix[i][j] + A.matrix[i][j];
                return B;
        }

        SMatrix subtract(SMatrix A) {
                SMatrix B = new SMatrix(n);
                for (int i = 0; i < n; i++)
                        for (int j = 0; j < n; j++)
                                B.matrix[i][j] = matrix[i][j] - A.matrix[i][j];
                return B;
        }

        SMatrix multiply(SMatrix A) {
                SMatrix B = new SMatrix(n);
                for (int i = 0; i < n; i++)
                        for (int j = 0; j < n; j++)
                                for (int k = 0; k < n; k++)
                                        B.matrix[i][j] += matrix[i][k] * A.matrix[k][j];
                return B;
        }
}

// Driver class
class MatrixArithmetic {
        // Method to display error and input choices
        static void display(int choice, Scanner s, SMatrix A, SMatrix B) {
                while (choice != 0) {
                        switch (choice) {
                                case 1:
                                        System.out.println("Sum of matrices: ");
                                        A.add(B).printMatrix();
                                        break;
                                case 2:
                                        System.out.println("Difference of matrices: ");
                                        A.subtract(B).printMatrix();
                                        break;
                                case 3:
                                        System.out.println("Product of matrices: ");
                                        A.multiply(B).printMatrix();
                                        break;
                                default:
                                        System.out.println("Invalid choice! Please try again.");
                                        break;
                        }
                        System.out.print("Enter your choice: ");
                        if (s.hasNextInt())
                                choice = s.nextInt();
                        else {
                                System.out.println("Invalid input!"); // when choice is not an integer
                                return;
                        }
                }
        }

        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.print("Enter the size of the square matrix:  ");
                if (s.hasNextInt()) {
                        int size = s.nextInt();
                        if (Math.signum(size) == -1)
                                System.out.println("Size of the array cannot be negative");
                        else {
                                SMatrix A = new SMatrix(size);
                                SMatrix B = new SMatrix(size);
                                System.out.println("First matrix:");
                                A.printMatrix();
                                System.out.println("Second matrix:");
                                B.printMatrix();
                                System.out.println(
                                                "Press 1 for add\nPress 2 for subtract\nPress 3 for multiply\nPress 0 for exit");
                                System.out.print("Enter your choice: ");
                                if (s.hasNextInt())
                                        display(s.nextInt(), s, A, B); // passing choice, scanner obj and the two
                                                                       // matrics
                                else
                                        System.out.println("Invalid input!"); // when choice is not an integer
                        }
                }
                // if user enters a non integer number as size
                else
                        System.out.println("invalid input! Please input integer number as size.");
                s.close();
        }
}