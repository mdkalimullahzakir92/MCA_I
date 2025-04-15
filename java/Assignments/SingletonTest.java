package Assignments;

import java.util.Scanner;
import java.util.ArrayList;
class Singleton{
        private static Singleton instance = null; // references the unique instance
        static int instanceCount;
        private Singleton(){    // restrict the constructor to call from outside for creating new instance
                instanceCount++;
        }
        static Singleton getInstanceRef(){ 
                if(instance == null){
                        instance = new Singleton();
                        return instance;
                }
                return instance;
        }
        static int getInstanceCount(){
                return instanceCount;
        }
        public String name;
        void setName(String name){
                this.name= name;
        }
        void printName(){
                System.out.println("Name of owner: "+name);
        }
}  
class SingletonTest{
        public static void main(String[] args) {
                ArrayList<Singleton>  objects =  new ArrayList<Singleton>();
                Scanner cin = new Scanner(System.in);
                System.out.print("Create new owner? ");
                String choice = cin.next(); 
                while(choice.equals("yes")){
                        Singleton s = Singleton.getInstanceRef();
                        System.out.print("Enter name: ");
                        s.setName(cin.next());
                        objects.add(s);
                        System.out.println("Successfully registered.");
                        System.out.print("Create new owner? ");
                        choice = cin.next(); 
                }
                for(Singleton s : objects){
                        s.printName();
                }
                System.out.println("Number of objects: " +Singleton.getInstanceCount());
                cin.close();
        }
}