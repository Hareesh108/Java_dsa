package Collection.Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListDemo {

    public static void main(String[] args) {
        // LinkedList implementation of Queue
        Queue<Integer> queue = new LinkedList<>();

        //add() - Inserts the specified element into the queue. If the task is successful, add() returns true, if not it throws an exception.
        queue.add(5);
        //offer() - Inserts the specified element into the queue. If the task is successful, offer() returns true, if not it returns false.
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        System.out.println(queue);

        //poll() - Returns and removes the head of the queue. Returns null if the queue is empty.
        System.out.println(queue.poll() + " Removed");
        //remove() - Returns and removes the head of the queue. Throws an exception if the queue is empty.
        System.out.println(queue.remove() +  " Removed");

        //peek() - Returns the head of the queue. Returns null if the queue is empty.
        System.out.println(queue.peek() + " at top");
        // which is nextelement() - Returns the head of the queue. Throws an exception if the queue is empty.
        System.out.println(queue.element() + " at top");
    }
}
