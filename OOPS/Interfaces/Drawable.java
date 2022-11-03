package Interfaces;

//Default Method in Interface
interface Drawable{
     int num = 10; // final and static by default

    void draw();
    //Using default we can assign body
//    default void msg(){
//
//        System.out.println("default method");
//    }
}

class Rectangle implements Drawable{
    @Override
    public void draw(){

        System.out.println(num + " Drawing rectangles");
    }
}

class TestInterfaceDefault{
    public static void main(String args[]){
        Drawable d = new Rectangle();
        d.draw();
//        d.msg();

    }
}