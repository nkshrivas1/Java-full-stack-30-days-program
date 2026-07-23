package day10.inheritance;
//to inherit a class extends
public class CollegeStudent extends Student {
    private String collegeName;
    private float fees;

    public CollegeStudent(String collegeName, float fees, String name, int age) {
        // super keyword reference for parent class
        super(name,age);
//        System.out.println("College student created");
        this.collegeName = collegeName;
        this.fees = fees;

    }
    public String getName(){
        return "Example";
    }
    @Override
    public String toString() {
        return "CollegeStudent{" +
                " Name='" + super.getName() + '\'' +
                ", Age='" + getAge() + '\'' +
                ", College Name='" + collegeName + '\'' +
                ", Fees=" + fees  +
                '}';
    }
}
