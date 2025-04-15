package Assignments;

import java.util.Scanner;

class GenericList<T>{
    private T[] array;
    private int index;
    @SuppressWarnings("unchecked")
    GenericList(){
        int DEFAULT_SIZE = 1;
        array = (T[]) new Object[DEFAULT_SIZE];
        index = 0;
    }
    public void add(T item){
        if(index == array.length)
            resizeArray();
        array[index] = item;
        index++;
    }
    @SuppressWarnings("unchecked")
    private void resizeArray(){
        T[] temp = (T[]) new Object[array.length+1];
        System.arraycopy(array, 0, temp, 0, array.length);
        array = temp;
    }
    public T get(int index){
        try{
            return array[index];
        }catch(IndexOutOfBoundsException e){
            return null;
        }
    }
    protected int indexOf(T item){
        for(int i= 0; i< array.length; i++){
            if(item.equals(array[i]))
                return i;
        }
        return -1;
    }
    public int search(T item){
        for(T t : array ){
            if(item.equals(t))
                return indexOf(t);
        }
        return -1;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        for(T item: array)
            sb.append(" ").append(item).append(",");
        sb.append("\b ]");
        return sb.toString();
    }
    public boolean remove(T item){
        if(indexOf(item) ==-1)
            return false;
        for(int i = indexOf(item); i<array.length-1; i++){
            array[i]=array[i+1];
        }
        @SuppressWarnings("unchecked")
        T[] temp = (T[])new Object[array.length-1];
        System.arraycopy(array, 0, temp, 0,array.length-1);
        array = temp;
        index--;
        return true;
    }
}
public class TestArray {
    public static void main(String[] args) {
        System.out.println("Abdullah");
        GenericList<Integer> intArray = new GenericList<>();

        GenericList<Triplet.Pair<String, Integer>> pairs = new GenericList<>();
        pairs.add(new Triplet.Pair<>("Ahmad", 24));
        pairs.add(new Triplet.Pair<>("Farhan", 30));
        pairs.add(new Triplet.Pair<>("Faizan", 28));
        System.out.println(pairs);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        System.out.println("1 add item\n2 get item\n3 search item\n4 remove \n5 display array\n0 exit");
        System.out.print(">> ");
        String choice = sc.next();
        while(!choice.equals("0")){
            switch(choice){
                case "1" :
                    System.out.print("Enter item to add: ");
                    intArray.add(sc.nextInt());
                    System.out.println("Item added successfully.");
                    break;
                case "2" :
                    System.out.print("Enter index to get item: ");
                    Integer val= intArray.get(sc.nextInt());
                    System.out.println("item : "+val);
                    break;
                case "3" :
                    System.out.print("Enter item to search: ");
                    int index= intArray.search(sc.nextInt());
                    if(index == -1)
                        System.out.println("Item not found: ");
                    else
                        System.out.println("Item found at index "+ index);
                    break;
                case "4" :
                    System.out.print("Enter item to remove: ");
                    boolean b= intArray.remove(sc.nextInt());
                    if(b)
                        System.out.println("Item removed successfully.");
                    else
                        System.out.println("Item does not exist.");
                    break;
                case "5" :
                    System.out.println(intArray);
                    break;
                default:
                    System.out.println("Invalid input! ");
            }
            System.out.println("Enter your choice: ");
            System.out.print(">> ");
            choice = sc.next();
        }
        sc.close();
    }
}

/*
Test Case:
----------

Enter your choice:
1 add item
2 get item
3 search item
4 remove
5 display array
0 exit
>> 1
Enter item to add: 20
Item added successfully.
Enter your choice:
>> 2
Enter index to get item: 0
item : 20
Enter your choice:
>> 2
Enter index to get item: 1
item : null
Enter your choice:
>> 1
Enter item to add: 25
Item added successfully.
Enter your choice:
>> 1
Enter item to add: 42
Item added successfully.
Enter your choice:
>> 3
Enter item to search: 25
Item found at index 1
Enter your choice:
>> 4
Enter item to remove: 42
Item removed successfully.
Enter your choice:
>> 1
Enter item to add: 15
Item added successfully.
Enter your choice:
>> 5
[ 20, 25, 15 ]
Enter your choice:
>> 0

*/