package src;


public class DemoNew {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        ClassB classB = new ClassA();
        InterfaceI interfaceI = new ClassB();
        classA.printMessage();
        classA.printMessage("Hello from A");

        classB.printMessage();
        classB.printMessage("Hello from B");
        interfaceI.printMessage();
    }
}
