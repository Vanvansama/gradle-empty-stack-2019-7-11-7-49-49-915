import java.util.List;

public class Driver extends Person {
    private Car car;
    private List<Phone> phones;

    public Driver(String name, int weight) {
        super(name, weight);
    }

    public void setPhones(Phone phone) {
        phones.add(phone);
    }

    public void accelerate() {
        car.accelerate(10);
        System.out.println("accelerate speed to " + car.checkSpeed());
    }

    public void useCar(Car car) {
        this.car = car;
        System.out.println("use: " + car.getName());
    }

    public void activeCar() {
        car.active();
        car.accelerate(10);
        System.out.println("accelerate speed to " + car.checkSpeed());
    }

    public void brake() {
        this.car.brake();
        System.out.println("brake speed to " + car.checkSpeed());
    }

    public int checkSpeed() {
        return this.car.checkSpeed();
    }
}
