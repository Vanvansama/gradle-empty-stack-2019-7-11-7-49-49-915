public class SportsCar extends Car {
    public SportsCar(String name, String color) {
        super(name, color);
    }

    public void drift(){
        this.speed -= 30;
    }

    @Override
    public void active(){
        this.accelerate();
        this.accelerate();
        this.accelerate();
        this.accelerate();
        this.accelerate();
        this.drift();
        this.drift();
    }
}
