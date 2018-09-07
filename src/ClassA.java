package src;


public class ClassA extends ClassB {
    String message = "ClassA";
    @Override
    public void printMessage(String msg) {
        System.out.println("Message by "+message+" is " + msg);
    }
}