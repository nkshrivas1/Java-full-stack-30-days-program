package day11;

public class PolyMorphism {
    //Poly = Many
    // Morph = Forms
    // same person different behaviours
    // it means one interface , many forms
    // it allows the same function to perform different tasks depending
    // on the object or parameters
    // types of polymorphism
    //1. Compile time (method overloading)
    // it means multiple methods with the same name but diff parameters
    // Rules :-
    // same method name
    // different number of parameters
    // different type of parameters
    // return type alone cannot overload a method
    //2. run time polymorphism
    // child class provides its own implementation
    // of a method already defined in the parent class
    static void main(int a){

    }

    static void main() {
//        Calculator calc = new Calculator();
//        System.out.println(calc.add(1,2));
//        System.out.println(calc.add(1,2,3));
//        System.out.println(calc.add(1.66,2.8));
        Payment p;

        // want upi payment
        p = new UPIPayment();
        p.i =199;
        p.pay(1000);
        // want cash payment
        p = new CashPayment();
        p.pay(1500);
        // want card payment
        p = new CardPayment();
        p.pay(1600);
    }

//    Assignment
    // Bankaccount -
    // saving account
    //current account
    // deposit, withdraw, calculateInterest, displayAccountdetail
    // ask user which account they want



}
