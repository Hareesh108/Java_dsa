package Collection.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
//        Methods of Iterator
//        The Iterator interface provides 4 methods that can be used to perform various operations on elements of collections.
//
//                hasNext() - returns true if there exists an element in the collection
//        next() - returns the next element of the collection
//        remove() - removes the last element returned by the next()
//        forEachRemaining() - performs the specified action for each remaining element of the collection

        // Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        System.out.println("ArrayList: " + numbers);

        // Creating an instance of Iterator
        Iterator<Integer> iterate = numbers.iterator();

        // Using the next() method
        int number = iterate.next();
        System.out.println("Accessed Element: " + number);

        // Using the remove() method
        iterate.remove();
        System.out.println("Removed Element: " + number);

        System.out.print("Updated ArrayList: ");

        // Using the hasNext() method
        while (iterate.hasNext()) {
            // Using the forEachRemaining() method
            iterate.forEachRemaining((value) -> System.out.print(value + ", "));
        }
    }
}

//
//        ArrayList: [1, 3, 2]
//        Accessed Element: 1
//        Removed Element: 1
//        Updated ArrayList: 3, 2,