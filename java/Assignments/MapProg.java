package Assignments;

import java.util.Scanner;
import java.util.TreeMap;

class MapProg {

    public static void main(String[] args) {
        TreeMap<String, String> MCA = new TreeMap<String, String>();
        TreeMap<String, String> MScAI_ML = new TreeMap<String, String>();
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter Username and password of 10 MCA students ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter username: ");
            String user = cin.nextLine();
            System.out.print("Enter Password: ");
            String pwd = cin.nextLine();
            MCA.put(user, pwd);
        }
        System.out.println("Enter Username and password of 10 MSC AI/ML students ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter username: ");
            String user = cin.nextLine();
            System.out.print("Enter Password: ");
            String pwd = cin.nextLine();
            MScAI_ML.put(user, pwd);
        }
        System.out.println("Displaying MCA students details");
        for (String key : MCA.keySet()) {
            System.out.println(key + " : " + MCA.get(key));
        }
        System.out.println("Displaying MSC AI/ML students details");
        for (String key : MScAI_ML.keySet()) {
            System.out.println(key + " : " + MScAI_ML.get(key));
        }

        MCA.putAll(MScAI_ML);
        System.out.println("Merged List:");
        for (String key : MCA.keySet()) {
            System.out.println(key + " : " + MCA.get(key));
        }

        cin.close();
    }

}
