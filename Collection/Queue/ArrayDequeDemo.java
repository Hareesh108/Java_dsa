package Collection.Queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        // Creating Queue using the ArrayDeque class
        //In this data structure we can add and remove elements from end and front
        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        // offer elements to the ArrayDeque from last with offer and offerLast
        numbers.offer(5);
        numbers.offer(10);
        numbers.offer(2);
        numbers.offerLast(7);

        // offer elements to the ArrayDeque from front with offerFirst
        numbers.offerFirst(3);
        numbers.offer(6);
        System.out.println("ArrayDeque: " + numbers);

        // Access elements of the ArrayDeque
        int accessedNumber = numbers.peekFirst();
        System.out.println("Accessed First Element: " + accessedNumber);

        int accessedNumber1 = numbers.peekLast();
        System.out.println("Accessed Last Element: " + accessedNumber1);

        // Remove elements from first of ArrayDeque
        int removedNumber = numbers.pollFirst();
        System.out.println("Removed First Element: " + removedNumber);

        // Remove elements from last of the ArrayDeque
        int removedNumber1 = numbers.pollLast();
        System.out.println("Removed Last Element: " + removedNumber1);

        System.out.println("Updated ArrayDeque: " + numbers);
    }
}

//        ArrayDeque: [3, 5, 10, 2, 7, 6]
//        Accessed First Element: 3
//        Accessed Last Element: 6
//        Removed First Element: 3
//        Removed Last Element: 6
//        Updated ArrayDeque: [5, 10, 2, 7]