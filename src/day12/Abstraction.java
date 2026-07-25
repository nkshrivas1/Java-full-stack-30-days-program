package day12;

public class Abstraction {
    // abstraction - it focuses on what an object does instead of how it does it
    // security , simplicity,better design, easier maintenance, code reusability
    // 1. Abstract class 2. interfaces
    // abstract class- is a class that cannot be instantiated/can not create object and may contain both
    // abstract and concrete methods.
    // Rules of abstract class
    // 1. can have both methods abstract and concrete
    // 2. can have variables
    // 3. can have constructors
    // 4. cannot create object

    // 2. Interface - is a blueprint of a class that contains method declaration
    // which implementing class must define
    // rules
    // 1. cannot create object
    // 2. methods are public and abstract by default
    // 3. support multiple inheritance
    // 4. variables are public static final
    // 5. Constructor is not allowed in interface

    // difference b/w abstract class and interface
    //uses extends | uses implements
    //OOPs -- Four pillars
    // 1. Encapsulation
    // 2. Polymorphism
    // 3. inheritance
    // 4. Abstraction
    static void main() {
        Dog d = new Dog();
        d.eat();
        d.sound();
        Car c = new Car();
        c.start();
        c.e20();
        c.stop();
    }
}
