package Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Hareesh");
        map.put(2,"Rahul");
        map.put(3,"Kiran");
        map.put(4,"Harry");
        map.put(5,"Ramesh");

        System.out.println("Removed "+ map.remove(3,"Kiran")); //return true if it is there

//        map.put(1,"Prince");// It will override value of the key directly

        // Checking condition
        if(!map.containsKey(1)){
            map.put(1,"Prince");
        }
        map.putIfAbsent(1,"Prince");
        System.out.println(map);

        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Harry"));

        for(Map.Entry<Integer,String> element : map.entrySet()){
            System.out.println(element);

            System.out.println(element.getKey());
            System.out.println(element.getValue());
        }

        for(Integer key : map.keySet()){
            System.out.print(key + " ");
        }

        System.out.println();//newline
        for(String values : map.values()){
            System.out.print(values + " ");
        }

    }
}

//        {1=Hareesh, 2=Rahul, 3=Kiran, 4=Harry, 5=Ramesh}
//          true
//          true
//        1=Hareesh
//        1
//        Hareesh
//        2=Rahul
//        2
//        Rahul
//        3=Kiran
//        3
//        Kiran
//        4=Harry
//        4
//        Harry
//        5=Ramesh
//        5
//        Ramesh
//        1 2 3 4 5 Hareesh Rahul Kiran Harry Ramesh