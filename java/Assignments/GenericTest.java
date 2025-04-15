package Assignments;
import java.util.ArrayList;
import java.util.Scanner;

class GenericArray<T>{
    ArrayList<T> array;

    GenericArray(){
        array=  new ArrayList<>();
    }
    void add(T t){
        array.add(t);
    }
    T get(int i){
        return array.get(i);
    }
    int search(T t){
        for(T item : array){
            if(item.equals(t)){
                return array.indexOf(item);
            }
        }
        return -1;
    }
}
public class GenericTest {
    public static void main(String[] args) {
        System.out.println("Abdullah");

        Scanner sc = new Scanner(System.in);

        GenericArray<Double> doubleArray = new GenericArray<>();
        System.out.println("Enter your choice: ");
        System.out.println("1 add item\n2 get item\n3 search item\n0 exit");
        String choice = sc.next();
        while(!choice.equals("0")){
            switch(choice){
                case "1" :
                    System.out.println("Enter value: ");
                    doubleArray.add(sc.nextDouble());
                    break;
                case "2" :
                    System.out.println("Enter index: ");
                    Double val= doubleArray.get(sc.nextInt());
                    System.out.println("item : "+val);
                    break;
                case "3" :
                    System.out.println("Enter item: ");
                    double item= sc.nextDouble();
                    int index= doubleArray.search(item);
                    if(index == -1)
                        System.out.println("Item not found: ");
                    else
                        System.out.println("Item found at : " + index + " index");
                    break;
                default:
                    System.out.println("Invalid input! ");
            }
            System.out.println("Enter your choice: ");
            choice = sc.next();
        }
        sc.close();
    }
}
