import java.util.ArrayList;
import java.util.List;

public class Person {
    private final String name;
    private int weight;
    private int heartRate = 60;
    private List<Phone> phones = new ArrayList<>();

    public Person(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void eat(){
        this.weight += 1;
    }

    public void introduce(){
        this.heartRate += 30;
    }

    public void call(String s) {
        for (Phone phone : phones) {
            phone.call(s);
        }
    }

    public void send(String message) {
        for (Phone phone : phones) {
            System.out.println(phone.sendMessage(message));
        }
    }
}
