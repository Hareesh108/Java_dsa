package Collection.List;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<String>();
        System.out.println("Initial list of elements: "+list);
        list.addFirst("Ravi");
        list.add("Vijay");
        list.add("Ajay");
        System.out.println("After invoking add(E e) method: "+list);
        //Adding an element at the specific position
        list.add(1, "Gaurav");
        System.out.println("After invoking add(int index, E element) method: "+list);
        LinkedList<String> list1=new LinkedList<String>();
        list1.add("Sonoo");
        list1.add("Hanumat");

        //Adding second list elements to the first list
        list.addAll(list1);
        System.out.println("After invoking addAll(Collection<? extends E> c) method: "+list);
        LinkedList<String> ll3=new LinkedList<String>();
        ll3.add("John");
        ll3.add("Rahul");
        //Adding second list elements to the first list at specific position
        list.addAll(1, ll3);
        System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+list);
        //Adding an element at the first position
        list.addFirst("Lokesh");
        System.out.println("After invoking addFirst(E e) method: "+list);
        //Adding an element at the last position
        list.addLast("Harsh");
        System.out.println("After invoking addLast(E e) method: "+list);
        list.removeFirst();
        list.removeLast();
        System.out.println("After invoking addLast(E e) method: "+list);
        System.out.println(list.contains("Rahul"));

    }
}
