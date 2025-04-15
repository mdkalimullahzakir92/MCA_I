//
//import mypackage.mymath.*;
//import java.util.Scanner;
//
//public class PackageTest {
//        public static void main(String[] args) {
//                Scanner cin = new Scanner(System.in);
//                double a, b, c;
//                String prompt= "Enter 1 for finding area\n"+
//                                "Enter 2 for finding factorial\n"+
//                                "Enter 0 for exit";
//                String promptArea = "Enter 1 for circle area\n"+
//                                "Enter 2 for rectangle area\n"+
//                                "Enter 3 for triangle area";
//                System.out.println(prompt);
//                int choice = cin.nextInt();
//                while (choice != 0) {
//                        switch (choice) {
//                                case 1: // finding area
//                                        Area area = new Area();
//                                        System.out.println(promptArea);
//                                        int areaChoice = cin.nextInt();
//                                        switch (areaChoice) {
//                                                case 1:
//                                                       System.out.print("Enter radius:  ");
//                                                       System.out.println("Area of circle= "+ area.circle(cin.nextDouble()) );
//                                                        break;
//                                                case 2:
//                                                       System.out.print("Enter length:  ");
//                                                       a = cin.nextDouble();
//                                                       System.out.print("Enter breadth:  ");
//                                                       b = cin.nextDouble();
//                                                       System.out.println("Area of Rectangle= "+ area.rectangle(a, b) );
//                                                        break;
//                                                case 3:
//                                                        System.out.print("Enter side1:  ");
//                                                        a = cin.nextDouble();
//                                                        System.out.print("Enter side2:  ");
//                                                        b = cin.nextDouble();
//                                                        System.out.print("Enter side3:  ");
//                                                        c = cin.nextDouble();
//                                                        System.out.println("Area of triangle= "+ area.triangle(a, b, c) );
//                                                        break;
//                                                default:
//                                                        System.out.println("Invalid choice!");
//                                                        break;
//                                        }
//                                        break;
//                                case 2: // finding factorial
//                                        Factorial f = new Factorial();
//                                        System.out.println("Enter a number to find factorial");
//                                        int n = cin.nextInt();
//                                        if( n < 50)
//                                                System.out.println("Factorial of "+ n + "is " +f.factorial(n));
//                                        else
//                                                System.out.println("Factorial of "+ n + "is " +f.BigFactorial(n));
//                                        break;
//                                default: // default message
//                                        System.out.println("Invalid choice");
//                                        break;
//                        }
//                        System.out.println(prompt);
//                        choice = cin.nextInt();
//                }
//                cin.close();
//        }
//}