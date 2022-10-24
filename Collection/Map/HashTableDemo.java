package Collection.Map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    public static void main(String args[]) {
        Hashtable<Integer, String> hash = new Hashtable<Integer, String>();

        hash.put(100, "Amit");
        hash.put(102, "Ravi");
        hash.put(101, "Vijay");
        hash.put(103, "Rahul");

        for (Map.Entry m : hash.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
      }
    }

//    Points to remember
//        A Hashtable is an array of a list. Each list is known as a bucket. The position of the bucket is identified by calling the hashcode() method. A Hashtable contains values based on the key.
//        Java Hashtable class contains unique elements.
//        Java Hashtable class doesn't allow null key or value.
//        Java Hashtable class is synchronized.
//        The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.