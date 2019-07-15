public class Main {
    public static void main(String[] args) {
        Driver jimmy = new Driver("Jimmy",70);
        Android android = new Android("XiaoMi","9");
        IOS iphone = new IOS("iPhone","XSM");
        Jeep jeep = new Jeep("Jeep","red");
        SportsCar sportsCar = new SportsCar("sport car","black");

        jimmy.setPhones(android);
        jimmy.setPhones(iphone);

        jimmy.useCar(jeep);

        jimmy.call("18195857647");
        jimmy.send("hello bro");

        jimmy.useCar(sportsCar);
        jimmy.accelerate();
        jimmy.brake();

        Boss Mophy = new Boss("Mophy",40);
        Mophy.call("12312312");
    }
}
