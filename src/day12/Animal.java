package day12;

abstract class Animal {
    private int noOfLegs;
    // no-args constructor
    public Animal(){
        System.out.println("Animal creating..");
        noOfLegs = 4;
    }
    // abstract method
    abstract void sound();
    //Concrete method
    void eat(){
        System.out.println("Animal is Eating");
    }
}
class Dog extends Animal{

    @Override
    void sound() {
        System.out.println("Dog is barking..");
    }
}