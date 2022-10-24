package Collection.List;

import java.util.List;
import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        //FIFO and LIFO
        Stack<String> list = new Stack<>();

        list.push("Hareesh");
        list.push("Rahul");
        list.push("Kiran");
        list.push("Harry");

        System.out.println(list);
        System.out.println("Top element is : " + list.peek());
        System.out.println("Deleted element is : " + list.pop());; // delete top element
        System.out.println("Top element is : " + list.peek());
        System.out.println(list);
    }
}
