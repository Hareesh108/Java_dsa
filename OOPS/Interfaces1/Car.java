package Interfaces1;

public class Car {
    private Media media;
    public Engine engine;

    public Car(){
        this.media = new MediaPlayer();
        this.engine = new CarEngine();
    }
    public void MediaCar(){
        media.start();
        media.stop();
    }
    public void EngineCar(){
        engine.start();
        engine.stop();
    }
}
