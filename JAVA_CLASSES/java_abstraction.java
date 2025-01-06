abstract class Animal {
    public abstract void sound();
    public void sleep() {
        System.out.println("Zzz");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Woof");
    }
}

public class java_abstraction {
    public static void main(String[] args) {
        Dog myDog = new Dog(); // Create a Dog object
        myDog.sound();
        myDog.sleep();
    }
}