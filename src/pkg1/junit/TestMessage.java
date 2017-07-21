package pkg1.junit;


public class TestMessage {

    private String message;

    public TestMessage(String msg){
        message = msg;
    }

    public  String printMsg(){
        System.out.println(message);
        return message;
    }
}
