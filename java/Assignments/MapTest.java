import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class MapTest {
        public static void main(String[] args) {
                // Map<String, String> tm = new TreeMap<>();
                Map<String, String> tm = new TreeMap<>();
                System.out.println(tm.isEmpty());
                System.out.println(tm.size());
                tm.put("Hamid", null);
                tm.put("Abid", "12223");
                tm.put("Kalim", "12003");
                tm.put("Bilal", "12003");
                tm.put("Mudassir", "12003");
                tm.put("Jawed", "1200023");
                tm.put("Jawed", "0023");
                System.out.println(tm.isEmpty());
                System.out.println(tm.size());
                System.out.println(tm.containsKey("Hamid"));
                System.out.println(tm);
                Map<String, String> MCA = new TreeMap<String, String>();
                Map<String, String> MScAI_ML = new TreeMap<String, String>();
                Map<Integer, String> map = new LinkedHashMap<>();
                map.put(5, "five");
                map.put(6, "Six");
                map.put(4, "four");
                map.put(3, "three");
                map.put(null, "two");
                map.put(1, null);
                map.put(1, "one");
                map.remove(1, "once");

                System.out.println(map);
                // map.clear();
                map.size();
                map.containsKey(1);
                System.out.println(map.containsValue("one"));
                map.isEmpty();
        }
}