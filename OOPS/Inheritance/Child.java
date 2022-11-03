package Inheritance;

public class Child extends Parent{
    int age = 30;
    String color = "Black";

    public Child() {
        super(); // It will print (I am Parent) because super keyword print their earlier class data.
        System.out.println("I am Child");
    }

    public void CallParent(){
        super.CallParent(); //Method Overriding
    }
}
