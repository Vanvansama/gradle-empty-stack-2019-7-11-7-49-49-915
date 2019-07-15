public class Phone {
    private String name;
    private String version;

    public Phone(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public void call(String phoneNumber){
        System.out.println(String.format("use %s %s call to %s",this.name,this.version,phoneNumber));
    }

    public String sendMessage(String message){
        return String.format("send %s",message);
    }
}
