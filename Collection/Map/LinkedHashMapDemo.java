package Collection.Map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String args[]) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");
        //Fetching key
        System.out.println("Keys: " + map.keySet());
        //Fetching value
        System.out.println("Values: " + map.values());
        //Fetching key-value pair
        System.out.println("Key-Value pairs: " + map.entrySet());
    }
}

//        Keys: [100, 101, 102]
//        Values: [Amit, Vijay, Rahul]
//        Key-Value pairs: [100=Amit, 101=Vijay, 102=Rahul]
