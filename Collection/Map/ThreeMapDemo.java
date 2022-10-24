package Collection.Map;

import java.util.Map;
import java.util.TreeMap;

public class ThreeMapDemo {
    public static void main(String[] args) {

        Map<Integer, String> map = new TreeMap<>();
        map.put(3, "Kiran");
        map.put(1, "Hareesh");
        map.put(5, "Ramesh");
        map.put(2, "Rahul");
        map.put(4, "Harry");

//        map.put(1,"Prince");// It will override value of the key directly

        // Checking condition
        if (!map.containsKey(1)) {
            map.put(1, "Prince");
        }
        map.putIfAbsent(1, "Prince");
        System.out.println(map);

        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Harry"));

        for (Map.Entry<Integer, String> element : map.entrySet()) {
            System.out.println(element);

            System.out.println(element.getKey());
            System.out.println(element.getValue());
        }

        for (Integer key : map.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();
        for (String values : map.values()) {
            System.out.print(values + " ");
        }
    }
}
