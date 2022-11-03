package Interfaces1;

public class CarEngine implements Engine{
    @Override
    public void start(){
        System.out.println("Start Car Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop Car Engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate Car Engine");
    }
}
