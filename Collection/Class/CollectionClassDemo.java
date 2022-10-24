package Collection.Class;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionClassDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(25);
        list.add(50);
        list.add(10);

        System.out.println("Minimun Element is : " + Collections.min(list));
        System.out.println("Maximum Element is : " + Collections.max(list));
        System.out.println("Frequency of 10 Element is : " + Collections.frequency(list,10));

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);

    }
}
