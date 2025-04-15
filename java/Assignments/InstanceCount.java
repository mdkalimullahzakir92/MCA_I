package Assignments;// Instance count class
import java.util.Scanner;
import java.util.ArrayList;  
class Student {
        private int id;
        private static int instanceCount = 0;
        private String name, course, add, phone;
        Student() {
                instanceCount++; // for counting number of student instances created
        }
        public void getDetails() {
                System.out.println("Name: " + name);
                System.out.println("Student Id: " + id);
                System.out.println("Course: " + course);
                System.out.println("address: " + add);
                System.out.println("Contact No: " + phone);
        }
        public void setDetail(Scanner s) {
                System.out.print("Enter id: ");
                id = s.nextInt();
                s.nextLine();
                System.out.print("Enter name: ");
                name = s.nextLine();
                System.out.print("Enter course: ");
                course = s.nextLine();
                System.out.print("Enter phone: ");
                phone = s.nextLine();
                System.out.print("Enter address: ");
                add = s.nextLine();
        }
        static public int getInstanceCount(){
                return instanceCount;
        }
}
class InstanceTest {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.println("Do you want to register a student?");
                String choice = input.next();
                ArrayList<Student> students = new ArrayList<Student>();
                while (choice.equals("yes") || choice.equals("Yes") || choice.equals("YES") ||  choice.equals("Y") ||  choice.equals("y")) {
                        Student s = new Student();
                        students.add(s);
                        s.setDetail(input);
                        System.out.println("Do you want to register a student?");
                        choice = input.next();
                }
                System.out.println("----------------------------------\nNumber of students registered: " + Student.getInstanceCount()+"\n");
                System.out.println("Do you want to view students details?");
                String c = input.next();
                if(c.equals("yes") || c.equals("Yes") || c.equals("YES") ||  c.equals("Y") ||  c.equals("y")){
                        System.out.println("Details of registered students:");
                        for(Student s: students){
                                s.getDetails();
                                System.out.println();
                        }    
                }
                input.close();
        }                
}
