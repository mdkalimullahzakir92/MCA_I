package Assignments;

import java.util.TreeMap;

class Triplet<T,U, V>{
    private final TreeMap<T, Pair<U, V>> triplets;
    Triplet() {
        triplets = new TreeMap<>();
    }
         static class Pair<X, Y>{
        private final X  val1;
        private final Y val2;

        Pair(X val1, Y val2){
            this.val1 = val1;
            this.val2 = val2;
        }
        public String toString(){
            return val1 +"::"+ val2;
        }
    }

    public void put(T key, U var1, V var2){
        triplets.put(key, new Pair<>(var1, var2));
    }

    public Pair<U, V> get(T key){
        return triplets.get(key);
    }

    public String getVal1(T key){
        Pair<U, V> p = triplets.get(key);
        return p.val1.toString();
    }
    public String getVal2(T key){
        Pair<U, V> p = triplets.get(key);
        return p.val2.toString();
    }
    public String toString(){
        StringBuilder sb = new StringBuilder("{ ");
        for(T key: triplets.keySet())
            sb.append(key).append("=").append(triplets.get(key)).append("  ");
        sb.append("} ");
        return sb.toString();
    }

}

public class TripletTest {

    public static void main(String[] args) {
        Triplet<Integer, String, String> triplet1 = new Triplet<>();
        Triplet<String, Integer, Double> triplet2 = new Triplet<>();

        triplet1.put(2024102,"Ahmad", "12qwe");
        triplet1.put(2024103,"Abdullah", "82p9y0");
        triplet1.put(2024104,"Gulam", "8790iuo");
        triplet1.put(2024103,"Shakir", "09foi90");
        triplet1.put(2024105,"Faiz", "ll90iuo");
        System.out.println("Pair values for key "+ 2024102 + " is "+triplet1.get(2024102));
        System.out.println("Pair values for key "+ 2024103 + " is "+triplet1.get(2024103));
        System.out.println("Pair values for key "+ 2024105 + " is "+triplet1.get(2024105));
        System.out.println("Name for id "+ 2024102+ " is "+ triplet1.getVal1(2024102));
        System.out.println("Password for id "+ 2024102+ " is "+ triplet1.getVal2(2024102));
        System.out.println("Triplets (Id, Name, Password)= "+triplet1);

        triplet2.put("Danish", 23, 65700.98);
        triplet2.put("Aamish", 33, 69000.50);
        triplet2.put("Aarif", 29, 80700.00);
        System.out.println("Pair values for key "+ "Danish  is "+ triplet2.get("Danish"));
        System.out.println("Pair values for key "+ "Amir  is " + triplet2.get("Aamish"));
        System.out.println("Age of Danish  is " + triplet2.getVal1("Danish"));
        System.out.println("Salary of Danish  is "+ triplet2.getVal2("Danish"));
        System.out.println("Triplets (Name, Age, Salary) = " + triplet2);
    }
}
/*
Pair values for key 2024102 is Ahmad::12qwe
Pair values for key 2024103 is Shakir::09foi90
Pair values for key 2024105 is Faiz::ll90iuo
Name for id 2024102 is Ahmad
Password for id 2024102 is 12qwe
Triplets (Id, Name, Password)= { 2024102=Ahmad::12qwe  2024103=Shakir::09foi90  2024104=Gulam::8790iuo  2024105=Faiz::ll90iuo  }
Pair values for key Danish  is 23::65700.98
Pair values for key Amir  is 33::69000.5
Age of Danish  is 23
Salary of Danish  is 65700.98
Triplets (Name, Age, Salary) = { Aamish=33::69000.5  Aarif=29::80700.0  Danish=23::65700.98  }
*/