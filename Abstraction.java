// Abstract class
abstract class Animal {
    // Abstract method (no body)
    abstract void sound();
    
    // Concrete method
    void eat() {
        System.out.println("This animal eats food");
    }
}

// Subclass implementing abstract method
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();  // Calls Dog's implementation of sound()
        dog.eat();    // Calls concrete method from Animal
    }
}
