package day10.inheritance;

public class Inherit1 {
    // Inheritance -it is an oop feature in which one class acquires
    // the properties and beahviour of another class
    //or
    //it allows one class to reuse the variables and methods of another class
    // inheritance - IS-A Relationship
    // ex- is college-student a Student?
    // is Dog an animal ?
    //yes
    // car IS-A vehicle
    // inher. only works when IS-A relationship exists.
    // for ex-  Engine is a car ? no

    // Types of inheritance
    // 1. Single ex- Animal - dog
    // 2. multilevel inheritance - ex- person - student - college student
    // 3. Hierarchical - animal - dog - puppy
    //                          - cat - kitten
    //                           - cow - calf
    // multiple inheritance X - java does not support multiple inheritance
    // Diamond problem
//     class a implements b,c;


    static void main() {
        CollegeStudent std1 = new CollegeStudent("Jain College",123456.00f,"Nikhil",24);
        System.out.println(std1.toString());
        Student schStd1 = new SchoolStudent("dps",21343,"Rahul",17);
        System.out.println(schStd1.toString());
    }
    // EMployee management
    //parent
    //employee - id ,name,salary, display()
    //child
    // Manager - department ,bonus, displayManager()
    // create 3 managers
}
