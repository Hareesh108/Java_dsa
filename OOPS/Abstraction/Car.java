package Abstraction;

abstract class Car {

    public  void accelerate(){
        System.out.println("Do something for accelerate");
    }
    public void applyBrake(){
        System.out.println("Do something for applyBrake");
    }
     abstract void changeGear();
}

 class BMW extends Car{
    @Override
    public void changeGear(){
        System.out.println("Do something for BMW ChangeGear");
    }
}

 class Audi extends Car{
    @Override
    public void changeGear(){
        System.out.println("Do something for Audi ChangeGear");
    }
}

class Test{
    public static void main(String[] args) {
        Car car ;
        car= new Audi();
        car.changeGear();
        car = new BMW();
        car.changeGear();
    }
}
