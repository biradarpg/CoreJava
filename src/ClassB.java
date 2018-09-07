package src;


public class ClassB  implements InterfaceI {
    String message = "ClassB";
    public void printMessage() {
        System.out.println(message + " Message");
    }
    public void printMessage(String msg) {
        System.out.println("Message by "+message+" is " + msg);
    }
}