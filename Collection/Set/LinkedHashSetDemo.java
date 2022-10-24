package Collection.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        // Element will add in order means the way of we are adding
        Set<Integer> set = new LinkedHashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(30);//will not add double
        set.add(40);
        System.out.println(set);

        System.out.println(set.remove(30)); // remove the object direct return true if contain else false
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        System.out.println(set.contains(30));

        set.clear();
        System.out.println(set);
    }
}

//        [10, 20, 30, 40]
//        true
//        false
//        3
//        false
//        []
