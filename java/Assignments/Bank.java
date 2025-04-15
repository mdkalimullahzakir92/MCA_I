package Assignments;

import java.util.Scanner;
import java.util.ArrayList;

class BankAccount{
    private static int accountSeq = 100 ;
    private int accountNo, pin =0;
    private double bal;
    String fName, lName, address, city, pan, adhar;
    
    private int generateAcountNo(){
        return ++accountSeq;
    }

    int createAccount(Scanner input){
        input.nextLine();
        System.out.println("Enter the following details:"+
                            "\nThe symbol * reperesents mandatory field.");
        System.out.print("*first Name ");
        fName=input.nextLine();
        System.out.print("*Last Name ");
        lName=input.nextLine();
        System.out.print("*Address ");
        address=input.nextLine();
        System.out.print("*City ");
        city=input.nextLine();
        System.out.print("Adhar Number ");
        adhar=input.nextLine();
        System.out.print("PAN number ");
        pan=input.nextLine();
        System.out.print("*PIN ");
        pin=input.nextInt();
        
        /* check whether mandatory details are filled by user or not */
        if(fName.equals("") || lName.equals("")|| address.equals("") 
                                    || city.equals("")){
            System.out.println("\nError! Please enter mandatory details.\n");
            accountNo=createAccount(input);
        }
        else
            accountNo= generateAcountNo();
        return accountNo;
    }

    void displayDetails(){
        System.out.println("\n------------------------");
        System.out.println("Account No:"+accountNo);
        System.out.println("Name: "+fName +" "+ lName);
        System.out.println("Address: "+ address + ", "+city);
        System.out.println("Adhar Number: "+ adhar);
        System.out.println("PAN number: "+ pan );    
        System.out.println("------------------------\n");
    }

    void deposit (double amount){
        bal += amount;
        System.out.println("Amount deposited successfully.\n");
    }

    boolean withdraw(double amount){
        if(bal >= amount){
            bal -= amount;
            return true;
        }
        return false;
    }

    double checkbal(){
        return bal;
    }
    
    boolean login(int acNo, int pin){
        if(accountNo== acNo && this.pin == pin){
            return true;
        }
        return false;
    }

    boolean transfer(BankAccount recipient, double amt){
        if(bal >= amt){
            bal -= amt;
            recipient.bal +=  amt;
            return true;
        }
        return false;
    }

    boolean checkRecipientAc(BankAccount recipient, int acNo){
        if(recipient.accountNo == acNo)
            return true;
        return false;
    }
    
    int showAccountNo(){
        return accountNo;
    }
}

class Test{    
    public static void main(String[] args) {
        String prompt = "\n------HOME---------\n"+
                        "Enter 1 to create a new Account.\n"+
                        "Enter 2 for login Account.\nEnter 0 for exit.";
        Scanner cin = new Scanner(System.in);
        /*Prompt user to choose option to create or login account */
        System.out.println(prompt);
        userInterface(cin, cin.nextInt(), prompt);
        cin.close();
    }

    static void userInterface(Scanner cin,int choice, String prompt){
        int acNo, pin; 
        boolean response=false;           
        ArrayList<BankAccount> users = new ArrayList<BankAccount>();
        while(choice != 0){
            switch (choice) {
                case 1:
                    BankAccount user = new BankAccount();
                    acNo = user.createAccount(cin);
                    System.out.println("Account created successfully."+
                                        "Your account no is:\t" + acNo);
                    users.add(user);
                    break;
                case 2:
                    System.out.print("Enter account number      ");
                    acNo=cin.nextInt();
                    System.out.print("Enter pin     ");
                    pin=cin.nextInt();
                    for(BankAccount u : users){
                        response=u.login(acNo, pin);
                        if(response){
                            System.out.println("\n--------Welcome--------");
                            clientHome(u, cin, users); 
                            break;
                        }
                    }
                    if(response==false)
                        System.out.println("Authentication failed! "+
                                        "Invalid Account Number/PIN.");
                    break;
            
                default:
                    System.out.println("Invalid choice");
                    break;
            } 
            System.out.println(prompt);
            choice = cin.nextInt();
        }
    }

    static void clientHome(BankAccount user, Scanner cin, ArrayList<BankAccount> users){
        double amt;
        int acNo;
        boolean response = false;
        String prompt = "Press 1 for deposit\nPress 2 for withdraw\n"+
                        "Press 3 for check bal\n"+
                        "Press 4 for View details\nPress 5 for transfer"+
                        "\nPress 0 for logout";
        System.out.println(prompt);
        int choice = cin.nextInt();
        while(choice != 0){
            switch(choice){
                case 1:
                    System.out.print("Enter amount    ");        
                    user.deposit(cin.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter amount    ");        
                    if(user.withdraw(cin.nextDouble()))
                        System.out.println("Amount withdrawn successfully.\n");
                    else
                        System.out.println("Amount couldn't withdrawn! "+
                        "Your account balance is low.\n");
                    break;
                case 3:
                    System.out.println("Your balance is rupees "+ user.checkbal() 
                                        + "\n");        
                    break;
                case 4:
                    user.displayDetails();   
                    break;
                case 5:
                    System.out.print("Enter the recipient account number   ");        
                    acNo = cin.nextInt();
                    System.out.print("Enter amount    ");
                    amt= cin.nextDouble();
                    for(BankAccount u: users){
                        response = u.checkRecipientAc(u, acNo);
                        if(response){
                            if(user.transfer(u, amt))
                                System.out.println("Amount of rupees "+amt+
                                 " has been transferred to account no "
                                +u.showAccountNo()+" successfully.\n");
                            else
                                System.out.println("Amount couldn't transferred! Low balance.");
                            break;
                        }
                    }
                    if(response == false)
                        System.out.println("Invalid recipient account number!");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.println(prompt);
            choice = cin.nextInt();
        }
    }
}