import java.util.ArrayList;
import java.util.Scanner;

class   BankAccount{
    private double balance;
    private String name, position;
    String id ;
    private static int accountNo= 1000;
    private int ac;

    BankAccount(String id, String name, String position){
        balance = 0.0;
        ac = accountNo++;
        this.id = id;
        this.name = name;
        this.position =position;

    }

    void deposit(double amount ){
        balance += amount;
        System.out.println("amount deposited "+ amount);
    }

    void withdraw(double amount ){
        try {
            if(amount>0 && amount <= balance){
                balance -= amount;
                System.out.println(amount + "rupees withdraw successful " );
            }
            else
               throw new InsufficientBalanceException();
        } catch (Exception e) {
            System.out.println("Error! "+ e);
        }
    }

    double checkBalance(){
        return balance;
    }

    public String toString(){
        return "Name: "+ name + "id : "+ id + "Position: "+ position;
    }
}

class DuplicateEmployeeException extends Exception{
    public String toString(){
        return "Employee Already exist.";
    }
}

class EmployeeNotFoundException extends Exception{
    public String toString(){
        return "Employee does not exist.";
    }
}

class InsufficientBalanceException extends Exception{
    public String toString(){
        return "Balance is Insufficient.";
    }
}

public class BankTest {
    static ArrayList<BankAccount> employees = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while(running){
            System.out.println("Enter choice ");
            System.out.println("1. add employee ");
            System.out.println("3. deposit money ");
            System.out.println("4. withdraw money ");
            System.out.println("6. display details ");

            System.out.println("5. exit ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    addEmployee();
                    break;
                case 3:
                     deposit();
                    break;
                case 4:
                     withdraw();
                    break;
                case 5:
                    running = false;
                    break;
                case 6:
                     displayDetail();
                    break;
                default:
                    break;

            }
        }
    }

    static BankAccount searchEmployee(String id){
        for(BankAccount e : employees ) {
            if (e.id.equals(id))
                return e;
        }
        return null;
    }

    static void addEmployee() {
        String id, name, position;
        System.out.print("Enter id: ");
        sc.nextLine();
        id = sc.nextLine();

        // error handling code
        try{
            if (searchEmployee(id) != null) {
                throw new DuplicateEmployeeException();
            }
            System.out.print("Enter name : ");
            name = sc.nextLine();
            System.out.print("Enter position : ");
            position = sc.nextLine();
            BankAccount emp = new BankAccount(id, name, position);
            employees.add(emp);
        }catch(Exception e){
            System.out.println("Error" + e);
         }
    }

    static void displayDetail(){
        String id;
        System.out.println("Enter id ");
        sc.nextLine(); // consume newline character
        id = sc.nextLine();
        BankAccount emp = searchEmployee(id);
        // error handling
        try {
            if(emp == null) {
                throw new EmployeeNotFoundException();
            }
            System.out.println(emp);
        } catch (Exception e) {
            System.out.println("Error! " + e);
        }
    }

    static void deposit(){
        String id;
        System.out.println("Enter id ");
        sc.nextLine(); // consume newline character
        id= sc.nextLine();
        // error handling
        BankAccount b = searchEmployee(id);
        try {
            if(b == null ) {
                throw new EmployeeNotFoundException();
            }
            System.out.println("Enter amount");
            double amt = sc.nextDouble();
            b.deposit(amt);
        } catch (Exception e) {
            System.out.println("Error. "+e);
        }

    }

    static void withdraw(){
        System.out.println("Enter id ");
        sc.nextLine(); // consume newline character
        String id = sc.nextLine();
        // error handling
        BankAccount emp = searchEmployee(id);
        try {
            if(emp == null)
            {
               throw new EmployeeNotFoundException();
            }
            System.out.println("Enter amount ");
            double amt = sc.nextDouble();
            emp.withdraw(amt);
        } catch (Exception e) {
            System.out.println("Error'"+e);
        }


    }

}
