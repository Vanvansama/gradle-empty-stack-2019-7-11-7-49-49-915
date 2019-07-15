public class Jeep extends Car {
    public Jeep(String name, String color) {
        super(name, color);
    }

    public void jump(){
        this.speed -= 10;
    }

    @Override
    public void active(){
        this.accelerate();
        this.accelerate();
        this.jump();
    }
}
