package day01.solved;

public class StaticVarDemo {
    // Declare a static variable
    public static int staticVariable = 10;
    public int instanceVariable = 10;

    public static void main(String[] args) {
        // Access the static variable using the class name
        StaticVarDemo obj1 = new StaticVarDemo();
        obj1.staticVariable += 1;
        obj1.instanceVariable += 1;
        System.out.println("Static variable obj1: " + obj1.staticVariable);
        System.out.println("Instance variable obj1: " + obj1.instanceVariable);
        
        
        StaticVarDemo obj2 = new StaticVarDemo();
        obj2.staticVariable += 1;
        obj2.instanceVariable += 1;
 
        System.out.println("Static variable obj2: " + obj2.staticVariable);
        System.out.println("Instance variable obj2: " + obj2.instanceVariable);
        
    }
}