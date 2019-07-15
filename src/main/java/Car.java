public abstract class Car {
    protected int speed;
    private String name;
    private String color;

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract void active();

    public void accelerate(){
        this.speed += 30;
    }

    public void accelerate(int speed){
        this.speed += speed;
    }

    public void brake(){
        this.speed = 0;
    }

    public void decelerate(){
        this.speed -= 50;
    }

    public void decelerate(int speed){
        this.speed -= speed;
    }

    public int checkSpeed(){
        return speed;
    }

    public String getName() {
        return name;
    }
}
