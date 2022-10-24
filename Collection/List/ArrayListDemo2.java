package Collection.List;

import java.util.ArrayList;
import java.util.*;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        //Input
        Scanner input = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(5);

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        System.out.println(list);
        list.set(0, 99);// update the value with help of index and value which you to update

        System.out.println(list);

//      Using loop we are adding elements
        for (int i = 0; i < 3; i++) {
            list.add(input.nextInt());//it will take user input
        }

        // get item at any index
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " "); // pass index here, list[index] syntax will not work here
        }
        System.out.println();

        // for each loop
        for(Integer element : list){
            System.out.print(element+ " ");
        }
        System.out.println();

        Iterator<Integer> iterate =  list.iterator();
        while (iterate.hasNext()){
            System.out.print(iterate.next() + " ");
        }

        System.out.println();

        System.out.println(list);
    }

}
//        Output of program
//        [67, 234, 654, 43, 654, 8765]
//        [99, 234, 654, 43, 654, 8765]
//        25 30 40 // user input and added into list
//        99 234 654 43 654 8765 25 30 40
//        99 234 654 43 654 8765 25 30 40
//        99 234 654 43 654 8765 25 30 40
//        [99, 234, 654, 43, 654, 8765, 25, 30, 40]