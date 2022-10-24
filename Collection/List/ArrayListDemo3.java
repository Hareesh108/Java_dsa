package Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo3 {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();//Creating arraylist
        list1.add("Ravi");//Adding object in arraylist
        list1.add("Vijay");
        list1.add("Ravi");
        list1.add("Ajay");

        //Traversing list through Iterator
        Iterator<String> iterate = list1.iterator();
//        Iterator iterate = list1.iterator();

        while (iterate.hasNext()) {
            System.out.println(iterate.next());
        }
    }
}
