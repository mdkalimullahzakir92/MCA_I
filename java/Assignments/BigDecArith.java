package Assignments;

import java.util.Scanner;
import java.math.*;
class BigArithmetic{
        BigDecimal a , b;
        BigArithmetic(BigDecimal a, BigDecimal b){
                this.a = a;
                this.b = b;
        }
        BigDecimal add(){
                return a.add(b);
        }
        BigDecimal subtract(){
                return a.subtract(b);
        }
        BigDecimal multiply(){
                return a.multiply(b);
        }
        BigDecimal divide(){
                return a.divide(b, 2, RoundingMode.CEILING);
        }

        void compare(){
                int c = a.compareTo(b);
                if (c>0)
                        System.out.println(a + " is greater than "+ b);
                else if(c<0)
                        System.out.println(a + " is smaller than "+ b);
                else
                        System.out.println(a + " is equal to "+ b);
        }

}
public class BigDecArith {
        public static void main(String[] args) {
                Scanner cin = new Scanner(System.in);
                
                System.out.print("Enter value of first no:    ");
                BigDecimal a = new BigDecimal(cin.next());
                System.out.print("Enter value of Second no:    ");
                BigDecimal b = new BigDecimal(cin.next());
                BigArithmetic A = new BigArithmetic(a, b);
                String prompt ="Enter 1 for add\n"+
                "Enter 2 for subtract\nEnter 3 for multiply\n"+
                "Enter 4 for divide\nEnter 5 for compare"+
                "\nEnter 0 for exit";
                int choice;
                System.out.println(prompt);
                choice = cin.nextInt();
                while(choice != 0){
                        switch(choice){
                                case 1:
                                        System.out.println("sum = "+ A.add());
                                        break;
                                case 2:
                                        System.out.println("difference = "+ A.subtract());
                                        break;
                                case 3:
                                        System.out.println("product = "+ A.multiply());
                                        break;
                                case 4:
                                        System.out.println("quotient = "+ A.divide());
                                        break;
                                case 5:
                                        A.compare();
                                        break;
                                default:
                                        System.out.println("invalid choice!");
                                        break;
                        }
                        System.out.println(prompt);
                        choice = cin.nextInt();
                }
                cin.close();
        }
}
