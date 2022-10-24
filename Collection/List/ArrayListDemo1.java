package Collection.List;

import java.util.*;
public class ArrayListDemo1 {
    public static void main(String args[]){

        List<Integer> list = new ArrayList<>();//ListNumber 01
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(25);
        list.add(3,20);//index and element

        System.out.println(list);
        System.out.println(list.contains(765432));// It will print true or false

        List<Integer> list3 = new ArrayList<>();//ListNumber 02
        list3.add(30);
        list3.add(35);

        list.addAll(list3);//Here we adding list 02 in list 01

        System.out.println(list);

        System.out.println(list.get(5)); //Get element with index

        list.remove(2);
        list.remove(Integer.valueOf(30));//remove object one only

        System.out.println(list);

        list.clear();
        System.out.println(list);

    }
}
//        output of the program
//        [5, 10, 15, 20, 25]
//        false
//        [5, 10, 15, 20, 25, 30, 35]
//        30
//        [5, 10, 20, 25, 35]
//        []