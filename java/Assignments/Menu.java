// this is not assignment for menu creation only

package Assignments;

import java.util.Scanner;

public class Menu {
    static void Menu(int choice, Scanner cin, Triplet<Integer, String, String> triplet){
        switch(choice){
            case 1:
                int c =1;
                while(c!=0) {
                    System.out.println("Enter Id, name, password: ");
                    Integer id = cin.nextInt();
                    cin.nextLine();
                    String name = cin.nextLine();
                    String password = cin.nextLine();
                    triplet.put(id, name, password);

                    System.out.println("Enter 0 for return, 1 for continue");
                    c = cin.nextInt();
                }
                break;
            case 2:
                System.out.println(triplet);
                break;
            case 3:
                System.out.println("Enter id: ");
                System.out.println(triplet.get(cin.nextInt()));
                break;
            default :
                System.out.println("Invalid input! Try again.");
                break;
        }
    }

    public static void main(String[] args) {
        Triplet<Integer, String, String> triplet = new Triplet<>();

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter 1 for add data in the collection ");
        System.out.println("Enter 2 for print whole list data ");
        System.out.println("Enter 3 for view data by id");
        System.out.println("Enter 0 for exit ");
        System.out.println("Enter your Choice: ");
        int choice = cin.nextInt();
        while (choice != 0){
            Menu(choice, cin, triplet);
            System.out.println("Enter your Choice: ");
            choice = cin.nextInt();
        }
        System.out.println("Exiting...");

    }
}
