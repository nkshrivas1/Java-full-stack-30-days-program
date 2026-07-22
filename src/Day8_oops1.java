import java.util.Arrays;

public class Day8_oops1 {

    static void main() {
        //5 students and we want to store their roll no
        int[] rollNo = new int[5];
        //5 students now we want to store names
        String names[] = new String[5];
        // marks
        float marks[] = new float[5];
        //datatype Student
        //we can create a class for it
        Student student1 = new Student(1,"Nikhil",87.6);
        Student student2 = new Student(2,"Rahul",99);
        student1.marks=0.0f;
        ///  Student student - it will be stored inside our stack memory at the compile time
        /// objects will be stored inside heap memory -runtime
//        student1.rollNo = 120;
//        student1.name = "Nikhil";
//        student2.rollNo = 121;
//        student2.sal =987654; java is a static typed language
        System.out.println(student2.toString());
    }
}
// it is like a template/blueprint
//Class -> named group of properties and functions
//class - logical construct
//object-physical reality / instance which will be occupying some memory
//3 properties for our objects
//1. state of object - value from its datatype
//2. identity of object - an id or reference to differentiate objects
//3. behaviour of object- function of that object
class Student{
    ///  properties for our class
    int rollNo=0;
    String name="";
    float marks = 0.0f;
    // Constructor - is a special type of function which is automatically called at the time of object initialization
    // it should have same name as class
    // it don't have any return type
    // it should be public
    public Student(int rollNo, String name,double marks){
        System.out.println("Constructor 2 is called");
        this.rollNo = rollNo;
        this.name = name;
    }
    // property to create different constructor with same name but different parameters
    // constructor overloading/method overloading
//    public Student(int rollNo, String name, float marks) {
//        System.out.println("Constructor 1 is called");
//        this.rollNo = rollNo;
//        this.name = name;
//        this.marks = marks;
//    }

    // this - it is a keyword
    // super inheritance
    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
