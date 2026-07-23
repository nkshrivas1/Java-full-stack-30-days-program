package day10.inheritance;
//to inherit a class extends
public class SchoolStudent extends Student {
    private String schoolName;
    private float fees;

    public SchoolStudent(String collegeName, float fees, String name, int age) {
        // super keyword reference for parent class
        System.out.println("School student created");
        this.schoolName = collegeName;
        this.fees = fees;
        // thats how we call parent class constructor
        super(name,age);
    }
    public String getName(){
        return "Example";
    }
    @Override
    public String toString() {
        return "School Student{" +
                " Name='" + super.getName() + '\'' +
                ", Age='" + getAge() + '\'' +
                ", School Name='" + schoolName + '\'' +
                ", Fees=" + fees  +
                '}';
    }
}
