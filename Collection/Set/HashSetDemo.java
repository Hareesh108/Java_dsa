package Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        //O(1)
        //Order is not defined
        // add only one unique element double element will not add
        Set<Integer> set = new HashSet<>();

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

//        [20, 40, 10, 30]
//        true
//        false
//        3
//        false
//        []