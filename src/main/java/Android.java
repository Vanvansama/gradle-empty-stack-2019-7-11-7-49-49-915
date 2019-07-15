public class Android extends Phone {
    public Android(String name, String version) {
        super(name, version);
    }

    @Override
    public String sendMessage(String message){
        return "Android-"+super.sendMessage(message);
    }
}
