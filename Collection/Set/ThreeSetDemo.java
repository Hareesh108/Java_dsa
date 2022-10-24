package Collection.Set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ThreeSetDemo {
    public static void main(String[] args) {
        //O(logn)
        // include properties of Set and Binary Tree
        //Element will be unique and sorted form
        Set<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(30);//will not add double
        set.add(40);
        set.add(15);
        set.add(25);
        System.out.println(set);

        System.out.println(set.remove(30)); // remove the object direct return true if contain else false
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        System.out.println(set.contains(30));

        set.clear();
        System.out.println(set);
    }
}

//        [10, 15, 20, 25, 30, 40]
//        true
//        false
//        5
//        false
//        []