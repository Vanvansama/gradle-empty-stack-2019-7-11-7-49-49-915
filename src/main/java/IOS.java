public class IOS extends Phone {
    public IOS(String name, String version) {
        super(name, version);
    }

    @Override
    public String sendMessage(String message){
        return "IOS-"+super.sendMessage(message);
    }
}
